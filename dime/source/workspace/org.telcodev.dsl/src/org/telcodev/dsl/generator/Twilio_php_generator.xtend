package org.telcodev.dsl.generator

import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.telcodev.dsl.dime.Ask 
//import org.telcodev.dsl.dime.Assigment
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
import java.util.HashMap
import org.telcodev.dsl.dime.Primitive
import org.telcodev.dsl.dime.Constant
import org.telcodev.dsl.dime.SESSION
import org.telcodev.dsl.dime.CALLSTATUS
import org.telcodev.dsl.dime.Tweet
import org.telcodev.dsl.dime.Email
import org.telcodev.dsl.dime.Sms

class Twilio_php_generator {
	private static String appName
	private static String voice
	private static String url
	private static String name
	private static String language
	private static String twilioLanguage
	private static String errorRedirect
	private static String completedRedirect
	private static String hangupRedirect
	private static String timesRedirect
	private static String timeoutRedirect
	private static Set<String> variablesId
	private static HashMap variables
	private static HashMap constants
	private static Set<String> constantsId
	private static String number;
	
	def static void generateTwilioPhp(Resource resource, IFileSystemAccess fsa, Config config){
		//Setting parameters
		
		voice=config.twilio.voice
		twilioLanguage= config.twilio.language
		url= config.url
		language=config.language
		number= config.twilio.number
		
				System::out.println("")
	System::out.println("*****************************************************************************************")
	System::out.println("")
	System::out.println("Creating Twilio-Php "+ (resource.contents.head as Document).name+" application.");
	
	System::out.println("Generating resources folder.");
		//FALTAN ARCHIVOS DE LAS SIGNALS SI REALMENTE SE NECESITAN
		
//		//Copy important Slim files to the new directory
//		 		
//		fsa.generateFile('res/Slim/Environment.php', CopyFile::readFile('res/twilio_php/Slim/Environment.php'))
//		fsa.generateFile('res/Slim/Log.php', CopyFile::readFile('res/twilio_php/Slim/Log.php'))
//		fsa.generateFile('res/Slim/LogWriter.php', CopyFile::readFile('res/twilio_php/Slim/LogWriter.php'))
//		fsa.generateFile('res/Slim/Middleware.php', CopyFile::readFile('res/twilio_php/Slim/Middleware.php'))
//		fsa.generateFile('res/Slim/Route.php', CopyFile::readFile('res/twilio_php/Slim/Route.php'))
//		fsa.generateFile('res/Slim/Router.php', CopyFile::readFile('res/twilio_php/Slim/Router.php'))
//		fsa.generateFile('res/Slim/Slim.php', CopyFile::readFile('res/twilio_php/Slim/Slim.php'))
//		fsa.generateFile('res/Slim/View.php', CopyFile::readFile('res/twilio_php/Slim/View.php'))
//		
//		fsa.generateFile('res/Slim/Exception/Pass.php', CopyFile::readFile('res/twilio_php/Slim/Exception/Pass.php'))
//		fsa.generateFile('res/Slim/Exception/RequestSlash.php', CopyFile::readFile('res/twilio_php/Slim/Exception/RequestSlash.php'))
//		fsa.generateFile('res/Slim/Exception/Stop.php', CopyFile::readFile('res/twilio_php/Slim/Exception/Stop.php'))
//
//		fsa.generateFile('res/Slim/Http/Headers.php', CopyFile::readFile('res/twilio_php/Slim/Http/Headers.php'))
//		fsa.generateFile('res/Slim/Http/Request.php', CopyFile::readFile('res/twilio_php/Slim/Http/Request.php'))
//		fsa.generateFile('res/Slim/Http/Response.php', CopyFile::readFile('res/twilio_php/Slim/Http/Response.php'))
//		fsa.generateFile('res/Slim/Http/Util.php', CopyFile::readFile('res/twilio_php/Slim/Http/Util.php'))
//
//		fsa.generateFile('res/Slim/Middleware/ContentTypes.php', CopyFile::readFile('res/twilio_php/Slim/Middleware/ContentTypes.php'))
//		fsa.generateFile('res/Slim/Middleware/Flash.php', CopyFile::readFile('res/twilio_php/Slim/Middleware/Flash.php'))
//		fsa.generateFile('res/Slim/Middleware/MethodOverride.php', CopyFile::readFile('res/twilio_php/Slim/Middleware/MethodOverride.php'))
//		fsa.generateFile('res/Slim/Middleware/PrettyExceptions.php', CopyFile::readFile('res/twilio_php/Slim/Middleware/PrettyExceptions.php'))
//		fsa.generateFile('res/Slim/Middleware/SessionCookie.php', CopyFile::readFile('res/twilio_php/Slim/Middleware/SessionCookie.php'))
//
//		
//	
	
		//Copy important Twilio files to the new directory
		
		fsa.generateFile('res/Services/Twilio.php', CopyFile::readFile('res/twilio_php/Services/Twilio.php'))
		fsa.generateFile('res/Services/twilio_ssl_certificate.crt', CopyFile::readFile('res/twilio_php/Services/twilio_ssl_certificate.crt'))
		
		fsa.generateFile('res/Services/Twilio/AutoPagingIterator.php', CopyFile::readFile('res/twilio_php/Services/Twilio/AutoPagingIterator.php'))
		fsa.generateFile('res/Services/Twilio/Capability.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Capability.php'))
		fsa.generateFile('res/Services/Twilio/InstanceResource.php', CopyFile::readFile('res/twilio_php/Services/Twilio/InstanceResource.php'))
		fsa.generateFile('res/Services/Twilio/ListResource.php', CopyFile::readFile('res/twilio_php/Services/Twilio/ListResource.php'))
		fsa.generateFile('res/Services/Twilio/Page.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Page.php'))
		
		fsa.generateFile('res/Services/Twilio/PartialApplicationHelper.php', CopyFile::readFile('res/twilio_php/Services/Twilio/PartialApplicationHelper.php'))
		fsa.generateFile('res/Services/Twilio/RequestValidator.php', CopyFile::readFile('res/twilio_php/Services/Twilio/RequestValidator.php'))
		fsa.generateFile('res/Services/Twilio/Resource.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Resource.php'))
		fsa.generateFile('res/Services/Twilio/RestException.php', CopyFile::readFile('res/twilio_php/Services/Twilio/RestException.php'))
		fsa.generateFile('res/Services/Twilio/TinyHttp.php', CopyFile::readFile('res/twilio_php/Services/Twilio/TinyHttp.php'))
		fsa.generateFile('res/Services/Twilio/Twiml.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Twiml.php'))
		
		
		fsa.generateFile('res/Services/Twilio/Rest/Account.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Account.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Accounts.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Accounts.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Application.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Application.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Applications.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Applications.php'))
		fsa.generateFile('res/Services/Twilio/Rest/AuthorizedConnectApp.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/AuthorizedConnectApp.php'))
		fsa.generateFile('res/Services/Twilio/Rest/AuthorizedConnectApps.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/AuthorizedConnectApps.php'))
		fsa.generateFile('res/Services/Twilio/Rest/AvailablePhoneNumber.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/AvailablePhoneNumber.php'))
		fsa.generateFile('res/Services/Twilio/Rest/AvailablePhoneNumbers.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/AvailablePhoneNumbers.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Call.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Call.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Calls.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Calls.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Conference.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Conference.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Conferences.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Conferences.php'))
		fsa.generateFile('res/Services/Twilio/Rest/ConnectApp.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/ConnectApp.php'))
		fsa.generateFile('res/Services/Twilio/Rest/ConnectApps.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/ConnectApps.php'))
		fsa.generateFile('res/Services/Twilio/Rest/IncomingPhoneNumber.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/IncomingPhoneNumber.php'))
		fsa.generateFile('res/Services/Twilio/Rest/IncomingPhoneNumbers.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/IncomingPhoneNumbers.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Member.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Member.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Members.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Members.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Notification.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Notification.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Notifications.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Notifications.php'))
		fsa.generateFile('res/Services/Twilio/Rest/OutgoingCallerId.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/OutgoingCallerId.php'))
		fsa.generateFile('res/Services/Twilio/Rest/OutgoingCallerIds.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/OutgoingCallerId.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Participant.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Participant.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Participants.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Participants.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Queue.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Queue.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Queues.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Queues.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Recording.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Recording.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Recordings.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Recordings.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Sandbox.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Sandbox.php'))
		fsa.generateFile('res/Services/Twilio/Rest/ShortCode.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/ShortCode.php'))
		fsa.generateFile('res/Services/Twilio/Rest/ShortCodes.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/ShortCodes.php'))
		fsa.generateFile('res/Services/Twilio/Rest/SmsMessage.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/SmsMessage.php'))
		fsa.generateFile('res/Services/Twilio/Rest/SmsMessages.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/SmsMessages.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Transcription.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Transcription.php'))
		fsa.generateFile('res/Services/Twilio/Rest/Transcriptions.php', CopyFile::readFile('res/twilio_php/Services/Twilio/Rest/Transcriptions.php'))
		
		
		variables= new  HashMap()
		constants= new  HashMap()
		appName=className(resource) 
		variablesId= new HashSet<String>()
		constantsId= new HashSet<String>()
		
		System::out.println("Creating "+"index"+".php file");
		
		fsa.generateFile("globals.php", toTwilioPHP(resource.contents.head as Document, resource))
		
		
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
	
	
//FALTAN LAS GLOBALES

	def static toTwilioPHP(Document sm, Resource resource) {
	
			'''<?php 

// Defining global constants and variables

«FOR c : sm.elements»«declareGlobalStatement(c)»
«ENDFOR»




?>'''
		

	}  



	def static dispatch declareGlobalStatement(Constant elem){
			constantsId.add(elem.name)
			if(elem.value!=null){
					constants.put(elem.name, declarePrimitive(elem.value))
			}
	
		
	 '''«declareStatement(elem)»'''
	}
	
	def static dispatch declareGlobalStatement(BoolVariable elem){
		variablesId.add(elem.name)
		if(elem.value!=null){
			variables.put(elem.name, declareBoolExpression(elem.value))
		}
		
		''''''
	}
	
	def static dispatch declareGlobalStatement(StringVariable elem){
			variablesId.add(elem.name)
			if(elem.value!=null){
			variables.put(elem.name, declareConcatenation(elem.value))
		}
			
		''''''
	}
	
	def static dispatch declareGlobalStatement(NumVariable elem){
			variablesId.add(elem.name)
				if(elem.value!=null){
					variables.put(elem.name, declareMathExpression(elem.value))
				}
			
			
			''''''
	}
	
// States declaration:
	
	
	def  static declareState(State elem){
		var result=false
		var first=true;
	
		System::out.println("Generating "+elem.name.toUpperCase+" state.");
		
		
'''
<?php

require "res/Services/Twilio.php";
require "globals.php";

// State «elem.name» implementation


	header("content-type: text/xml");

	
	// Update of the value of the global constants and variables, and the session params.
	«FOR d: variablesId»
	«declareStateGlobalVariable(d)» 
	«ENDFOR»
	«IF hangupRedirect!=null»
	
	if($_REQUEST["CallStatus"]=="hangup"){
		echo "<Redirect>«hangupRedirect»?".«saveGlobalVariable()»"</Redirect>";
	}«ENDIF»
	
	«IF errorRedirect!=null»
	«IF !first»else «ENDIF»if($_REQUEST["CallStatus"]=="fail"){
		echo "<Redirect>«errorRedirect»?".«saveGlobalVariable()»"</Redirect>";
	}«ENDIF»
	
	«IF !first»else «ENDIF»if($_REQUEST["CallStatus"]=="in-progress"|| $_REQUEST["CallStatus"]=="ringing"|| $_REQUEST["CallStatus"]=="queued"){
		
	«IF elem.name.equals("start")»

	«ENDIF»
	
		// Declaration of the statements of the state.
		echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?> ";
		echo "<Response>";
		«FOR c : elem.stms»
		«declareAbstractElement(c)»
	«ENDFOR»
	
	
		// Update the global variables and the session params.
	
	
		«IF completedRedirect!=null && !result»echo "<Redirect>«completedRedirect»?".«saveGlobalVariable()»"?lastState=«elem.name»</Redirect>";«ENDIF»
	
		echo "</Response>";
	}
	

«IF elem.times!=0&& timesRedirect!=null» 
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_REQUEST['times']){
	$attempts=$_REQUEST['times'];
		if($attempts==«elem.times»){
			echo "<Redirect>«timesRedirect»?".«saveGlobalVariable()»"</Redirect>";
		}else{
			$attempts++;
		}
	}else{
		$_REQUEST['times']=1;
	}
	«ENDIF»
	
	«IF elem.timeout!=0 && timeoutRedirect!=null» 	
	
	// Timeout signal appears when the timeout atribute of the state is reached.
	
	«ENDIF»
	«errorRedirect=null»«completedRedirect=null»«hangupRedirect=null»«timesRedirect=null»«timeoutRedirect=null»
	
?>'''


	
	}
	
//
//	if($«elem»=="Digits"){
//	$«elem»= $_REQUEST['Digits'];
//}else if($«elem»=="TranscriptionText"){
//	$«elem»= $_REQUEST['TranscriptionText'];
//}
	

	
	
	
	// Auxiliar functions for state
	
	
	// AQUI HE HECHO UNA GILIPOLLEZ ENORME

	def static  declareStateGlobalVariable(String elem){
		
		'''$«elem»=$_GET['«elem»'];'''
	}
	
		
	def static saveGlobalVariable(){
		
		var N = variablesId.size();
		
		'''«FOR n: variablesId»«IF (N=N-1)==0»"«n»=".urlencode($«n»).«ELSE»"«n»=".urlencode($«n»)."&".«ENDIF»«ENDFOR»'''
	}
	
	


// Abstract elements

def static dispatch declareAbstractElement(VoiceTag elem){
		'''«declareVoiceTag(elem)»;'''
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
		 	'''($callStatus=="RINGING")'''
		 }else if(elem.name.equals("IN-PROGRESS")){
		 	'''($callStatus=="ANSWERING"| $callStatus=="ANSWERED")'''
		 	}else if(elem.name.equals("DISCONNECTED")){
		 	'''($callStatus=="DISCONNECTED")'''
		 	}else if(elem.name.equals("FAILED")){
		 	'''($callStatus=="FAILED")'''
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
	def static dispatch declareVars(Ask elem){
		'''$«elem.vari»'''
	}
	def static dispatch declareVars(GetDigits elem){
		'''$«elem.vari»'''
	}
	def static dispatch declareVars(Constant elem){
		'''«elem.name»'''
	}
	
// Variables and assigments

	//def static declareAssigment(Assigment elem){
		
	//	if(variables.contains(declareVars(elem.va).toString())){
	//		'''$«declareVars(elem.va)»=«declareRight(elem.right)»; 
//$_SESSION['«declareVars(elem.va)»'] = «declareVars(elem.va)»'''
	//	}
	//	else{
	//		'''$«declareVars(elem.va)»=«declareRight(elem.right)»'''
	//	}
		
	//}
	
	
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
			
		//	'''«declareConstantLiteral(elem)»'''
		}
		
	}
	
	

 	def static dispatch declareLiteral(SESSION elem){
 		if(elem.name.equals('CALLER')){
 			'''$_REQUEST['From']'''
 		}else if(elem.name.equals('CALLED')){
 			'''$_REQUEST['To']'''
 		}
 		else if(elem.name.equals('LASTSTATE')){
 			'''$lastState'''
 		} 	else if(elem.name.equals('TIME')){
 			'''$time'''
 		} 	
 		
 		else{
 			''''''
 		}
 	}
	
	
//VoiceTags


	
	def static dispatch declareVoiceTag(Send elem){
	'''// Send implementation for HTTP GET with cURL.
	
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,«declareConcatenation(elem.url)»«IF elem.params!=null»+"?"+«declareSendBlock(elem.params)»«ENDIF»);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle)'''
	}
	
	def static declareSendBlock(SendBlock elem){
		var s=declareParam(elem.value);
		var i =0;
		var size = elem.stms.size;
		if(size!=0){
			while(i<size){
			s=s+"+\"&\"+"+declareParam(elem.stms.get(i).value);
			i=i+1;
			}
		}
		//s=s+")";
		'''«s»'''
	}
	
	def static declareParam(Param elem){
		'''"«elem.name»="+«declareConcatenation(elem.value)»'''
	}
	
	// FALTAN EVENTOS
	
	
	def static dispatch declareVoiceTag( Say elem){
		'''echo "<Say voice=\"«voice»\" language=\"«twilioLanguage»\">".«declareConcatenation(elem.that)»."</Say>\n" '''
	}
	//FALTA HACER LA PREGUNTA
	
	def static dispatch declareVoiceTag( Ask elem){
		'''$_REQUEST['«elem.vari»']="TranscriptionText";
		echo "<Record transcribe=\"true\" transcribeCallback=\"«completedRedirect»\" /> \n"'''
	}
	
	
	def static dispatch declareVoiceTag( Play elem){
		'''echo "<Play>".«declareConcatenation(elem.file)»."</Play>\n" '''
	}
	
	
	def static dispatch declareVoiceTag( Record elem){
		'''echo "<Record action=\"«completedRedirect»\" method=\"GET\" maxLength=\"«elem.time»\" finishOnKey=\"*\" /> \n"'''
	}
	def static dispatch declareVoiceTag( Reject elem){
		'''echo "<Reject /> \n" '''
	}
	def static dispatch declareVoiceTag( Hangup elem){
		'''echo "<Hangup /> \n" '''
	}
	
	//FALTA DECLARAR LA VOICETAG SAYa
	// twilio envia a la direccion.
	def static dispatch declareVoiceTag( GetDigits elem){
		'''$_REQUEST['«elem.name»']="Digits";
		echo "<Gather action=\"«completedRedirect»\" numDigits=\"«elem.numDigits»\" > <Say>". «declareConcatenation(elem.question)»."</Say> </Gather>"'''
	}
	def static dispatch declareVoiceTag( Dial elem){
		'''echo "<Dial callerId=\""."«number»"."\">\n <Number>".«declareConcatenation(elem.to)»."</Number> \n </Dial> \n"'''
	}
	def static dispatch declareVoiceTag( Call elem){
		'''echo "<Dial callerId=\""."«number»"."\">\n <Number>".«declareConcatenation(elem.to)»."</Number> \n </Dial> \n"'''
	} 


//FALTAN POR IMPLEMENTAR
	
	def static dispatch declareVoiceTag( Tweet elem){
		''''''
	} 

	def static dispatch declareVoiceTag( Email elem){
		'''mail(«declareConcatenation(elem.to)», «declareConcatenation(elem.title)»,«declareConcatenation(elem.value)», "From: <".«declareConcatenation(elem.from)»."> \r\n") '''
	}  
	def static dispatch declareVoiceTag( Sms elem){
		'''echo "<Sms from=\""."«number»"."\" "." to=\«declareConcatenation(elem.to)»."\">".«declareConcatenation(elem.value)»."</Sms>"'''
	} 
	// Statements
	
	
	def static dispatch declareStatement(StringVariable elem){
		'''«declareVariable(elem)»;'''
	}
	def static dispatch declareStatement(NumVariable elem){
		'''«declareVariable(elem)»;'''
	}  
	//def static dispatch declareStatement(Assigment elem){
	//	'''«declareAssigment(elem)»;'''
	//}
	
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
			errorRedirect=url+elem.target.name+".php";
			
		}else if(elem.event.name.equals("HANGUP")){
			hangupRedirect=url+elem.target.name+".php";
		}else if(elem.event.name.equals("COMPLETED")){
			completedRedirect=url+elem.target.name+".php";
		}else if(elem.event.name.equals("TIMES")){
			timesRedirect=url+elem.target.name+".php";
		}else if(elem.event.name.equals("TIMEOUT")){
			timeoutRedirect=url+elem.target.name+".php";
		}else {
			
		}
		System::out.println("url:  "+url+elem.target.name+".php");
		System::out.println("url:  "+completedRedirect);
		
		
		''''''
		
	}
	


}