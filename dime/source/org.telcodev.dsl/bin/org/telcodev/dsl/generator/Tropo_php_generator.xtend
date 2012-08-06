package org.telcodev.dsl.generator

import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.telcodev.dsl.dime.Ask
import org.telcodev.dsl.dime.Assigment
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


import static org.telcodev.dsl.generator.Tropo_php_generator.*
import org.telcodev.dsl.dime.SendBlock
import org.telcodev.dsl.dime.Param
import org.telcodev.dsl.dime.MathBrackets
import org.telcodev.dsl.dime.ConcatenationBrackets
import org.telcodev.dsl.dime.Call



class Tropo_php_generator {
	private static String appName
	private static Set<String> variables
	private static String voice
	private static String url
	private static String name
	
	def static void generateTropoPhp(Resource resource, IFileSystemAccess fsa, Config config){
		//Setting parameters
		
		voice=config.tropo.voice
		url= config.url
		
		 		
	fsa.generateFile('res/signals.php', CopyFile::readFile('res/tropo_php/signals.php'))	
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
		
		appName=className(resource) 
		variables= new HashSet<String>()
		fsa.generateFile(appName+".php", Tropo_php_generator::toTropoPHP(resource.contents.head as Document, resource))
	}
	
	def static className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}

	def static toTropoPHP(Document sm, Resource resource) {
		

			'''<?php
require 'res/tropo.class.php';
require 'res/lib/limonade.php';
«FOR c : sm.elements»«declareGlobalVariable(c)»
«ENDFOR»
«FOR c : sm.sta»«declareState(c)»
«ENDFOR»
run(); 
?>'''
		
			}  
	
	def static dispatch declareGlobalVariable(Statement elem){
		addGlobalVariable(elem)
	 ''''''
	}
	
	def static dispatch declareGlobalVariable(IfExp elem){
		''''''
	}
	
	def static dispatch addGlobalVariable(BoolVariable elem){
		variables.add(elem.name)
	}
	
	def static dispatch addGlobalVariable(StringVariable elem){
			variables.add(elem.name)
	}
	
	def static dispatch addGlobalVariable(NumVariable elem){
			variables.add(elem.name)
	}
	
	
	
	


// Expressiones

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
		'''«elem.name»'''
	}
	
	def static dispatch declareVars(BoolVariable elem){
		'''«elem.name»'''
	}
	
	def static dispatch declareVars(NumVariable elem){
		'''«elem.name»'''
	}
	def static dispatch declareVars(Ask elem){
		'''«elem.name»'''
	}
	def static dispatch declareVars(GetDigits elem){
		'''«elem.name»'''
	}
	
// Variables and assigments

	def static declareAssigment(Assigment elem){
		
		if(variables.contains(declareVars(elem.va).toString)){
			'''$«declareVars(elem.va)»=«declareMathExpression(elem.right)»; 
$_SESSION['«declareVars(elem.va)»'] = «declareVars(elem.va)»'''
		}
		else{
			'''$«declareVars(elem.va)»=«declareMathExpression(elem.right)»'''
		}
		
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
	def static dispatch declareLiteralAbs(StringLiteral elem){
		'''"«elem.value»"'''
	}
	
	def static dispatch declareLiteralAbs(Literal elem){
		'''«declareLiteral(elem)»'''
	}
	
	def static dispatch declareLiteralAbs(BoolLiteral elem){
		'''«elem.value»'''
	}

	def static dispatch declareLiteralAbs(NumLiteral elem){
		'''«elem.value»'''	
	}
	
	def static declareLiteral(Literal elem){
		if(elem.v!=null){
			'''$«declareVars(elem.v)»'''
		}else if(elem.nul!=null){
			'''null'''
		}
		
		else{
			'''«declareSession(elem.ses)»'''
		}
		
	}
	

 	def static declareSession(String elem){
 		if(elem=='caller'){
 			'''$«elem»'''
 		}else if(elem=='called'){
 			'''$«elem»'''
 		}
 		else if(elem=='lastState'){
 			'''$«elem»'''
 		} 	
 		else{
 			'''$«elem»'''
 		}
 	}
	
//VoiceTags


	
def static dispatch declareVoiceTag(Send elem){
	'''		$url = «declareConcatenation(elem.url)»«IF elem.params!=null»«declareSendBlock(elem.params)»«ENDIF»;
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);'''
	}
	
	def static declareSendBlock(SendBlock elem){
		var s=""+declareParam(elem.value);
		var i =0;
		var size = elem.stms.size;
		//if(size!=0){
			while(i<=size){
			s=s+"&"+declareParam(elem.stms.get(i).value);
			i=i+1;
			}
		//}
		//s=s+")";
		'''«s»'''
	}
	
	def static declareParam(Param elem){
		'''"«elem.paramName»"=«declareConcatenation(elem.value)»'''
	}
	
	
	def static dispatch declareVoiceTag( Say elem){
		'''$tropo->say(«declareConcatenation(elem.that)», array("voice"=>"«voice»", "allowSignals"=>array("timeExceeded«name»", "attemptsLimit")))'''
	}
	
	
	def static dispatch declareVoiceTag( Ask elem){
		'''$tropo->record( array("say" => «declareConcatenation(elem.question)»,  "voice"=>"«voice»", "allowSignals"=>array("timeExceeded«name»", "attemptsLimit")))'''
	}
	
	
	def static dispatch declareVoiceTag( Play elem){
		'''$tropo->say(«declareConcatenation(elem.file)», array("voice"=>"«voice»", "allowSignals"=>array("timeExceeded", "attemptsLimit")))'''
	}
	
	
	def static dispatch declareVoiceTag( Record elem){
		'''$tropo->record(array('url' => «declareConcatenation(elem.action)»,'terminator' => '#'«IF elem.time!=null»,'timeout' =>«elem.time»)«ENDIF», "allowSignals"=>array("timeExceeded«name»", "attemptsLimit")))'''
	}
	def static dispatch declareVoiceTag( Reject elem){
		'''$tropo->reject()'''
	}
	def static dispatch declareVoiceTag( Hangup elem){
		'''$tropo->hangup()'''
	}
	def static dispatch declareVoiceTag( GetDigits elem){
		'''$«elem.name»=$tropo->ask(«declareConcatenation(elem.question)»,array("choices"=>[«elem.numDigits» DIGITS]", "terminator" => "#", "name"=>"«elem.name»", "voice"=>"«voice»", "allowSignals"=>array("timeExceeded«name»", "attemptsLimit")))'''
	}
	def static dispatch declareVoiceTag( Dial elem){
		'''$tropo->transfer(«declareConcatenation(elem.to)», array( "allowSignals"=>array("timeExceeded«name»", "attemptsLimit")))'''
	}
	def static dispatch declareVoiceTag( Call elem){
		'''$tropo->call(«declareConcatenation(elem.to)», array( "allowSignals"=>array("timeExceeded«name»", "attemptsLimit")))'''
	} 

	// Statements
	
	
	def static dispatch declareStatement(StringVariable elem){
		'''«declareVariable(elem)»;'''
	}
	def static dispatch declareStatement(NumVariable elem){
		'''«declareVariable(elem)»;'''
	}
	def static dispatch declareStatement(Assigment elem){
		'''«declareAssigment(elem)»;'''
	}
	def static dispatch declareStatement(BoolVariable elem){
		'''«declareVariable(elem)»;'''
	}
	def static dispatch declareStatement(VoiceTag elem){
		'''«declareVoiceTag(elem)»;'''
	}
	
	
	def static declareTransition(Transition elem){
		if(elem.event.equals("error")){
				'''$tropo->on(array("event" => "incomplete", "next" =>"«appName».php?uri=«elem.target.name»"));
$tropo->on(array("event" => "error", "next" =>"«appName».php?uri=«elem.target.name»"));'''
			
		}else{
			
		}
		'''$tropo->on(array("event" => "«declareEvent(elem.event)»", "next" =>"«appName».php?uri=«elem.target.name»"));'''
	}
	def static declareEvent(String elem){
		 if(elem.equals("completed")){
		 	'''continue'''
		 }else if(elem.equals("times")){
		 	'''attemptsLimit'''

		 	}else if(elem.equals("timeout")){
		 	'''timeExceeded'''
		 	}else{
		 	'''«elem»«name»'''
		 }
	}

// States declaration:
	
	
	
	
	def  static declareState(State elem){
		name=elem.name
'''dispatch_post('/«elem.name»', 'app_«elem.name»');
function app_«elem.name»() {
	«IF false»
	$session = new Session();
	$from = $session->getFrom();
	$sessionID = $session->getId();
	$caller = $from["id"]; 
	$to = $session->getTo();
	$called = $to["id"]; 
	$_SESSION['caller']=$caller;
	$_SESSION['called']=$called;
	$_SESSION['sessionID']=$sessionID;
	«ENDIF»«IF false» 
	if(isset($_SESSION['times']){
	$attempts=$_SESSION['times'];
		if($attempts==«elem.times»){
			$urltimes = "«url»/res/signals.php?uri=times&sessionID=".$sessionID."&state=«elem.name»";
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}else{
			$attempts++;
		}
	}else{
		$_SESSION['times']=1;
	}
	«ENDIF»«IF elem.timeout!=0» 	
	$url = "«url»/res/signals.php?uri=timeout&sessionID=".$sessionID."&state=«elem.name»&timeout=«elem.timeout»";
	$curl_handle=curl_init();
	curl_setopt($curl_handle,CURLOPT_URL,$url);
	curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
	curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
	curl_exec($curl_handle);
	curl_close($curl_handle);
	«ENDIF»
	$tropo = new Tropo();
	«FOR d: variables»
	«declareGlobalVariable(d)» 
	«ENDFOR»
	$caller=$_SESSION['caller'];
	$called=$_SESSION['called'];
	$sessionId=$_SESSION['sessionId'];
	$lastState=$_SESSION['lastState'];
	«FOR c : elem.stms»
	«declareAbstractElement(c)»
	«ENDFOR»
	$_SESSION['lastState']='«elem.name»';
	return $tropo->RenderJson();
}'''
	}
	def static declareGlobalVariable(String elem){
		'''$«elem»=$_SESSION['«elem»'];'''
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
}