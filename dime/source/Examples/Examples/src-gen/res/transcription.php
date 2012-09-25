<?php 
$file = fopen('transcription.txt', 'w'); 

$data = file_get_contents('php://input'); 
fwrite($file, $data); 

fclose($file); 
?> 