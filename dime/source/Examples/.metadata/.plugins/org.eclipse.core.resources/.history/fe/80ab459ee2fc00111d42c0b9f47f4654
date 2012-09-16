<?php
	// Include the Twilio PHP library
	require 'res/Services/Twilio.php';
	sleep(15);
	// Twilio REST API version
	$version = "2010-04-01";

	// Set our Account SID and AuthToken
	$sid = "AC6506a3b7f8f40975b99a2e02c0f48935";
	$token = '82cd4bdddc83ac0b7bdcd95854a24a1f';
	
	// A phone number you have previously validated with Twilio
	$phonenumber = '+1 754-333-6784';

	// Instantiate a new Twilio Rest Client
	$client = new Services_Twilio($sid, $token, $version);

	try {
		$url="http://shannon.gsi.dit.upm.es/roberto/".$_GET['next_dime'].".php?laststate_dime=".$_GET['laststate_dime'];
		// Initiate a new outbound call
		$call = $client->account->calls->create(
			$phonenumber, // The number of the phone initiating the call
			$_GET['number_dime'], // The number of the phone receiving call
			$url // The URL Twilio will request when the call is answered
		);
		echo 'Started call: ' . $call->sid;
	} catch (Exception $e) {
		echo 'Error: ' . $e->getMessage();
	}
		?>
