<?php
	if(isset($_GET['sessionID_dime'])&& isset($_GET['signal_dime'])){
		
		$urltimes = "https://api.tropo.com/1.0/sessions/".$_GET['sessionID']."/signals?action=signal&value=".$_GET['signal_dime'];
		$curl_handle=curl_init();
		curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
		curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
		curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
		curl_exec($curl_handle);
		curl_close($curl_handle);

		
		
	}

		?>