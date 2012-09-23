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
	
	$tropo->say("start", array("voice"=>"susan", "allowSignals"=>array("timeExceededstart", "attemptsLimit")));
	$tropo->record(array(
	    'name' => 'recording',
	    'say' => 'Please leave a message.',
	   	'url' => 'ftp://totemteleko:telcodev@ftp.tropo.com/recordings/record_start.mp3',
	    'terminator' => '#',
	    'timeout' => 10,
	    'maxSilence' => 3,
	    'maxTime' => 10,
	    'format' => 'audio/mp3',
	  ));;
	$tropo->on(array("event" => "continue", "next" =>"test.php?uri=end"));
	$hola=1;
	
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
	
	if((($callStatus=="RINGING"))){
			$tropo->say("end", array("voice"=>"susan", "allowSignals"=>array("timeExceededend", "attemptsLimit")));
	$tropo->say("ftp://totemteleko:telcodev@ftp.tropo.com/recordings/record_".$_REQUEST['lastState_dime'].".mp3".5, array("voice"=>"susan", "allowSignals"=>array("timeExceededend", "attemptsLimit")));
	$tropo->hangup();
			}
	
	// Update the global variables and the session params.
	
	$_SESSION['lastState_dime']='end';
	return $tropo->RenderJson();
}

run(); 
?>