<?php

require "res/Services/Twilio.php";
require "globals.php";

// State start implementation


	header("content-type: text/xml");

	
	// Update of the value of the global constants and variables, and the session params.
	
	
	if($_REQUEST["CallStatus"]=="in-progress"|| $_REQUEST["CallStatus"]=="ringing"|| $_REQUEST["CallStatus"]=="queued"){
		

	
		// Declaration of the statements of the state.
		echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?> ";
		echo "<Response>";
		echo "<Play>"."http://shannon.gsi.dit.upm.es/roberto/lion2.wav"."</Play>\n" ;
		echo "<Hangup /> \n" ;
	
	
		// Update the global variables and the session params.
	
	
	
		echo "</Response>";
	}
	

	
	
?>