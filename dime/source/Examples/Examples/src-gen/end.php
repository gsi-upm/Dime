<?php

require "res/Services/Twilio.php";
require "globals_dime.php";

// State end implementation


	header("content-type: text/xml");
	
	// Update of the value of the global constants and variables, and the session params.
	
	
	if((!isset($_REQUEST['CallStatus']))||$_REQUEST["CallStatus"]=="in-progress"|| $_REQUEST["CallStatus"]=="ringing"|| $_REQUEST["CallStatus"]=="queued"){
		
	
	
		// Declaration of the statements of the state.
		echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?> ";
		echo "<Response>";
		//  HTTP GET with cURL to activate the call.
		if(!isset($_REQUEST['CallStatus'])){
			$curl_handle=curl_init();
			$url_dime="http://shannon.gsi.dit.upm.es/roberto/call_dime.php?number_dime=".urlencode("+34656422095")."&next_dime="."end&laststate_dime=end";
			curl_setopt($curl_handle,CURLOPT_URL, $url_dime);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,20);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}
		echo "<Say voice=\"man\" language=\"en\">"."I am a fucking machine"."</Say>\n"; 
		echo "<Hangup /> \n"; 
	
	
		echo "</Response>";
	}
	


	
?>