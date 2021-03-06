package org.telcodev.dsl.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.telcodev.dsl.dime.AbstractElement;
import org.telcodev.dsl.dime.Block;
import org.telcodev.dsl.dime.BoolExpression;
import org.telcodev.dsl.dime.BoolLiteral;
import org.telcodev.dsl.dime.BoolVariable;
import org.telcodev.dsl.dime.Brackets;
import org.telcodev.dsl.dime.CALLSTATUS;
import org.telcodev.dsl.dime.Call;
import org.telcodev.dsl.dime.CompareExpression;
import org.telcodev.dsl.dime.Concatenation;
import org.telcodev.dsl.dime.ConcatenationBrackets;
import org.telcodev.dsl.dime.ConcatenationExpression;
import org.telcodev.dsl.dime.CondBlock;
import org.telcodev.dsl.dime.Constant;
import org.telcodev.dsl.dime.Data;
import org.telcodev.dsl.dime.Dial;
import org.telcodev.dsl.dime.Document;
import org.telcodev.dsl.dime.EVENT;
import org.telcodev.dsl.dime.Email;
import org.telcodev.dsl.dime.GetDigits;
import org.telcodev.dsl.dime.Hangup;
import org.telcodev.dsl.dime.IfExp;
import org.telcodev.dsl.dime.Literal;
import org.telcodev.dsl.dime.LiteralAbs;
import org.telcodev.dsl.dime.MathBrackets;
import org.telcodev.dsl.dime.MathExpression;
import org.telcodev.dsl.dime.NegExpression;
import org.telcodev.dsl.dime.NotPrimaryParam;
import org.telcodev.dsl.dime.NumLiteral;
import org.telcodev.dsl.dime.NumVariable;
import org.telcodev.dsl.dime.Operation;
import org.telcodev.dsl.dime.OperationBool;
import org.telcodev.dsl.dime.Param;
import org.telcodev.dsl.dime.Play;
import org.telcodev.dsl.dime.Primitive;
import org.telcodev.dsl.dime.Record;
import org.telcodev.dsl.dime.Reject;
import org.telcodev.dsl.dime.SESSION;
import org.telcodev.dsl.dime.Say;
import org.telcodev.dsl.dime.Send;
import org.telcodev.dsl.dime.SendBlock;
import org.telcodev.dsl.dime.Sms;
import org.telcodev.dsl.dime.State;
import org.telcodev.dsl.dime.Statement;
import org.telcodev.dsl.dime.StringLiteral;
import org.telcodev.dsl.dime.StringVariable;
import org.telcodev.dsl.dime.Transition;
import org.telcodev.dsl.dime.Vars;
import org.telcodev.dsl.dime.VoiceTag;
import org.telcodev.dsl.dime.Wait;
import org.telcodev.dsl.generator.Config;
import org.telcodev.dsl.generator.Twilio;

@SuppressWarnings("all")
public class Twilio_php_generator {
  private static String appName;
  
  private static String voice;
  
  private static String url;
  
  private static String name;
  
  private static String language;
  
  private static String twilioLanguage;
  
  private static String token;
  
  private static String sid;
  
  private static String number;
  
  private static String errorRedirect;
  
  private static String completedRedirect;
  
  private static String hangupRedirect;
  
  private static String timesRedirect;
  
  private static String timeoutRedirect;
  
  private static Set<String> variablesId;
  
  private static Set<String> constantsId;
  
  private static Record record;
  
  private static GetDigits getdigits;
  
  private static int timeout;
  
  public static void generateTwilioPhp(final Resource resource, final IFileSystemAccess fsa, final Config config) {
    Twilio _twilio = config.getTwilio();
    String _voice = _twilio.getVoice();
    Twilio_php_generator.voice = _voice;
    Twilio _twilio_1 = config.getTwilio();
    String _language = _twilio_1.getLanguage();
    Twilio_php_generator.twilioLanguage = _language;
    String _url = config.getUrl();
    Twilio_php_generator.url = _url;
    String _language_1 = config.getLanguage();
    Twilio_php_generator.language = _language_1;
    Twilio _twilio_2 = config.getTwilio();
    String _number = _twilio_2.getNumber();
    Twilio_php_generator.number = _number;
    Twilio _twilio_3 = config.getTwilio();
    String _accountSid = _twilio_3.getAccountSid();
    Twilio_php_generator.sid = _accountSid;
    Twilio _twilio_4 = config.getTwilio();
    String _token = _twilio_4.getToken();
    Twilio_php_generator.token = _token;
    System.out.println("");
    System.out.println("*****************************************************************************************");
    System.out.println("");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    String _name = ((Document) _head).getName();
    String _plus = ("Creating Twilio-Php " + _name);
    String _plus_1 = (_plus + " application.");
    System.out.println(_plus_1);
    System.out.println("Generating resources folder.");
    System.out.println("Generating Twilio folder.");
    fsa.generateFile("README.txt", "Copy inside the res folder the Twilio Service folder. ");
    fsa.generateFile("res/COPY-HERE.txt", "Copy inside this folder the Twilio Service folder. ");
    String _className = Twilio_php_generator.className(resource);
    Twilio_php_generator.appName = _className;
    HashSet<String> _hashSet = new HashSet<String>();
    Twilio_php_generator.variablesId = _hashSet;
    HashSet<String> _hashSet_1 = new HashSet<String>();
    Twilio_php_generator.constantsId = _hashSet_1;
    Twilio_php_generator.variablesId.add("times_dime");
    String _plus_2 = ("Creating " + "globals_dime");
    String _plus_3 = (_plus_2 + ".php file");
    System.out.println(_plus_3);
    EList<EObject> _contents_1 = resource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    CharSequence _twilioPHP = Twilio_php_generator.toTwilioPHP(((Document) _head_1), resource);
    fsa.generateFile("globals_dime.php", _twilioPHP);
    String _plus_4 = ("Creating " + "call_dime");
    String _plus_5 = (_plus_4 + ".php file");
    System.out.println(_plus_5);
    CharSequence _declareCall = Twilio_php_generator.declareCall();
    fsa.generateFile("call_dime.php", _declareCall);
    CharSequence _kenFile = Twilio_php_generator.tokenFile();
    fsa.generateFile("token.php", _kenFile);
    EList<EObject> _contents_2 = resource.getContents();
    EObject _head_2 = IterableExtensions.<EObject>head(_contents_2);
    EList<State> _sta = ((Document) _head_2).getSta();
    for (final State state : _sta) {
      String _name_1 = state.getName();
      String _plus_6 = ("times_" + _name_1);
      String _plus_7 = (_plus_6 + "_dime");
      Twilio_php_generator.variablesId.add(_plus_7);
    }
    EList<EObject> _contents_3 = resource.getContents();
    EObject _head_3 = IterableExtensions.<EObject>head(_contents_3);
    EList<State> _sta_1 = ((Document) _head_3).getSta();
    for (final State state_1 : _sta_1) {
      String _name_2 = state_1.getName();
      String _plus_8 = (_name_2 + ".php");
      CharSequence _declareState = Twilio_php_generator.declareState(state_1);
      fsa.generateFile(_plus_8, _declareState);
    }
    System.out.println("Success.");
    System.out.println("");
  }
  
  public static String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public static CharSequence toTwilioPHP(final Document sm, final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Defining global constants and variables");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Statement> _elements = sm.getElements();
      for(final Statement c : _elements) {
        CharSequence _declareGlobalStatement = Twilio_php_generator.declareGlobalStatement(c);
        _builder.append(_declareGlobalStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("?>");
    return _builder;
  }
  
  public static CharSequence tokenFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php");
    _builder.newLine();
    _builder.newLine();
    _builder.append("$url= \"");
    _builder.append(Twilio_php_generator.url, "");
    _builder.append("start.php\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("$curl_handle=curl_init();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("curl_setopt($curl_handle,CURLOPT_URL,$url);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("curl_exec($curl_handle);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("curl_close($curl_handle);");
    _builder.newLine();
    _builder.append("echo \"<h1>Twilio token, from a Dime application.</h1>\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("?> ");
    return _builder;
  }
  
  protected static CharSequence _declareGlobalStatement(final Constant elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Twilio_php_generator.constantsId.add(_name);
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _declareStatement = Twilio_php_generator.declareStatement(elem);
      _builder.append(_declareStatement, "");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalStatement(final BoolVariable elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Twilio_php_generator.variablesId.add(_name);
      CharSequence _xifexpression = null;
      BoolExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("$");
        String _name_1 = elem.getName();
        _builder.append(_name_1, "");
        _builder.append("=");
        BoolExpression _value_1 = elem.getValue();
        CharSequence _declareBoolExpression = Twilio_php_generator.declareBoolExpression(_value_1);
        _builder.append(_declareBoolExpression, "");
        _builder.append(";");
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _xifexpression = _builder_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalStatement(final StringVariable elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Twilio_php_generator.variablesId.add(_name);
      CharSequence _xifexpression = null;
      ConcatenationExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("$");
        String _name_1 = elem.getName();
        _builder.append(_name_1, "");
        _builder.append("=");
        ConcatenationExpression _value_1 = elem.getValue();
        CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_value_1);
        _builder.append(_declareConcatenation, "");
        _builder.append(";");
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _xifexpression = _builder_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalStatement(final NumVariable elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Twilio_php_generator.variablesId.add(_name);
      CharSequence _xifexpression = null;
      MathExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("$");
        String _name_1 = elem.getName();
        _builder.append(_name_1, "");
        _builder.append("=");
        MathExpression _value_1 = elem.getValue();
        CharSequence _declareMathExpression = Twilio_php_generator.declareMathExpression(_value_1);
        _builder.append(_declareMathExpression, "");
        _builder.append(";");
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _xifexpression = _builder_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareState(final State elem) {
    CharSequence _xblockexpression = null;
    {
      boolean first = true;
      String _name = elem.getName();
      Twilio_php_generator.name = _name;
      String _name_1 = elem.getName();
      String _upperCase = _name_1.toUpperCase();
      String _plus = ("Generating " + _upperCase);
      String _plus_1 = (_plus + " state.");
      System.out.println(_plus_1);
      Twilio_php_generator.getdigits = null;
      Twilio_php_generator.record = null;
      int _timeout = elem.getTimeout();
      Twilio_php_generator.timeout = _timeout;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?php");
      _builder.newLine();
      _builder.newLine();
      _builder.append("require \"res/Services/Twilio.php\";");
      _builder.newLine();
      _builder.append("require \"globals_dime.php\";");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Auxiliar functions");
      _builder.newLine();
      _builder.newLine();
      _builder.append("function get_data($url) {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("$ch = curl_init();");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("$timeout = 5;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("curl_setopt($ch, CURLOPT_URL, $url);");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("curl_setopt($ch, CURLOPT_CONNECTTIMEOUT, $timeout);");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("$data = curl_exec($ch);");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("curl_close($ch);");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("return $data;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("// State ");
      String _name_2 = elem.getName();
      _builder.append(_name_2, "");
      _builder.append(" implementation");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("header(\"content-type: text/xml\");");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// Update of the value of the global constants and variables, and the session params.");
      _builder.newLine();
      {
        for(final String d : Twilio_php_generator.variablesId) {
          _builder.append("\t");
          CharSequence _declareStateGlobalVariable = Twilio_php_generator.declareStateGlobalVariable(d);
          _builder.append(_declareStateGlobalVariable, "	");
          _builder.append(" ");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        boolean _notEquals = (!Objects.equal(Twilio_php_generator.hangupRedirect, null));
        if (_notEquals) {
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          {
            boolean _not = (!first);
            if (_not) {
              _builder.append("else ");
            }
          }
          _builder.append("if($_REQUEST[\"CallStatus\"]==\"hangup\"){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("if(isset($_GET[\'hangupurl_dime\']){");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("$url=$_GET[\'hangupurl_dime\'].\"?\"laststate_dime=");
          _builder.append(Twilio_php_generator.name, "			");
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          {
            boolean _isEmpty = Twilio_php_generator.variablesId.isEmpty();
            boolean _not_1 = (!_isEmpty);
            if (_not_1) {
              CharSequence _saveGlobalVariableXML = Twilio_php_generator.saveGlobalVariableXML("url");
              _builder.append(_saveGlobalVariableXML, "			");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("echo \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?> \";");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("echo \"<Response>\";");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("echo \"<Redirect>\".$url.\"</Redirect>\";");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("echo \"</Response>\";");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("exit();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      {
        boolean _notEquals_1 = (!Objects.equal(Twilio_php_generator.errorRedirect, null));
        if (_notEquals_1) {
          _builder.append("\t");
          {
            boolean _not_2 = (!first);
            if (_not_2) {
              _builder.append("else ");
            }
          }
          _builder.append("if($_REQUEST[\"CallStatus\"]==\"fail\"){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("if(isset($_GET[\'errorurl_dime\']){");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("$url=$_GET[\'errorurl_dime\'].\"?\"laststate_dime=");
          _builder.append(Twilio_php_generator.name, "			");
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          {
            boolean _isEmpty_1 = Twilio_php_generator.variablesId.isEmpty();
            boolean _not_3 = (!_isEmpty_1);
            if (_not_3) {
              CharSequence _saveGlobalVariableXML_1 = Twilio_php_generator.saveGlobalVariableXML("url");
              _builder.append(_saveGlobalVariableXML_1, "			");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("echo \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?> \";");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("echo \"<Response>\";");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("echo \"<Redirect>\".$url.\"</Redirect>\";");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("echo \"</Response>\";");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("exit();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      {
        boolean _not_4 = (!first);
        if (_not_4) {
          _builder.append("else ");
        }
      }
      _builder.append("if((!isset($_REQUEST[\'CallStatus\']))||$_REQUEST[\"CallStatus\"]==\"in-progress\"|| $_REQUEST[\"CallStatus\"]==\"ringing\"|| $_REQUEST[\"CallStatus\"]==\"queued\"){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if(isset($_GET[\'times_");
      String _name_3 = elem.getName();
      _builder.append(_name_3, "	");
      _builder.append("_dime\'])){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("$times_");
      String _name_4 = elem.getName();
      _builder.append(_name_4, "		");
      _builder.append("_dime=intval($_GET[\'times_");
      String _name_5 = elem.getName();
      _builder.append(_name_5, "		");
      _builder.append("_dime\'])+1;");
      _builder.newLineIfNotEmpty();
      {
        int _times = elem.getTimes();
        boolean _notEquals_2 = (_times != 0);
        if (_notEquals_2) {
          _builder.append("\t\t");
          _builder.append("// Times signal appears when the param reached the atribute times of the state");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("if($_GET[\'times_");
          String _name_6 = elem.getName();
          _builder.append(_name_6, "		");
          _builder.append("_dime\']==");
          int _times_1 = elem.getTimes();
          _builder.append(_times_1, "		");
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("if(isset($_GET[\'timesurl_dime\'])){");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("$url=$_GET[\'timesurl_dime\'].\"?laststate_dime=");
          _builder.append(Twilio_php_generator.name, "			");
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("$times_url=NULL;");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          {
            boolean _isEmpty_2 = Twilio_php_generator.variablesId.isEmpty();
            boolean _not_5 = (!_isEmpty_2);
            if (_not_5) {
              CharSequence _saveGlobalVariableXML_2 = Twilio_php_generator.saveGlobalVariableXML("url");
              _builder.append(_saveGlobalVariableXML_2, "			");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("echo \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?> \";");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("echo \"<Response>\";");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("echo \"<Redirect>\".$url.\"</Redirect>\";");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("echo \"</Response>\";");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("exit();");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("}");
        }
      }
      _builder.append("\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}else{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$times_");
      String _name_7 = elem.getName();
      _builder.append(_name_7, "		");
      _builder.append("_dime=1;");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        String _name_8 = elem.getName();
        boolean _equals = _name_8.equals("start");
        if (_equals) {
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// Declaration of the statements of the state.");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("echo \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?> \";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("echo \"<Response>\";\t");
      _builder.newLine();
      {
        EList<AbstractElement> _stms = elem.getStms();
        for(final AbstractElement c : _stms) {
          _builder.append("\t\t");
          CharSequence _declareAbstractElement = Twilio_php_generator.declareAbstractElement(c);
          _builder.append(_declareAbstractElement, "		");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      {
        boolean _notEquals_3 = (!Objects.equal(Twilio_php_generator.completedRedirect, null));
        if (_notEquals_3) {
          _builder.append("\t\t");
          {
            boolean _notEquals_4 = (!Objects.equal(Twilio_php_generator.record, null));
            if (_notEquals_4) {
              _builder.append("if($recordtag_dime==TRUE){");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("\t");
              CharSequence _declareVoiceTag = Twilio_php_generator.declareVoiceTag(Twilio_php_generator.record);
              _builder.append(_declareVoiceTag, "			");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("}");
            }
          }
          {
            boolean _notEquals_5 = (!Objects.equal(Twilio_php_generator.getdigits, null));
            if (_notEquals_5) {
              _builder.append("if($getdigits_dime==TRUE){");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("\t");
              CharSequence _declareVoiceTag_1 = Twilio_php_generator.declareVoiceTag(Twilio_php_generator.getdigits);
              _builder.append(_declareVoiceTag_1, "			");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("}");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("$url=$completedurl_dime.\"?\".\"laststate_dime=");
          String _name_9 = elem.getName();
          _builder.append(_name_9, "		");
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          {
            boolean _isEmpty_3 = Twilio_php_generator.variablesId.isEmpty();
            boolean _not_6 = (!_isEmpty_3);
            if (_not_6) {
              CharSequence _saveGlobalVariableXML_3 = Twilio_php_generator.saveGlobalVariableXML("url");
              _builder.append(_saveGlobalVariableXML_3, "		");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("if(isset($hangupurl_dime)){");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("$url=$url.\"&amp;hangupurl_dime=\".$hangupurl_dime;");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("if(isset($errorurl_dime)){");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("$url=$url.\"&amp;errorurl_dime=\".$errorurl_dime;");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("if(isset($timesurl_dime)){");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("$url=$url.\"&amp;timesurl_dime=\".$timesurl_dime;");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("echo \"<Redirect>\".$url.\"</Redirect>\";");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("echo \"</Response>\";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      String _errorRedirect = Twilio_php_generator.errorRedirect = null;
      _builder.append(_errorRedirect, "");
      String _completedRedirect = Twilio_php_generator.completedRedirect = null;
      _builder.append(_completedRedirect, "");
      String _hangupRedirect = Twilio_php_generator.hangupRedirect = null;
      _builder.append(_hangupRedirect, "");
      String _timesRedirect = Twilio_php_generator.timesRedirect = null;
      _builder.append(_timesRedirect, "");
      String _timeoutRedirect = Twilio_php_generator.timeoutRedirect = null;
      _builder.append(_timeoutRedirect, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("?>");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareStateGlobalVariable(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(isset($_GET[\'");
    _builder.append(elem, "");
    _builder.append("\'])){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("$");
    _builder.append(elem, "	");
    _builder.append("=$_GET[\'");
    _builder.append(elem, "	");
    _builder.append("\'];");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public static CharSequence saveGlobalVariable(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String n : Twilio_php_generator.variablesId) {
        _builder.append("if(isset($");
        _builder.append(n, "");
        _builder.append(")){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("$");
        _builder.append(elem, "	");
        _builder.append("=$");
        _builder.append(elem, "	");
        _builder.append(".\"&");
        _builder.append(n, "	");
        _builder.append("=\".urlencode($");
        _builder.append(n, "	");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
      }
    }
    return _builder;
  }
  
  public static CharSequence saveGlobalVariableXML(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String n : Twilio_php_generator.variablesId) {
        _builder.append("if(isset($");
        _builder.append(n, "");
        _builder.append(")){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("$");
        _builder.append(elem, "	");
        _builder.append("=$");
        _builder.append(elem, "	");
        _builder.append(".\"&amp;");
        _builder.append(n, "	");
        _builder.append("=\".urlencode($");
        _builder.append(n, "	");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final VoiceTag elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVoiceTag = Twilio_php_generator.declareVoiceTag(elem);
    _builder.append(_declareVoiceTag, "");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStructure = Twilio_php_generator.declareStructure(elem);
    _builder.append(_declareStructure, "");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Statement elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStatement = Twilio_php_generator.declareStatement(elem);
    _builder.append(_declareStatement, "");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Transition elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareTransition = Twilio_php_generator.declareTransition(elem);
    _builder.append(_declareTransition, "");
    return _builder;
  }
  
  public static CharSequence declareStructure(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    CondBlock _block = elem.getBlock();
    CharSequence _declareCondBlock = Twilio_php_generator.declareCondBlock(_block);
    _builder.append(_declareCondBlock, "");
    _builder.newLineIfNotEmpty();
    {
      EList<CondBlock> _blocks = elem.getBlocks();
      boolean _notEquals = (!Objects.equal(_blocks, null));
      if (_notEquals) {
        {
          EList<CondBlock> _blocks_1 = elem.getBlocks();
          for(final CondBlock e : _blocks_1) {
            _builder.append("else ");
            CharSequence _declareCondBlock_1 = Twilio_php_generator.declareCondBlock(e);
            _builder.append(_declareCondBlock_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      Block _defaultBlock = elem.getDefaultBlock();
      boolean _notEquals_1 = (!Objects.equal(_defaultBlock, null));
      if (_notEquals_1) {
        _builder.append("else ");
        Block _defaultBlock_1 = elem.getDefaultBlock();
        CharSequence _declareBlock = Twilio_php_generator.declareBlock(_defaultBlock_1);
        _builder.append(_declareBlock, "");
      }
    }
    return _builder;
  }
  
  public static CharSequence declareBlock(final Block elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    {
      EList<AbstractElement> _sta = elem.getSta();
      for(final AbstractElement c : _sta) {
        CharSequence _declareAbstractElement = Twilio_php_generator.declareAbstractElement(c);
        _builder.append(_declareAbstractElement, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    return _builder;
  }
  
  public static CharSequence declareCondBlock(final CondBlock elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    BoolExpression _cond = elem.getCond();
    CharSequence _declareBoolExpression = Twilio_php_generator.declareBoolExpression(_cond);
    _builder.append(_declareBoolExpression, "");
    _builder.append(")");
    {
      Block _action = elem.getAction();
      boolean _notEquals = (!Objects.equal(_action, null));
      if (_notEquals) {
        Block _action_1 = elem.getAction();
        CharSequence _declareBlock = Twilio_php_generator.declareBlock(_action_1);
        _builder.append(_declareBlock, "");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final CALLSTATUS elem) {
    CharSequence _xifexpression = null;
    String _name = elem.getName();
    boolean _equals = _name.equals("RINGING");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("($_REQUEST[\'CallStatus\']==\"RINGING\")");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _name_1 = elem.getName();
      boolean _equals_1 = _name_1.equals("IN-PROGRESS");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("($_REQUEST[\'CallStatus\']==\"ANSWERING\"|| $_REQUEST[\'CallStatus\']==\"ANSWERED\")");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        String _name_2 = elem.getName();
        boolean _equals_2 = _name_2.equals("DISCONNECTED");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("($_REQUEST[\'CallStatus\']==\"DISCONNECTED\")");
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          String _name_3 = elem.getName();
          boolean _equals_3 = _name_3.equals("FAILED");
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("($_REQUEST[\'CallStatus\']==\"FAILED\")");
            _xifexpression_3 = _builder_3;
          } else {
            StringConcatenation _builder_4 = new StringConcatenation();
            _xifexpression_3 = _builder_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected static CharSequence _declareBoolExpression(final BoolLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = elem.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = Twilio_php_generator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final CompareExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    LiteralAbs _left = elem.getLeft();
    CharSequence _declareLiteralAbs = Twilio_php_generator.declareLiteralAbs(_left);
    _builder.append(_declareLiteralAbs, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    LiteralAbs _right = elem.getRight();
    CharSequence _declareLiteralAbs_1 = Twilio_php_generator.declareLiteralAbs(_right);
    _builder.append(_declareLiteralAbs_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final NegExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _op = elem.getOp();
    _builder.append(_op, "");
    BoolExpression _obj = elem.getObj();
    CharSequence _declareBoolExpression = Twilio_php_generator.declareBoolExpression(_obj);
    _builder.append(_declareBoolExpression, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final OperationBool elem) {
    StringConcatenation _builder = new StringConcatenation();
    BoolExpression _left = elem.getLeft();
    CharSequence _declareBoolExpression = Twilio_php_generator.declareBoolExpression(_left);
    _builder.append(_declareBoolExpression, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    BoolExpression _right = elem.getRight();
    CharSequence _declareBoolExpression_1 = Twilio_php_generator.declareBoolExpression(_right);
    _builder.append(_declareBoolExpression_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final Brackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    BoolExpression _obj = elem.getObj();
    CharSequence _declareBoolExpression = Twilio_php_generator.declareBoolExpression(_obj);
    _builder.append(_declareBoolExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Operation elem) {
    StringConcatenation _builder = new StringConcatenation();
    MathExpression _left = elem.getLeft();
    CharSequence _declareMathExpression = Twilio_php_generator.declareMathExpression(_left);
    _builder.append(_declareMathExpression, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    MathExpression _right = elem.getRight();
    CharSequence _declareMathExpression_1 = Twilio_php_generator.declareMathExpression(_right);
    _builder.append(_declareMathExpression_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = Twilio_php_generator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteralAbs = Twilio_php_generator.declareLiteralAbs(elem);
    _builder.append(_declareLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final MathBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    MathExpression _obj = elem.getObj();
    CharSequence _declareMathExpression = Twilio_php_generator.declareMathExpression(_obj);
    _builder.append(_declareMathExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final Concatenation elem) {
    StringConcatenation _builder = new StringConcatenation();
    ConcatenationExpression _left = elem.getLeft();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_left);
    _builder.append(_declareConcatenation, "");
    _builder.append(".");
    ConcatenationExpression _right = elem.getRight();
    CharSequence _declareConcatenation_1 = Twilio_php_generator.declareConcatenation(_right);
    _builder.append(_declareConcatenation_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final LiteralAbs elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteralAbs = Twilio_php_generator.declareLiteralAbs(elem);
    _builder.append(_declareLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final ConcatenationBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    ConcatenationExpression _obj = elem.getObj();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_obj);
    _builder.append(_declareConcatenation, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final Constant elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public static CharSequence declareVariable(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _name = elem.getName();
    _builder.append(_name, "");
    {
      ConcatenationExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("=");
        ConcatenationExpression _value_1 = elem.getValue();
        CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_value_1);
        _builder.append(_declareConcatenation, "");
      }
    }
    return _builder;
  }
  
  public static CharSequence declareVariable(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _name = elem.getName();
    _builder.append(_name, "");
    {
      MathExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("=");
        MathExpression _value_1 = elem.getValue();
        CharSequence _declareMathExpression = Twilio_php_generator.declareMathExpression(_value_1);
        _builder.append(_declareMathExpression, "");
      }
    }
    return _builder;
  }
  
  public static CharSequence declareVariable(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _name = elem.getName();
    _builder.append(_name, "");
    {
      BoolExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("=");
        BoolExpression _value_1 = elem.getValue();
        CharSequence _declareBoolExpression = Twilio_php_generator.declareBoolExpression(_value_1);
        _builder.append(_declareBoolExpression, "");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final Primitive elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declarePrimitive = Twilio_php_generator.declarePrimitive(elem);
    _builder.append(_declarePrimitive, "");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = Twilio_php_generator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declarePrimitive(final BoolLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = elem.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected static CharSequence _declarePrimitive(final StringLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = elem.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected static CharSequence _declarePrimitive(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = elem.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected static CharSequence _declareLiteral(final Literal elem) {
    CharSequence _xifexpression = null;
    Vars _v = elem.getV();
    boolean _notEquals = (!Objects.equal(_v, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      Vars _v_1 = elem.getV();
      CharSequence _declareVars = Twilio_php_generator.declareVars(_v_1);
      _builder.append(_declareVars, "");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _nul = elem.getNul();
      boolean _notEquals_1 = (!Objects.equal(_nul, null));
      if (_notEquals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("null");
        _xifexpression_1 = _builder_1;
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected static CharSequence _declareLiteral(final SESSION elem) {
    CharSequence _xifexpression = null;
    String _name = elem.getName();
    boolean _equals = _name.equals("CALLER");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$_REQUEST[\'From\']");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _name_1 = elem.getName();
      boolean _equals_1 = _name_1.equals("CALLED");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("$_REQUEST[\'To\']");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        String _name_2 = elem.getName();
        boolean _equals_2 = _name_2.equals("LASTSTATE");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("$_GET[\'laststate_dime\']");
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          String _name_3 = elem.getName();
          boolean _equals_3 = _name_3.equals("ANSWER");
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("$_REQUEST[\'TranscriptionText\']");
            _xifexpression_3 = _builder_3;
          } else {
            CharSequence _xifexpression_4 = null;
            String _name_4 = elem.getName();
            boolean _equals_4 = _name_4.equals("RECORD");
            if (_equals_4) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("$_REQUEST[\'RecordingUrl\']");
              _xifexpression_4 = _builder_4;
            } else {
              CharSequence _xifexpression_5 = null;
              String _name_5 = elem.getName();
              boolean _equals_5 = _name_5.equals("DIGITS");
              if (_equals_5) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("intval($_REQUEST[\'Digits\'])");
                _xifexpression_5 = _builder_5;
              } else {
                CharSequence _xifexpression_6 = null;
                String _name_6 = elem.getName();
                boolean _equals_6 = _name_6.equals("TIMES");
                if (_equals_6) {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("intval($_GET[\'times_");
                  _builder_6.append(Twilio_php_generator.name, "");
                  _builder_6.append("_dime\'])");
                  _xifexpression_6 = _builder_6;
                } else {
                  StringConcatenation _builder_7 = new StringConcatenation();
                  _xifexpression_6 = _builder_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected static CharSequence _declareVoiceTag(final Wait elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Pause length=\"");
    int _seconds = elem.getSeconds();
    _builder.append(_seconds, "");
    _builder.append("\"/>;");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Data elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Data implementation");
    _builder.newLine();
    _builder.append("$data_dime = get_data(urlencode(");
    ConcatenationExpression _url = elem.getUrl();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_url);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"?\".");
    {
      Param _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, Integer.valueOf(0)));
      if (_notEquals) {
        Param _value_1 = elem.getValue();
        CharSequence _declareParam = Twilio_php_generator.declareParam(_value_1);
        _builder.append(_declareParam, "");
        {
          EList<NotPrimaryParam> _stms = elem.getStms();
          for(final NotPrimaryParam n : _stms) {
            _builder.append(".\"&\".");
            Param _value_2 = n.getValue();
            CharSequence _declareParam_1 = Twilio_php_generator.declareParam(_value_2);
            _builder.append(_declareParam_1, "");
            _builder.append(" ");
          }
        }
      }
    }
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("$data_dime= json_decode($data_dime, true);");
    _builder.newLine();
    _builder.append("$");
    Vars _vari = elem.getVari();
    CharSequence _declareVars = Twilio_php_generator.declareVars(_vari);
    _builder.append(_declareVars, "");
    _builder.append("=$data_dime[\'");
    Vars _vari_1 = elem.getVari();
    CharSequence _declareVars_1 = Twilio_php_generator.declareVars(_vari_1);
    _builder.append(_declareVars_1, "");
    _builder.append("\'];");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// End of Data implementation");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Send elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Send implementation for HTTP GET with cURL.");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("$curl_handle=curl_init();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("curl_setopt($curl_handle,CURLOPT_URL,urlencode(");
    ConcatenationExpression _url = elem.getUrl();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_url);
    _builder.append(_declareConcatenation, "			");
    {
      SendBlock _params = elem.getParams();
      boolean _notEquals = (!Objects.equal(_params, null));
      if (_notEquals) {
        _builder.append(".\"?\".");
        SendBlock _params_1 = elem.getParams();
        CharSequence _declareSendBlock = Twilio_php_generator.declareSendBlock(_params_1);
        _builder.append(_declareSendBlock, "			");
      }
    }
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("curl_exec($curl_handle);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("curl_close($curl_handle);");
    return _builder;
  }
  
  public static CharSequence declareSendBlock(final SendBlock elem) {
    CharSequence _xblockexpression = null;
    {
      Param _value = elem.getValue();
      CharSequence s = Twilio_php_generator.declareParam(_value);
      int i = 0;
      EList<NotPrimaryParam> _stms = elem.getStms();
      int size = _stms.size();
      boolean _notEquals = (size != 0);
      if (_notEquals) {
        boolean _lessThan = (i < size);
        boolean _while = _lessThan;
        while (_while) {
          {
            String _plus = (s + ".\"&\".");
            EList<NotPrimaryParam> _stms_1 = elem.getStms();
            NotPrimaryParam _get = _stms_1.get(i);
            Param _value_1 = _get.getValue();
            CharSequence _declareParam = Twilio_php_generator.declareParam(_value_1);
            String _plus_1 = (_plus + _declareParam);
            s = _plus_1;
            int _plus_2 = (i + 1);
            i = _plus_2;
          }
          boolean _lessThan_1 = (i < size);
          _while = _lessThan_1;
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(s, "");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareParam(final Param elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("=\".");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_value);
    _builder.append(_declareConcatenation, "");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Say elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Say voice=\\\"");
    _builder.append(Twilio_php_generator.voice, "");
    _builder.append("\\\" language=\\\"");
    _builder.append(Twilio_php_generator.twilioLanguage, "");
    _builder.append("\\\">\".");
    ConcatenationExpression _that = elem.getThat();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_that);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"</Say>\\n\"; ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Play elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Play>\".");
    ConcatenationExpression _file = elem.getFile();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_file);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"</Play>\\n\"; ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Record elem) {
    CharSequence _xblockexpression = null;
    {
      Twilio_php_generator.record = elem;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if(isset($completedurl_dime)){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$url_dime=$completedurl_dime.\"?laststate_dime=");
      _builder.append(Twilio_php_generator.name, "	");
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _saveGlobalVariableXML = Twilio_php_generator.saveGlobalVariableXML("url_dime");
      _builder.append(_saveGlobalVariableXML, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("echo \"<Record action=\\\"\".urlencode($url_dime).\"\\\" method=\\\"GET\\\" maxLength=\\\"");
      int _time = elem.getTime();
      _builder.append(_time, "	");
      _builder.append("\\\" finishOnKey=\\\"*\\\" /> \\n\";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("echo \"</Response>\";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("exit();");
      _builder.newLine();
      _builder.append("}else{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$recordtag_dime=TRUE;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareVoiceTag(final Reject elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Reject /> \\n\"; ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Hangup elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Hangup /> \\n\"; ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final GetDigits elem) {
    CharSequence _xblockexpression = null;
    {
      Twilio_php_generator.getdigits = elem;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if(isset($completedurl_dime)){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$url_dime=$completedurl_dime.\"?laststate_dime=");
      _builder.append(Twilio_php_generator.name, "	");
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      CharSequence _saveGlobalVariableXML = Twilio_php_generator.saveGlobalVariableXML("url_dime");
      _builder.append(_saveGlobalVariableXML, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("echo \"<Gather action=\\\"\".urlencode($url_dime).\"\\\"  ");
      {
        int _numDigits = elem.getNumDigits();
        boolean _notEquals = (_numDigits != 0);
        if (_notEquals) {
          _builder.append("numDigits=\\\"");
          int _numDigits_1 = elem.getNumDigits();
          _builder.append(_numDigits_1, "	");
          _builder.append("\\\" ");
        }
      }
      {
        boolean _notEquals_1 = (Twilio_php_generator.timeout != 0);
        if (_notEquals_1) {
          _builder.append("timeout=\\\"\".\"");
          _builder.append(Twilio_php_generator.timeout, "	");
          _builder.append("\".\"\\\"");
        }
      }
      _builder.append(" ></Gather>\";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("echo \"</Response>\";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("exit();");
      _builder.newLine();
      _builder.append("}else{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$getdigits_dime=TRUE;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareVoiceTag(final Dial elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Dial callerId=\\\"\".\"");
    _builder.append(Twilio_php_generator.number, "");
    _builder.append("\".\"\\\" ");
    {
      boolean _notEquals = (Twilio_php_generator.timeout != 0);
      if (_notEquals) {
        _builder.append("timeout=\\\"\".\"");
        _builder.append(Twilio_php_generator.timeout, "");
        _builder.append("\".\"\\\"");
      }
    }
    _builder.append("> \\n <Number>\".");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"</Number> \\n </Dial> \\n\";");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Call elem) {
    StringConcatenation _builder = new StringConcatenation();
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareCallSignal = Twilio_php_generator.declareCallSignal(_to, Twilio_php_generator.name);
    _builder.append(_declareCallSignal, "");
    return _builder;
  }
  
  public static CharSequence declareCallSignal(final ConcatenationExpression elem, final String next) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//  HTTP GET with cURL to activate the call.");
    _builder.newLine();
    _builder.append("if(!isset($_REQUEST[\'CallStatus\'])){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$curl_handle=curl_init();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$url_dime=\"");
    _builder.append(Twilio_php_generator.url, "	");
    _builder.append("call_dime.php?number_dime=\".urlencode(");
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(elem);
    _builder.append(_declareConcatenation, "	");
    _builder.append(").\"&next_dime=\".\"");
    _builder.append(next, "	");
    _builder.append("&laststate_dime=");
    _builder.append(Twilio_php_generator.name, "	");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _isEmpty = Twilio_php_generator.variablesId.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        CharSequence _saveGlobalVariable = Twilio_php_generator.saveGlobalVariable("url_dime");
        _builder.append(_saveGlobalVariable, "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("curl_setopt($curl_handle,CURLOPT_URL, urlencode($url_dime));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,20);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("curl_exec($curl_handle);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("curl_close($curl_handle);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("exit();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence declareCall() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Include the Twilio PHP library");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("require \'res/Services/Twilio.php\';");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("sleep(15);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Twilio REST API version");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$version = \"2010-04-01\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Set our Account SID and AuthToken");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$sid = \"");
    _builder.append(Twilio_php_generator.sid, "	");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("$token = \'");
    _builder.append(Twilio_php_generator.token, "	");
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// A phone number you have previously validated with Twilio");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$phonenumber = \'");
    _builder.append(Twilio_php_generator.number, "	");
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Instantiate a new Twilio Rest Client");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$client = new Services_Twilio($sid, $token, $version);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("$url=\"");
    _builder.append(Twilio_php_generator.url, "		");
    _builder.append("\".$_GET[\'next_dime\'].\".php?laststate_dime=\".$_GET[\'laststate_dime\'];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      boolean _isEmpty = Twilio_php_generator.variablesId.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        CharSequence _saveGlobalVariable = Twilio_php_generator.saveGlobalVariable("url");
        _builder.append(_saveGlobalVariable, "		");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("// Initiate a new outbound call");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("$call = $client->account->calls->create(");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("$phonenumber, // The number of the phone initiating the call");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("$_GET[\'number_dime\'], // The number of the phone receiving call");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("urlencode($url) // The URL Twilio will request when the call is answered");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("echo \'Started call: \' . $call->sid;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} catch (Exception $e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("echo \'Error: \' . $e->getMessage();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("?>");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Email elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Email implementation");
    _builder.newLine();
    _builder.newLine();
    _builder.append("mail(");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(", ");
    ConcatenationExpression _title = elem.getTitle();
    CharSequence _declareConcatenation_1 = Twilio_php_generator.declareConcatenation(_title);
    _builder.append(_declareConcatenation_1, "");
    _builder.append(",");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareConcatenation_2 = Twilio_php_generator.declareConcatenation(_value);
    _builder.append(_declareConcatenation_2, "");
    _builder.append(", \"From: <\".");
    ConcatenationExpression _from = elem.getFrom();
    CharSequence _declareConcatenation_3 = Twilio_php_generator.declareConcatenation(_from);
    _builder.append(_declareConcatenation_3, "");
    _builder.append(".\"> \\r\\n\"); ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Sms elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Sms from=\\\"\".\"");
    _builder.append(Twilio_php_generator.number, "");
    _builder.append("\".\"\\\" \".\" to=\\");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"\\\">\".");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareConcatenation_1 = Twilio_php_generator.declareConcatenation(_value);
    _builder.append(_declareConcatenation_1, "");
    _builder.append(".\"</Sms>\";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = Twilio_php_generator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = Twilio_php_generator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = Twilio_php_generator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final Constant elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareConstant = Twilio_php_generator.declareConstant(elem);
    _builder.append(_declareConstant, "");
    _builder.append(";");
    return _builder;
  }
  
  public static CharSequence declareConstant(final Constant elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("define(\"");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("\",");
    Primitive _value = elem.getValue();
    CharSequence _declarePrimitive = Twilio_php_generator.declarePrimitive(_value);
    _builder.append(_declarePrimitive, "");
    _builder.append(")");
    return _builder;
  }
  
  public static CharSequence declareTransition(final Transition elem) {
    CharSequence _xifexpression = null;
    EVENT _event = elem.getEvent();
    String _name = _event.getName();
    boolean _equals = _name.equals("ERROR");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        State _target = elem.getTarget();
        String _name_1 = _target.getName();
        String _plus = (_name_1 + ".php");
        Twilio_php_generator.errorRedirect = _plus;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("$errorurl_dime=\"");
        _builder.append(Twilio_php_generator.errorRedirect, "");
        _builder.append("\";");
        _xblockexpression = (_builder);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EVENT _event_1 = elem.getEvent();
      String _name_1 = _event_1.getName();
      boolean _equals_1 = _name_1.equals("HANGUP");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          State _target = elem.getTarget();
          String _name_2 = _target.getName();
          String _plus = (_name_2 + ".php");
          Twilio_php_generator.hangupRedirect = _plus;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("$hangupurl_dime=\"");
          _builder.append(Twilio_php_generator.hangupRedirect, "");
          _builder.append("\";");
          _xblockexpression_1 = (_builder);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EVENT _event_2 = elem.getEvent();
        String _name_2 = _event_2.getName();
        boolean _equals_2 = _name_2.equals("COMPLETED");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            State _target = elem.getTarget();
            String _name_3 = _target.getName();
            String _plus = (_name_3 + ".php");
            Twilio_php_generator.completedRedirect = _plus;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("$completedurl_dime=\"");
            _builder.append(Twilio_php_generator.completedRedirect, "");
            _builder.append("\";");
            _xblockexpression_2 = (_builder);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EVENT _event_3 = elem.getEvent();
          String _name_3 = _event_3.getName();
          boolean _equals_3 = _name_3.equals("TIMES");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              State _target = elem.getTarget();
              String _name_4 = _target.getName();
              String _plus = (_name_4 + ".php");
              Twilio_php_generator.timesRedirect = _plus;
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("$timesurl_dime=\"");
              _builder.append(Twilio_php_generator.timesRedirect, "");
              _builder.append("\";");
              _xblockexpression_3 = (_builder);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EVENT _event_4 = elem.getEvent();
            String _name_4 = _event_4.getName();
            boolean _equals_4 = _name_4.equals("TIMEOUT");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                State _target = elem.getTarget();
                String _name_5 = _target.getName();
                String _plus = (_name_5 + ".php");
                Twilio_php_generator.timeoutRedirect = _plus;
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("$timeouturl_dime=\"");
                _builder.append(Twilio_php_generator.timeoutRedirect, "");
                _builder.append("\";");
                _xblockexpression_4 = (_builder);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              StringConcatenation _builder = new StringConcatenation();
              _xifexpression_4 = _builder;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence declareGlobalStatement(final EObject elem) {
    if (elem instanceof BoolVariable) {
      return _declareGlobalStatement((BoolVariable)elem);
    } else if (elem instanceof Constant) {
      return _declareGlobalStatement((Constant)elem);
    } else if (elem instanceof NumVariable) {
      return _declareGlobalStatement((NumVariable)elem);
    } else if (elem instanceof StringVariable) {
      return _declareGlobalStatement((StringVariable)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareAbstractElement(final AbstractElement elem) {
    if (elem instanceof IfExp) {
      return _declareAbstractElement((IfExp)elem);
    } else if (elem instanceof Statement) {
      return _declareAbstractElement((Statement)elem);
    } else if (elem instanceof Transition) {
      return _declareAbstractElement((Transition)elem);
    } else if (elem instanceof VoiceTag) {
      return _declareAbstractElement((VoiceTag)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareBoolExpression(final BoolExpression elem) {
    if (elem instanceof BoolLiteral) {
      return _declareBoolExpression((BoolLiteral)elem);
    } else if (elem instanceof Literal) {
      return _declareBoolExpression((Literal)elem);
    } else if (elem instanceof Brackets) {
      return _declareBoolExpression((Brackets)elem);
    } else if (elem instanceof CALLSTATUS) {
      return _declareBoolExpression((CALLSTATUS)elem);
    } else if (elem instanceof CompareExpression) {
      return _declareBoolExpression((CompareExpression)elem);
    } else if (elem instanceof NegExpression) {
      return _declareBoolExpression((NegExpression)elem);
    } else if (elem instanceof OperationBool) {
      return _declareBoolExpression((OperationBool)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareMathExpression(final MathExpression elem) {
    if (elem instanceof NumLiteral) {
      return _declareMathExpression((NumLiteral)elem);
    } else if (elem instanceof Literal) {
      return _declareMathExpression((Literal)elem);
    } else if (elem instanceof MathBrackets) {
      return _declareMathExpression((MathBrackets)elem);
    } else if (elem instanceof Operation) {
      return _declareMathExpression((Operation)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareConcatenation(final ConcatenationExpression elem) {
    if (elem instanceof Concatenation) {
      return _declareConcatenation((Concatenation)elem);
    } else if (elem instanceof ConcatenationBrackets) {
      return _declareConcatenation((ConcatenationBrackets)elem);
    } else if (elem instanceof LiteralAbs) {
      return _declareConcatenation((LiteralAbs)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareVars(final EObject elem) {
    if (elem instanceof BoolVariable) {
      return _declareVars((BoolVariable)elem);
    } else if (elem instanceof Constant) {
      return _declareVars((Constant)elem);
    } else if (elem instanceof NumVariable) {
      return _declareVars((NumVariable)elem);
    } else if (elem instanceof StringVariable) {
      return _declareVars((StringVariable)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareLiteralAbs(final LiteralAbs elem) {
    if (elem instanceof Literal) {
      return _declareLiteralAbs((Literal)elem);
    } else if (elem instanceof Primitive) {
      return _declareLiteralAbs((Primitive)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declarePrimitive(final Primitive elem) {
    if (elem instanceof BoolLiteral) {
      return _declarePrimitive((BoolLiteral)elem);
    } else if (elem instanceof NumLiteral) {
      return _declarePrimitive((NumLiteral)elem);
    } else if (elem instanceof StringLiteral) {
      return _declarePrimitive((StringLiteral)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareLiteral(final Literal elem) {
    if (elem instanceof SESSION) {
      return _declareLiteral((SESSION)elem);
    } else if (elem != null) {
      return _declareLiteral(elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareVoiceTag(final VoiceTag elem) {
    if (elem instanceof Call) {
      return _declareVoiceTag((Call)elem);
    } else if (elem instanceof Data) {
      return _declareVoiceTag((Data)elem);
    } else if (elem instanceof Dial) {
      return _declareVoiceTag((Dial)elem);
    } else if (elem instanceof Email) {
      return _declareVoiceTag((Email)elem);
    } else if (elem instanceof GetDigits) {
      return _declareVoiceTag((GetDigits)elem);
    } else if (elem instanceof Hangup) {
      return _declareVoiceTag((Hangup)elem);
    } else if (elem instanceof Play) {
      return _declareVoiceTag((Play)elem);
    } else if (elem instanceof Record) {
      return _declareVoiceTag((Record)elem);
    } else if (elem instanceof Reject) {
      return _declareVoiceTag((Reject)elem);
    } else if (elem instanceof Say) {
      return _declareVoiceTag((Say)elem);
    } else if (elem instanceof Send) {
      return _declareVoiceTag((Send)elem);
    } else if (elem instanceof Sms) {
      return _declareVoiceTag((Sms)elem);
    } else if (elem instanceof Wait) {
      return _declareVoiceTag((Wait)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareStatement(final EObject elem) {
    if (elem instanceof BoolVariable) {
      return _declareStatement((BoolVariable)elem);
    } else if (elem instanceof Constant) {
      return _declareStatement((Constant)elem);
    } else if (elem instanceof NumVariable) {
      return _declareStatement((NumVariable)elem);
    } else if (elem instanceof StringVariable) {
      return _declareStatement((StringVariable)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
}
