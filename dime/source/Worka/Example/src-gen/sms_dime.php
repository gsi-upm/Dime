<?php	 
 	 	$url = 'http://api.messaging.staging.voxeo.net/1.0/messaging';	 
 	 	
 	 	if(isset($_GET['message_dime'])&&isset($_GET['to_dime'])&&isset($_GET['from_dime'])){
	 	 	$data="botkey=416378&apimethod=send&msg=".$_GET['message_dime']."&user=".$_GET['to_dime']."&network=SMS&from=".isset($_GET['from_dime']);	 
	 	 	$ch = curl_init();	 
	 	 	curl_setopt($ch, CURLOPT_URL, $url);	 
	 	 	curl_setopt($ch, CURLOPT_HEADER, 0);	 
	 	 	// ToDo: Replace the placeholders in brackets with your data.	 
	 	 	curl_setopt($ch, CURLOPT_USERPWD, 'rjimenez:celda');	 
	 	 	curl_setopt($ch, CURLOPT_POST, 1);	 
	 	 	curl_setopt($ch, CURLOPT_POSTFIELDS, $data);	 
	 	 	curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);	 
	 	 	curl_setopt($ch, CURLOPT_TIMEOUT, 100);	 
	 	 	$xml = curl_exec($ch);	 
	 	 	if (curl_error($ch)) {	 
	 	 	print "ERROR ". curl_error($ch) ."\n<br/>";	 
	 	 	}	 
	 	 	curl_close($ch);	 
	 	 	print_r($xml);	 
 	 	} 
?>	 
