<?php
			
// Required Tropo files

require 'res/tropo.class.php';

// Limonade files for states simulation. More information in 

require 'res/lib/limonade.php';

// Defining constants


// Declaration of the states

// State start implementation

dispatch_post('/start', 'app_start');
function app_start() {
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	// Initialitation of the global variables
	
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	// Update of the value of the global constants and variables, and the session params.
	
	
	// Declaration of the statements of the state.
	
	$tropo->say("Say five digits", array("voice"=>"susan", "allowSignals"=>array("timeExceededstart", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"digits.php?uri=end"));
	$tropo->ask("",array("choices"=>"[5 DIGITS]", "terminator" => "#", "name"=>"Get", "voice"=>"susan", "allowSignals"=>array("timeExceededstart", "attemptsLimit")));
	
	// Update the global variables and the session params.
	
	$_SESSION['lastState_dime']='start';
	return $tropo->RenderJson();
}
// State end implementation

dispatch_post('/end', 'app_end');
function app_end() {
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
	// Update of the value of the global constants and variables, and the session params.
	
	
	// Declaration of the statements of the state.
	
	$tropo->say($result_dime->getValue(), array("voice"=>"susan", "allowSignals"=>array("timeExceededend", "attemptsLimit")));
	$tropo->say("Bye", array("voice"=>"susan", "allowSignals"=>array("timeExceededend", "attemptsLimit")));
	$tropo->hangup();
	
	// Update the global variables and the session params.
	
	$_SESSION['lastState_dime']='end';
	return $tropo->RenderJson();
}

run(); 
?>