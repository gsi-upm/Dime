package org.telcodev.dsl.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.HashMap;
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
import org.telcodev.dsl.dime.Ask;
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
import org.telcodev.dsl.dime.Tweet;
import org.telcodev.dsl.dime.Vars;
import org.telcodev.dsl.dime.VoiceTag;
import org.telcodev.dsl.generator.Config;
import org.telcodev.dsl.generator.CopyFile;
import org.telcodev.dsl.generator.Tropo;

@SuppressWarnings("all")
public class Tropo_php_generator {
  private static String appName;
  
  private static String voice;
  
  private static String url;
  
  private static String name;
  
  private static Set<String> variablesId;
  
  private static HashMap variables;
  
  private static HashMap constants;
  
  private static Set<String> constantsId;
  
  public static void generateTropoPhp(final Resource resource, final IFileSystemAccess fsa, final Config config) {
    Tropo _tropo = config.getTropo();
    String _voice = _tropo.getVoice();
    Tropo_php_generator.voice = _voice;
    String _url = config.getUrl();
    Tropo_php_generator.url = _url;
    System.out.println("");
    System.out.println("*****************************************************************************************");
    System.out.println("");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    String _name = ((Document) _head).getName();
    String _plus = ("Creating Tropo-Php " + _name);
    String _plus_1 = (_plus + " application.");
    System.out.println(_plus_1);
    System.out.println("Generating resources folder.");
    String _readFile = CopyFile.readFile("res/tropo_php/lib/limonade.php");
    fsa.generateFile("res/lib/limonade.php", _readFile);
    String _readFile_1 = CopyFile.readFile("res/tropo_php/lib/limonade/abstract.php");
    fsa.generateFile("res/lib/limonade/abstract.php", _readFile_1);
    String _readFile_2 = CopyFile.readFile("res/tropo_php/lib/limonade/tests.php");
    fsa.generateFile("res/lib/limonade/abstract.php", _readFile_2);
    String _readFile_3 = CopyFile.readFile("res/tropo_php/lib/limonade/assertions.php");
    fsa.generateFile("res/lib/limonade/abstract.php", _readFile_3);
    String _readFile_4 = CopyFile.readFile("res/tropo_php/lib/limonade/public/css/screen.css");
    fsa.generateFile("res/lib/limonade/public/css/screen.css", _readFile_4);
    String _readFile_5 = CopyFile.readFile("res/tropo_php/lib/limonade/public/img/bg_header.png");
    fsa.generateFile("res/lib/limonade/public/img/bg_header.png", _readFile_5);
    String _readFile_6 = CopyFile.readFile("res/tropo_php/lib/limonade/views/_debug.html.php");
    fsa.generateFile("res/lib/limonade/views/_debug.html.php", _readFile_6);
    String _readFile_7 = CopyFile.readFile("res/tropo_php/lib/limonade/views/default_layout.php");
    fsa.generateFile("res/lib/limonade/views/default_layout.php", _readFile_7);
    String _readFile_8 = CopyFile.readFile("res/tropo_php/lib/limonade/views/error.html.php");
    fsa.generateFile("res/lib/limonade/views/error.html.php", _readFile_8);
    String _readFile_9 = CopyFile.readFile("res/tropo_php/lib/limonade/views/_notices.html.php");
    fsa.generateFile("res/lib/limonade/views/_notices.html.php", _readFile_9);
    String _readFile_10 = CopyFile.readFile("res/tropo_php/tropo.class.php");
    fsa.generateFile("res/tropo.class.php", _readFile_10);
    String _readFile_11 = CopyFile.readFile("res/tropo_php/compatibility.php");
    fsa.generateFile("res/compatibility.php", _readFile_11);
    String _readFile_12 = CopyFile.readFile("res/tropo_php/TropoClasses.php");
    fsa.generateFile("res/TropoClasses.php", _readFile_12);
    String _readFile_13 = CopyFile.readFile("res/tropo_php/tropo-rest.class.php");
    fsa.generateFile("res/tropo-rest.class.php", _readFile_13);
    HashMap<?,?> _hashMap = new HashMap<Object,Object>();
    Tropo_php_generator.variables = _hashMap;
    HashMap<?,?> _hashMap_1 = new HashMap<Object,Object>();
    Tropo_php_generator.constants = _hashMap_1;
    String _className = Tropo_php_generator.className(resource);
    Tropo_php_generator.appName = _className;
    HashSet<String> _hashSet = new HashSet<String>();
    Tropo_php_generator.variablesId = _hashSet;
    HashSet<String> _hashSet_1 = new HashSet<String>();
    Tropo_php_generator.constantsId = _hashSet_1;
    String _plus_2 = ("Creating " + Tropo_php_generator.appName);
    String _plus_3 = (_plus_2 + ".php file");
    System.out.println(_plus_3);
    String _plus_4 = (Tropo_php_generator.appName + ".php");
    EList<EObject> _contents_1 = resource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    CharSequence _tropoPHP = Tropo_php_generator.toTropoPHP(((Document) _head_1), resource);
    fsa.generateFile(_plus_4, _tropoPHP);
    System.out.println("Success.");
    System.out.println("Success.");
  }
  
  public static String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public static CharSequence toTropoPHP(final Document sm, final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("// Required Tropo files");
    _builder.newLine();
    _builder.newLine();
    _builder.append("require \'res/tropo.class.php\';");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Limonade files for states simulation. More information in ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("require \'res/lib/limonade.php\';");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Defining constants");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Statement> _elements = sm.getElements();
      for(final Statement c : _elements) {
        CharSequence _declareGlobalStatement = Tropo_php_generator.declareGlobalStatement(c);
        _builder.append(_declareGlobalStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("// Declaration of the states");
    _builder.newLine();
    _builder.newLine();
    {
      EList<State> _sta = sm.getSta();
      for(final State c_1 : _sta) {
        CharSequence _declareState = Tropo_php_generator.declareState(c_1);
        _builder.append(_declareState, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("run(); ");
    _builder.newLine();
    _builder.append("?>");
    return _builder;
  }
  
  protected static CharSequence _declareGlobalStatement(final Constant elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Tropo_php_generator.constantsId.add(_name);
      Primitive _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        String _name_1 = elem.getName();
        Primitive _value_1 = elem.getValue();
        CharSequence _declarePrimitive = Tropo_php_generator.declarePrimitive(_value_1);
        Tropo_php_generator.constants.put(_name_1, _declarePrimitive);
      }
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _declareStatement = Tropo_php_generator.declareStatement(elem);
      _builder.append(_declareStatement, "");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalStatement(final BoolVariable elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Tropo_php_generator.variablesId.add(_name);
      BoolExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        String _name_1 = elem.getName();
        BoolExpression _value_1 = elem.getValue();
        CharSequence _declareBoolExpression = Tropo_php_generator.declareBoolExpression(_value_1);
        Tropo_php_generator.variables.put(_name_1, _declareBoolExpression);
      }
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalStatement(final StringVariable elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Tropo_php_generator.variablesId.add(_name);
      ConcatenationExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        String _name_1 = elem.getName();
        ConcatenationExpression _value_1 = elem.getValue();
        CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_value_1);
        Tropo_php_generator.variables.put(_name_1, _declareConcatenation);
      }
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalStatement(final NumVariable elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Tropo_php_generator.variablesId.add(_name);
      MathExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        String _name_1 = elem.getName();
        MathExpression _value_1 = elem.getValue();
        CharSequence _declareMathExpression = Tropo_php_generator.declareMathExpression(_value_1);
        Tropo_php_generator.variables.put(_name_1, _declareMathExpression);
      }
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareState(final State elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Tropo_php_generator.name = _name;
      String _plus = ("Generating " + Tropo_php_generator.name);
      String _plus_1 = (_plus + " state.");
      System.out.println(_plus_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// State ");
      String _name_1 = elem.getName();
      _builder.append(_name_1, "");
      _builder.append(" implementation");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("dispatch_post(\'/");
      String _name_2 = elem.getName();
      _builder.append(_name_2, "");
      _builder.append("\', \'app_");
      String _name_3 = elem.getName();
      _builder.append(_name_3, "");
      _builder.append("\');");
      _builder.newLineIfNotEmpty();
      _builder.append("function app_");
      String _name_4 = elem.getName();
      _builder.append(_name_4, "");
      _builder.append("() {");
      _builder.newLineIfNotEmpty();
      {
        boolean _equals = Tropo_php_generator.name.equals("start");
        if (_equals) {
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("// Creates a Tropo session and getting its parameters");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$session = new Session();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$from = $session->getFrom();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$sessionID = $session->getId();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$caller = $from[\"id\"]; ");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$to = $session->getTo();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$called = $to[\"id\"]; ");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$_SESSION[\'caller\']=$caller;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$_SESSION[\'called\']=$called;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$_SESSION[\'sessionID\']=$sessionID;");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("// Initialitation of the global variables");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          {
            for(final String d : Tropo_php_generator.variablesId) {
              _builder.append("\t");
              CharSequence _inicializeGlobalVariable = Tropo_php_generator.inicializeGlobalVariable(d);
              _builder.append(_inicializeGlobalVariable, "	");
              _builder.append(" ");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        int _times = elem.getTimes();
        boolean _notEquals = (_times != 0);
        if (_notEquals) {
          _builder.newLine();
          _builder.append("\t");
          _builder.append("// Times signal appears when the param reached the atribute times of the state");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("if(isset($_SESSION[\'times\']){");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$attempts=$_SESSION[\'times\'];");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("if($attempts==");
          int _times_1 = elem.getTimes();
          _builder.append(_times_1, "		");
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("$urltimes = \"");
          _builder.append(Tropo_php_generator.url, "			");
          _builder.append("/res/signals.php?uri=times&sessionID=\".$sessionID.\"&state=");
          String _name_5 = elem.getName();
          _builder.append(_name_5, "			");
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("$curl_handle=curl_init();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("curl_setopt($curl_handle,CURLOPT_URL,$urltimes);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("curl_setopt($curl_handle, CURLOPT_RETURNTRANSFER, TRUE);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("curl_exec($curl_handle);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("curl_close($curl_handle);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}else{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("$attempts++;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}else{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("$_SESSION[\'times\']=1;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      {
        if (false) {
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("// Timeout signal appears when the timeout atribute of the state is reached.");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$url = \"");
          _builder.append(Tropo_php_generator.url, "	");
          _builder.append("/res/signals.php?uri=timeout&sessionID=\".$sessionID.\"&state=");
          String _name_6 = elem.getName();
          _builder.append(_name_6, "	");
          _builder.append("&timeout=");
          int _timeout = elem.getTimeout();
          _builder.append(_timeout, "	");
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("$curl_handle=curl_init();");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("curl_setopt($curl_handle,CURLOPT_URL,$url);");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("curl_setopt($curl_handle,CURLOPT_CONNECTTIMEOUT,2);");
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
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// Inicialize the tropo aplication");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$tropo = new Tropo();");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// Update of the value of the global constants and variables, and the session params.");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        for(final String d_1 : Tropo_php_generator.variablesId) {
          _builder.append("\t");
          CharSequence _declareStateGlobalVariable = Tropo_php_generator.declareStateGlobalVariable(d_1);
          _builder.append(_declareStateGlobalVariable, "	");
          _builder.append(" ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("if(isset($_SESSION[\'caller\'])){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$caller=$_SESSION[\'caller\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if(isset($_SESSION[\'called\'])){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$called=$_SESSION[\'called\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if(isset($_SESSION[\'sessionID\'])){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$sessionID=$_SESSION[\'sessionID\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if(isset($_SESSION[\'lastState\'])){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$lastState=$_SESSION[\'lastState\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// Declaration of the statements of the state.");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        EList<AbstractElement> _stms = elem.getStms();
        for(final AbstractElement c : _stms) {
          _builder.append("\t");
          CharSequence _declareAbstractElement = Tropo_php_generator.declareAbstractElement(c);
          _builder.append(_declareAbstractElement, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// Update the global variables and the session params.");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        for(final String d_2 : Tropo_php_generator.variablesId) {
          _builder.append("\t");
          CharSequence _saveGlobalVariable = Tropo_php_generator.saveGlobalVariable(d_2);
          _builder.append(_saveGlobalVariable, "	");
          _builder.append(" ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("$_SESSION[\'lastState\']=\'");
      String _name_7 = elem.getName();
      _builder.append(_name_7, "	");
      _builder.append("\';");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("return $tropo->RenderJson();");
      _builder.newLine();
      _builder.append("}");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareStateGlobalVariable(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(isset($_SESSION[\'");
    _builder.append(elem, "");
    _builder.append("\'])){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("$");
    _builder.append(elem, "	");
    _builder.append("=$_SESSION[\'");
    _builder.append(elem, "	");
    _builder.append("\'];");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  public static CharSequence saveGlobalVariable(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$_SESSION[\'");
    _builder.append(elem, "");
    _builder.append("\']=$");
    _builder.append(elem, "");
    _builder.append(";  ");
    return _builder;
  }
  
  public static CharSequence inicializeGlobalVariable(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    _builder.append(elem, "");
    _builder.append("=");
    Object _get = Tropo_php_generator.variables.get(elem);
    _builder.append(_get, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("$_SESSION[\'");
    _builder.append(elem, "");
    _builder.append("\']=$");
    _builder.append(elem, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final VoiceTag elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVoiceTag = Tropo_php_generator.declareVoiceTag(elem);
    _builder.append(_declareVoiceTag, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStructure = Tropo_php_generator.declareStructure(elem);
    _builder.append(_declareStructure, "");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Statement elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStatement = Tropo_php_generator.declareStatement(elem);
    _builder.append(_declareStatement, "");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Transition elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareTransition = Tropo_php_generator.declareTransition(elem);
    _builder.append(_declareTransition, "");
    return _builder;
  }
  
  public static CharSequence declareStructure(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    CondBlock _block = elem.getBlock();
    CharSequence _declareCondBlock = Tropo_php_generator.declareCondBlock(_block);
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
            CharSequence _declareCondBlock_1 = Tropo_php_generator.declareCondBlock(e);
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
        CharSequence _declareBlock = Tropo_php_generator.declareBlock(_defaultBlock_1);
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
        CharSequence _declareAbstractElement = Tropo_php_generator.declareAbstractElement(c);
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
    CharSequence _declareBoolExpression = Tropo_php_generator.declareBoolExpression(_cond);
    _builder.append(_declareBoolExpression, "");
    _builder.append(")");
    {
      Block _action = elem.getAction();
      boolean _notEquals = (!Objects.equal(_action, null));
      if (_notEquals) {
        Block _action_1 = elem.getAction();
        CharSequence _declareBlock = Tropo_php_generator.declareBlock(_action_1);
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
      _builder.append("($callStatus==\"RINGING\")");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _name_1 = elem.getName();
      boolean _equals_1 = _name_1.equals("IN-PROGRESS");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("($callStatus==\"ANSWERING\"| $callStatus==\"ANSWERED\")");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        String _name_2 = elem.getName();
        boolean _equals_2 = _name_2.equals("DISCONNECTED");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("($callStatus==\"DISCONNECTED\")");
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          String _name_3 = elem.getName();
          boolean _equals_3 = _name_3.equals("FAILED");
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("($callStatus==\"FAILED\")");
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
    CharSequence _declareLiteral = Tropo_php_generator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final CompareExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    LiteralAbs _left = elem.getLeft();
    CharSequence _declareLiteralAbs = Tropo_php_generator.declareLiteralAbs(_left);
    _builder.append(_declareLiteralAbs, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    LiteralAbs _right = elem.getRight();
    CharSequence _declareLiteralAbs_1 = Tropo_php_generator.declareLiteralAbs(_right);
    _builder.append(_declareLiteralAbs_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final NegExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _op = elem.getOp();
    _builder.append(_op, "");
    BoolExpression _obj = elem.getObj();
    CharSequence _declareBoolExpression = Tropo_php_generator.declareBoolExpression(_obj);
    _builder.append(_declareBoolExpression, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final OperationBool elem) {
    StringConcatenation _builder = new StringConcatenation();
    BoolExpression _left = elem.getLeft();
    CharSequence _declareBoolExpression = Tropo_php_generator.declareBoolExpression(_left);
    _builder.append(_declareBoolExpression, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    BoolExpression _right = elem.getRight();
    CharSequence _declareBoolExpression_1 = Tropo_php_generator.declareBoolExpression(_right);
    _builder.append(_declareBoolExpression_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final Brackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    BoolExpression _obj = elem.getObj();
    CharSequence _declareBoolExpression = Tropo_php_generator.declareBoolExpression(_obj);
    _builder.append(_declareBoolExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Operation elem) {
    StringConcatenation _builder = new StringConcatenation();
    MathExpression _left = elem.getLeft();
    CharSequence _declareMathExpression = Tropo_php_generator.declareMathExpression(_left);
    _builder.append(_declareMathExpression, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    MathExpression _right = elem.getRight();
    CharSequence _declareMathExpression_1 = Tropo_php_generator.declareMathExpression(_right);
    _builder.append(_declareMathExpression_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = Tropo_php_generator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteralAbs = Tropo_php_generator.declareLiteralAbs(elem);
    _builder.append(_declareLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final MathBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    MathExpression _obj = elem.getObj();
    CharSequence _declareMathExpression = Tropo_php_generator.declareMathExpression(_obj);
    _builder.append(_declareMathExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final Concatenation elem) {
    StringConcatenation _builder = new StringConcatenation();
    ConcatenationExpression _left = elem.getLeft();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_left);
    _builder.append(_declareConcatenation, "");
    _builder.append(".");
    ConcatenationExpression _right = elem.getRight();
    CharSequence _declareConcatenation_1 = Tropo_php_generator.declareConcatenation(_right);
    _builder.append(_declareConcatenation_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final LiteralAbs elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteralAbs = Tropo_php_generator.declareLiteralAbs(elem);
    _builder.append(_declareLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final ConcatenationBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    ConcatenationExpression _obj = elem.getObj();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_obj);
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
  
  protected static CharSequence _declareVars(final Ask elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _vari = elem.getVari();
    _builder.append(_vari, "");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final GetDigits elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _vari = elem.getVari();
    _builder.append(_vari, "");
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
        CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_value_1);
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
        CharSequence _declareMathExpression = Tropo_php_generator.declareMathExpression(_value_1);
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
        CharSequence _declareBoolExpression = Tropo_php_generator.declareBoolExpression(_value_1);
        _builder.append(_declareBoolExpression, "");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final Primitive elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declarePrimitive = Tropo_php_generator.declarePrimitive(elem);
    _builder.append(_declarePrimitive, "");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = Tropo_php_generator.declareLiteral(elem);
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
      CharSequence _declareVars = Tropo_php_generator.declareVars(_v_1);
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
      _builder.append("$caller");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _name_1 = elem.getName();
      boolean _equals_1 = _name_1.equals("CALLED");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("$called");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        String _name_2 = elem.getName();
        boolean _equals_2 = _name_2.equals("LASTSTATE");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("$lastState");
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          String _name_3 = elem.getName();
          boolean _equals_3 = _name_3.equals("TIME");
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("$time");
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
    _builder.append("curl_setopt($curl_handle,CURLOPT_URL,");
    ConcatenationExpression _url = elem.getUrl();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_url);
    _builder.append(_declareConcatenation, "			");
    {
      SendBlock _params = elem.getParams();
      boolean _notEquals = (!Objects.equal(_params, null));
      if (_notEquals) {
        _builder.append("+\"?\"+");
        SendBlock _params_1 = elem.getParams();
        CharSequence _declareSendBlock = Tropo_php_generator.declareSendBlock(_params_1);
        _builder.append(_declareSendBlock, "			");
      }
    }
    _builder.append(");");
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
    _builder.append("curl_close($curl_handle)");
    return _builder;
  }
  
  public static CharSequence declareSendBlock(final SendBlock elem) {
    CharSequence _xblockexpression = null;
    {
      Param _value = elem.getValue();
      CharSequence s = Tropo_php_generator.declareParam(_value);
      int i = 0;
      EList<NotPrimaryParam> _stms = elem.getStms();
      int size = _stms.size();
      boolean _notEquals = (size != 0);
      if (_notEquals) {
        boolean _lessThan = (i < size);
        boolean _while = _lessThan;
        while (_while) {
          {
            String _plus = (s + "+\"&\"+");
            EList<NotPrimaryParam> _stms_1 = elem.getStms();
            NotPrimaryParam _get = _stms_1.get(i);
            Param _value_1 = _get.getValue();
            CharSequence _declareParam = Tropo_php_generator.declareParam(_value_1);
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
    _builder.append("=\"+");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_value);
    _builder.append(_declareConcatenation, "");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Say elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->say(");
    ConcatenationExpression _that = elem.getThat();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_that);
    _builder.append(_declareConcatenation, "");
    _builder.append(", array(\"voice\"=>\"");
    _builder.append(Tropo_php_generator.voice, "");
    _builder.append("\", \"allowSignals\"=>array(\"timeExceeded");
    _builder.append(Tropo_php_generator.name, "");
    _builder.append("\", \"attemptsLimit\")))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Ask elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->record( array(\"say\" => ");
    ConcatenationExpression _question = elem.getQuestion();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_question);
    _builder.append(_declareConcatenation, "");
    _builder.append(",  \"voice\"=>\"");
    _builder.append(Tropo_php_generator.voice, "");
    _builder.append("\", \"allowSignals\"=>array(\"timeExceeded");
    _builder.append(Tropo_php_generator.name, "");
    _builder.append("\", \"attemptsLimit\")))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Play elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->say(");
    ConcatenationExpression _file = elem.getFile();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_file);
    _builder.append(_declareConcatenation, "");
    _builder.append(", array(\"allowSignals\"=>array(\"timeExceeded\", \"attemptsLimit\")))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Record elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->record(array(\'url\' => ");
    ConcatenationExpression _action = elem.getAction();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_action);
    _builder.append(_declareConcatenation, "");
    _builder.append(",\'terminator\' => \'#\'");
    {
      int _time = elem.getTime();
      boolean _notEquals = (!Objects.equal(Integer.valueOf(_time), null));
      if (_notEquals) {
        _builder.append(",\'timeout\' =>");
        int _time_1 = elem.getTime();
        _builder.append(_time_1, "");
        _builder.append(")");
      }
    }
    _builder.append(", \"allowSignals\"=>array(\"timeExceeded");
    _builder.append(Tropo_php_generator.name, "");
    _builder.append("\", \"attemptsLimit\")))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Reject elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->reject()");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Hangup elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->hangup()");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final GetDigits elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _vari = elem.getVari();
    _builder.append(_vari, "");
    _builder.append("=$tropo->ask(");
    ConcatenationExpression _question = elem.getQuestion();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_question);
    _builder.append(_declareConcatenation, "");
    _builder.append(",array(\"choices\"=>\"[");
    int _numDigits = elem.getNumDigits();
    _builder.append(_numDigits, "");
    _builder.append(" DIGITS]\", \"terminator\" => \"#\", \"name\"=>\"");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("\", \"voice\"=>\"");
    _builder.append(Tropo_php_generator.voice, "");
    _builder.append("\", \"allowSignals\"=>array(\"timeExceeded");
    _builder.append(Tropo_php_generator.name, "");
    _builder.append("\", \"attemptsLimit\")))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Dial elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->transfer(");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(", array( \"allowSignals\"=>array(\"timeExceeded");
    _builder.append(Tropo_php_generator.name, "");
    _builder.append("\", \"attemptsLimit\")))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Call elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->call(");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(", array( \"allowSignals\"=>array(\"timeExceeded");
    _builder.append(Tropo_php_generator.name, "");
    _builder.append("\", \"attemptsLimit\")))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Tweet elem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Email elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mail(");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(", ");
    ConcatenationExpression _title = elem.getTitle();
    CharSequence _declareConcatenation_1 = Tropo_php_generator.declareConcatenation(_title);
    _builder.append(_declareConcatenation_1, "");
    _builder.append(",");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareConcatenation_2 = Tropo_php_generator.declareConcatenation(_value);
    _builder.append(_declareConcatenation_2, "");
    _builder.append(", \"From: <\".");
    ConcatenationExpression _from = elem.getFrom();
    CharSequence _declareConcatenation_3 = Tropo_php_generator.declareConcatenation(_from);
    _builder.append(_declareConcatenation_3, "");
    _builder.append(".\"> \\r\\n\") ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Sms elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->call(");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(", array(\'network\'=>\'SMS\'));");
    _builder.newLineIfNotEmpty();
    _builder.append("$tropo->say(");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareConcatenation_1 = Tropo_php_generator.declareConcatenation(_value);
    _builder.append(_declareConcatenation_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = Tropo_php_generator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = Tropo_php_generator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = Tropo_php_generator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final Constant elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareConstant = Tropo_php_generator.declareConstant(elem);
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
    CharSequence _declarePrimitive = Tropo_php_generator.declarePrimitive(_value);
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
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$tropo->on(array(\"event\" => \"incomplete\", \"next\" =>\"");
      _builder.append(Tropo_php_generator.appName, "");
      _builder.append(".php?uri=");
      State _target = elem.getTarget();
      String _name_1 = _target.getName();
      _builder.append(_name_1, "");
      _builder.append("\"));");
      _builder.newLineIfNotEmpty();
      _builder.append("$tropo->on(array(\"event\" => \"error\", \"next\" =>\"");
      _builder.append(Tropo_php_generator.appName, "");
      _builder.append(".php?uri=");
      State _target_1 = elem.getTarget();
      String _name_2 = _target_1.getName();
      _builder.append(_name_2, "");
      _builder.append("\"));");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("$tropo->on(array(\"event\" => \"");
      EVENT _event_1 = elem.getEvent();
      CharSequence _declareEvent = Tropo_php_generator.declareEvent(_event_1);
      _builder_1.append(_declareEvent, "");
      _builder_1.append("\", \"next\" =>\"");
      _builder_1.append(Tropo_php_generator.appName, "");
      _builder_1.append(".php?uri=");
      State _target_2 = elem.getTarget();
      String _name_3 = _target_2.getName();
      _builder_1.append(_name_3, "");
      _builder_1.append("\"));");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence declareEvent(final EVENT elem) {
    CharSequence _xifexpression = null;
    String _name = elem.getName();
    boolean _equals = _name.equals("COMPLETED");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("continue");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _name_1 = elem.getName();
      boolean _equals_1 = _name_1.equals("TIMEOUT");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("timeExceeded");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        String _name_2 = elem.getName();
        boolean _equals_2 = _name_2.equals("TIMES");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("timeExceeattemptsLimit");
          _xifexpression_2 = _builder_2;
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          _xifexpression_2 = _builder_3;
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
    if (elem instanceof Ask) {
      return _declareVars((Ask)elem);
    } else if (elem instanceof BoolVariable) {
      return _declareVars((BoolVariable)elem);
    } else if (elem instanceof Constant) {
      return _declareVars((Constant)elem);
    } else if (elem instanceof GetDigits) {
      return _declareVars((GetDigits)elem);
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
    if (elem instanceof Ask) {
      return _declareVoiceTag((Ask)elem);
    } else if (elem instanceof Call) {
      return _declareVoiceTag((Call)elem);
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
    } else if (elem instanceof Tweet) {
      return _declareVoiceTag((Tweet)elem);
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
