package org.telcodev.dsl.generator

import java.util.HashSet
import java.util.Set
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
import org.telcodev.dsl.dime.Data
import org.telcodev.dsl.dime.Say
import org.telcodev.dsl.dime.Send
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
import org.telcodev.dsl.dime.ConcatenationExpression
import org.telcodev.dsl.dime.Wait

class Twilio_php_generator {
	private static String appName
	private static String voice
	private static String url
	private static String name
	private static String language
	private static String twilioLanguage
	private static String token
	private static String sid
	private static String number;
	
	private static String errorRedirect
	private static String completedRedirect
	private static String hangupRedirect
	private static String timesRedirect
	private static String timeoutRedirect
	private static Set<String> variablesId
	private static Set<String> constantsId
	
	private static Record record;
	private static GetDigits getdigits;
	private static int timeout;
	
	
	
	def static void generateTwilioPhp(Resource resource, IFileSystemAccess fsa, Config config){
		//Setting parameters
		
		voice=config.twilio.voice
		twilioLanguage= config.twilio.language
		url= config.url
		language=config.language
		number= config.twilio.number
		sid= config.twilio.accountSid
		token= config.twilio.token
		
		
		System::out.println("")
		System::out.println("*****************************************************************************************")
		System::out.println("")
		System::out.println("Creating Twilio-Php "+ (resource.contents.head as Document).name+" application.");
	
		System::out.println("Generating resources folder.");
	
		System::out.println("Generating Twilio folder.");
	
		//Copy important Twilio files to the new directory
		
//		fsa.generateFile('res/Services/Twilio.php', CopyFile::readFile('res/twilio_php/Services/Twilio.php'))
//		fsa.generateFile('res/Services/cacert.pem', CopyFile::readFile('res/twilio_php/Services/cacert.pem'))
//		
//		fsa.generateFile('res/Services/Twilio/AutoPagingIterator.php', CopyFile::readFile('res/twilio_php/Services/Twilio/AutoPagingIterator.php'))
//		fsa.generateFile('res/Services/Twilio/Capability.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Capability.php'))
//		fsa.generateFile('res/Services/Twilio/InstanceResource.php', CopyFile::readFile('res/twilio_php/Services/Twilio/InstanceResource.php'))
//		fsa.generateFile('res/Services/Twilio/ListResource.php', CopyFile::readFile('res/twilio_php/Services/Twilio/ListResource.php'))
//		fsa.generateFile('res/Services/Twilio/Page.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Page.php'))
//		fsa.generateFile('res/Services/Twilio/PartialApplicationHelper.php', CopyFile::readFile('res/twilio_php/Services/Twilio/PartialApplicationHelper.php'))
//		fsa.generateFile('res/Services/Twilio/RequestValidator.php', CopyFile::readFile('res/twilio_php/Services/Twilio/RequestValidator.php'))
//		fsa.generateFile('res/Services/Twilio/Resource.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Resource.php'))
//		fsa.generateFile('res/Services/Twilio/RestException.php', CopyFile::readFile('res/twilio_php/Services/Twilio/RestException.php'))
//		fsa.generateFile('res/Services/Twilio/TimeRangeResource.php', CopyFile::readFile('res/twilio_php/Services/Twilio/TimeRangeResource.php'))
//		fsa.generateFile('res/Services/Twilio/TinyHttp.php', CopyFile::readFile('res/twilio_php/Services/Twilio/TinyHttp.php'))
//		fsa.generateFile('res/Services/Twilio/Twiml.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Twiml.php'))
//		fsa.generateFile('res/Services/Twilio/UsageResource.php', CopyFile::readFile('res/twilio_php/Services/Twilio/UsageResource.php'))
//		
//		
//		fsa.generateFile('res/Services/Twilio/Rest/Account.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Account.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Accounts.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Accounts.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Application.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Application.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Applications.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Applications.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/AuthorizedConnectApp.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/AuthorizedConnectApp.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/AuthorizedConnectApps.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/AuthorizedConnectApps.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/AvailablePhoneNumber.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/AvailablePhoneNumber.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/AvailablePhoneNumbers.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/AvailablePhoneNumbers.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Call.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Call.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Calls.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Calls.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Conference.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Conference.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Conferences.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Conferences.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/ConnectApp.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/ConnectApp.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/ConnectApps.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/ConnectApps.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/IncomingPhoneNumber.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/IncomingPhoneNumber.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/IncomingPhoneNumbers.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/IncomingPhoneNumbers.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Member.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Member.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Members.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Members.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Notification.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Notification.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Notifications.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Notifications.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/OutgoingCallerId.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/OutgoingCallerId.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/OutgoingCallerIds.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/OutgoingCallerIds.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Participant.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Participant.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Participants.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Participants.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Queue.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Queue.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Queues.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Queues.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Recording.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Recording.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Recordings.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Recordings.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Sandbox.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Sandbox.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/ShortCode.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/ShortCode.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/ShortCodes.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/ShortCodes.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/SmsMessage.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/SmsMessage.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/SmsMessages.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/SmsMessages.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Transcription.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Transcription.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/Transcriptions.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Transcriptions.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/UsageRecord.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/UsageRecord.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/UsageRecords.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/UsageRecords.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/UsageTrigger.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/UsageTrigger.php'))
//		fsa.generateFile('res/Services/Twilio/Rest/UsageTriggers.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/UsageTriggers.php'))
		

		fsa.generateFile('README.txt',  'Copy inside the res folder the Twilio Service folder. ')
		fsa.generateFile('res/COPY-HERE.txt',  'Copy inside this folder the Twilio Service folder. ')
		appName=className(resource) 
		variablesId= new HashSet<String>()
		constantsId= new HashSet<String>()
		
		variablesId.add("times_dime")
		
		System::out.println("Creating "+"globals_dime"+".php file");
		
		fsa.generateFile("globals_dime.php", toTwilioPHP(resource.contents.head as Document, resource))
		
		System::out.println("Creating "+"call_dime"+".php file");
		
		fsa.generateFile("call_dime.php",declareCall())
		fsa.generateFile("token.php", tokenFile)
		for(state :( resource.contents.head as Document).sta){
				variablesId.add("times_"+state.name+"_dime")
		}
		for(state :( resource.contents.head as Document).sta){
			
				fsa.generateFile(state.name+".php",declareState(state))
		
			
			
		}
		
		System::out.println("Success.");
		System::out.println("");
	}
	
	def static className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
	
	


	def static toTwilioPHP(Document sm, Resource resource) {
	
			'''<?php 

// Defining global constants and variables

«FOR c : sm.elements»«declareGlobalStatement(c)»
«ENDFOR»




?>'''
		

	}  

	def static tokenFile(){
		'''<?php

$url= "«url»start.php";
		$curl_handle=curl_init();
		curl_setopt($curl_handle,CURLOPT_URL,$url);
		curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
		curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
		curl_exec($curl_handle);
		curl_close($curl_handle);
echo "<h1>Twilio token, from a Dime application.</h1>";

?> '''}


	def static dispatch declareGlobalStatement(Constant elem){
			constantsId.add(elem.name)
			
		
	 '''«declareStatement(elem)»'''
	}
	
	def static dispatch declareGlobalStatement(BoolVariable elem){
		variablesId.add(elem.name)
		if(elem.value!=null){
		
			'''$«elem.name»=«declareBoolExpression(elem.value)»;'''
		}else{
			''''''
		}
		
		
	}
	
	def static dispatch declareGlobalStatement(StringVariable elem){
			variablesId.add(elem.name)
			if(elem.value!=null){
			
			'''$«elem.name»=«declareConcatenation(elem.value)»;'''
		}
			else{
				''''''
			}
	}
	
	def static dispatch declareGlobalStatement(NumVariable elem){
			variablesId.add(elem.name)
				if(elem.value!=null){
					
					'''$«elem.name»=«declareMathExpression(elem.value)»;'''
				}
			
			else{
					''''''
			}
		
	}
	
// States declaration:

	
	
	def  static declareState(State elem){
		
		var first=true;
		name=elem.name;
		System::out.println("Generating "+elem.name.toUpperCase+" state.");
		getdigits=null;
		record=null;
		timeout=elem.timeout;
	
			 
'''
<?php

require "res/Services/Twilio.php";
require "globals_dime.php";

//Auxiliar functions

function get_data($url) {
  $ch = curl_init();
  $timeout = 5;
  curl_setopt($ch, CURLOPT_URL, $url);
  curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
  curl_setopt($ch, CURLOPT_CONNECTTIMEOUT, $timeout);
  $data = curl_exec($ch);
  curl_close($ch);
  return $data;
}


// State «elem.name» implementation


	header("content-type: text/xml");
	
	// Update of the value of the global constants and variables, and the session params.
	«FOR d: variablesId»
	«declareStateGlobalVariable(d)» 
	«ENDFOR»
	«IF hangupRedirect!=null»
	
	«IF !first»else «ENDIF»if($_REQUEST["CallStatus"]=="hangup"){
		if(isset($_GET['hangupurl_dime']){
			$url=$_GET['hangupurl_dime']."?"laststate_dime=«name»";
			«IF !variablesId.isEmpty()»«saveGlobalVariableXML("url")»«ENDIF»
			echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?> ";
			echo "<Response>";
			echo "<Redirect>".$url."</Redirect>";
			echo "</Response>";
			exit();
		}
	}«ENDIF»
	
	«IF errorRedirect!=null»
	«IF !first»else «ENDIF»if($_REQUEST["CallStatus"]=="fail"){
		if(isset($_GET['errorurl_dime']){
			$url=$_GET['errorurl_dime']."?"laststate_dime=«name»";
			«IF !variablesId.isEmpty()»«saveGlobalVariableXML("url")»«ENDIF»
			echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?> ";
			echo "<Response>";
			echo "<Redirect>".$url."</Redirect>";
			echo "</Response>";
			exit();
		}
	}«ENDIF»
	
	«IF !first»else «ENDIF»if((!isset($_REQUEST['CallStatus']))||$_REQUEST["CallStatus"]=="in-progress"|| $_REQUEST["CallStatus"]=="ringing"|| $_REQUEST["CallStatus"]=="queued"){
	
	
	
	
	if(isset($_GET['times_«elem.name»_dime'])){
		$times_«elem.name»_dime=intval($_GET['times_«elem.name»_dime'])+1;
		«IF elem.times!=0»
		// Times signal appears when the param reached the atribute times of the state
		
		if($_GET['times_«elem.name»_dime']==«elem.times»){
			
			if(isset($_GET['timesurl_dime'])){
			$url=$_GET['timesurl_dime']."?laststate_dime=«name»";
			$times_url=NULL;
			«IF !variablesId.isEmpty()»«saveGlobalVariableXML("url")»«ENDIF»
			echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?> ";
			echo "<Response>";
			echo "<Redirect>".$url."</Redirect>";
			echo "</Response>";
			exit();
			}
		}«ENDIF»			
		
	}else{
		$times_«elem.name»_dime=1;
		
	}
	
	«IF elem.name.equals("start")»

	«ENDIF»
	
		// Declaration of the statements of the state.
		
	echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?> ";
	echo "<Response>";	
		«FOR c : elem.stms»
		«declareAbstractElement(c)»
	«ENDFOR»
	
		«IF completedRedirect!=null »
		«IF record!=null»if($recordtag_dime==TRUE){
			«declareVoiceTag(record)»
		}«ENDIF»«IF getdigits!=null»if($getdigits_dime==TRUE){
			«declareVoiceTag(getdigits)»
		}«ENDIF»
		$url=$completedurl_dime."?"."laststate_dime=«elem.name»";
		«IF !variablesId.isEmpty()»«saveGlobalVariableXML("url")»«ENDIF»
		if(isset($hangupurl_dime)){
			$url=$url."&amp;hangupurl_dime=".$hangupurl_dime;
		}
		if(isset($errorurl_dime)){
			$url=$url."&amp;errorurl_dime=".$errorurl_dime;
		}
		if(isset($timesurl_dime)){
			$url=$url."&amp;timesurl_dime=".$timesurl_dime;
		}
		
		echo "<Redirect>".$url."</Redirect>";
		«ENDIF»
	
		echo "</Response>";
	}
	
«errorRedirect=null»«completedRedirect=null»«hangupRedirect=null»«timesRedirect=null»«timeoutRedirect=null»

?>'''


	
	}
	

	
	// Auxiliar functions for state

	def static  declareStateGlobalVariable(String elem){
		
		'''if(isset($_GET['«elem»'])){
	$«elem»=$_GET['«elem»'];
}'''
	}
	
		
	def static saveGlobalVariable(String elem){
	
		
		'''«FOR n: variablesId»if(isset($«n»)){
	$«elem»=$«elem»."&«n»=".urlencode($«n»);
}«ENDFOR»'''
	}
	def static saveGlobalVariableXML(String elem){
	
		
		'''«FOR n: variablesId»if(isset($«n»)){
	$«elem»=$«elem»."&amp;«n»=".urlencode($«n»);
}«ENDFOR»'''
	}
	 


// Abstract elements

def static dispatch declareAbstractElement(VoiceTag elem){
		'''«declareVoiceTag(elem)»'''
	}
	
	
	def static dispatch declareAbstractElement(IfExp elem){		
'''«declareStructure(elem)»'''
	}
	def static dispatch declareAbstractElement(Statement elem){
'''«declareStatement(elem)»'''
	}

		def static dispatch declareAbstractElement(Transition elem){
'''«declareTransition(elem)»'''
	}  

// Declare if structure

	def static declareStructure(IfExp elem){
'''«declareCondBlock(elem.block)»
«IF elem.blocks!=null»«FOR e: elem.blocks »else «declareCondBlock(e)»
«ENDFOR»«ENDIF»
«IF elem.defaultBlock!=null»else «declareBlock(elem.defaultBlock)»«ENDIF»'''
		 
  
	}
	def static declareBlock(Block elem){
		'''{
		«FOR c: elem.sta»«declareAbstractElement(c)»
		«ENDFOR»
		}'''
	}
	
	
	def static declareCondBlock(CondBlock elem){
		'''if(«declareBoolExpression(elem.cond)»)«IF elem.action!=null»«declareBlock(elem.action)»«ENDIF»'''
	}	
	
	

	
	


// Expressiones
	def static dispatch declareBoolExpression(CALLSTATUS elem){
		 if(elem.name.equals("RINGING")){
		 	'''($_REQUEST['CallStatus']=="RINGING")'''
		 }else if(elem.name.equals("IN-PROGRESS")){
		 	'''($_REQUEST['CallStatus']=="ANSWERING"|| $_REQUEST['CallStatus']=="ANSWERED")'''
		 	}else if(elem.name.equals("DISCONNECTED")){
		 	'''($_REQUEST['CallStatus']=="DISCONNECTED")'''
		 	}else if(elem.name.equals("FAILED")){
		 	'''($_REQUEST['CallStatus']=="FAILED")'''
		 	}
		 	else{
		 	''''''
		 }
	}
	def static dispatch declareBoolExpression(BoolLiteral elem){
		'''«elem.value»'''
	}
	def static dispatch declareBoolExpression(Literal elem){
		'''«declareLiteral(elem)»'''
	}


	def static dispatch declareBoolExpression(CompareExpression elem){
		'''«declareLiteralAbs(elem.left)»«elem.op»«declareLiteralAbs(elem.right)»'''
	}
 
	def static dispatch declareBoolExpression(NegExpression elem){
		'''«elem.op»«declareBoolExpression(elem.obj)»'''
	}

	def static dispatch declareBoolExpression(OperationBool elem){
		'''«declareBoolExpression(elem.left)»«elem.op»«declareBoolExpression(elem.right)»'''
	}

	def static dispatch declareBoolExpression(Brackets elem){
		'''(«declareBoolExpression(elem.obj)»)'''
	}



	def static dispatch declareMathExpression(Operation elem){
		'''«declareMathExpression(elem.left)»«elem.op»«declareMathExpression(elem.right)»'''
	}

	def static dispatch declareMathExpression(Literal elem){
		'''«declareLiteral(elem)»'''
	}
		def static dispatch declareMathExpression(NumLiteral elem){
		'''«declareLiteralAbs(elem)»'''
	}
	
	def static dispatch declareMathExpression(MathBrackets elem){
		'''(«declareMathExpression(elem.obj)»)'''
	}


	def static dispatch declareConcatenation(Concatenation elem){
		'''«declareConcatenation(elem.left)».«declareConcatenation(elem.right)»'''
	}

	def static dispatch declareConcatenation(LiteralAbs elem){
		'''«declareLiteralAbs(elem)»'''
	}
	
	def static dispatch declareConcatenation(ConcatenationBrackets elem){
		'''(«declareConcatenation(elem.obj)»)'''
	}

	def static dispatch declareVars(StringVariable elem){
		'''$«elem.name»''' 
	}
	
	def static dispatch declareVars(BoolVariable elem){
		'''$«elem.name»'''
	}
	
	def static dispatch declareVars(NumVariable elem){
		'''$«elem.name»'''
	}
	
	def static dispatch declareVars(Constant elem){
		'''«elem.name»'''
	}
	

	
	
	def static declareVariable(StringVariable elem){
		 '''$«elem.name»«IF elem.value!=null»=«declareConcatenation(elem.value)»«ENDIF»''' 	
	}
	
	def static declareVariable(NumVariable elem){
		 '''$«elem.name»«IF elem.value!=null»=«declareMathExpression(elem.value)»«ENDIF»''' 	
	}
	
	def static declareVariable(BoolVariable elem){
		 '''$«elem.name»«IF elem.value!=null»=«declareBoolExpression(elem.value)»«ENDIF»''' 	
	}
	
// Literals
	
	def static dispatch declareLiteralAbs(Primitive elem){
		'''«declarePrimitive(elem)»'''
	}
	def static dispatch declareLiteralAbs(Literal elem){
		'''«declareLiteral(elem)»'''
	}
	
	def static dispatch declarePrimitive(BoolLiteral elem){
		'''«elem.value»'''
	}
 	def static dispatch declarePrimitive(StringLiteral elem){
		'''"«elem.value»"'''
	}
	def static dispatch declarePrimitive(NumLiteral elem){
		'''«elem.value»'''	
	}
	
	def static dispatch declareLiteral(Literal elem){
		if(elem.v!=null){
			'''«declareVars(elem.v)»'''
		}else if(elem.nul!=null){
			'''null'''
		
			
		}else {
			
		
		}
		
	}
	
	

 	def static dispatch declareLiteral(SESSION elem){
 		if(elem.name.equals('CALLER')){
 			'''$_REQUEST['From']'''
 		}else if(elem.name.equals('CALLED')){
 			'''$_REQUEST['To']'''
 		}
 		else if(elem.name.equals('LASTSTATE')){
 			'''$_GET['laststate_dime']'''
 		
 		} else if(elem.name.equals('ANSWER')){
 			'''$_REQUEST['TranscriptionText']'''
 		
 		} else if(elem.name.equals('RECORD')){
 			'''$_REQUEST['RecordingUrl']'''
 		
 		} else if(elem.name.equals('DIGITS')){
 			'''intval($_REQUEST['Digits'])'''
 		
 		} 	
 			else if(elem.name.equals('TIMES')){
 			'''intval($_GET['times_«name»_dime'])'''
 		
 		} 	
 		
 		else{
 			''''''
 		}
 	}
	
	
//VoiceTags

	def static dispatch declareVoiceTag(Wait elem){
		'''echo "<Pause length="«elem.seconds»"/>;'''
	}


	def static dispatch declareVoiceTag(Data elem){
		
		'''// Data implementation
$data_dime = get_data(urlencode(«declareConcatenation(elem.url)»."?".«IF elem.value!=0»«declareParam(elem.value)»«FOR n :elem.stms»."&".«declareParam(n.value)» «ENDFOR»«ENDIF»));
$data_dime= json_decode($data_dime, true);
$«declareVars(elem.vari)»=$data_dime['«declareVars(elem.vari)»'];

// End of Data implementation'''
	}
	def static dispatch declareVoiceTag(Send elem){
	'''// Send implementation for HTTP GET with cURL.
	
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,urlencode(«declareConcatenation(elem.url)»«IF elem.params!=null»."?".«declareSendBlock(elem.params)»«ENDIF»));
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);'''
	}
	
	def static declareSendBlock(SendBlock elem){
		var s=declareParam(elem.value);
		var i =0;
		var size = elem.stms.size;
		if(size!=0){
			while(i<size){
			s=s+".\"&\"."+declareParam(elem.stms.get(i).value);
			i=i+1;
			}
		}
		
		'''«s»'''
	}
	
	def static declareParam(Param elem){
		'''"«elem.name»=".«declareConcatenation(elem.value)»'''
	}
	
	
	
	
	def static dispatch declareVoiceTag( Say elem){
		'''echo "<Say voice=\"«voice»\" language=\"«twilioLanguage»\">".«declareConcatenation(elem.that)»."</Say>\n"; '''
	}
	
	
	
//	def static dispatch declareVoiceTag( Ask elem){
//		
//		'''if(isset($completedurl_dime)){
//$url_dime=$completedurl_dime."?laststate_dime=«name»";
//«saveGlobalVariableXML("url_dime")»
//echo "<Record transcribe=\"true\" transcribeCallback=\"".$url_dime."\" /> \n";
//}
//			'''
//	}
//	
	
	def static dispatch declareVoiceTag( Play elem){
		'''echo "<Play>".«declareConcatenation(elem.file)»."</Play>\n"; '''
	}
	
	
	def static dispatch declareVoiceTag( Record elem){
		record=elem;
		'''if(isset($completedurl_dime)){
	$url_dime=$completedurl_dime."?laststate_dime=«name»";
	«saveGlobalVariableXML("url_dime")»
	echo "<Record action=\"".urlencode($url_dime)."\" method=\"GET\" maxLength=\"«elem.time»\" finishOnKey=\"*\" /> \n";
	echo "</Response>";
	exit();
}else{
	$recordtag_dime=TRUE;
}
		'''
	}
	def static dispatch declareVoiceTag( Reject elem){
		'''echo "<Reject /> \n"; '''
	}
	def static dispatch declareVoiceTag( Hangup elem){
		'''echo "<Hangup /> \n"; '''
	}
	
	
	
	//
	def static dispatch declareVoiceTag( GetDigits elem){
		getdigits=elem;
		'''if(isset($completedurl_dime)){
	$url_dime=$completedurl_dime."?laststate_dime=«name»";
	«saveGlobalVariableXML("url_dime")»
	echo "<Gather action=\"".urlencode($url_dime)."\"  «IF elem.numDigits!=0»numDigits=\"«elem.numDigits»\" «ENDIF»«IF timeout!=0»timeout=\""."«timeout»"."\"«ENDIF» ></Gather>";
	echo "</Response>";
	exit();
}else{
	$getdigits_dime=TRUE;
}
	'''
	}
	def static dispatch declareVoiceTag( Dial elem){
		'''echo "<Dial callerId=\""."«number»"."\" «IF timeout!=0»timeout=\""."«timeout»"."\"«ENDIF»> \n <Number>".«declareConcatenation(elem.to)»."</Number> \n </Dial> \n";'''
	}
	def static dispatch declareVoiceTag( Call elem){
		
		'''«declareCallSignal(elem.to,name)»'''  
	} 
	
	def static declareCallSignal(ConcatenationExpression elem, String next){
		'''//  HTTP GET with cURL to activate the call.
if(!isset($_REQUEST['CallStatus'])){
	$curl_handle=curl_init();
	$url_dime="«url»call_dime.php?number_dime=".urlencode(«declareConcatenation(elem)»)."&next_dime="."«next»&laststate_dime=«name»";
	«IF !variablesId.isEmpty()»«saveGlobalVariable("url_dime")»«ENDIF»
	curl_setopt($curl_handle,CURLOPT_URL, urlencode($url_dime));
	curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,20);
	curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
	curl_exec($curl_handle);
	curl_close($curl_handle);
	
	exit();
	
}
	'''
	}
	def static declareCall(){
		'''
<?php
	// Include the Twilio PHP library
	require 'res/Services/Twilio.php';
	sleep(15);
	// Twilio REST API version
	$version = "2010-04-01";

	// Set our Account SID and AuthToken
	$sid = "«sid»";
	$token = '«token»';
	
	// A phone number you have previously validated with Twilio
	$phonenumber = '«number»';

	// Instantiate a new Twilio Rest Client
	$client = new Services_Twilio($sid, $token, $version);

	try {
		$url="«url»".$_GET['next_dime'].".php?laststate_dime=".$_GET['laststate_dime'];
		«IF !variablesId.isEmpty()»«saveGlobalVariable("url")»«ENDIF»
		// Initiate a new outbound call
		$call = $client->account->calls->create(
			$phonenumber, // The number of the phone initiating the call
			$_GET['number_dime'], // The number of the phone receiving call
			urlencode($url) // The URL Twilio will request when the call is answered
		);
		echo 'Started call: ' . $call->sid;
	} catch (Exception $e) {
		echo 'Error: ' . $e->getMessage();
	}
		?>
		'''
	}



	def static dispatch declareVoiceTag( Email elem){
		
		'''
		// Email implementation
		
		mail(«declareConcatenation(elem.to)», «declareConcatenation(elem.title)»,«declareConcatenation(elem.value)», "From: <".«declareConcatenation(elem.from)»."> \r\n"); '''
	}  
	def static dispatch declareVoiceTag( Sms elem){
		'''echo "<Sms from=\""."«number»"."\" "." to=\«declareConcatenation(elem.to)»."\">".«declareConcatenation(elem.value)»."</Sms>";'''
	} 
	// Statements
	
	
	def static dispatch declareStatement(StringVariable elem){
		'''«declareVariable(elem)»;'''
	}
	def static dispatch declareStatement(NumVariable elem){
		'''«declareVariable(elem)»;'''
	}  

	
	def static dispatch declareStatement(BoolVariable elem){
		'''«declareVariable(elem)»;'''
	}
	
	def static dispatch declareStatement(Constant elem){
		'''«declareConstant(elem)»;'''
	}
	
	
	
	def static declareConstant(Constant elem){
		'''define("«elem.name»",«declarePrimitive(elem.value)»)'''
	}
	
	def static declareTransition(Transition elem){
		if(elem.event.name.equals("ERROR")){
			errorRedirect=elem.target.name+".php";
				'''$errorurl_dime="«errorRedirect»";'''
		}else if(elem.event.name.equals("HANGUP")){
			hangupRedirect=elem.target.name+".php";
				'''$hangupurl_dime="«hangupRedirect»";'''
		}else if(elem.event.name.equals("COMPLETED")){
			completedRedirect=elem.target.name+".php";
				'''$completedurl_dime="«completedRedirect»";'''
		}else if(elem.event.name.equals("TIMES")){
			timesRedirect=elem.target.name+".php";
				'''$timesurl_dime="«timesRedirect»";'''
		}else if(elem.event.name.equals("TIMEOUT")){
			timeoutRedirect=elem.target.name+".php";
				'''$timeouturl_dime="«timeoutRedirect»";'''
		}else {
				''''''
		}
		
		
		
	}
	


}