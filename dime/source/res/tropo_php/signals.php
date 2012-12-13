<?php
require 'lib/limonade.php';



dispatch('/times', 'app_times');
function app_times() {

$sessionID = $_GET['sessionID'];

if (isset($sessionID)) {
	
	
	$url = "https://api.tropo.com/1.0/sessions/".$sessionID."/signals?action=signal&value=attemptsLimit";
	$curl_handle=curl_init();
	curl_setopt($curl_handle,CURLOPT_URL,$url);
	curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
	curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
	curl_exec($curl_handle);
	curl_close($curl_handle);

}
}


dispatch('/timeout', 'app_timeout');
function app_timeout() {

	$sessionID = $_GET['sessionID'];
	$state=$_GET['state'];
	$timeout=$_GET['timeout'];
if (isset($sessionID)&&isset($state)&&isset($timeout)) {
	//contador
	
	sleep(intval($timeout));
	
	$url = "https://api.tropo.com/1.0/sessions/".$sessionID."/signals?action=signal&value=timeExceeded".$state;
	$curl_handle=curl_init();
	curl_setopt($curl_handle,CURLOPT_URL,$url);
	curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
	curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
	curl_exec($curl_handle);
	curl_close($curl_handle);

}
}
run(); 
?>
