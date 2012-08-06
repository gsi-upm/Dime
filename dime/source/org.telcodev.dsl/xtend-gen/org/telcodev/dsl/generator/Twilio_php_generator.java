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
import org.telcodev.dsl.dime.Ask;
import org.telcodev.dsl.dime.Assigment;
import org.telcodev.dsl.dime.Block;
import org.telcodev.dsl.dime.BoolExpression;
import org.telcodev.dsl.dime.BoolLiteral;
import org.telcodev.dsl.dime.BoolVariable;
import org.telcodev.dsl.dime.Brackets;
import org.telcodev.dsl.dime.Call;
import org.telcodev.dsl.dime.CompareExpression;
import org.telcodev.dsl.dime.Concatenation;
import org.telcodev.dsl.dime.ConcatenationBrackets;
import org.telcodev.dsl.dime.ConcatenationExpression;
import org.telcodev.dsl.dime.CondBlock;
import org.telcodev.dsl.dime.Dial;
import org.telcodev.dsl.dime.Document;
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
import org.telcodev.dsl.dime.Record;
import org.telcodev.dsl.dime.Reject;
import org.telcodev.dsl.dime.Say;
import org.telcodev.dsl.dime.Send;
import org.telcodev.dsl.dime.SendBlock;
import org.telcodev.dsl.dime.State;
import org.telcodev.dsl.dime.Statement;
import org.telcodev.dsl.dime.StringLiteral;
import org.telcodev.dsl.dime.StringVariable;
import org.telcodev.dsl.dime.Transition;
import org.telcodev.dsl.dime.Vars;
import org.telcodev.dsl.dime.VoiceTag;
import org.telcodev.dsl.generator.Config;
import org.telcodev.dsl.generator.CopyFile;
import org.telcodev.dsl.generator.Twilio;

@SuppressWarnings("all")
public class Twilio_php_generator {
  private static String appName;
  
  private static Set<String> variables;
  
  private static String voice;
  
  private static String url;
  
  private static String name;
  
  private static String language;
  
  private static String twilioLanguage;
  
  private static String errorRedirect;
  
  private static String completedRedirect;
  
  private static String hangupRedirect;
  
  private static String timesRedirect;
  
  private static String timeoutRedirect;
  
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
    String _readFile = CopyFile.readFile("res/tropo_php/signals.php");
    fsa.generateFile("res/signals.php", _readFile);
    String _readFile_1 = CopyFile.readFile("res/tropo_php/lib/limonade.php");
    fsa.generateFile("res/lib/limonade.php", _readFile_1);
    String _readFile_2 = CopyFile.readFile("res/tropo_php/lib/limonade/abstract.php");
    fsa.generateFile("res/lib/limonade/abstract.php", _readFile_2);
    String _readFile_3 = CopyFile.readFile("res/tropo_php/lib/limonade/tests.php");
    fsa.generateFile("res/lib/limonade/abstract.php", _readFile_3);
    String _readFile_4 = CopyFile.readFile("res/tropo_php/lib/limonade/assertions.php");
    fsa.generateFile("res/lib/limonade/abstract.php", _readFile_4);
    String _readFile_5 = CopyFile.readFile("res/tropo_php/lib/limonade/public/css/screen.css");
    fsa.generateFile("res/lib/limonade/public/css/screen.css", _readFile_5);
    String _readFile_6 = CopyFile.readFile("res/tropo_php/lib/limonade/public/img/bg_header.png");
    fsa.generateFile("res/lib/limonade/public/img/bg_header.png", _readFile_6);
    String _readFile_7 = CopyFile.readFile("res/tropo_php/lib/limonade/views/_debug.html.php");
    fsa.generateFile("res/lib/limonade/views/_debug.html.php", _readFile_7);
    String _readFile_8 = CopyFile.readFile("res/tropo_php/lib/limonade/views/default_layout.php");
    fsa.generateFile("res/lib/limonade/views/default_layout.php", _readFile_8);
    String _readFile_9 = CopyFile.readFile("res/tropo_php/lib/limonade/views/error.html.php");
    fsa.generateFile("res/lib/limonade/views/error.html.php", _readFile_9);
    String _readFile_10 = CopyFile.readFile("res/tropo_php/lib/limonade/views/_notices.html.php");
    fsa.generateFile("res/lib/limonade/views/_notices.html.php", _readFile_10);
    String _className = Twilio_php_generator.className(resource);
    Twilio_php_generator.appName = _className;
    HashSet<String> _hashSet = new HashSet<String>();
    Twilio_php_generator.variables = _hashSet;
    String _plus = (Twilio_php_generator.appName + ".php");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _twilioPHP = Twilio_php_generator.toTwilioPHP(((Document) _head), resource);
    fsa.generateFile(_plus, _twilioPHP);
  }
  
  public static String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public static CharSequence toTwilioPHP(final Document sm, final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("require \'res/Twilio.php\';");
    _builder.newLine();
    _builder.append("require \'res/lib/limonade.php\';");
    _builder.newLine();
    _builder.append("\u00AC\u00B4FOR c : sm.elements\u00AC\u00AA\u00AC\u00B4declareGlobalVariable(c)\u00AC\u00AA");
    _builder.newLine();
    _builder.append("\u00AC\u00B4ENDFOR\u00AC\u00AA");
    _builder.newLine();
    _builder.append("\u00AC\u00B4FOR c : sm.sta\u00AC\u00AA\u00AC\u00B4declareState(c)\u00AC\u00AA");
    _builder.newLine();
    _builder.append("\u00AC\u00B4ENDFOR\u00AC\u00AA");
    _builder.newLine();
    _builder.append("run(); ");
    _builder.newLine();
    _builder.append("?>");
    return _builder;
  }
  
  protected static CharSequence _declareGlobalVariable(final Statement elem) {
    CharSequence _xblockexpression = null;
    {
      Twilio_php_generator.addGlobalVariable(elem);
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalVariable(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected static boolean _addGlobalVariable(final BoolVariable elem) {
    String _name = elem.getName();
    boolean _add = Twilio_php_generator.variables.add(_name);
    return _add;
  }
  
  protected static boolean _addGlobalVariable(final StringVariable elem) {
    String _name = elem.getName();
    boolean _add = Twilio_php_generator.variables.add(_name);
    return _add;
  }
  
  protected static boolean _addGlobalVariable(final NumVariable elem) {
    String _name = elem.getName();
    boolean _add = Twilio_php_generator.variables.add(_name);
    return _add;
  }
  
  protected static CharSequence _declareBoolExpression(final BoolLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.value\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareLiteral(elem)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final CompareExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareLiteralAbs(elem.left)\u00AC\u00AA\u00AC\u00B4elem.op\u00AC\u00AA\u00AC\u00B4declareLiteralAbs(elem.right)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final NegExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.op\u00AC\u00AA\u00AC\u00B4declareBoolExpression(elem.obj)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final OperationBool elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareBoolExpression(elem.left)\u00AC\u00AA\u00AC\u00B4elem.op\u00AC\u00AA\u00AC\u00B4declareBoolExpression(elem.right)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final Brackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(\u00AC\u00B4declareBoolExpression(elem.obj)\u00AC\u00AA)");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Operation elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareMathExpression(elem.left)\u00AC\u00AA\u00AC\u00B4elem.op\u00AC\u00AA\u00AC\u00B4declareMathExpression(elem.right)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareLiteral(elem)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareLiteralAbs(elem)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final MathBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(\u00AC\u00B4declareMathExpression(elem.obj)\u00AC\u00AA)");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final Concatenation elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareConcatenation(elem.left)\u00AC\u00AA.\u00AC\u00B4declareConcatenation(elem.right)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final LiteralAbs elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareLiteralAbs(elem)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final ConcatenationBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(\u00AC\u00B4declareConcatenation(elem.obj)\u00AC\u00AA)");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.name\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.name\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.name\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final Ask elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.name\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final GetDigits elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.name\u00AC\u00AA");
    return _builder;
  }
  
  public static CharSequence declareAssigment(final Assigment elem) {
    CharSequence _xifexpression = null;
    Vars _va = elem.getVa();
    CharSequence _declareVars = Twilio_php_generator.declareVars(_va);
    String _string = _declareVars.toString();
    boolean _contains = Twilio_php_generator.variables.contains(_string);
    if (_contains) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$\u00AC\u00B4declareVars(elem.va)\u00AC\u00AA=\u00AC\u00B4declareMathExpression(elem.right)\u00AC\u00AA; ");
      _builder.newLine();
      _builder.append("$_REQUEST[\'\u00AC\u00B4declareVars(elem.va)\u00AC\u00AA\'] = \u00AC\u00B4declareVars(elem.va)\u00AC\u00AA");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("$\u00AC\u00B4declareVars(elem.va)\u00AC\u00AA=\u00AC\u00B4declareMathExpression(elem.right)\u00AC\u00AA");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence declareVariable(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$\u00AC\u00B4elem.name\u00AC\u00AA\u00AC\u00B4IF elem.value!=null\u00AC\u00AA=\u00AC\u00B4declareConcatenation(elem.value)\u00AC\u00AA\u00AC\u00B4ENDIF\u00AC\u00AA");
    return _builder;
  }
  
  public static CharSequence declareVariable(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$\u00AC\u00B4elem.name\u00AC\u00AA\u00AC\u00B4IF elem.value!=null\u00AC\u00AA=\u00AC\u00B4declareMathExpression(elem.value)\u00AC\u00AA\u00AC\u00B4ENDIF\u00AC\u00AA");
    return _builder;
  }
  
  public static CharSequence declareVariable(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$\u00AC\u00B4elem.name\u00AC\u00AA\u00AC\u00B4IF elem.value!=null\u00AC\u00AA=\u00AC\u00B4declareBoolExpression(elem.value)\u00AC\u00AA\u00AC\u00B4ENDIF\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final StringLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"\u00AC\u00B4elem.value\u00AC\u00AA\"");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareLiteral(elem)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final BoolLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.value\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4elem.value\u00AC\u00AA");
    return _builder;
  }
  
  public static CharSequence declareLiteral(final Literal elem) {
    CharSequence _xifexpression = null;
    Vars _v = elem.getV();
    boolean _notEquals = (!Objects.equal(_v, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$\u00AC\u00B4declareVars(elem.v)\u00AC\u00AA");
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
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("\u00AC\u00B4declareSession(elem.ses)\u00AC\u00AA");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence declareSession(final String elem) {
    CharSequence _xifexpression = null;
    boolean _equals = Objects.equal(elem, "caller");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$\u00AC\u00B4elem\u00AC\u00AA");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _equals_1 = Objects.equal(elem, "called");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("$\u00AC\u00B4elem\u00AC\u00AA");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        boolean _equals_2 = Objects.equal(elem, "lastState");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("$\u00AC\u00B4elem\u00AC\u00AA");
          _xifexpression_2 = _builder_2;
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("$\u00AC\u00B4elem\u00AC\u00AA");
          _xifexpression_2 = _builder_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected static CharSequence _declareVoiceTag(final Send elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("$url = \u00AC\u00B4declareConcatenation(elem.url)\u00AC\u00AA\u00AC\u00B4IF elem.params!=null\u00AC\u00AA\u00AC\u00B4declareSendBlock(elem.params)\u00AC\u00AA\u00AC\u00B4ENDIF\u00AC\u00AA;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("$curl_handle=curl_init();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("curl_setopt($curl_handle,CURLOPT_URL,$urltimes);");
    _builder.newLine();
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
      CharSequence _declareParam = Twilio_php_generator.declareParam(_value);
      String s = ("" + _declareParam);
      int i = 0;
      EList<NotPrimaryParam> _stms = elem.getStms();
      int size = _stms.size();
      boolean _lessEqualsThan = (i <= size);
      boolean _while = _lessEqualsThan;
      while (_while) {
        {
          String _plus = (s + "&");
          EList<NotPrimaryParam> _stms_1 = elem.getStms();
          NotPrimaryParam _get = _stms_1.get(i);
          Param _value_1 = _get.getValue();
          CharSequence _declareParam_1 = Twilio_php_generator.declareParam(_value_1);
          String _plus_1 = (_plus + _declareParam_1);
          s = _plus_1;
          int _plus_2 = (i + 1);
          i = _plus_2;
        }
        boolean _lessEqualsThan_1 = (i <= size);
        _while = _lessEqualsThan_1;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\u00AC\u00B4s\u00AC\u00AA");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareParam(final Param elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"\u00AC\u00B4elem.paramName\u00AC\u00AA\"=\u00AC\u00B4declareConcatenation(elem.value)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Say elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Say voice=\\\"\u00AC\u00B4voice\u00AC\u00AA\\\" language=\\\"\u00AC\u00B4twilioLanguage\u00AC\u00AA\\\">\".\u00AC\u00B4declareConcatenation(elem.that)\u00AC\u00AA.\"</Say>\\n\" ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Ask elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$_REQUEST[\'\u00AC\u00B4elem.name\u00AC\u00AA\']=\"TranscriptionText\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("echo \"<Record transcribe=\\\"true\\\" transcribeCallback=\\\"\u00AC\u00B4completedRedirect\u00AC\u00AA\\\" /> \\n\"");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Play elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Play>\".\u00AC\u00B4declareConcatenation(elem.file)\u00AC\u00AA\".</Play>\\n\" ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Record elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Record action=\\\"\u00AC\u00B4completedRedirect\u00AC\u00AA\\\" method=\\\"GET\\\" maxLength=\\\"\u00AC\u00B4elem.time\u00AC\u00AA\\\" finishOnKey=\\\"*\\\" /> \\n\"");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Reject elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Reject /> \\n\" ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Hangup elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Hangup /> \\n\" ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final GetDigits elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$_REQUEST[\'\u00AC\u00B4elem.name\u00AC\u00AA\']=\"Digits\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("echo \"<Gather action=\\\"\u00AC\u00B4completedRedirect\u00AC\u00AA\\\" numDigits=\\\"\u00AC\u00B4elem.numDigits\u00AC\u00AA\\\" > <Say>\". \u00AC\u00B4declareConcatenation(elem.question)\u00AC\u00AA.\"</Say> </Gather>\"");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Dial elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Dial callerId=\\\"\".$caller.\"\\\">\\n <Number>\".\u00AC\u00B4declareConcatenation(elem.to)\u00AC\u00AA.\"</Number> \\n </Dial> \\n\"");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Call elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Dial callerId=\\\"\".$caller.\"\\\">\\n <Number>\".\u00AC\u00B4declareConcatenation(elem.to)\u00AC\u00AA.\"</Number> \\n </Dial> \\n\"");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareVariable(elem)\u00AC\u00AA;");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareVariable(elem)\u00AC\u00AA;");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final Assigment elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareAssigment(elem)\u00AC\u00AA;");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareVariable(elem)\u00AC\u00AA;");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final VoiceTag elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareVoiceTag(elem)\u00AC\u00AA;");
    return _builder;
  }
  
  public static CharSequence declareTransition(final Transition elem) {
    CharSequence _xblockexpression = null;
    {
      String _event = elem.getEvent();
      boolean _equals = _event.equals("error");
      if (_equals) {
        String _plus = (Twilio_php_generator.appName + ".php?uri=");
        State _target = elem.getTarget();
        String _name = _target.getName();
        String _plus_1 = (_plus + _name);
        Twilio_php_generator.errorRedirect = _plus_1;
      } else {
        String _event_1 = elem.getEvent();
        boolean _equals_1 = _event_1.equals("hangup");
        if (_equals_1) {
          String _plus_2 = (Twilio_php_generator.appName + ".php?uri=");
          State _target_1 = elem.getTarget();
          String _name_1 = _target_1.getName();
          String _plus_3 = (_plus_2 + _name_1);
          Twilio_php_generator.hangupRedirect = _plus_3;
        } else {
          String _event_2 = elem.getEvent();
          boolean _equals_2 = _event_2.equals("completed");
          if (_equals_2) {
            String _plus_4 = (Twilio_php_generator.appName + ".php?uri=");
            State _target_2 = elem.getTarget();
            String _name_2 = _target_2.getName();
            String _plus_5 = (_plus_4 + _name_2);
            Twilio_php_generator.completedRedirect = _plus_5;
          } else {
            String _event_3 = elem.getEvent();
            boolean _equals_3 = _event_3.equals("attemptsLimit");
            if (_equals_3) {
              String _plus_6 = (Twilio_php_generator.appName + ".php?uri=");
              State _target_3 = elem.getTarget();
              String _name_3 = _target_3.getName();
              String _plus_7 = (_plus_6 + _name_3);
              Twilio_php_generator.timesRedirect = _plus_7;
            } else {
              String _event_4 = elem.getEvent();
              boolean _equals_4 = _event_4.equals("timeout");
              if (_equals_4) {
                String _plus_8 = (Twilio_php_generator.appName + ".php?uri=");
                State _target_4 = elem.getTarget();
                String _name_4 = _target_4.getName();
                String _plus_9 = (_plus_8 + _name_4);
                Twilio_php_generator.timeoutRedirect = _plus_9;
              } else {
              }
            }
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareState(final State elem) {
    CharSequence _xblockexpression = null;
    {
      boolean result = true;
      String _name = elem.getName();
      Twilio_php_generator.name = _name;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("dispatch_post(\'/\u00AC\u00B4elem.name\u00AC\u00AA\', \'app_\u00AC\u00B4elem.name\u00AC\u00AA\');");
      _builder.newLine();
      _builder.append("function app_\u00AC\u00B4elem.name\u00AC\u00AA() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$status = $_REQUEST[\"CallStatus\"]; ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4IF hangupRedirect!=null\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if($status==\"hangup\"){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("echo \"<Redirect>\u00AC\u00B4hangupRedirect\u00AC\u00AA</Redirect>\";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}\u00AC\u00B4ENDIF\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4IF errorRedirect!=null\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if($status==\"fail\"){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("echo \"<Redirect>\u00AC\u00B4errorRedirect\u00AC\u00AA</Redirect>\";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}\u00AC\u00B4ENDIF\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4IF elem.name.equals(\"start\")\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$caller = $_REQUEST[\"From\"]; ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$called = $_REQUEST[\"To\"]; ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$_REQUEST[\'caller\']=$caller;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$_REQUEST[\'called\']=$called;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4ENDIF\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4IF false\u00AC\u00AA ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if(isset($_SESSION[\'times\']){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$attempts=$_SESSION[\'times\'];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if($attempts==\u00AC\u00B4elem.times\u00AC\u00AA){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("$urltimes = \"\u00AC\u00B4url\u00AC\u00AA/res/signals.php?uri=times&sessionID=\".$sessionID.\"&state=\u00AC\u00B4elem.name\u00AC\u00AA\";");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("$curl_handle=curl_init();");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("curl_setopt($curl_handle,CURLOPT_URL,$urltimes);");
      _builder.newLine();
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
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}else{ ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("$attempts++;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}else{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$_SESSION[\'times\']=1;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4ENDIF\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4IF false \u00AC\u00AA \t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$url = \"\u00AC\u00B4url\u00AC\u00AA/res/signals.php?uri=timeout&sessionID=\".$sessionID.\"&state=\u00AC\u00B4elem.name\u00AC\u00AA&timeout=\u00AC\u00B4elem.timeout\u00AC\u00AA\";");
      _builder.newLine();
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
      _builder.append("\t");
      _builder.append("\u00AC\u00B4ENDIF\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4FOR d: variables\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4declareGlobalVariable(d)\u00AC\u00AA ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4ENDFOR\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$caller=$_REQUEST[\'caller\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$called=$_REQUEST[\'called\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if(isset($_REQUEST[\'lastState\']){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$lastState=$_REQUEST[\'lastState\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4FOR c : elem.stms\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4IF (c instanceof Ask)&&(c instanceof GetDigits)&&(c instanceof Record)\u00AC\u00AA\u00AC\u00B4result=false\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4ENDIF\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4declareAbstractElement(c)\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4ENDFOR\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$_REQUEST[\'lastState\']=\'\u00AC\u00B4elem.name\u00AC\u00AA\';");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4IF completedRedirect!=null && result\u00AC\u00AAecho \"<Redirect>\u00AC\u00B4completedRedirect\u00AC\u00AA</Redirect>\";\u00AC\u00B4ENDIF\u00AC\u00AA");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\u00AC\u00B4IF errorRedirect!=null\u00AC\u00AAecho \"<Redirect>\u00AC\u00B4hangupRedirect\u00AC\u00AA</Redirect>\";\u00AC\u00B4ENDIF\u00AC\u00AA");
      _builder.newLine();
      _builder.append("}");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareGlobalVariable(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$\u00AC\u00B4elem\u00AC\u00AA=$_REQUEST[\'\u00AC\u00B4elem\u00AC\u00AA\'];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if($\u00AC\u00B4elem\u00AC\u00AA==\"Digits\"){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("$\u00AC\u00B4elem\u00AC\u00AA= $_REQUEST[\'Digits\'];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}else if($\u00AC\u00B4elem\u00AC\u00AA==\"TranscriptionText\"){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("$\u00AC\u00B4elem\u00AC\u00AA= $_REQUEST[\'TranscriptionText\'];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareStructure(elem)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Statement elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareStatement(elem)\u00AC\u00AA");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Transition elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareTransition(elem)\u00AC\u00AA");
    return _builder;
  }
  
  public static CharSequence declareStructure(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\u00AC\u00B4declareCondBlock(elem.block)\u00AC\u00AA");
    _builder.newLine();
    _builder.append("\u00AC\u00B4IF elem.blocks!=null\u00AC\u00AA\u00AC\u00B4FOR e: elem.blocks \u00AC\u00AAelse \u00AC\u00B4declareCondBlock(e)\u00AC\u00AA");
    _builder.newLine();
    _builder.append("\u00AC\u00B4ENDFOR\u00AC\u00AA\u00AC\u00B4ENDIF\u00AC\u00AA");
    _builder.newLine();
    _builder.append("\u00AC\u00B4IF elem.defaultBlock!=null\u00AC\u00AAelse \u00AC\u00B4declareBlock(elem.defaultBlock)\u00AC\u00AA\u00AC\u00B4ENDIF\u00AC\u00AA");
    return _builder;
  }
  
  public static CharSequence declareBlock(final Block elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\u00AC\u00B4FOR c: elem.sta\u00AC\u00AA\u00AC\u00B4declareAbstractElement(c)\u00AC\u00AA");
    _builder.newLine();
    _builder.append("\u00AC\u00B4ENDFOR\u00AC\u00AA");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    return _builder;
  }
  
  public static CharSequence declareCondBlock(final CondBlock elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(\u00AC\u00B4declareBoolExpression(elem.cond)\u00AC\u00AA)\u00AC\u00B4IF elem.action!=null\u00AC\u00AA\u00AC\u00B4declareBlock(elem.action)\u00AC\u00AA\u00AC\u00B4ENDIF\u00AC\u00AA");
    return _builder;
  }
  
  public static CharSequence declareGlobalVariable(final AbstractElement elem) {
    if (elem instanceof IfExp) {
      return _declareGlobalVariable((IfExp)elem);
    } else if (elem instanceof Statement) {
      return _declareGlobalVariable((Statement)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static boolean addGlobalVariable(final EObject elem) {
    if (elem instanceof BoolVariable) {
      return _addGlobalVariable((BoolVariable)elem);
    } else if (elem instanceof NumVariable) {
      return _addGlobalVariable((NumVariable)elem);
    } else if (elem instanceof StringVariable) {
      return _addGlobalVariable((StringVariable)elem);
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
    if (elem instanceof Literal) {
      return _declareMathExpression((Literal)elem);
    } else if (elem instanceof NumLiteral) {
      return _declareMathExpression((NumLiteral)elem);
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
    } else if (elem instanceof GetDigits) {
      return _declareVars((GetDigits)elem);
    } else if (elem instanceof BoolVariable) {
      return _declareVars((BoolVariable)elem);
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
    if (elem instanceof BoolLiteral) {
      return _declareLiteralAbs((BoolLiteral)elem);
    } else if (elem instanceof Literal) {
      return _declareLiteralAbs((Literal)elem);
    } else if (elem instanceof NumLiteral) {
      return _declareLiteralAbs((NumLiteral)elem);
    } else if (elem instanceof StringLiteral) {
      return _declareLiteralAbs((StringLiteral)elem);
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
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareStatement(final Statement elem) {
    if (elem instanceof Assigment) {
      return _declareStatement((Assigment)elem);
    } else if (elem instanceof BoolVariable) {
      return _declareStatement((BoolVariable)elem);
    } else if (elem instanceof NumVariable) {
      return _declareStatement((NumVariable)elem);
    } else if (elem instanceof StringVariable) {
      return _declareStatement((StringVariable)elem);
    } else if (elem instanceof VoiceTag) {
      return _declareStatement((VoiceTag)elem);
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
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
}
