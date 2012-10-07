<?php
			
// Required Tropo files

require 'res/tropo.class.php';

// Limonade files for states simulation. More information in 

require 'res/lib/limonade.php';

// Defining constants

$hour;
$day;
$month;
$people;
define("userNumber","+3656422095");
define("userEmail","user@mail.com");
define("year",2012);

// Declaration of the states

// State start implementation

dispatch_post('/start', 'app_start');
function app_start() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_start_dime'])){
	$attempts=intval($_SESSION['times_start_dime']);
	$attempts++;
	$_SESSION['times_start_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_start_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$tropo->say("Bienvenido al servicio de atencion especial de restaurantes de Telcodev.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitstart")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=isclient"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='start';
	return $tropo->RenderJson();
}
// State isclient implementation

dispatch_post('/isclient', 'app_isclient');
function app_isclient() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_isclient_dime'])){
	$attempts=intval($_SESSION['times_isclient_dime']);
	$attempts++;
	$_SESSION['times_isclient_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_isclient_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$tropo->say("Usted desea solicitar reserva en uno de nuestros restaurantes. Es correcto? Pulse 1 si esta conforme o 0 si no lo esta.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitisclient")));
	$tropo->ask("",array("choices"=> "[1 DIGIT]", "terminator" => "#", "name"=>"Gather", "voice"=>"leonor", "allowSignals"=>array("attemptsLimitisclient") ));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=clientconf"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='isclient';
	return $tropo->RenderJson();
}
// State clientconf implementation

dispatch_post('/clientconf', 'app_clientconf');
function app_clientconf() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_clientconf_dime'])){
	$attempts=intval($_SESSION['times_clientconf_dime']);
	$attempts++;
	$_SESSION['times_clientconf_dime']=$attempts;
	if($attempts==3){
		$_SESSION['times_clientconf_dime']=0;
		$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimitclientconf&sessionID_dime=".$_SESSION['sessionID_dime'];
		$curl_handle=curl_init();
		curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
		curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
		curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
		curl_exec($curl_handle);
		curl_close($curl_handle);
	}
			
		
	}else{
		$_SESSION['times_clientconf_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	if((intval($result_dime->getValue())==1)){
			$tropo->say("De acuerdo. Ahora procederemos a la realizacion de la solicitud. ", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitclientconf")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askpeople"));
			}
	else if((intval($result_dime->getValue())==0)){
			$tropo->say("De acuerdo, disculpe las molestias que le hayamos ocasionado. Un saludo.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitclientconf")));
	$tropo->hangup();
			}
	else {
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=isclient"));
			}
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='clientconf';
	return $tropo->RenderJson();
}
// State askpeople implementation

dispatch_post('/askpeople', 'app_askpeople');
function app_askpeople() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askpeople_dime'])){
	$attempts=intval($_SESSION['times_askpeople_dime']);
	$attempts++;
	$_SESSION['times_askpeople_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_askpeople_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$tropo->say("Diga el numero de comensales", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskpeople")));
	$tropo->ask("",array("choices"=> "[1 DIGIT]", "terminator" => "#", "name"=>"Gather", "voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskpeople") ));
	if((intval($_SESSION['times_askpeople_dime'])==0)){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askday"));
			}
	else {
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askdone"));
			}
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='askpeople';
	return $tropo->RenderJson();
}
// State askday implementation

dispatch_post('/askday', 'app_askday');
function app_askday() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askday_dime'])){
	$attempts=intval($_SESSION['times_askday_dime']);
	$attempts++;
	$_SESSION['times_askday_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_askday_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$people=intval($result_dime->getValue());
	$tropo->say("En que dia lo desea?", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskday")));
	$tropo->ask("",array("choices"=> "[2 DIGITS]", "terminator" => "#", "name"=>"Gather", "voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskday") ));
	if((intval($_SESSION['times_askday_dime'])==0)){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askmonth"));
			}
	else {
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askdone"));
			}
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='askday';
	return $tropo->RenderJson();
}
// State askmonth implementation

dispatch_post('/askmonth', 'app_askmonth');
function app_askmonth() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askmonth_dime'])){
	$attempts=intval($_SESSION['times_askmonth_dime']);
	$attempts++;
	$_SESSION['times_askmonth_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_askmonth_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$day=intval($result_dime->getValue());
	$tropo->say("En que mes desea realizar dicha reserva?", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskmonth")));
	$tropo->ask("",array("choices"=> "[1 DIGIT]", "terminator" => "#", "name"=>"Gather", "voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskmonth") ));
	if((intval($_SESSION['times_askmonth_dime'])==0)){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askhour"));
			}
	else {
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askdone"));
			}
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='askmonth';
	return $tropo->RenderJson();
}
// State askhour implementation

dispatch_post('/askhour', 'app_askhour');
function app_askhour() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askhour_dime'])){
	$attempts=intval($_SESSION['times_askhour_dime']);
	$attempts++;
	$_SESSION['times_askhour_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_askhour_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$month=intval($result_dime->getValue());
	$tropo->say("A que hora le conviene?", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskhour")));
	$tropo->ask("",array("choices"=> "[2 DIGITS]", "terminator" => "#", "name"=>"Gather", "voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskhour") ));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askdone"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='askhour';
	return $tropo->RenderJson();
}
// State askdone implementation

dispatch_post('/askdone', 'app_askdone');
function app_askdone() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askdone_dime'])){
	$attempts=intval($_SESSION['times_askdone_dime']);
	$attempts++;
	$_SESSION['times_askdone_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_askdone_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	if(($_SESSION['lastState_dime']=="askhour")){
			$hour=intval($result_dime->getValue());
			}
	else if(($_SESSION['lastState_dime']=="askday")){
			$day=intval($result_dime->getValue());
			}
	else if(($_SESSION['lastState_dime']=="askpeople")){
			$people=intval($result_dime->getValue());
			}
	else if(($_SESSION['lastState_dime']=="askmonth")){
			$month=intval($result_dime->getValue());
			}
	$tropo->say("Usted ha solicitado una reserva en nuestro restaurante el dia ".$day." de ".$month." de "."2012"." a las ".$hour." horas  para ".$people." personas.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskdone")));
	$tropo->say("Esta totalmente de acuerdo con dicha solicitud? Pulse 1 si esta conforme, o 0 si no lo esta.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskdone")));
	$tropo->ask("",array("choices"=> "[1 DIGIT]", "terminator" => "#", "name"=>"Gather", "voice"=>"leonor", "allowSignals"=>array("attemptsLimitaskdone") ));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=doneconf"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='askdone';
	return $tropo->RenderJson();
}
// State doneconf implementation

dispatch_post('/doneconf', 'app_doneconf');
function app_doneconf() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_doneconf_dime'])){
	$attempts=intval($_SESSION['times_doneconf_dime']);
	$attempts++;
	$_SESSION['times_doneconf_dime']=$attempts;
	if($attempts==3){
		$_SESSION['times_doneconf_dime']=0;
		$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimitdoneconf&sessionID_dime=".$_SESSION['sessionID_dime'];
		$curl_handle=curl_init();
		curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
		curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
		curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
		curl_exec($curl_handle);
		curl_close($curl_handle);
	}
			
		
	}else{
		$_SESSION['times_doneconf_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	if((intval($result_dime->getValue())==1)){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=end"));
			}
	else if((intval($result_dime->getValue())==0)){
			$tropo->say("Que dato desea modificar?", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitdoneconf")));
	$tropo->say("Pulse 1 para el numero de comensales.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitdoneconf")));
	$tropo->say("Pulse 2 para el dia", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitdoneconf")));
	$tropo->say("Pulse 3 para el mes", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitdoneconf")));
	$tropo->say("Pulse 4 para la hora", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitdoneconf")));
	$tropo->ask("",array("choices"=> "[1 DIGIT]", "terminator" => "#", "name"=>"Gather", "voice"=>"leonor", "allowSignals"=>array("attemptsLimitdoneconf") ));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=modification"));
			}
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='doneconf';
	return $tropo->RenderJson();
}
// State modification implementation

dispatch_post('/modification', 'app_modification');
function app_modification() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_modification_dime'])){
	$attempts=intval($_SESSION['times_modification_dime']);
	$attempts++;
	$_SESSION['times_modification_dime']=$attempts;
	if($attempts==3){
		$_SESSION['times_modification_dime']=0;
		$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimitmodification&sessionID_dime=".$_SESSION['sessionID_dime'];
		$curl_handle=curl_init();
		curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
		curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
		curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
		curl_exec($curl_handle);
		curl_close($curl_handle);
	}
			
		
	}else{
		$_SESSION['times_modification_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	if((intval($result_dime->getValue())==1)){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askpeople"));
			}
	else if((intval($result_dime->getValue())==2)){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askday"));
			}
	else if((intval($result_dime->getValue())==3)){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askmonth"));
			}
	else if((intval($result_dime->getValue())==4)){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askhour"));
			}
	else {
			$tropo->say("Disculpe, pero ha pulsado un digito equivocado.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitmodification")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=doneconf"));
			}
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='modification';
	return $tropo->RenderJson();
}
// State tooattempts implementation

dispatch_post('/tooattempts', 'app_tooattempts');
function app_tooattempts() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_tooattempts_dime'])){
	$attempts=intval($_SESSION['times_tooattempts_dime']);
	$attempts++;
	$_SESSION['times_tooattempts_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_tooattempts_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$tropo->say("Disculpe, pero estamos teniendo problemas para entender. Si es tan amable intentelo mas tarde", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimittooattempts")));
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='tooattempts';
	return $tropo->RenderJson();
}
// State hanguperror implementation

dispatch_post('/hanguperror', 'app_hanguperror');
function app_hanguperror() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_hanguperror_dime'])){
	$attempts=intval($_SESSION['times_hanguperror_dime']);
	$attempts++;
	$_SESSION['times_hanguperror_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_hanguperror_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$tropo->say("Ha ocurrido un error, disculpe las molestias.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimithanguperror")));
	$tropo->hangup();
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='hanguperror';
	return $tropo->RenderJson();
}
// State end implementation

dispatch_post('/end', 'app_end');
function app_end() {
	
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller_dime'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID_dime = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	
	
	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_end_dime'])){
	$attempts=intval($_SESSION['times_end_dime']);
	$attempts++;
	$_SESSION['times_end_dime']=$attempts;
			
		
	}else{
		$_SESSION['times_end_dime']=0;
	}
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	if(isset($_SESSION['lastState_dime'])){
		@$result_dime=new Result();
	}
	// Update of the value of the global constants and variables, and the session params.
	
	if(isset($_SESSION['month'])){
		$month=$_SESSION['month'];
	} 
	if(isset($_SESSION['day'])){
		$day=$_SESSION['day'];
	} 
	if(isset($_SESSION['hour'])){
		$hour=$_SESSION['hour'];
	} 
	if(isset($_SESSION['people'])){
		$people=$_SESSION['people'];
	} 
	
	// Declaration of the statements of the state.
	
	$tropo->say("De acuerdo. Gracias por utilizar nuestro servicio de restaurantes Telcodev. Un saludo.", array("voice"=>"leonor", "allowSignals"=>array("attemptsLimitend")));
	if(($_SESSION['caller_dime']==userNumber)){
			// Email implementation
			
			mail(userEmail, "Reservation","Usted ha solicitado una reserva en nuestro restaurante el dia ".$day."de".$month."de".year."a las ".$hour." para ".$people." personas", "From: <"."restaurant@dime.com"."> \r\n") ;
	// Send implementation for HTTP GET with cURL.
				
						$curl_handle=curl_init();
						curl_setopt($curl_handle,CURLOPT_URL,"http://host.com/saveReservation.php"."?"."caller=".userNumber."&"."day=".$day."&"."hour=".$hour."&"."month=".$month."&"."people=".$people."&"."year=".year);
						curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
						curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
						curl_exec($curl_handle);
						curl_close($curl_handle);;
			}
	else {
			// Send implementation for HTTP GET with cURL.
				
						$curl_handle=curl_init();
						curl_setopt($curl_handle,CURLOPT_URL,"http://host.com/saveReservation.php"."?"."caller=".$_SESSION['caller_dime']."&"."day=".$day."&"."hour=".$hour."&"."month=".$month."&"."people=".$people."&"."year=".year);
						curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
						curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
						curl_exec($curl_handle);
						curl_close($curl_handle);;
			}
	$tropo->hangup();
	
	// Update the global variables and the session params.
	
	if(isset($month)){
		$_SESSION['month']=$month;
	}
	if(isset($day)){
		$_SESSION['day']=$day;
	}
	if(isset($hour)){
		$_SESSION['hour']=$hour;
	}
	if(isset($people)){
		$_SESSION['people']=$people;
	}
	$_SESSION['lastState_dime']='end';
	return $tropo->RenderJson();
}

run(); 
?>