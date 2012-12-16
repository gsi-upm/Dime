<?php
		if(isset($_POST['to_email_dime'])&&isset($_POST['title_email_dime'])&&isset($_POST['value_email_dime'])&&isset($_POST['from_email_dime']){
			mail($_POST['to_email_dime'], $_POST['title_email_dime'],$_POST['value_email_dime'], "From: <".$_POST['from_email_dime']."> \r\n"); 
		}else{
			echo "error";
		}
		
		?>