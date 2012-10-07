<?php

$url= "http://api.tropo.com/1.0/sessions?action=create&token=0ecbcadc9ba6a848b056b892873d3f45fa9e4b226f7d3a418dfcf02914007d1f59a8a18ac9661839d2281053";
		$curl_handle=curl_init();
		curl_setopt($curl_handle,CURLOPT_URL,$url);
		curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
		curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
		curl_exec($curl_handle);
		curl_close($curl_handle);

echo "<h1>Tropo token, from a Dime application.</h1>";

?> 