<?php
	$token = 'XXXXXXXXXXXXXXXXXXXXX';
	if(isset($_GET['number_dime']){
		$url="http://api.voxeo.net/SessionControl/VoiceXML.start?
    	numbertodial=".$_GET['number_dime']."&
    	tokenid=".$token;
	}else{	$url="http://api.voxeo.net/SessionControl/VoiceXML.start?
   	 	tokenid=".$token;	
	}
	$curl_handle=curl_init();
	curl_setopt($curl_handle,CURLOPT_URL,$url);
	curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
	curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
	curl_exec($curl_handle);
	curl_close($curl_handle);
?>
