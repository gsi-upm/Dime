package org.telcodev.dsl.generator

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.telcodev.dsl.dime.Block
import org.telcodev.dsl.dime.BoolLiteral
import org.telcodev.dsl.dime.BoolVariable
import org.telcodev.dsl.dime.CompareExpression
import org.telcodev.dsl.dime.Concatenation
import org.telcodev.dsl.dime.CondBlock
import org.telcodev.dsl.dime.Dial
import org.telcodev.dsl.dime.Document
import org.telcodev.dsl.dime.GetDigits
import org.telcodev.dsl.dime.Hangup
import org.telcodev.dsl.dime.IfExp
import org.telcodev.dsl.dime.Literal
import org.telcodev.dsl.dime.LiteralAbs
import org.telcodev.dsl.dime.NegExpression
import org.telcodev.dsl.dime.NumLiteral
import org.telcodev.dsl.dime.NumVariable
import org.telcodev.dsl.dime.Operation
import org.telcodev.dsl.dime.OperationBool
import org.telcodev.dsl.dime.Brackets
import org.telcodev.dsl.dime.Play
import org.telcodev.dsl.dime.Record
import org.telcodev.dsl.dime.Reject
import org.telcodev.dsl.dime.Say
import org.telcodev.dsl.dime.Send
import org.telcodev.dsl.dime.Data
import org.telcodev.dsl.dime.State
import org.telcodev.dsl.dime.Statement
import org.telcodev.dsl.dime.StringLiteral
import org.telcodev.dsl.dime.StringVariable
import org.telcodev.dsl.dime.Transition
import org.telcodev.dsl.dime.VoiceTag
import org.telcodev.dsl.dime.SendBlock
import org.telcodev.dsl.dime.Param
import org.telcodev.dsl.dime.MathBrackets
import org.telcodev.dsl.dime.ConcatenationBrackets
import org.telcodev.dsl.dime.Call
import org.telcodev.dsl.dime.Primitive
import org.telcodev.dsl.dime.Constant
import org.telcodev.dsl.dime.SESSION
import org.telcodev.dsl.dime.CALLSTATUS
import org.telcodev.dsl.dime.Email
import org.telcodev.dsl.dime.Sms
import org.telcodev.dsl.dime.Wait

class VoiceXML_generator {
	
	private static String appName
	private static String token
	private static String languageVXML
	private static String user
	private static String password
	private static String botkey
	private static String number
	
	private static String state
	
	private static String cond
	private static String condinitial
	
	def static void generateVoiceXML(Resource resource, IFileSystemAccess fsa, Config config){
		//Setting parameters
	
		
		
		System::out.println("")
		System::out.println("*****************************************************************************************")
		System::out.println("")
		System::out.println("Creating VoiceXML "+ (resource.contents.head as Document).name+" application.");
	

		languageVXML=config.vxml.language
		token= config.vxml.token
		 
		user=config.vxml.user
		password= config.vxml.password
		number=config.vxml.number
		botkey= config.vxml.botkey
		
		appName=className(resource) 
		
		cond=""
		
		System::out.println("Creating "+"call_dime"+".php file")
		
		fsa.generateFile("call_dime.php",declareCall())
		
		System::out.println("Creating "+"sms_dime"+".php file")
	
		fsa.generateFile("sms_dime.php",declareSMS())
		
		System::out.println("Creating "+"email_dime"+".php file");
		
		fsa.generateFile("email_dime.php", VoiceXML_generator::emailPHP)
		
		System::out.println("Creating "+"index.xml file");
		fsa.generateFile("index.xml", VoiceXML_generator::toVoiceXML(resource.contents.head as Document,resource))
		
		
		
		System::out.println("Success.");
		System::out.println("");
	}
	
	def static className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
	
	
	def static emailPHP(){
		'''<?php
		if(isset($_POST['to_email_dime'])&&isset($_POST['title_email_dime'])&&isset($_POST['value_email_dime'])&&isset($_POST['from_email_dime']){
			mail($_POST['to_email_dime'], $_POST['title_email_dime'],$_POST['value_email_dime'], "From: <".$_POST['from_email_dime']."> \r\n"); 
		}else{
			echo "error";
		}
		
		?>'''
	}
	
	def static declareCall(){
		'''<?php
	$token = '�token�';
	if(isset($_GET['number_dime']){
		$url="http://api.voxeo.net/SessionControl/VoiceXML.start?
    	numbertodial=".$_GET['number_dime']."&
    	tokenid=".$token;
	}else{	$url="http://api.voxeo.net/SessionControl/VoiceXML.start?
   	 	tokenid=".$token;	
	}
	$curl_handle=curl_init();
	curl_setopt($curl_handle,CURLOPT_URL,$url);
	curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
	curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
	curl_exec($curl_handle);
	curl_close($curl_handle);
?>
		'''
	}
	
	def static declareSMS(){
		'''<?php	 
 	 	$url = 'http://api.messaging.staging.voxeo.net/1.0/messaging';	 
 	 	
 	 	if(isset($_GET['message_dime'])&&isset($_GET['to_dime'])&&isset($_GET['from_dime'])){
	 	 	$data="botkey=�botkey�&apimethod=send&msg=".$_GET['message_dime']."&user=".$_GET['to_dime']."&network=SMS&from=".isset($_GET['from_dime']);	 
	 	 	$ch = curl_init();	 
	 	 	curl_setopt($ch, CURLOPT_URL, $url);	 
	 	 	curl_setopt($ch, CURLOPT_HEADER, 0);	 
	 	 	// ToDo: Replace the placeholders in brackets with your data.	 
	 	 	curl_setopt($ch, CURLOPT_USERPWD, '�user�:�password�');	 
	 	 	curl_setopt($ch, CURLOPT_POST, 1);	 
	 	 	curl_setopt($ch, CURLOPT_POSTFIELDS, $data);	 
	 	 	curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);	 
	 	 	curl_setopt($ch, CURLOPT_TIMEOUT, 100);	 
	 	 	$xml = curl_exec($ch);	 
	 	 	if (curl_error($ch)) {	 
	 	 	print "ERROR ". curl_error($ch) ."\n<br/>";	 
	 	 	}	 
	 	 	curl_close($ch);	 
	 	 	print_r($xml);	 
 	 	} 
?>	 
		'''
	}

	def static toVoiceXML(Document sm, Resource resource) {
		
'''<?xml version="1.0" encoding="UTF-8"?>
<vxml version="2.1" xml:lang="�languageVXML�">

<!-- Declaration of the global statements -->

�FOR elem: sm.elements�
�declareStatement(elem)�
�ENDFOR�

�FOR elem: sm.sta�
<var name="times_�elem.name�_dime" expr="0"/>
�ENDFOR�

<var name="DIGITS"/>

<var name="RECORD"/>

<var name="LASTSTATE" expr="&quot;start&quot;"/>

<!-- Declaration of the states -->

�FOR elem: sm.sta�
�declareState(elem)�
�ENDFOR�

</vxml>'''
		

	}  

 
	
// States declaration:

	
	
	def  static declareState(State elem){
		state=elem.name
	
		cond=""
		condinitial=""
		
		System::out.println("Generating "+elem.name.toUpperCase+" state.");
			 
'''<!-- Declaration of the state �elem.name� -->
<form id="�elem.name�">
	<block>
		<assign name="LASTSTATE" expr="&quot;�elem.name�&quot;" />
	</block>
	�IF elem.times!=0�
			<if cond="times_�elem.name�_dime==�elem.times�">
				<throw event="times_�elem.name�_event"/> 
			</if>
	�ENDIF�
	�FOR n :elem.stms�	
	�declareAbstractElement(n)�
�ENDFOR�

</form>
	
<!-- End of the state �elem.name� -->

'''


	
	}
	

	


// Abstract elements

def static dispatch declareAbstractElement(VoiceTag elem){
		'''�declareVoiceTag(elem)�'''
	}
	
	
	def static dispatch declareAbstractElement(IfExp elem){		
'''�declareStructure(elem)�'''
	}
	def static dispatch declareAbstractElement(Statement elem){
'''�declareStatement(elem)�'''
	}

		def static dispatch declareAbstractElement(Transition elem){
'''�declareTransition(elem)�'''
	}  


// Declare if structure

	def static declareStructure(IfExp elem){
		condinitial=cond
'''<!-- If structure declaration -->

<!-- �declareCondBlock(elem.block)��IF elem.blocks!=null��FOR e: elem.blocks �
<!-- ELSE �declareCondBlock(e)�
�ENDFOR��ENDIF��IF elem.defaultBlock!=null�<!--ELSE -->
�declareBlock(elem.defaultBlock)��ENDIF��IF (cond=condinitial)!=null��ENDIF�
<!-- End of the if declaration -->'''

 }

	
	def static declareBlock(Block elem){
		'''
		�FOR c: elem.sta��declareAbstractElement(c)�
		�ENDFOR�
		'''
	}
	
	
	def static declareCondBlock(CondBlock elem){
		if(cond.equals("")){
			cond=declareBoolExpression(elem.cond).toString()
		}else{
			cond="(!("+cond+"))&amp;&amp;"+declareBoolExpression(elem.cond).toString()
		}
		
		
		''' IF cond=�declareBoolExpression(elem.cond)� -->
�IF elem.action!=null��declareBlock(elem.action)��ENDIF�

<!-- ENDIF -->'''
	}	
	
	

		
	
//FALTA CALLSTATUS

// Expressiones
	def static dispatch declareBoolExpression(CALLSTATUS elem){
//		 if(elem.name.equals("RINGING")){
//		 	'''($_REQUEST['CallStatus']=="RINGING")'''
//		 }else if(elem.name.equals("IN-PROGRESS")){
//		 	'''($_REQUEST['CallStatus']=="ANSWERING"|| $_REQUEST['CallStatus']=="ANSWERED")'''
//		 	}else if(elem.name.equals("DISCONNECTED")){
//		 	'''($_REQUEST['CallStatus']=="DISCONNECTED")'''
//		 	}else if(elem.name.equals("FAILED")){
//		 	'''($_REQUEST['CallStatus']=="FAILED")'''
//		 	}
//		 	else{
//		 	''''''
//		 }
''''''
	}
	
	// DECLARE EXPRESSIONS
	
	// BoolExpression
	
	def static dispatch declareBoolExpression(BoolLiteral elem){
		'''�elem.value�'''
	}
	def static dispatch declareBoolExpression(Literal elem){
		'''�declareScriptLiteral(elem)�'''
	}


	def static dispatch declareBoolExpression(CompareExpression elem){
		'''�declareScriptLiteralAbs(elem.left)��elem.op��declareScriptLiteralAbs(elem.right)�'''
	}
 
	def static dispatch declareBoolExpression(NegExpression elem){
		'''�elem.op��declareBoolExpression(elem.obj)�'''
	}

	def static dispatch declareBoolExpression(OperationBool elem){
		'''�declareBoolExpression(elem.left)��StringEscapeUtils::escapeXml(elem.op.toString())��declareBoolExpression(elem.right)�'''
	}

	def static dispatch declareBoolExpression(Brackets elem){
		'''(�declareBoolExpression(elem.obj)�)'''
	}

	// MathExpression

	def static dispatch declareMathExpression(Operation elem){
		'''�declareMathExpression(elem.left)��elem.op��declareMathExpression(elem.right)�'''
	}

	def static dispatch declareMathExpression(Literal elem){
		'''�declareLiteral(elem)�'''
	}
		def static dispatch declareMathExpression(NumLiteral elem){
		'''�declareLiteralAbs(elem)�'''
	}
	
	def static dispatch declareMathExpression(MathBrackets elem){
		'''(�declareMathExpression(elem.obj)�)'''
	}
	
	
	
	def static dispatch declareConcatenation(Concatenation elem){
		'''�declareConcatenation(elem.left)��declareConcatenation(elem.right)�'''
	}
	

	def static dispatch declareConcatenation(LiteralAbs elem){
		'''�declareLiteralAbs(elem)�'''
	}
	
	def static dispatch declareConcatenation(ConcatenationBrackets elem){
		'''(�declareConcatenation(elem.obj)�)'''
	}
	 
	
	// For javaScript
	
	def static dispatch declareScriptConcatenation(Concatenation elem){
		'''�declareScriptConcatenation(elem.left)�+�declareScriptConcatenation(elem.right)�'''
	}
	

	def static dispatch declareScriptConcatenation(LiteralAbs elem){
		'''�declareScriptLiteralAbs(elem)�'''
	}
	
	def static dispatch declareScriptConcatenation(ConcatenationBrackets elem){
		'''(�declareScriptConcatenation(elem.obj)�)'''
	}
	
	
	

	def static dispatch declareVars(StringVariable elem){
		'''<value expr="�StringEscapeUtils::escapeXml(elem.name.toString())�"/>''' 
	}
	
	def static dispatch declareVars(BoolVariable elem){
		'''<value expr="�elem.name�"/>'''
	}
	
	def static dispatch declareVars(NumVariable elem){
		'''<value expr="�elem.name�"/>'''
	}
	
	def static dispatch declareVars(Constant elem){
		'''<value expr="�elem.name�"/>'''
	}
	
	// For javaScript
	def static dispatch declareScriptVars(StringVariable elem){
		'''�elem.name�''' 
	}
	
	def static dispatch declareScriptVars(BoolVariable elem){
		'''�elem.name�'''
	}
	
	def static dispatch declareScriptVars(NumVariable elem){
		'''�elem.name�'''
	}
	
	def static dispatch declareScriptVars(Constant elem){
		'''�elem.name�'''
	}
	
	
	

	
// Literals
	
	def static dispatch declareLiteralAbs(Primitive elem){
		'''�declarePrimitive(elem)�'''
	}
	def static dispatch declareLiteralAbs(Literal elem){
		'''�declareLiteral(elem)�'''
	}
	
	def static dispatch declarePrimitive(BoolLiteral elem){
		'''�elem.value�'''
	}
 	def static dispatch declarePrimitive(StringLiteral elem){
		'''�elem.value�'''
	}
	def static dispatch declarePrimitive(NumLiteral elem){
		'''�elem.value�'''	
	}
	
	def static dispatch declareLiteral(Literal elem){
		if(elem.v!=null){
			'''�declareVars(elem.v)�'''
		}else if(elem.nul!=null){
			'''null'''
		
			
		}else {
			
		
		}
		
	}
	
	

 	def static dispatch declareLiteral(SESSION elem){
 		if(elem.name.equals('CALLER')){
 			'''<value expr="session.callerid"/>'''
 		}else if(elem.name.equals('CALLED')){
 			'''<value expr="session.calledid"/>'''
 		}
 		else if(elem.name.equals('LASTSTATE')){
 			'''<value expr="LASTSTATE"/>'''
 		
 		} else if(elem.name.equals('ANSWER')){
 			'''<value expr="ANSWER"/>'''
 		
 		} else if(elem.name.equals('RECORD')){
 			'''<value expr="RECORD"/>'''
 		
 		} else if(elem.name.equals('DIGITS')){
 			'''<value expr="DIGITS"/>'''
 		
 		} 	
 			else if(elem.name.equals('TIMES')){
 			'''<value expr="times_�state�_dime"/>'''
 		
 		} 	
 		
 		else{
 			''''''
 		}
 			
 	
 	}
// For JavaScript

	def static dispatch declareScriptLiteralAbs(Primitive elem){
		'''�declareScriptPrimitive(elem)�'''
	}
	def static dispatch declareScriptLiteralAbs(Literal elem){
		'''�declareScriptLiteral(elem)�'''
	}
	
	def static dispatch declareScriptPrimitive(BoolLiteral elem){
		'''�elem.value�'''
	}
 	def static dispatch declareScriptPrimitive(StringLiteral elem){
		'''&quot;�elem.value�&quot;'''
	}
	def static dispatch declareScriptPrimitive(NumLiteral elem){
		'''�elem.value�'''	
	}
	
	def static dispatch declareScriptLiteral(Literal elem){
		if(elem.v!=null){
			'''�declareScriptVars(elem.v)�'''
		}else if(elem.nul!=null){
			'''null'''
		
			
		}else {
			
		
		}
		 
	}
	


 	def static dispatch declareScriptLiteral(SESSION elem){
 		if(elem.name.equals('CALLER')){
 			'''session.callerid'''
 		}else if(elem.name.equals('CALLED')){
 			'''session.calledid'''
 		}
 		else if(elem.name.equals('LASTSTATE')){
 			'''LASTSTATE'''
 		
 		} else if(elem.name.equals('ANSWER')){
 			'''ANSWER'''
 		
 		} else if(elem.name.equals('RECORD')){
 			'''RECORD'''
 		
 		} else if(elem.name.equals('DIGITS')){
 			'''DIGITS'''
 		
 		} 	
 			else if(elem.name.equals('TIMES')){
 			'''times_�state�_dime'''
 		
 		} 	
 		
 		else{
 			''''''
 		}
 	}


//VoiceTags
	def static dispatch declareVoiceTag(Wait elem){
		'''<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<prompt> <break time="�elem.seconds�s"/></prompt> 
</block>
'''
	}
	def static dispatch declareVoiceTag(Data elem){
		'''<!-- Send implementation for HTTP GET with cURL -->

<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<var name="response_dime" /> 
	<data name="response_dime" method="get" srcexpr="�declareScriptConcatenation(elem.url)�+&quot;?&quot;+�declareParam(elem.value)��FOR n :elem.stms�+&quot;&amp;&quot;+�declareParam(n.value)� �ENDFOR�" />
    <assign name="�declareScriptVars(elem.vari)�" expr="response_dime"/> 
</block>
 
<!-- End Send implementation--> '''
	}
	def static dispatch declareVoiceTag(Send elem){
	'''<!-- Send implementation for HTTP GET with cURL -->

<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<var name="response_dime" /> 
	<data name="response_dime" method="get" srcexpr="�declareScriptConcatenation(elem.url)��IF elem.params!=null�+&quot;?&quot;+�declareSendBlock(elem.params)��ENDIF�" />
</block>
 
<!-- End Send implementation--> '''
	}
	
	def static declareSendBlock(SendBlock elem){
		var s=declareParam(elem.value);
		var i =0;
		var size = elem.stms.size;
		if(size!=0){
			while(i<size){
			s=s+"+&quot;&amp;&quot;+"+declareParam(elem.stms.get(i).value);
			i=i+1;
			}
		}
		
		'''�s�'''
	}
	
	def static declareParam(Param elem){
		'''&quot;�elem.name�=&quot;+escape(�declareScriptConcatenation(elem.value)�)'''
	}
	
	
	
	def static dispatch declareVoiceTag( Say elem){
			'''<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<prompt>�declareConcatenation(elem.that)�</prompt>
</block>'''	
		
	}
	
	
	

	
	def static dispatch declareVoiceTag( Play elem){
	
			'''<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<prompt> 
		<audio expr="�declareScriptConcatenation(elem.file)�" />
	</prompt>
</block>'''

		
		
		
	}
	
	
	def static dispatch declareVoiceTag( Record elem){
		'''<record �IF !cond.equals("")�cond="�cond�"�ENDIF� name="RECORD" beep="true" maxtime="�elem.time�" />'''
	}
	
	def static dispatch declareVoiceTag( Reject elem){
		'''<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<disconnect/>
</block>'''
	}
	
	def static dispatch declareVoiceTag( Hangup elem){
		'''<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<disconnect/>
</block>'''
	}
	
	def static dispatch declareVoiceTag( GetDigits elem){
		'''<field �IF !cond.equals("")�cond="�cond�"�ENDIF� name="field_dime" type="digits?length=�elem.numDigits�" />
<block><assign name="DIGITS" expr="field_dime" /></block>'''
	}
	
	def static dispatch declareVoiceTag( Dial elem){
		var to=  declareScriptConcatenation(elem.to);
		if(to.toString().contains("sip:")){
			'''<transfer  �IF !cond.equals("")�cond="�cond�"�ENDIF� bridge="true" connecttimeout="300" destexpr="�declareScriptConcatenation(elem.to)�" />'''
			
		}else{
			'''<transfer �IF !cond.equals("")�cond="�cond�"�ENDIF� bridge="true" connecttimeout="300" destexpr="&quot;tel:&quot;+�declareScriptConcatenation(elem.to)�" />'''
		}
		
	}
	

	
	def static dispatch declareVoiceTag( Call elem){
		'''<block �IF !cond.equals("")�cond="�cond�"�ENDIF� >
	<data srcexpr="&quot;call_dime.php?number_dime=&quot;+�declareScriptConcatenation(elem.to)�" method="get"/>
	<disconnect/>
</block>'''  
	} 
	

	def static dispatch declareVoiceTag( Email elem){
		
		'''<!-- Email implementation -->
<var name="title_email_dime" exp="�declareScriptConcatenation(elem.title)�"/>
<var name="value_email_dime" exp="�declareScriptConcatenation(elem.value)�"/>
<var name="from_email_dime" exp="�declareScriptConcatenation(elem.from)�"/>
<block �IF !cond.equals("")�cond="�cond�"�ENDIF� >
<data srcexpr="&quot;email_dime.php?title_email_dime=&quot;+escape(title_email_dime)+&amp;&quot;value_email=&quot;+escape(value_email_dime)+&amp;&quot;from_email_dime=&quot;+escape(from_email_dime)+&amp;&quot;to_email_dime=�elem.to�&quot;" method="get"/>
</block>

<!-- End Email implementation -->'''
	}  
	
	//MIRAR COMPORTAMIENTO DE ESCAPE()
	
	def static dispatch declareVoiceTag( Sms elem){
		
		'''<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<data srcexpr="&quot;sms_dime.php?to_dime=&quot;+escape(�declareScriptConcatenation(elem.to)�)+&amp&quot;message_dime=&quot;+escape(�elem.value�)+&amp;&quot;from=�number�&quot;" method="get"/>
</block>'''
		
	} 
	// Statements
	
	
	def static dispatch declareStatement(StringVariable elem){
		
			'''�IF elem.value!=null�<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<assign name="�elem.name�" expr="�declareScriptConcatenation(elem.value)�" />
</block>�ENDIF�
<var name="�elem.name�" �IF elem.value!=null�expr="�declareScriptConcatenation(elem.value)�" �ENDIF�/>
'''	
	}
	
	def static dispatch declareStatement(NumVariable elem){
			'''�IF elem.value!=null�<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<assign name="�elem.name�" expr="�declareMathExpression(elem.value)�" />
</block>�ENDIF�
<var name="�elem.name�" �IF elem.value!=null�expr="�declareMathExpression(elem.value)�"�ENDIF�/>
'''			
	}
	
	
	def static dispatch declareStatement(BoolVariable elem){
			'''
�IF elem.value!=null�<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<assign name="�elem.name�" expr="�declareBoolExpression(elem.value)�" />
<block>�ENDIF�
<var name="�elem.name�" �IF elem.value!=null�expr="�declareBoolExpression(elem.value)�" �ENDIF�/>
'''
	}

	
	def static dispatch declareStatement(Constant elem){
		'''�IF elem.value!=null�<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<assign name="�elem.name�" expr="�declareScriptPrimitive(elem.value)�" />
</block>�ENDIF�
<var name="�elem.name�" �IF elem.value!=null�expr="�declareScriptPrimitive(elem.value)�" �ENDIF�/>
'''
	}
	
	
	

	


	def static declareTransition(Transition elem){
		
		if( elem.event.name.equals("COMPLETED")){
			'''<block �IF !cond.equals("")�cond="�cond�"�ENDIF�>
	<goto next="#�elem.target.name�"/>
</block>'''
		}else if(elem.event.name.equals("ERROR")){
					'''<catch �IF !cond.equals("")�cond="�cond�"�ENDIF� event="error">
	<goto next="#�elem.target.name�"/> 
</catch>
<catch �IF !cond.equals("")�cond="�cond�"�ENDIF� event="maxtime_disconnect">
	<goto next="#�elem.target.name�"/> 
</catch>
<catch �IF !cond.equals("")�cond="�cond�"�ENDIF� event="busy">
	<goto next="#�elem.target.name�"/> 
</catch>
<catch �IF !cond.equals("")�cond="�cond�"�ENDIF� event="noanswer">
	<goto next="#�elem.target.name�"/> 
</catch>
<catch �IF !cond.equals("")�cond="�cond�"�ENDIF� event="far_end_disconnect">
	<goto next="#�elem.target.name�"/> 
</catch>
<catch �IF !cond.equals("")�cond="�cond�"�ENDIF� event="near_end_disconnect">
	<goto next="#�elem.target.name�"/> 
</catch>'''
		}
		else if(elem.event.name.equals("HANGUP")){
					'''<catch �IF !cond.equals("")�cond="�cond�"�ENDIF� event="connection.disconnect">
	<goto next="#�elem.target.name�"/> 
</catch>'''
		}
		else{
			'''<catch  �IF !cond.equals("")�cond="�cond�"�ENDIF� event="times_�state�_event">
	<goto next="#�elem.target.name�"/> 
</catch>'''
		}
	}
	
	def static lessCond(String or, String st){
		return or.subSequence(3,or.length()-st.length())
	
	}


}