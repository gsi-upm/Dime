<?php
			
// Required Tropo files

require 'res/tropo.class.php';

// Limonade files for states simulation. More information in 

require 'res/lib/limonade.php';

// Defining constants


// Declaration of the states

// State start implementation

dispatch_post('/start', 'app_start');
function app_start() {
	
	// Creates a Tropo session and getting its parameters
	if(!isset($_SESSION['caller'])){
	$session_dime = new Session();
	$from_dime = $session_dime->getFrom();
	$sessionID = $session_dime->getId();
	$caller_dime = $from_dime["id"]; 
	$to_dime = $session_dime->getTo();
	$called_dime = $to_dime["id"]; 
	$_SESSION['caller_dime']=$caller_dime;
	$_SESSION['called_dime']=$called_dime;
	$_SESSION['sessionID_dime']=$sessionID_dime;
	}
	
	// Initialitation of the global variables
	
	$month=;
	$_SESSION['month']=$month;
	$day=;
	$_SESSION['day']=$day;
	$hour=;
	$_SESSION['hour']=$hour;
	$people=;
	$_SESSION['people']=$people;
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
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
	
	$tropo->say("Bienvenido al servicio de atencion especial de restaurantes de Telcodev.", array("voice"=>"susan", "allowSignals"=>array("timeExceededstart", "attemptsLimit")));
	$tropo->record( array("say" => "Usted desea solicitar reserva en uno de nuestros restaurantes. Es correcto?",  "voice"=>"susan", "allowSignals"=>array("timeExceededstart", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=isclient"));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='start';
	return $tropo->RenderJson();
}
// State isclient implementation

dispatch_post('/isclient', 'app_isclient');
function app_isclient() {
	

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_isclient_dime'])){
	$attempts=intval($_SESSION['times_isclient_dime']);
		if($attempts==3){
			$_SESSION['times_isclient_dime']=0;
			$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimit&sessionID_dime=".$_SESSION['sessionID_dime'];
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}else{
			$attempts++;
			$_SESSION['times_isclient_dime']=$attempts;
		}
	}else{
		$_SESSION['times_isclient_dime']=1;
	}
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	if(($result_dime->getValue()=="yes")){
			$tropo->say("De acuerdo. Ahora procederemos a la realizacion de la solicitud. ", array("voice"=>"susan", "allowSignals"=>array("timeExceededisclient", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askpeople"));
			}
	else {
			$tropo->say("De acuerdo, disculpe las molestias que le hayamos ocasionado. Un saludo.", array("voice"=>"susan", "allowSignals"=>array("timeExceededisclient", "attemptsLimit")));
	$tropo->hangup();
			}
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='isclient';
	return $tropo->RenderJson();
}
// State askpeople implementation

dispatch_post('/askpeople', 'app_askpeople');
function app_askpeople() {
	

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askpeople_dime'])){
	$attempts=intval($_SESSION['times_askpeople_dime']);
		if($attempts==3){
			$_SESSION['times_askpeople_dime']=0;
			$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimit&sessionID_dime=".$_SESSION['sessionID_dime'];
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}else{
			$attempts++;
			$_SESSION['times_askpeople_dime']=$attempts;
		}
	}else{
		$_SESSION['times_askpeople_dime']=1;
	}
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$tropo->record( array("say" => "Diga el numero de comensales",  "voice"=>"susan", "allowSignals"=>array("timeExceededaskpeople", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askday"));
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='askpeople';
	return $tropo->RenderJson();
}
// State askday implementation

dispatch_post('/askday', 'app_askday');
function app_askday() {
	

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askday_dime'])){
	$attempts=intval($_SESSION['times_askday_dime']);
		if($attempts==3){
			$_SESSION['times_askday_dime']=0;
			$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimit&sessionID_dime=".$_SESSION['sessionID_dime'];
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}else{
			$attempts++;
			$_SESSION['times_askday_dime']=$attempts;
		}
	}else{
		$_SESSION['times_askday_dime']=1;
	}
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$people=$result_dime->getValue();
	$tropo->record( array("say" => "En que dia lo desea?",  "voice"=>"susan", "allowSignals"=>array("timeExceededaskday", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askmonth"));
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='askday';
	return $tropo->RenderJson();
}
// State askmonth implementation

dispatch_post('/askmonth', 'app_askmonth');
function app_askmonth() {
	

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askmonth_dime'])){
	$attempts=intval($_SESSION['times_askmonth_dime']);
		if($attempts==3){
			$_SESSION['times_askmonth_dime']=0;
			$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimit&sessionID_dime=".$_SESSION['sessionID_dime'];
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}else{
			$attempts++;
			$_SESSION['times_askmonth_dime']=$attempts;
		}
	}else{
		$_SESSION['times_askmonth_dime']=1;
	}
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$day=$result_dime->getValue();
	$tropo->record( array("say" => "En que mes desea realizar dicha reserva?",  "voice"=>"susan", "allowSignals"=>array("timeExceededaskmonth", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askhour"));
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='askmonth';
	return $tropo->RenderJson();
}
// State askhour implementation

dispatch_post('/askhour', 'app_askhour');
function app_askhour() {
	

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askhour_dime'])){
	$attempts=intval($_SESSION['times_askhour_dime']);
		if($attempts==3){
			$_SESSION['times_askhour_dime']=0;
			$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimit&sessionID_dime=".$_SESSION['sessionID_dime'];
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}else{
			$attempts++;
			$_SESSION['times_askhour_dime']=$attempts;
		}
	}else{
		$_SESSION['times_askhour_dime']=1;
	}
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$month=$result_dime->getValue();
	$tropo->record( array("say" => "A que hora le conviene?",  "voice"=>"susan", "allowSignals"=>array("timeExceededaskhour", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askdone"));
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=wrongchoice"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=wrongchoice"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='askhour';
	return $tropo->RenderJson();
}
// State askdone implementation

dispatch_post('/askdone', 'app_askdone');
function app_askdone() {
	

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_askdone_dime'])){
	$attempts=intval($_SESSION['times_askdone_dime']);
		if($attempts==3){
			$_SESSION['times_askdone_dime']=0;
			$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimit&sessionID_dime=".$_SESSION['sessionID_dime'];
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}else{
			$attempts++;
			$_SESSION['times_askdone_dime']=$attempts;
		}
	}else{
		$_SESSION['times_askdone_dime']=1;
	}
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$hour=$result_dime->getValue();
	$tropo->say("Usted ha solicitado una reserva en nuestro restaurante el dia ".$day."de".$month."de"."2012"."a las ".$hour." para".$people." personas.", array("voice"=>"susan", "allowSignals"=>array("timeExceededaskdone", "attemptsLimit")));
	$tropo->record( array("say" => "Esta totalmente de acuerdo con dicha solicitud?",  "voice"=>"susan", "allowSignals"=>array("timeExceededaskdone", "attemptsLimit")));
	if(($result_dime->getValue()=="yes")){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=hangup"));
			}
	else {
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=modification"));
			}
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='askdone';
	return $tropo->RenderJson();
}
// State modification implementation

dispatch_post('/modification', 'app_modification');
function app_modification() {
	

	// Times signal appears when the param reached the atribute times of the state
	
	if(isset($_SESSION['times_modification_dime'])){
	$attempts=intval($_SESSION['times_modification_dime']);
		if($attempts==3){
			$_SESSION['times_modification_dime']=0;
			$urltimes = "http://shannon.gsi.dit.upm.es/roberto/res/signals.php?signal_dime=attemptsLimit&sessionID_dime=".$_SESSION['sessionID_dime'];
			$curl_handle=curl_init();
			curl_setopt($curl_handle,CURLOPT_URL,$urltimes);
			curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
			curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
			curl_exec($curl_handle);
			curl_close($curl_handle);
		}else{
			$attempts++;
			$_SESSION['times_modification_dime']=$attempts;
		}
	}else{
		$_SESSION['times_modification_dime']=1;
	}
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$tropo->record( array("say" => "Que dato desea modificar?",  "voice"=>"susan", "allowSignals"=>array("timeExceededmodification", "attemptsLimit")));
	if(($result_dime->getValue()=="numero de comensales")){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askpeople"));
			}
	else if(($result_dime->getValue()=="dia")){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askday"));
			}
	else if(($result_dime->getValue()=="hora")){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askhour"));
			}
	else {
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askmonth"));
			}
	$tropo->on(array("event" => "attemptsLimit", "next" =>"restaurant.php?uri=tooattempts"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=wrongchoice"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=wrongchoice"));
	$tropo->on(array("event" => "incomplete", "next" =>"restaurant.php?uri=hanguperror"));
	$tropo->on(array("event" => "error", "next" =>"restaurant.php?uri=hanguperror"));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='modification';
	return $tropo->RenderJson();
}
// State tooattempts implementation

dispatch_post('/tooattempts', 'app_tooattempts');
function app_tooattempts() {
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$tropo->say("Disculpe, pero estamos teniendo problemas para entender. Si es tan amable intentelo m‡s tarde", array("voice"=>"susan", "allowSignals"=>array("timeExceededtooattempts", "attemptsLimit")));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='tooattempts';
	return $tropo->RenderJson();
}
// State hanguperror implementation

dispatch_post('/hanguperror', 'app_hanguperror');
function app_hanguperror() {
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$tropo->say("Ha ocurrido un error, disculpe las molestias.", array("voice"=>"susan", "allowSignals"=>array("timeExceededhanguperror", "attemptsLimit")));
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='hanguperror';
	return $tropo->RenderJson();
}
// State wrongchoice implementation

dispatch_post('/wrongchoice', 'app_wrongchoice');
function app_wrongchoice() {
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	if(($_SESSION['lastState_dime']=="askDay")){
			$tropo->say("Lo siento, no le hemos entendido. Tiene que decir un dia del mes", array("voice"=>"susan", "allowSignals"=>array("timeExceededwrongchoice", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askday"));
			}
	else if(($_SESSION['lastState_dime']=="askHour")){
			$tropo->say("Lo siento, no le hemos entendido. Diga la hora a la que quiere hacer la reserva. Solo es posible hacer una reserva a las horas en punto o y media entre la una y las 11 y media de la noche.", array("voice"=>"susan", "allowSignals"=>array("timeExceededwrongchoice", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askhour"));
			}
	else if(($_SESSION['lastState_dime']=="askPeople")){
			$tropo->say("Lo siento, no le hemos entendido. Sepa ademas que el numero maximo de comensales es 10", array("voice"=>"susan", "allowSignals"=>array("timeExceededwrongchoice", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askpeople"));
			}
	else if(($_SESSION['lastState_dime']=="askMonth")){
			$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askmonth"));
			}
	else if(($_SESSION['lastState_dime']=="askDone")){
			$tropo->say("Perdone, no le hemos entendido", array("voice"=>"susan", "allowSignals"=>array("timeExceededwrongchoice", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=askdone"));
			}
	else if(($_SESSION['lastState_dime']=="confirmation")){
			$tropo->say("Lo siento, no le hemos entendido. Los datos a modificar son: numero de comensales, mes, dia y hora de la reserva", array("voice"=>"susan", "allowSignals"=>array("timeExceededwrongchoice", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=modification"));
			}
	else {
			$tropo->say("Perdone, no le hemos entendido", array("voice"=>"susan", "allowSignals"=>array("timeExceededwrongchoice", "attemptsLimit")));
	$tropo->on(array("event" => "continue", "next" =>"restaurant.php?uri=isclient"));
			}
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='wrongchoice';
	return $tropo->RenderJson();
}
// State hangup implementation

dispatch_post('/hangup', 'app_hangup');
function app_hangup() {
	
	
	// Inicialize the tropo aplication
	
	$tropo = new Tropo();
	
	@$result_dime=new Result();
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
	
	$tropo->say("De acuerdo. Gracias por utilizar nuestro servicio de restaurantes Telcodev. Un saludo.", array("voice"=>"susan", "allowSignals"=>array("timeExceededhangup", "attemptsLimit")));
	// Send implementation for HTTP GET with cURL.
		
				$curl_handle=curl_init();
				curl_setopt($curl_handle,CURLOPT_URL,"http://www.restaurant.com"+"?"+"caller="+$_SESSION['caller_dime']+"&"+"day="+$day+"&"+"hour="+$hour+"&"+"month="+$month+"&"+"people="+$people);
				curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);
				curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);
				curl_exec($curl_handle);
				curl_close($curl_handle);;
	// Email implementation
	
	mail("user@dime.com", "Reservation","Usted ha solicitado una reserva en nuestro restaurante el dia ".$day."de".$month."de"."2012"."a las ".$hour." para".$people." personas", "From: <"."restaurant@dime.com"."> \r\n") ;
	$tropo->hangup();
	
	// Update the global variables and the session params.
	
	$_SESSION['month']=$month;   
	$_SESSION['day']=$day;   
	$_SESSION['hour']=$hour;   
	$_SESSION['people']=$people;   
	$_SESSION['lastState_dime']='hangup';
	return $tropo->RenderJson();
}

run(); 
?>