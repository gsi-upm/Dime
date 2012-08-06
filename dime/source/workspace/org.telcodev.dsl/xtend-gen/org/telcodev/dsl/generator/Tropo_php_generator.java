package org.telcodev.dsl.generator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
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
import org.telcodev.dsl.generator.Tropo;

@SuppressWarnings("all")
public class Tropo_php_generator {
  private static String appName;
  
  private static Set<String> variables;
  
  private static String voice;
  
  private static String url;
  
  private static String name;
  
  public static void generateTropoPhp(final Resource resource, final IFileSystemAccess fsa, final Config config) {
      Tropo _tropo = config.getTropo();
      String _voice = _tropo.getVoice();
      Tropo_php_generator.voice = _voice;
      String _url = config.getUrl();
      Tropo_php_generator.url = _url;
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
      String _readFile_11 = CopyFile.readFile("res/tropo_php/tropo.class.php");
      fsa.generateFile("res/tropo.class.php", _readFile_11);
      String _readFile_12 = CopyFile.readFile("res/tropo_php/compatibility.php");
      fsa.generateFile("res/compatibility.php", _readFile_12);
      String _readFile_13 = CopyFile.readFile("res/tropo_php/TropoClasses.php");
      fsa.generateFile("res/TropoClasses.php", _readFile_13);
      String _readFile_14 = CopyFile.readFile("res/tropo_php/tropo-rest.class.php");
      fsa.generateFile("res/tropo-rest.class.php", _readFile_14);
      String _className = Tropo_php_generator.className(resource);
      Tropo_php_generator.appName = _className;
      HashSet<String> _hashSet = new HashSet<String>();
      Tropo_php_generator.variables = _hashSet;
      String _operator_plus = StringExtensions.operator_plus(Tropo_php_generator.appName, ".php");
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      CharSequence _tropoPHP = Tropo_php_generator.toTropoPHP(((Document) _head), resource);
      fsa.generateFile(_operator_plus, _tropoPHP);
  }
  
  public static String className(final Resource res) {
      URI _uRI = res.getURI();
      String _lastSegment = _uRI.lastSegment();
      String name = _lastSegment;
      int _indexOf = name.indexOf(".");
      String _substring = name.substring(0, _indexOf);
      return _substring;
  }
  
  public static CharSequence toTropoPHP(final Document sm, final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("require \'res/tropo.class.php\';");
    _builder.newLine();
    _builder.append("require \'res/lib/limonade.php\';");
    _builder.newLine();
    {
      EList<Statement> _elements = sm.getElements();
      for(final Statement c : _elements) {
        CharSequence _declareGlobalVariable = Tropo_php_generator.declareGlobalVariable(c);
        _builder.append(_declareGlobalVariable, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<State> _sta = sm.getSta();
      for(final State c_1 : _sta) {
        CharSequence _declareState = Tropo_php_generator.declareState(c_1);
        _builder.append(_declareState, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("run(); ");
    _builder.newLine();
    _builder.append("?>");
    return _builder;
  }
  
  protected static CharSequence _declareGlobalVariable(final Statement elem) {
    CharSequence _xblockexpression = null;
    {
      Tropo_php_generator.addGlobalVariable(elem);
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
    boolean _add = Tropo_php_generator.variables.add(_name);
    return _add;
  }
  
  protected static boolean _addGlobalVariable(final StringVariable elem) {
    String _name = elem.getName();
    boolean _add = Tropo_php_generator.variables.add(_name);
    return _add;
  }
  
  protected static boolean _addGlobalVariable(final NumVariable elem) {
    String _name = elem.getName();
    boolean _add = Tropo_php_generator.variables.add(_name);
    return _add;
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
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final Ask elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final GetDigits elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public static CharSequence declareAssigment(final Assigment elem) {
    CharSequence _xifexpression = null;
    Vars _va = elem.getVa();
    CharSequence _declareVars = Tropo_php_generator.declareVars(_va);
    String _string = _declareVars.toString();
    boolean _contains = Tropo_php_generator.variables.contains(_string);
    if (_contains) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$");
      Vars _va_1 = elem.getVa();
      CharSequence _declareVars_1 = Tropo_php_generator.declareVars(_va_1);
      _builder.append(_declareVars_1, "");
      _builder.append("=");
      MathExpression _right = elem.getRight();
      CharSequence _declareMathExpression = Tropo_php_generator.declareMathExpression(_right);
      _builder.append(_declareMathExpression, "");
      _builder.append("; ");
      _builder.newLineIfNotEmpty();
      _builder.append("$_SESSION[\'");
      Vars _va_2 = elem.getVa();
      CharSequence _declareVars_2 = Tropo_php_generator.declareVars(_va_2);
      _builder.append(_declareVars_2, "");
      _builder.append("\'] = ");
      Vars _va_3 = elem.getVa();
      CharSequence _declareVars_3 = Tropo_php_generator.declareVars(_va_3);
      _builder.append(_declareVars_3, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("$");
      Vars _va_4 = elem.getVa();
      CharSequence _declareVars_4 = Tropo_php_generator.declareVars(_va_4);
      _builder_1.append(_declareVars_4, "");
      _builder_1.append("=");
      MathExpression _right_1 = elem.getRight();
      CharSequence _declareMathExpression_1 = Tropo_php_generator.declareMathExpression(_right_1);
      _builder_1.append(_declareMathExpression_1, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence declareVariable(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _name = elem.getName();
    _builder.append(_name, "");
    {
      ConcatenationExpression _value = elem.getValue();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_value, null);
      if (_operator_notEquals) {
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
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_value, null);
      if (_operator_notEquals) {
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
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_value, null);
      if (_operator_notEquals) {
        _builder.append("=");
        BoolExpression _value_1 = elem.getValue();
        CharSequence _declareBoolExpression = Tropo_php_generator.declareBoolExpression(_value_1);
        _builder.append(_declareBoolExpression, "");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final StringLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = elem.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = Tropo_php_generator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final BoolLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = elem.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = elem.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  public static CharSequence declareLiteral(final Literal elem) {
    CharSequence _xifexpression = null;
    Vars _v = elem.getV();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_v, null);
    if (_operator_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$");
      Vars _v_1 = elem.getV();
      CharSequence _declareVars = Tropo_php_generator.declareVars(_v_1);
      _builder.append(_declareVars, "");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _nul = elem.getNul();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_nul, null);
      if (_operator_notEquals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("null");
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        String _ses = elem.getSes();
        CharSequence _declareSession = Tropo_php_generator.declareSession(_ses);
        _builder_2.append(_declareSession, "");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence declareSession(final String elem) {
    CharSequence _xifexpression = null;
    boolean _operator_equals = ObjectExtensions.operator_equals(elem, "caller");
    if (_operator_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$");
      _builder.append(elem, "");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _operator_equals_1 = ObjectExtensions.operator_equals(elem, "called");
      if (_operator_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("$");
        _builder_1.append(elem, "");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        boolean _operator_equals_2 = ObjectExtensions.operator_equals(elem, "lastState");
        if (_operator_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("$");
          _builder_2.append(elem, "");
          _xifexpression_2 = _builder_2;
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("$");
          _builder_3.append(elem, "");
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
    _builder.append("$url = ");
    ConcatenationExpression _url = elem.getUrl();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_url);
    _builder.append(_declareConcatenation, "		");
    {
      SendBlock _params = elem.getParams();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_params, null);
      if (_operator_notEquals) {
        SendBlock _params_1 = elem.getParams();
        CharSequence _declareSendBlock = Tropo_php_generator.declareSendBlock(_params_1);
        _builder.append(_declareSendBlock, "		");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
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
      CharSequence _declareParam = Tropo_php_generator.declareParam(_value);
      String _operator_plus = StringExtensions.operator_plus("", _declareParam);
      String s = _operator_plus;
      int i = 0;
      EList<NotPrimaryParam> _stms = elem.getStms();
      int _size = _stms.size();
      int size = _size;
      boolean _operator_lessEqualsThan = IntegerExtensions.operator_lessEqualsThan(i, size);
      boolean _while = _operator_lessEqualsThan;
      while (_while) {
        {
          String _operator_plus_1 = StringExtensions.operator_plus(s, "&");
          EList<NotPrimaryParam> _stms_1 = elem.getStms();
          NotPrimaryParam _get = _stms_1.get(i);
          Param _value_1 = _get.getValue();
          CharSequence _declareParam_1 = Tropo_php_generator.declareParam(_value_1);
          String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _declareParam_1);
          s = _operator_plus_2;
          int _operator_plus_3 = IntegerExtensions.operator_plus(i, 1);
          i = _operator_plus_3;
        }
        boolean _operator_lessEqualsThan_1 = IntegerExtensions.operator_lessEqualsThan(i, size);
        _while = _operator_lessEqualsThan_1;
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
    String _paramName = elem.getParamName();
    _builder.append(_paramName, "");
    _builder.append("\"=");
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
    _builder.append(", array(\"voice\"=>\"");
    _builder.append(Tropo_php_generator.voice, "");
    _builder.append("\", \"allowSignals\"=>array(\"timeExceeded\", \"attemptsLimit\")))");
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
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(Integer.valueOf(_time), null);
      if (_operator_notEquals) {
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
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("=$tropo->ask(");
    ConcatenationExpression _question = elem.getQuestion();
    CharSequence _declareConcatenation = Tropo_php_generator.declareConcatenation(_question);
    _builder.append(_declareConcatenation, "");
    _builder.append(",array(\"choices\"=>[");
    int _numDigits = elem.getNumDigits();
    _builder.append(_numDigits, "");
    _builder.append(" DIGITS]\", \"terminator\" => \"#\", \"name\"=>\"");
    String _name_1 = elem.getName();
    _builder.append(_name_1, "");
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
  
  protected static CharSequence _declareStatement(final Assigment elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareAssigment = Tropo_php_generator.declareAssigment(elem);
    _builder.append(_declareAssigment, "");
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
  
  protected static CharSequence _declareStatement(final VoiceTag elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVoiceTag = Tropo_php_generator.declareVoiceTag(elem);
    _builder.append(_declareVoiceTag, "");
    _builder.append(";");
    return _builder;
  }
  
  public static CharSequence declareTransition(final Transition elem) {
    CharSequence _xblockexpression = null;
    {
      String _event = elem.getEvent();
      boolean _equals = _event.equals("error");
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("$tropo->on(array(\"event\" => \"incomplete\", \"next\" =>\"");
        _builder.append(Tropo_php_generator.appName, "");
        _builder.append(".php?uri=");
        State _target = elem.getTarget();
        String _name = _target.getName();
        _builder.append(_name, "");
        _builder.append("\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("$tropo->on(array(\"event\" => \"error\", \"next\" =>\"");
        _builder.append(Tropo_php_generator.appName, "");
        _builder.append(".php?uri=");
        State _target_1 = elem.getTarget();
        String _name_1 = _target_1.getName();
        _builder.append(_name_1, "");
        _builder.append("\"));");
      } else {
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("$tropo->on(array(\"event\" => \"");
      String _event_1 = elem.getEvent();
      CharSequence _declareEvent = Tropo_php_generator.declareEvent(_event_1);
      _builder_1.append(_declareEvent, "");
      _builder_1.append("\", \"next\" =>\"");
      _builder_1.append(Tropo_php_generator.appName, "");
      _builder_1.append(".php?uri=");
      State _target_2 = elem.getTarget();
      String _name_2 = _target_2.getName();
      _builder_1.append(_name_2, "");
      _builder_1.append("\"));");
      _xblockexpression = (_builder_1);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareEvent(final String elem) {
    CharSequence _xifexpression = null;
    boolean _equals = elem.equals("completed");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("continue");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _equals_1 = elem.equals("times");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("attemptsLimit");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        boolean _equals_2 = elem.equals("timeout");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("timeExceeded");
          _xifexpression_2 = _builder_2;
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(elem, "");
          _builder_3.append(Tropo_php_generator.name, "");
          _xifexpression_2 = _builder_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence declareState(final State elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Tropo_php_generator.name = _name;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("dispatch_post(\'/");
      String _name_1 = elem.getName();
      _builder.append(_name_1, "");
      _builder.append("\', \'app_");
      String _name_2 = elem.getName();
      _builder.append(_name_2, "");
      _builder.append("\');");
      _builder.newLineIfNotEmpty();
      _builder.append("function app_");
      String _name_3 = elem.getName();
      _builder.append(_name_3, "");
      _builder.append("() {");
      _builder.newLineIfNotEmpty();
      {
        if (false) {
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
        }
      }
      {
        if (false) {
          _builder.append("\t");
          _builder.append("if(isset($_SESSION[\'times\']){");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("$attempts=$_SESSION[\'times\'];");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("if($attempts==");
          int _times = elem.getTimes();
          _builder.append(_times, "		");
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t\t");
          _builder.append("$urltimes = \"");
          _builder.append(Tropo_php_generator.url, "			");
          _builder.append("/res/signals.php?uri=times&sessionID=\".$sessionID.\"&state=");
          String _name_4 = elem.getName();
          _builder.append(_name_4, "			");
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
        int _timeout = elem.getTimeout();
        boolean _operator_notEquals = IntegerExtensions.operator_notEquals(_timeout, 0);
        if (_operator_notEquals) {
          _builder.append("\t");
          _builder.append("$url = \"");
          _builder.append(Tropo_php_generator.url, "	");
          _builder.append("/res/signals.php?uri=timeout&sessionID=\".$sessionID.\"&state=");
          String _name_5 = elem.getName();
          _builder.append(_name_5, "	");
          _builder.append("&timeout=");
          int _timeout_1 = elem.getTimeout();
          _builder.append(_timeout_1, "	");
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
      _builder.append("$tropo = new Tropo();");
      _builder.newLine();
      {
        for(final String d : Tropo_php_generator.variables) {
          _builder.append("\t");
          CharSequence _declareGlobalVariable = Tropo_php_generator.declareGlobalVariable(d);
          _builder.append(_declareGlobalVariable, "	");
          _builder.append(" ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("$caller=$_SESSION[\'caller\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$called=$_SESSION[\'called\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$sessionId=$_SESSION[\'sessionId\'];");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$lastState=$_SESSION[\'lastState\'];");
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
      _builder.append("$_SESSION[\'lastState\']=\'");
      String _name_6 = elem.getName();
      _builder.append(_name_6, "	");
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
  
  public static CharSequence declareGlobalVariable(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    _builder.append(elem, "");
    _builder.append("=$_SESSION[\'");
    _builder.append(elem, "");
    _builder.append("\'];");
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
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_blocks, null);
      if (_operator_notEquals) {
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
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_defaultBlock, null);
      if (_operator_notEquals_1) {
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
    {
      EList<AbstractElement> _sta = elem.getSta();
      for(final AbstractElement c : _sta) {
        CharSequence _declareAbstractElement = Tropo_php_generator.declareAbstractElement(c);
        _builder.append(_declareAbstractElement, "");
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
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_action, null);
      if (_operator_notEquals) {
        Block _action_1 = elem.getAction();
        CharSequence _declareBlock = Tropo_php_generator.declareBlock(_action_1);
        _builder.append(_declareBlock, "");
      }
    }
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
  
  public static CharSequence declareVars(final Vars elem) {
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
