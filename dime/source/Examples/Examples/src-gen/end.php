<?php

require "res/Services/Twilio.php";
require "globals.php";

// State end implementation


	header("content-type: text/xml");

	
	// Update of the value of the global constants and variables, and the session params.
	$greeting=$_GET['greeting']; 
	
	
	if($_REQUEST["CallStatus"]=="in-progress"|| $_REQUEST["CallStatus"]=="ringing"|| $_REQUEST["CallStatus"]=="queued"){
		
	
		// Declaration of the statements of the state.
		echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?> ";
		echo "<Response>";
		echo "<Say voice=\"man\" language=\"en\">"."You application has reached the end state"."</Say>\n" ;
		echo "<Say voice=\"man\" language=\"en\">".$greeting."</Say>\n" ;
		echo "<Hangup /> \n" ;
	
	
		// Update the global variables and the session params.
	
	
	
		echo "</Response>";
	}
	

	
	
?>