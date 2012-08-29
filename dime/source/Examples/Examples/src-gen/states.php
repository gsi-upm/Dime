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
	
	$company="google";
	$_SESSION['company']=$company;

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times']){
	$attempts=$_SESSION['times'];
		if($attempts==3){
			$urltimes = "http://www.gsi.dit.upm.es/~rjimenez/app/index.php/res/signals.php?uri=times&sessionID=".$sessionID."&state=start";
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
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['company'])){
		$company=$_SESSION['company'];
	} 
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
	
	$tropo->on(array("event" => "continue", "next" =>"states.php?uri=end"));
	$tropo->on(array("event" => "", "next" =>"states.php?uri=start"));
	
	// Update the global variables and the session params.
	
	$_SESSION['company']=$company;   
	$_SESSION['lastState']='start';
	return $tropo->RenderJson();
}
// State end implementation

dispatch_post('/end', 'app_end');
function app_end() {

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times']){
	$attempts=$_SESSION['times'];
		if($attempts==3){
			$urltimes = "http://www.gsi.dit.upm.es/~rjimenez/app/index.php/res/signals.php?uri=times&sessionID=".$sessionID."&state=end";
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
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['company'])){
		$company=$_SESSION['company'];
	} 
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
	
	$tropo->say("FUCK", array("voice"=>"susan", "allowSignals"=>array("timeExceededend", "attemptsLimit")));
	
	// Update the global variables and the session params.
	
	$_SESSION['company']=$company;   
	$_SESSION['lastState']='end';
	return $tropo->RenderJson();
}

run(); 
?>