package org.telcodev.dsl.generator

import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.telcodev.dsl.dime.Ask
import org.telcodev.dsl.dime.Assigment
import org.telcodev.dsl.dime.Block
import org.telcodev.dsl.dime.BlockState
import org.telcodev.dsl.dime.BoolLiteral
import org.telcodev.dsl.dime.BoolVariable
import org.telcodev.dsl.dime.CompareExpression
import org.telcodev.dsl.dime.Concatenation
import org.telcodev.dsl.dime.CondBlock
import org.telcodev.dsl.dime.CondStateBlock
import org.telcodev.dsl.dime.Dial
import org.telcodev.dsl.dime.Document
import org.telcodev.dsl.dime.GetDigits
import org.telcodev.dsl.dime.Hangup
import org.telcodev.dsl.dime.IfExp
import org.telcodev.dsl.dime.IfStateExp
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

import static org.telcodev.dsl.generator.PhpGenerator.*
import org.telcodev.dsl.dime.SendBlock
import org.telcodev.dsl.dime.Param
import org.telcodev.dsl.dime.MathBrackets
import org.telcodev.dsl.dime.ConcatenationBrackets



class PhpGenerator {
	private static String appName
	private static Set<String> variables
	private static String voice
	
	def static void generateTropoPhp(Resource resource, IFileSystemAccess fsa, Config config){
		//Setting parameters
		
		voice=config.voice
		
		
		 		
		//esto es para ver donde estamos
		fsa.generateFile('res/dondeEstoy.php', TellMeMyWorkingDirectory::where)
		
		//Copy important files to the new directory
		
	fsa.generateFile('res/tropo.class.php', CopyFile::readFile('res/tropo/php/tropo.class.php'))
	fsa.generateFile('res/compatibility.php', CopyFile::readFile('res/tropo/php/compatibility.php'))
	fsa.generateFile('res/TropoClasses.php', CopyFile::readFile('res/tropo/php/TropoClasses.php'))
	fsa.generateFile('res/compatibility.php', CopyFile::readFile('res/tropo/php/compatibility.php'))
		appName=className(resource) 
		variables= new HashSet<String>()
		fsa.generateFile(appName+".php", PhpGenerator::toTropoPHP(resource.contents.head as Document, resource))
	}
	
	def static className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}

	def static toTropoPHP(Document sm, Resource resource) {
		
		if(!sm.states){
			'''<?php
require 'res/tropo.class.php';
$session = new Session();
$from = $session->getFrom();
$sessionId = $session->getId();
$caller = $from["id"]; 
$to = $session->getTo();
$called = $to["id"]; 
$tropo = new Tropo();
«FOR c : sm.elements»«declareAbstractElement(c)»
«ENDFOR»
$tropo = new Tropo();
 ?>'''
		}else{
			'''<?php
require 'res/tropo.class.php';
require 'res/limonade/lib/limonade.php';
«FOR c : sm.elements»«declareGlobalVariable(c)»
«ENDFOR»
«FOR c : sm.sta»«declareState(c)»
«ENDFOR»
run(); 
?>'''
		}

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
	
	
	
	
// Methods without states
	
	// Puede que aqui surga un problemilla
	def static dispatch declareAbstractElement(IfExp elem){		
		'''«declareCondBlock(elem.block)»
«IF elem.blocks!=null»«FOR e: elem.blocks »else «declareCondBlock(e)»«ENDFOR»«ENDIF»
«IF elem.defaultBlock!=null» else «declareBlock(elem.defaultBlock)»«ENDIF»'''
		 
		
	}
	
	def static dispatch declareAbstractElement(Statement elem){
		'''«declareStatement(elem)»'''
	}


	def static declareBlock(Block elem){
		'''{«IF !elem.stms.empty»«FOR c:elem.stms»«declareAbstractElement(c)»
«ENDFOR»«ENDIF»
		}'''
	}
	
 
	
	def static declareCondBlock(CondBlock elem){
		'''if(«declareBoolExpression(elem.cond)»)«IF elem.action!=null»«declareBlock(elem.action)»«ENDIF»'''
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
		//Puede que tenga que incluir un declare Session	
		else{
			'''«declareSession(elem.ses)»'''
		}
		
	}
	
// Es posible que no funcione lo del state
 	def static declareSession(String elem){
 		if(elem=='caller'){
 			'''$«elem»'''
 		}else if(elem=='called'){
 			'''$«elem»'''
 		}
 		else if(elem=='lastState'){
 			'''$«elem»'''
 		} 	
 		else if(elem=='sessionState'){
 			''' ((@$result = new Result())->getState())'''
		}else{
 			'''$«elem»'''
 		}
 	}
	
//VoiceTags


	
def static dispatch declareVoiceTag(Send elem){
		'''$resultSend = post_request(«declareConcatenation(elem.url)»«IF elem.params!=null»«declareSendBlock(elem.params)»«ENDIF»)'''
	}
	
	def static declareSendBlock(SendBlock elem){
		var s=", array("+declareParam(elem.value);
		var i =0;
		var size = elem.stms.size;
		if(size!=0){
			while(i<size){
			s=s+" , "+declareParam(elem.stms.get(i).value);
			i=i+1;
			}
		}
		s=s+")";
		'''«s»'''
	}
	
	def static declareParam(Param elem){
		'''"«elem.paramName»"=>«declareConcatenation(elem.value)»'''
	}
	
	
	def static dispatch declareVoiceTag( Say elem){
		'''$tropo->say(«declareConcatenation(elem.that)», array("voice"=>"«voice»"))'''
	}
	
	
	def static dispatch declareVoiceTag( Ask elem){
		'''$«elem.name»=$tropo->ask(«declareConcatenation(elem.question)», array("choices" => "«elem.choices»",  "voice"=>"«voice»"))'''
	}
	
	
	def static dispatch declareVoiceTag( Play elem){
		'''$tropo->say(«declareConcatenation(elem.file)», array("voice"=>"«voice»"))'''
	}
	
	
	def static dispatch declareVoiceTag( Record elem){
		'''$tropo->record(array('url' => «declareConcatenation(elem.action)»,'terminator' => '#'«IF elem.time!=null»,'timeout' =>«elem.time»)«ENDIF» )'''
	}
	def static dispatch declareVoiceTag( Reject elem){
		'''$tropo->reject()'''
	}
	def static dispatch declareVoiceTag( Hangup elem){
		'''$tropo->hangup()'''
	}
	def static dispatch declareVoiceTag( GetDigits elem){
		'''$«elem.name»=$tropo->ask(«declareConcatenation(elem.question)»,array("choices"=>[«elem.numDigits» DIGITS]", "terminator" => "#", "name"=>"«elem.name»", "voice"=>"«voice»"))'''
	}
	def static dispatch declareVoiceTag( Dial elem){
		'''$tropo->transfer(«declareConcatenation(elem.to)»)'''
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
		'''$tropo->on(array("event" => "«elem.event»", "next" =>"«appName».php?uri=«elem.target.name»"));'''
	}


// States declaration:
	
		
	

	
	
	
	def  static declareState(State elem){
'''dispatch_post('/«elem.name»', 'app_«elem.name»');
function app_«elem.name»() {
	«IF elem.name.equals("start")»
	$session = new Session();
	$from = $session->getFrom();
	$sessionId = $session->getId();
	$caller = $from["id"]; 
	$to = $session->getTo();
	$called = $to["id"]; 
	$_SESSION['caller']=$caller;
	$_SESSION['called']=$called;
	$_SESSION['sessionId']=$sessionId;
	«ENDIF»
	«IF elem.times==null» 
	if(isset($_SESSION['times']){
	$attempts=$_SESSION['times'];
	if($attempts==«elem.times»){
		$resultSend = post_request('https://api.tropo.com/1.0/sessions/'.$sessionId.'/signals?action=signal&value=AttemptsLimit', array("action"=>"signal", "value=AttemptsLimit"));
			
		}else{
			$attempts++;
		}
	}else{
		$_SESSION['times']=1;
	}
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
	«declareStateAbstractElement(c)»
	«ENDFOR»
	$_SESSION['lastState']='«elem.name»';
	return $tropo->RenderJson();
}'''
	}
	def static declareGlobalVariable(String elem){
		'''$«elem»=$_SESSION['«elem»'];'''
	}

	
	def static dispatch declareStateAbstractElement(IfStateExp elem){		
'''«declareStateStructure(elem)»'''
	}
	def static dispatch declareStateAbstractElement(Statement elem){
'''«declareStatement(elem)»'''
	}

		def static dispatch declareStateAbstractElement(Transition elem){
'''«declareTransition(elem)»'''
	}  

	def static declareStateStructure(IfStateExp elem){
'''«declareCondStateBlock(elem.block)»
«IF elem.blocks!=null»«FOR e: elem.blocks »else «declareCondStateBlock(e)»
«ENDFOR»«ENDIF»
«IF elem.defaultBlock!=null»else «declareStateBlock(elem.defaultBlock)»«ENDIF»'''
		 

	}
	def static declareStateBlock(BlockState elem){
		'''{
«FOR c: elem.sta»«declareStateAbstractElement(c)»
«ENDFOR»
		}'''
	}
	
	
	def static declareCondStateBlock(CondStateBlock elem){
		'''if(«declareBoolExpression(elem.cond)»)«IF elem.action!=null»«declareStateBlock(elem.action)»«ENDIF»'''
	}
}