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
	
	$session = new Session();
	$from = $session->getFrom();
	$sessionID = $session->getId();
	$caller = $from["id"]; 
	$to = $session->getTo();
	$called = $to["id"]; 
	$_SESSION['caller']=$caller;
	$_SESSION['called']=$called;
	$_SESSION['sessionID']=$sessionID;
	
	// Initialitation of the global variables
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['caller'])){
		$caller=$_SESSION['caller'];
	}
	if(isset($_SESSION['called'])){
		$called=$_SESSION['called'];
	}
	if(isset($_SESSION['sessionID'])){
		$sessionID=$_SESSION['sessionID'];
	}
	if(isset($_SESSION['lastState'])){
		$lastState=$_SESSION['lastState'];
	}
	
	
	// Declaration of the statements of the state.
	
	// Send implementation for HTTP GET with cURL.
		
				$curl_handle=curl_init();
				curl_setopt($curl_handle,CURLOPT_URL,"http://shannon.gsi.dit.upm.es/roberto/getParams.php"+"?"+"caller="+$caller);
				curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
				curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
				curl_exec($curl_handle);
				curl_close($curl_handle);
	$tropo->say("Damn it", array("voice"=>"leonor", "allowSignals"=>array("timeExceededstart", "attemptsLimit")));
	$tropo->hangup();
	
	// Update the global variables and the session params.
	
	$_SESSION['lastState']='start';
	return $tropo->RenderJson();
}

run(); 
?>