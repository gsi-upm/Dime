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
import org.telcodev.dsl.dime.Data
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
import static org.telcodev.dsl.generator.Tropo_php_generator.*
import org.telcodev.dsl.dime.SendBlock
import org.telcodev.dsl.dime.Param
import org.telcodev.dsl.dime.MathBrackets
import org.telcodev.dsl.dime.ConcatenationBrackets
import org.telcodev.dsl.dime.Call
import java.util.HashMap
import org.telcodev.dsl.dime.Primitive
import org.telcodev.dsl.dime.Constant
import org.telcodev.dsl.dime.EVENT
import org.telcodev.dsl.dime.SESSION
import org.telcodev.dsl.dime.CALLSTATUS
import org.telcodev.dsl.dime.Email
import org.telcodev.dsl.dime.Sms
import org.telcodev.dsl.dime.Wait

class Tropo_php_generator {
	private static String appName
	
	private static String user
	private static String password
	private static String token
	private static String voice
	private static String url
	private static String name
	private static Set<String> variablesId
	private static HashMap variables
	private static HashMap constants
	private static Set<String> constantsId
	
	private static int timeout;
	
	def static void generateTropoPhp(Resource resource, IFileSystemAccess fsa, Config config){
		//Setting parameters
		
		voice=config.tropo.voice 
		password=config.tropo.password 
		user=config.tropo.user 
		token=config.tropo.token 
		url= config.url
		System::out.println("")
	System::out.println("*****************************************************************************************")
	System::out.println("")
	System::out.println("Creating Tropo-Php "+ (resource.contents.head as Document).name+" application.");
	
	System::out.println("Generating resources folder.");
	
	// ESTE SOBRA DE MOMENTO
	
	
//	fsa.generateFile('res/signals.php', CopyFile::readFile('res/tropo_php/signals.php'))	
		
		//Copy important Tropo files to the new directory
		 
	fsa.generateFile('res/lib/limonade.php', CopyFile::readFile('res/tropo_php/lib/limonade.php'))
	fsa.generateFile('res/lib/limonade/abstract.php', CopyFile::readFile('res/tropo_php/lib/limonade/abstract.php'))
	fsa.generateFile('res/lib/limonade/abstract.php', CopyFile::readFile('res/tropo_php/lib/limonade/tests.php'))
	fsa.generateFile('res/lib/limonade/abstract.php', CopyFile::readFile('res/tropo_php/lib/limonade/assertions.php'))
	fsa.generateFile('res/lib/limonade/public/css/screen.css', CopyFile::readFile('res/tropo_php/lib/limonade/public/css/screen.css'))
	fsa.generateFile('res/lib/limonade/public/img/bg_header.png', CopyFile::readFile('res/tropo_php/lib/limonade/public/img/bg_header.png'))
	fsa.generateFile('res/lib/limonade/views/_debug.html.php', CopyFile::readFile('res/tropo_php/lib/limonade/views/_debug.html.php'))
	fsa.generateFile('res/lib/limonade/views/default_layout.php', CopyFile::readFile('res/tropo_php/lib/limonade/views/default_layout.php'))
	fsa.generateFile('res/lib/limonade/views/error.html.php', CopyFile::readFile('res/tropo_php/lib/limonade/views/error.html.php'))
	fsa.generateFile('res/lib/limonade/views/_notices.html.php', CopyFile::readFile('res/tropo_php/lib/limonade/views/_notices.html.php'))
	
	
		//Copy important Limonade files to the new directory
		
	fsa.generateFile('res/tropo.class.php', CopyFile::readFile('res/tropo_php/tropo.class.php'))
	fsa.generateFile('res/compatibility.php', CopyFile::readFile('res/tropo_php/compatibility.php'))
	fsa.generateFile('res/TropoClasses.php', CopyFile::readFile('res/tropo_php/TropoClasses.php'))
	fsa.generateFile('res/tropo-rest.class.php', CopyFile::readFile('res/tropo_php/tropo-rest.class.php'))
	
	
		variables= new  HashMap()
		constants= new  HashMap()
		appName=className(resource) 
		variablesId= new HashSet<String>()
		constantsId= new HashSet<String>()
		
		System::out.println("Creating "+appName+".php file");
		
		fsa.generateFile(appName+".php", Tropo_php_generator::toTropoPHP(resource.contents.head as Document, resource))
		fsa.generateFile("res/signals.php", declareSignal)
		
		fsa.generateFile("token.php", tokenFile)
		System::out.println("Success.");
		
	}
	
	def static className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
	def static declareSignal(){
		'''<?php
	if(isset($_GET['sessionID_dime'])&& isset($_GET['signal_dime'])){
		
		$urltimes = "https://api.tropo.com/1.0/sessions/".$_GET['sessionID']."/signals?action=signal&value=".$_GET['signal_dime'];
		$curl_handle=curl_init();
		curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
		curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
		curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
		curl_exec($curl_handle);
		curl_close($curl_handle);

		
		
	}

		?>'''
	}
	

	def static tokenFile(){
		'''<?php

$url= "http://api.tropo.com/1.0/sessions?action=create&token=«token»";
		$curl_handle=curl_init();
		curl_setopt($curl_handle,CURLOPT_URL,$url);
		curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
		curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
		curl_exec($curl_handle);
		curl_close($curl_handle);

echo "<h1>Tropo token, from a Dime application.</h1>";

?> '''
	}
	def static toTropoPHP(Document sm, Resource resource) {
		

			'''<?php
			
// Required Tropo files

require 'res/tropo.class.php';

// Limonade files for states simulation. More information in 

require 'res/lib/limonade.php';


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

// Defining constants

«FOR c : sm.elements»«declareGlobalStatement(c)»
«ENDFOR»

// Declaration of the states

«FOR c : sm.sta»«declareState(c)»
«ENDFOR»

run(); 
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
		
		'''«declareStatement(elem)»'''
	}
	
	def static dispatch declareGlobalStatement(StringVariable elem){
			variablesId.add(elem.name)
			if(elem.value!=null){
			variables.put(elem.name, declareConcatenation(elem.value))
		}
			
		'''«declareStatement(elem)»'''
	}
	
	def static dispatch declareGlobalStatement(NumVariable elem){
			variablesId.add(elem.name)
				if(elem.value!=null){
					variables.put(elem.name, declareMathExpression(elem.value))
				}
			
			
			'''«declareStatement(elem)»'''
	}
	
	
	
// States declaration
	
	



	def  static declareState(State elem){
		
		name=elem.name;
		System::out.println("Generating "+name+" state.");
		timeout=elem.timeout;
		
'''// State «elem.name» implementation

dispatch_post('/«elem.name»', 'app_«elem.name»');
function app_«elem.name»() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_«elem.name»_dime'])){
	$attempts=intval($_SESSION['times_«elem.name»_dime']);
	$attempts++;
	$_SESSION['times_«elem.name»_dime']=$attempts;
	«IF elem.times!=0»
		if($attempts==«elem.times»){
			$_SESSION['times_«elem.name»_dime']=0;
			$urltimes = "«url»res/signals.php?signal_dime=attemptsLimit«name»&sessionID_dime=".$_SESSION['sessionID_dime'];
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}
	«ENDIF»	
			
		
	}else{
		$_SESSION['times_«elem.name»_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	«FOR d: variablesId»
	«declareStateGlobalVariable(d)» 
	«ENDFOR»
	
	// Declaration of the statements of the state.
	
	«FOR c : elem.stms»
	«declareAbstractElement(c)»
	«ENDFOR»
	
	// Update the global variables and the session params.
	
	«FOR d: variablesId»
	«saveGlobalVariable(d)» 
	«ENDFOR»
	$_SESSION['lastState_dime']='«elem.name»';
	return $tropo->RenderJson();
}'''
	}
	
// Auxiliar functions for state


	
	
	def static declareStateGlobalVariable(String elem){
		'''if(isset($_SESSION['«elem»'])){
	$«elem»=$_SESSION['«elem»'];
}'''
	}
	
	
	
	def static saveGlobalVariable(String elem){
		'''if(isset($«elem»)){
	$_SESSION['«elem»']=$«elem»;
}
		  '''
	}
	
	
	def static inicializeGlobalVariable(String elem){
		'''$«elem»=«variables.get(elem)»;
$_SESSION['«elem»']=$«elem»;
		'''
	}


//Abstract elements

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
		 	'''($result_dime->getState()=="RINGING")'''
		 }else if(elem.name.equals("IN-PROGRESS")){
		 	'''($result_dime->getState()=="ANSWERING"| $result_dime->getState()=="ANSWERED")'''
		 	}else if(elem.name.equals("DISCONNECTED")){
		 	'''($result_dime->getState()=="DISCONNECTED")'''
		 	}else if(elem.name.equals("FAILED")){
		 	'''($result_dime->getState()=="FAILED")'''
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
			
		
		}
		
	}
	
	

 	def static dispatch declareLiteral(SESSION elem){
 		if(elem.name.equals('CALLER')){
 			'''$_SESSION['caller_dime']'''
 		}else if(elem.name.equals('CALLED')){
 			'''$_SESSION['called_dime']'''
 		}
 		else if(elem.name.equals('LASTSTATE')){
 			'''$_SESSION['lastState_dime']'''
 		} else if(elem.name.equals('ANSWER')){
 			'''$result_dime->getValue()'''
 		
 		} else if(elem.name.equals('RECORD')){
 			'''"ftp://«user»:«password»@ftp.tropo.com/recordings/record_".$_REQUEST['lastState_dime'].".mp3"'''
 		
 		} else if(elem.name.equals('DIGITS')){
 			'''intval($result_dime->getValue())'''
 		
 		} 	else if(elem.name.equals('TIMES')){
 			'''intval($_SESSION['times_«name»_dime'])'''
 		
 		} 	
 		else{
 			''''''
 		}
 	}
	 

//VoiceTags
	
	def static dispatch declareVoiceTag(Wait elem){
		'''$tropo->say("<break time="«»s"/>"); '''
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
		'''$tropo->say(«declareConcatenation(elem.that)», array("voice"=>"«voice»", "allowSignals"=>array("attemptsLimit«name»")))'''
	}
	
	
//	def static dispatch declareVoiceTag( Ask elem){
//		'''$tropo->record( array("say" => «declareConcatenation(elem.question)»,  "voice"=>"«voice»", "allowSignals"=>array( "attemptsLimit«name»")  «IF timeout!=null», 'timeout'=> «timeout»«ENDIF»))'''
//	}
//	
	
	def static dispatch declareVoiceTag( Play elem){
		'''$tropo->say(«declareConcatenation(elem.file)», array("allowSignals"=>array("attemptsLimit«name»")))'''
	}
	
	
	def static dispatch declareVoiceTag( Record elem){
	
	'''$tropo->record(array(
    'name' => 'recording',
    'say' => 'Please leave a message.',
   	'url' => 'ftp://«user»:«password»@ftp.tropo.com/recordings/record_«name».mp3',
    'terminator' => '#',
     «IF timeout!=0» 'timeout'=> «timeout» , «ENDIF»
    'maxSilence' => 3,
    'maxTime' => 10,
    'format' => 'audio/mp3',
  ));'''
	}
	def static dispatch declareVoiceTag( Reject elem){
		'''$tropo->reject()'''
	}
	def static dispatch declareVoiceTag( Hangup elem){
		'''$tropo->hangup()'''
	}
	def static dispatch declareVoiceTag( GetDigits elem){
	'''$tropo->ask("",array("choices"=> «IF elem.numDigits!=0»"[«elem.numDigits» DIGIT«IF elem.numDigits>1»S«ENDIF»]"«ELSE»"[1-50 DIGITS]" «ENDIF», "terminator" => "#", "name"=>"«elem.name»", "voice"=>"«voice»", "allowSignals"=>array("attemptsLimit«name»") «IF timeout!=0», 'timeout'=> «timeout»«ENDIF»))'''
	
	}
	def static dispatch declareVoiceTag( Dial elem){
		'''$tropo->transfer(«declareConcatenation(elem.to)», array( "allowSignals"=>array("attemptsLimit«name»") «IF timeout!=0», 'timeout'=> «timeout»«ENDIF»))'''
	}
	def static dispatch declareVoiceTag( Call elem){
		'''$tropo->call(«declareConcatenation(elem.to)», array( "allowSignals"=>array("attemptsLimit«name»") «IF timeout!=0», 'timeout'=> «timeout»«ENDIF»))'''
	} 
	

	

	def static dispatch declareVoiceTag( Email elem){
		'''
		// Email implementation
		
		mail(«declareConcatenation(elem.to)», «declareConcatenation(elem.title)»,«declareConcatenation(elem.value)», "From: <".«declareConcatenation(elem.from)»."> \r\n") '''
	} 
	def static dispatch declareVoiceTag( Sms elem){
		'''$tropo->call(«declareConcatenation(elem.to)», array('network'=>'SMS' «IF timeout!=null», 'timeout'=> «timeout»«ENDIF»));
$tropo->say(«declareConcatenation(elem.value)»)'''
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
				'''$tropo->on(array("event" => "incomplete", "next" =>"«appName».php?uri=«elem.target.name»"));
$tropo->on(array("event" => "error", "next" =>"«appName».php?uri=«elem.target.name»"));'''
			
		}else{
			'''$tropo->on(array("event" => "«declareEvent(elem.event)»", "next" =>"«appName».php?uri=«elem.target.name»"));'''
		}
		
	}
	
	def static declareEvent(EVENT elem){
		
		 if(elem.name.equals("COMPLETED")){
		 	'''continue'''
		 }else if(elem.name.equals("TIMEOUT")){
		 	'''timeExceeded'''
		 	}else if(elem.name.equals("TIMES")){
		 	'''attemptsLimit'''
		 	}
		 	else{
		 	''''''
		 }
	}


	

}