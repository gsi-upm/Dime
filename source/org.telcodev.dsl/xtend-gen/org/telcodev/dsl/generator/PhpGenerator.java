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
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.telcodev.dsl.dime.AbstractElement;
import org.telcodev.dsl.dime.Ask;
import org.telcodev.dsl.dime.Assigment;
import org.telcodev.dsl.dime.Block;
import org.telcodev.dsl.dime.BlockState;
import org.telcodev.dsl.dime.BoolExpression;
import org.telcodev.dsl.dime.BoolLiteral;
import org.telcodev.dsl.dime.BoolVariable;
import org.telcodev.dsl.dime.Brackets;
import org.telcodev.dsl.dime.CompareExpression;
import org.telcodev.dsl.dime.Concatenation;
import org.telcodev.dsl.dime.ConcatenationBrackets;
import org.telcodev.dsl.dime.ConcatenationExpression;
import org.telcodev.dsl.dime.CondBlock;
import org.telcodev.dsl.dime.CondStateBlock;
import org.telcodev.dsl.dime.Dial;
import org.telcodev.dsl.dime.Document;
import org.telcodev.dsl.dime.GetDigits;
import org.telcodev.dsl.dime.Hangup;
import org.telcodev.dsl.dime.IfExp;
import org.telcodev.dsl.dime.IfStateExp;
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
import org.telcodev.dsl.dime.StateAbstractElement;
import org.telcodev.dsl.dime.Statement;
import org.telcodev.dsl.dime.StringLiteral;
import org.telcodev.dsl.dime.StringVariable;
import org.telcodev.dsl.dime.Transition;
import org.telcodev.dsl.dime.Vars;
import org.telcodev.dsl.dime.VoiceTag;
import org.telcodev.dsl.generator.Config;
import org.telcodev.dsl.generator.CopyFile;
import org.telcodev.dsl.generator.TellMeMyWorkingDirectory;

@SuppressWarnings("all")
public class PhpGenerator {
  private static String appName;
  
  private static Set<String> variables;
  
  private static String voice;
  
  public static void generateTropoPhp(final Resource resource, final IFileSystemAccess fsa, final Config config) {
      String _voice = config.getVoice();
      PhpGenerator.voice = _voice;
      String _where = TellMeMyWorkingDirectory.where();
      fsa.generateFile("res/dondeEstoy.php", _where);
      String _readFile = CopyFile.readFile("res/tropo/php/tropo.class.php");
      fsa.generateFile("res/tropo.class.php", _readFile);
      String _readFile_1 = CopyFile.readFile("res/tropo/php/compatibility.php");
      fsa.generateFile("res/compatibility.php", _readFile_1);
      String _readFile_2 = CopyFile.readFile("res/tropo/php/TropoClasses.php");
      fsa.generateFile("res/TropoClasses.php", _readFile_2);
      String _readFile_3 = CopyFile.readFile("res/tropo/php/compatibility.php");
      fsa.generateFile("res/compatibility.php", _readFile_3);
      String _className = PhpGenerator.className(resource);
      PhpGenerator.appName = _className;
      HashSet<String> _hashSet = new HashSet<String>();
      PhpGenerator.variables = _hashSet;
      String _operator_plus = StringExtensions.operator_plus(PhpGenerator.appName, ".php");
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      CharSequence _tropoPHP = PhpGenerator.toTropoPHP(((Document) _head), resource);
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
    CharSequence _xifexpression = null;
    boolean _isStates = sm.isStates();
    boolean _operator_not = BooleanExtensions.operator_not(_isStates);
    if (_operator_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?php");
      _builder.newLine();
      _builder.append("require \'res/tropo.class.php\';");
      _builder.newLine();
      _builder.append("$session = new Session();");
      _builder.newLine();
      _builder.append("$from = $session->getFrom();");
      _builder.newLine();
      _builder.append("$sessionId = $session->getId();");
      _builder.newLine();
      _builder.append("$caller = $from[\"id\"]; ");
      _builder.newLine();
      _builder.append("$to = $session->getTo();");
      _builder.newLine();
      _builder.append("$called = $to[\"id\"]; ");
      _builder.newLine();
      _builder.append("$tropo = new Tropo();");
      _builder.newLine();
      {
        EList<AbstractElement> _elements = sm.getElements();
        for(final AbstractElement c : _elements) {
          CharSequence _declareAbstractElement = PhpGenerator.declareAbstractElement(c);
          _builder.append(_declareAbstractElement, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("$tropo = new Tropo();");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("?>");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<?php");
      _builder_1.newLine();
      _builder_1.append("require \'res/tropo.class.php\';");
      _builder_1.newLine();
      _builder_1.append("require \'res/limonade/lib/limonade.php\';");
      _builder_1.newLine();
      {
        EList<AbstractElement> _elements_1 = sm.getElements();
        for(final AbstractElement c_1 : _elements_1) {
          CharSequence _declareGlobalVariable = PhpGenerator.declareGlobalVariable(c_1);
          _builder_1.append(_declareGlobalVariable, "");
          _builder_1.newLineIfNotEmpty();
        }
      }
      {
        EList<State> _sta = sm.getSta();
        for(final State c_2 : _sta) {
          CharSequence _declareState = PhpGenerator.declareState(c_2);
          _builder_1.append(_declareState, "");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _builder_1.append("run(); ");
      _builder_1.newLine();
      _builder_1.append("?>");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected static CharSequence _declareGlobalVariable(final Statement elem) {
    CharSequence _xblockexpression = null;
    {
      PhpGenerator.addGlobalVariable(elem);
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
    boolean _add = PhpGenerator.variables.add(_name);
    return _add;
  }
  
  protected static boolean _addGlobalVariable(final StringVariable elem) {
    String _name = elem.getName();
    boolean _add = PhpGenerator.variables.add(_name);
    return _add;
  }
  
  protected static boolean _addGlobalVariable(final NumVariable elem) {
    String _name = elem.getName();
    boolean _add = PhpGenerator.variables.add(_name);
    return _add;
  }
  
  protected static CharSequence _declareAbstractElement(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    CondBlock _block = elem.getBlock();
    CharSequence _declareCondBlock = PhpGenerator.declareCondBlock(_block);
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
            CharSequence _declareCondBlock_1 = PhpGenerator.declareCondBlock(e);
            _builder.append(_declareCondBlock_1, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Block _defaultBlock = elem.getDefaultBlock();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_defaultBlock, null);
      if (_operator_notEquals_1) {
        _builder.append(" else ");
        Block _defaultBlock_1 = elem.getDefaultBlock();
        CharSequence _declareBlock = PhpGenerator.declareBlock(_defaultBlock_1);
        _builder.append(_declareBlock, "");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Statement elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStatement = PhpGenerator.declareStatement(elem);
    _builder.append(_declareStatement, "");
    return _builder;
  }
  
  public static CharSequence declareBlock(final Block elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    {
      EList<AbstractElement> _stms = elem.getStms();
      boolean _isEmpty = _stms.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        {
          EList<AbstractElement> _stms_1 = elem.getStms();
          for(final AbstractElement c : _stms_1) {
            CharSequence _declareAbstractElement = PhpGenerator.declareAbstractElement(c);
            _builder.append(_declareAbstractElement, "");
            _builder.newLineIfNotEmpty();
          }
        }
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
    CharSequence _declareBoolExpression = PhpGenerator.declareBoolExpression(_cond);
    _builder.append(_declareBoolExpression, "");
    _builder.append(")");
    {
      Block _action = elem.getAction();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_action, null);
      if (_operator_notEquals) {
        Block _action_1 = elem.getAction();
        CharSequence _declareBlock = PhpGenerator.declareBlock(_action_1);
        _builder.append(_declareBlock, "");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final BoolLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = elem.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = PhpGenerator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final CompareExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    LiteralAbs _left = elem.getLeft();
    CharSequence _declareLiteralAbs = PhpGenerator.declareLiteralAbs(_left);
    _builder.append(_declareLiteralAbs, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    LiteralAbs _right = elem.getRight();
    CharSequence _declareLiteralAbs_1 = PhpGenerator.declareLiteralAbs(_right);
    _builder.append(_declareLiteralAbs_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final NegExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _op = elem.getOp();
    _builder.append(_op, "");
    BoolExpression _obj = elem.getObj();
    CharSequence _declareBoolExpression = PhpGenerator.declareBoolExpression(_obj);
    _builder.append(_declareBoolExpression, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final OperationBool elem) {
    StringConcatenation _builder = new StringConcatenation();
    BoolExpression _left = elem.getLeft();
    CharSequence _declareBoolExpression = PhpGenerator.declareBoolExpression(_left);
    _builder.append(_declareBoolExpression, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    BoolExpression _right = elem.getRight();
    CharSequence _declareBoolExpression_1 = PhpGenerator.declareBoolExpression(_right);
    _builder.append(_declareBoolExpression_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final Brackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    BoolExpression _obj = elem.getObj();
    CharSequence _declareBoolExpression = PhpGenerator.declareBoolExpression(_obj);
    _builder.append(_declareBoolExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Operation elem) {
    StringConcatenation _builder = new StringConcatenation();
    MathExpression _left = elem.getLeft();
    CharSequence _declareMathExpression = PhpGenerator.declareMathExpression(_left);
    _builder.append(_declareMathExpression, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    MathExpression _right = elem.getRight();
    CharSequence _declareMathExpression_1 = PhpGenerator.declareMathExpression(_right);
    _builder.append(_declareMathExpression_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = PhpGenerator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteralAbs = PhpGenerator.declareLiteralAbs(elem);
    _builder.append(_declareLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final MathBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    MathExpression _obj = elem.getObj();
    CharSequence _declareMathExpression = PhpGenerator.declareMathExpression(_obj);
    _builder.append(_declareMathExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final Concatenation elem) {
    StringConcatenation _builder = new StringConcatenation();
    ConcatenationExpression _left = elem.getLeft();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_left);
    _builder.append(_declareConcatenation, "");
    _builder.append(".");
    ConcatenationExpression _right = elem.getRight();
    CharSequence _declareConcatenation_1 = PhpGenerator.declareConcatenation(_right);
    _builder.append(_declareConcatenation_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final LiteralAbs elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteralAbs = PhpGenerator.declareLiteralAbs(elem);
    _builder.append(_declareLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final ConcatenationBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    ConcatenationExpression _obj = elem.getObj();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_obj);
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
    CharSequence _declareVars = PhpGenerator.declareVars(_va);
    String _string = _declareVars.toString();
    boolean _contains = PhpGenerator.variables.contains(_string);
    if (_contains) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$");
      Vars _va_1 = elem.getVa();
      CharSequence _declareVars_1 = PhpGenerator.declareVars(_va_1);
      _builder.append(_declareVars_1, "");
      _builder.append("=");
      MathExpression _right = elem.getRight();
      CharSequence _declareMathExpression = PhpGenerator.declareMathExpression(_right);
      _builder.append(_declareMathExpression, "");
      _builder.append("; ");
      _builder.newLineIfNotEmpty();
      _builder.append("$_SESSION[\'");
      Vars _va_2 = elem.getVa();
      CharSequence _declareVars_2 = PhpGenerator.declareVars(_va_2);
      _builder.append(_declareVars_2, "");
      _builder.append("\'] = ");
      Vars _va_3 = elem.getVa();
      CharSequence _declareVars_3 = PhpGenerator.declareVars(_va_3);
      _builder.append(_declareVars_3, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("$");
      Vars _va_4 = elem.getVa();
      CharSequence _declareVars_4 = PhpGenerator.declareVars(_va_4);
      _builder_1.append(_declareVars_4, "");
      _builder_1.append("=");
      MathExpression _right_1 = elem.getRight();
      CharSequence _declareMathExpression_1 = PhpGenerator.declareMathExpression(_right_1);
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
        CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_value_1);
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
        CharSequence _declareMathExpression = PhpGenerator.declareMathExpression(_value_1);
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
        CharSequence _declareBoolExpression = PhpGenerator.declareBoolExpression(_value_1);
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
    CharSequence _declareLiteral = PhpGenerator.declareLiteral(elem);
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
      CharSequence _declareVars = PhpGenerator.declareVars(_v_1);
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
        CharSequence _declareSession = PhpGenerator.declareSession(_ses);
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
          CharSequence _xifexpression_3 = null;
          boolean _operator_equals_3 = ObjectExtensions.operator_equals(elem, "sessionState");
          if (_operator_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append(" ");
            _builder_3.append("((@$result = new Result())->getState())");
            _xifexpression_3 = _builder_3;
          } else {
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("$");
            _builder_4.append(elem, "");
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
    _builder.append("$resultSend = post_request(");
    ConcatenationExpression _url = elem.getUrl();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_url);
    _builder.append(_declareConcatenation, "");
    {
      SendBlock _params = elem.getParams();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_params, null);
      if (_operator_notEquals) {
        SendBlock _params_1 = elem.getParams();
        CharSequence _declareSendBlock = PhpGenerator.declareSendBlock(_params_1);
        _builder.append(_declareSendBlock, "");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public static CharSequence declareSendBlock(final SendBlock elem) {
    CharSequence _xblockexpression = null;
    {
      Param _value = elem.getValue();
      CharSequence _declareParam = PhpGenerator.declareParam(_value);
      String _operator_plus = StringExtensions.operator_plus(", array(", _declareParam);
      String s = _operator_plus;
      int i = 0;
      EList<NotPrimaryParam> _stms = elem.getStms();
      int _size = _stms.size();
      int size = _size;
      boolean _operator_notEquals = IntegerExtensions.operator_notEquals(size, 0);
      if (_operator_notEquals) {
        boolean _operator_lessThan = IntegerExtensions.operator_lessThan(i, size);
        boolean _while = _operator_lessThan;
        while (_while) {
          {
            String _operator_plus_1 = StringExtensions.operator_plus(s, " , ");
            EList<NotPrimaryParam> _stms_1 = elem.getStms();
            NotPrimaryParam _get = _stms_1.get(i);
            Param _value_1 = _get.getValue();
            CharSequence _declareParam_1 = PhpGenerator.declareParam(_value_1);
            String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _declareParam_1);
            s = _operator_plus_2;
            int _operator_plus_3 = IntegerExtensions.operator_plus(i, 1);
            i = _operator_plus_3;
          }
          boolean _operator_lessThan_1 = IntegerExtensions.operator_lessThan(i, size);
          _while = _operator_lessThan_1;
        }
      }
      String _operator_plus_1 = StringExtensions.operator_plus(s, ")");
      s = _operator_plus_1;
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
    _builder.append("\"=>");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_value);
    _builder.append(_declareConcatenation, "");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Say elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->say(");
    ConcatenationExpression _that = elem.getThat();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_that);
    _builder.append(_declareConcatenation, "");
    _builder.append(", array(\"voice\"=>\"");
    _builder.append(PhpGenerator.voice, "");
    _builder.append("\"))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Ask elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("=$tropo->ask(");
    ConcatenationExpression _question = elem.getQuestion();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_question);
    _builder.append(_declareConcatenation, "");
    _builder.append(", array(\"choices\" => \"");
    String _choices = elem.getChoices();
    _builder.append(_choices, "");
    _builder.append("\",  \"voice\"=>\"");
    _builder.append(PhpGenerator.voice, "");
    _builder.append("\"))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Play elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->say(");
    ConcatenationExpression _file = elem.getFile();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_file);
    _builder.append(_declareConcatenation, "");
    _builder.append(", array(\"voice\"=>\"");
    _builder.append(PhpGenerator.voice, "");
    _builder.append("\"))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Record elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->record(array(\'url\' => ");
    ConcatenationExpression _action = elem.getAction();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_action);
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
    _builder.append(" )");
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
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_question);
    _builder.append(_declareConcatenation, "");
    _builder.append(",array(\"choices\"=>[");
    int _numDigits = elem.getNumDigits();
    _builder.append(_numDigits, "");
    _builder.append(" DIGITS]\", \"terminator\" => \"#\", \"name\"=>\"");
    String _name_1 = elem.getName();
    _builder.append(_name_1, "");
    _builder.append("\", \"voice\"=>\"");
    _builder.append(PhpGenerator.voice, "");
    _builder.append("\"))");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Dial elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->transfer(");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = PhpGenerator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = PhpGenerator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = PhpGenerator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final Assigment elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareAssigment = PhpGenerator.declareAssigment(elem);
    _builder.append(_declareAssigment, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVariable = PhpGenerator.declareVariable(elem);
    _builder.append(_declareVariable, "");
    _builder.append(";");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final VoiceTag elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVoiceTag = PhpGenerator.declareVoiceTag(elem);
    _builder.append(_declareVoiceTag, "");
    _builder.append(";");
    return _builder;
  }
  
  public static CharSequence declareTransition(final Transition elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$tropo->on(array(\"event\" => \"");
    String _event = elem.getEvent();
    _builder.append(_event, "");
    _builder.append("\", \"next\" =>\"");
    _builder.append(PhpGenerator.appName, "");
    _builder.append(".php?uri=");
    State _target = elem.getTarget();
    String _name = _target.getName();
    _builder.append(_name, "");
    _builder.append("\"));");
    return _builder;
  }
  
  public static CharSequence declareState(final State elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("dispatch_post(\'/");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("\', \'app_");
    String _name_1 = elem.getName();
    _builder.append(_name_1, "");
    _builder.append("\');");
    _builder.newLineIfNotEmpty();
    _builder.append("function app_");
    String _name_2 = elem.getName();
    _builder.append(_name_2, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    {
      String _name_3 = elem.getName();
      boolean _equals = _name_3.equals("start");
      if (_equals) {
        _builder.append("\t");
        _builder.append("$session = new Session();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("$from = $session->getFrom();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("$sessionId = $session->getId();");
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
        _builder.append("$_SESSION[\'sessionId\']=$sessionId;");
        _builder.newLine();
      }
    }
    {
      int _times = elem.getTimes();
      boolean _operator_equals = ObjectExtensions.operator_equals(Integer.valueOf(_times), null);
      if (_operator_equals) {
        _builder.append("\t");
        _builder.append("if(isset($_SESSION[\'times\']){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("$attempts=$_SESSION[\'times\'];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if($attempts==");
        int _times_1 = elem.getTimes();
        _builder.append(_times_1, "	");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("$resultSend = post_request(\'https://api.tropo.com/1.0/sessions/\'.$sessionId.\'/signals?action=signal&value=AttemptsLimit\', array(\"action\"=>\"signal\", \"value=AttemptsLimit\"));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
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
    _builder.append("\t");
    _builder.append("$tropo = new Tropo();");
    _builder.newLine();
    {
      for(final String d : PhpGenerator.variables) {
        _builder.append("\t");
        CharSequence _declareGlobalVariable = PhpGenerator.declareGlobalVariable(d);
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
      EList<StateAbstractElement> _stms = elem.getStms();
      for(final StateAbstractElement c : _stms) {
        _builder.append("\t");
        CharSequence _declareStateAbstractElement = PhpGenerator.declareStateAbstractElement(c);
        _builder.append(_declareStateAbstractElement, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("$_SESSION[\'lastState\']=\'");
    String _name_4 = elem.getName();
    _builder.append(_name_4, "	");
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return $tropo->RenderJson();");
    _builder.newLine();
    _builder.append("}");
    return _builder;
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
  
  protected static CharSequence _declareStateAbstractElement(final IfStateExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStateStructure = PhpGenerator.declareStateStructure(elem);
    _builder.append(_declareStateStructure, "");
    return _builder;
  }
  
  protected static CharSequence _declareStateAbstractElement(final Statement elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStatement = PhpGenerator.declareStatement(elem);
    _builder.append(_declareStatement, "");
    return _builder;
  }
  
  protected static CharSequence _declareStateAbstractElement(final Transition elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareTransition = PhpGenerator.declareTransition(elem);
    _builder.append(_declareTransition, "");
    return _builder;
  }
  
  public static CharSequence declareStateStructure(final IfStateExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    CondStateBlock _block = elem.getBlock();
    CharSequence _declareCondStateBlock = PhpGenerator.declareCondStateBlock(_block);
    _builder.append(_declareCondStateBlock, "");
    _builder.newLineIfNotEmpty();
    {
      EList<CondStateBlock> _blocks = elem.getBlocks();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_blocks, null);
      if (_operator_notEquals) {
        {
          EList<CondStateBlock> _blocks_1 = elem.getBlocks();
          for(final CondStateBlock e : _blocks_1) {
            _builder.append("else ");
            CharSequence _declareCondStateBlock_1 = PhpGenerator.declareCondStateBlock(e);
            _builder.append(_declareCondStateBlock_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      BlockState _defaultBlock = elem.getDefaultBlock();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_defaultBlock, null);
      if (_operator_notEquals_1) {
        _builder.append("else ");
        BlockState _defaultBlock_1 = elem.getDefaultBlock();
        CharSequence _declareStateBlock = PhpGenerator.declareStateBlock(_defaultBlock_1);
        _builder.append(_declareStateBlock, "");
      }
    }
    return _builder;
  }
  
  public static CharSequence declareStateBlock(final BlockState elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      EList<StateAbstractElement> _sta = elem.getSta();
      for(final StateAbstractElement c : _sta) {
        CharSequence _declareStateAbstractElement = PhpGenerator.declareStateAbstractElement(c);
        _builder.append(_declareStateAbstractElement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    return _builder;
  }
  
  public static CharSequence declareCondStateBlock(final CondStateBlock elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    BoolExpression _cond = elem.getCond();
    CharSequence _declareBoolExpression = PhpGenerator.declareBoolExpression(_cond);
    _builder.append(_declareBoolExpression, "");
    _builder.append(")");
    {
      BlockState _action = elem.getAction();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_action, null);
      if (_operator_notEquals) {
        BlockState _action_1 = elem.getAction();
        CharSequence _declareStateBlock = PhpGenerator.declareStateBlock(_action_1);
        _builder.append(_declareStateBlock, "");
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
  
  public static CharSequence declareAbstractElement(final AbstractElement elem) {
    if (elem instanceof IfExp) {
      return _declareAbstractElement((IfExp)elem);
    } else if (elem instanceof Statement) {
      return _declareAbstractElement((Statement)elem);
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
  
  public static CharSequence declareStateAbstractElement(final StateAbstractElement elem) {
    if (elem instanceof IfStateExp) {
      return _declareStateAbstractElement((IfStateExp)elem);
    } else if (elem instanceof Statement) {
      return _declareStateAbstractElement((Statement)elem);
    } else if (elem instanceof Transition) {
      return _declareStateAbstractElement((Transition)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
}
