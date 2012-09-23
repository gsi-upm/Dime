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
	
	// Send implementation for HTTP GET with cURL.
		
				$curl_handle=curl_init();
				curl_setopt($curl_handle,CURLOPT_URL,"http://shannon.gsi.dit.upm.es/roberto/getParams.php"+"?"+"caller="+$_SESSION['caller_dime']);
				curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
				curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
				curl_exec($curl_handle);
				curl_close($curl_handle);;
	$tropo->say("Damn it", array("voice"=>"susan", "allowSignals"=>array("timeExceededstart", "attemptsLimit")));
	$tropo->hangup();
	
	// Update the global variables and the session params.
	
	$_SESSION['lastState_dime']='start';
	return $tropo->RenderJson();
}

run(); 
?>