package org.telcodev.dsl.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.apache.commons.lang.StringEscapeUtils;
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
import org.telcodev.dsl.generator.VoiceXML;

@SuppressWarnings("all")
public class VoiceXML_generator {
  private static String appName;
  
  private static String token;
  
  private static String languageVXML;
  
  private static String user;
  
  private static String password;
  
  private static String botkey;
  
  private static String number;
  
  private static String state;
  
  private static String cond;
  
  private static String condinitial;
  
  public static void generateVoiceXML(final Resource resource, final IFileSystemAccess fsa, final Config config) {
    System.out.println("");
    System.out.println("*****************************************************************************************");
    System.out.println("");
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    String _name = ((Document) _head).getName();
    String _plus = ("Creating VoiceXML " + _name);
    String _plus_1 = (_plus + " application.");
    System.out.println(_plus_1);
    VoiceXML _vxml = config.getVxml();
    String _language = _vxml.getLanguage();
    VoiceXML_generator.languageVXML = _language;
    VoiceXML _vxml_1 = config.getVxml();
    String _token = _vxml_1.getToken();
    VoiceXML_generator.token = _token;
    VoiceXML _vxml_2 = config.getVxml();
    String _user = _vxml_2.getUser();
    VoiceXML_generator.user = _user;
    VoiceXML _vxml_3 = config.getVxml();
    String _password = _vxml_3.getPassword();
    VoiceXML_generator.password = _password;
    VoiceXML _vxml_4 = config.getVxml();
    String _number = _vxml_4.getNumber();
    VoiceXML_generator.number = _number;
    VoiceXML _vxml_5 = config.getVxml();
    String _botkey = _vxml_5.getBotkey();
    VoiceXML_generator.botkey = _botkey;
    String _className = VoiceXML_generator.className(resource);
    VoiceXML_generator.appName = _className;
    VoiceXML_generator.cond = "";
    String _plus_2 = ("Creating " + "call_dime");
    String _plus_3 = (_plus_2 + ".php file");
    System.out.println(_plus_3);
    CharSequence _declareCall = VoiceXML_generator.declareCall();
    fsa.generateFile("call_dime.php", _declareCall);
    String _plus_4 = ("Creating " + "sms_dime");
    String _plus_5 = (_plus_4 + ".php file");
    System.out.println(_plus_5);
    CharSequence _declareSMS = VoiceXML_generator.declareSMS();
    fsa.generateFile("sms_dime.php", _declareSMS);
    String _plus_6 = ("Creating " + "email_dime");
    String _plus_7 = (_plus_6 + ".php file");
    System.out.println(_plus_7);
    CharSequence _emailPHP = VoiceXML_generator.emailPHP();
    fsa.generateFile("email_dime.php", _emailPHP);
    String _plus_8 = ("Creating " + "index.xml file");
    System.out.println(_plus_8);
    EList<EObject> _contents_1 = resource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    CharSequence _voiceXML = VoiceXML_generator.toVoiceXML(((Document) _head_1), resource);
    fsa.generateFile("index.xml", _voiceXML);
    System.out.println("Success.");
    System.out.println("");
  }
  
  public static String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public static CharSequence emailPHP() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(isset($_POST[\'to_email_dime\'])&&isset($_POST[\'title_email_dime\'])&&isset($_POST[\'value_email_dime\'])&&isset($_POST[\'from_email_dime\']){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("mail($_POST[\'to_email_dime\'], $_POST[\'title_email_dime\'],$_POST[\'value_email_dime\'], \"From: <\".$_POST[\'from_email_dime\'].\"> \\r\\n\"); ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("echo \"error\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("?>");
    return _builder;
  }
  
  public static CharSequence declareCall() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$token = \'");
    _builder.append(VoiceXML_generator.token, "	");
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if(isset($_GET[\'number_dime\']){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("$url=\"http://api.voxeo.net/SessionControl/VoiceXML.start?");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("numbertodial=\".$_GET[\'number_dime\'].\"&");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("tokenid=\".$token;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}else{\t$url=\"http://api.voxeo.net/SessionControl/VoiceXML.start?");
    _builder.newLine();
    _builder.append("   \t \t");
    _builder.append("tokenid=\".$token;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
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
    _builder.append("?>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence declareSMS() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php\t ");
    _builder.newLine();
    _builder.append(" \t \t");
    _builder.append("$url = \'http://api.messaging.staging.voxeo.net/1.0/messaging\';\t ");
    _builder.newLine();
    _builder.append(" \t \t");
    _builder.newLine();
    _builder.append(" \t \t");
    _builder.append("if(isset($_GET[\'message_dime\'])&&isset($_GET[\'to_dime\'])&&isset($_GET[\'from_dime\'])){");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("$data=\"botkey=");
    _builder.append(VoiceXML_generator.botkey, "	 	 	");
    _builder.append("&apimethod=send&msg=\".$_GET[\'message_dime\'].\"&user=\".$_GET[\'to_dime\'].\"&network=SMS&from=\".isset($_GET[\'from_dime\']);\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t \t \t");
    _builder.append("$ch = curl_init();\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("curl_setopt($ch, CURLOPT_URL, $url);\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("curl_setopt($ch, CURLOPT_HEADER, 0);\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("// ToDo: Replace the placeholders in brackets with your data.\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("curl_setopt($ch, CURLOPT_USERPWD, \'");
    _builder.append(VoiceXML_generator.user, "	 	 	");
    _builder.append(":");
    _builder.append(VoiceXML_generator.password, "	 	 	");
    _builder.append("\');\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t \t \t");
    _builder.append("curl_setopt($ch, CURLOPT_POST, 1);\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("curl_setopt($ch, CURLOPT_POSTFIELDS, $data);\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("curl_setopt($ch, CURLOPT_TIMEOUT, 100);\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("$xml = curl_exec($ch);\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("if (curl_error($ch)) {\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("print \"ERROR \". curl_error($ch) .\"\\n<br/>\";\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("}\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("curl_close($ch);\t ");
    _builder.newLine();
    _builder.append("\t \t \t");
    _builder.append("print_r($xml);\t ");
    _builder.newLine();
    _builder.append(" \t \t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("?>\t ");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence toVoiceXML(final Document sm, final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<vxml version=\"2.1\" xml:lang=\"");
    _builder.append(VoiceXML_generator.languageVXML, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<!-- Declaration of the global statements -->");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Statement> _elements = sm.getElements();
      for(final Statement elem : _elements) {
        CharSequence _declareStatement = VoiceXML_generator.declareStatement(elem);
        _builder.append(_declareStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<State> _sta = sm.getSta();
      for(final State elem_1 : _sta) {
        _builder.append("<var name=\"times_");
        String _name = elem_1.getName();
        _builder.append(_name, "");
        _builder.append("_dime\" expr=\"0\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("<var name=\"DIGITS\"/>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<var name=\"RECORD\"/>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<var name=\"LASTSTATE\" expr=\"&quot;start&quot;\"/>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Declaration of the states -->");
    _builder.newLine();
    _builder.newLine();
    {
      EList<State> _sta_1 = sm.getSta();
      for(final State elem_2 : _sta_1) {
        CharSequence _declareState = VoiceXML_generator.declareState(elem_2);
        _builder.append(_declareState, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("</vxml>");
    return _builder;
  }
  
  public static CharSequence declareState(final State elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      VoiceXML_generator.state = _name;
      VoiceXML_generator.cond = "";
      VoiceXML_generator.condinitial = "";
      String _name_1 = elem.getName();
      String _upperCase = _name_1.toUpperCase();
      String _plus = ("Generating " + _upperCase);
      String _plus_1 = (_plus + " state.");
      System.out.println(_plus_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!-- Declaration of the state ");
      String _name_2 = elem.getName();
      _builder.append(_name_2, "");
      _builder.append(" -->");
      _builder.newLineIfNotEmpty();
      _builder.append("<form id=\"");
      String _name_3 = elem.getName();
      _builder.append(_name_3, "");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("<block>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<assign name=\"LASTSTATE\" expr=\"&quot;");
      String _name_4 = elem.getName();
      _builder.append(_name_4, "		");
      _builder.append("&quot;\" />");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("</block>");
      _builder.newLine();
      {
        int _times = elem.getTimes();
        boolean _notEquals = (_times != 0);
        if (_notEquals) {
          _builder.append("\t");
          _builder.append("<if cond=\"times_");
          String _name_5 = elem.getName();
          _builder.append(_name_5, "	");
          _builder.append("_dime==");
          int _times_1 = elem.getTimes();
          _builder.append(_times_1, "	");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("<throw event=\"times_");
          String _name_6 = elem.getName();
          _builder.append(_name_6, "		");
          _builder.append("_event\"/> ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("</if>");
          _builder.newLine();
        }
      }
      {
        EList<AbstractElement> _stms = elem.getStms();
        for(final AbstractElement n : _stms) {
          _builder.append("\t");
          CharSequence _declareAbstractElement = VoiceXML_generator.declareAbstractElement(n);
          _builder.append(_declareAbstractElement, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("</form>");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("<!-- End of the state ");
      String _name_7 = elem.getName();
      _builder.append(_name_7, "");
      _builder.append(" -->");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareAbstractElement(final VoiceTag elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVoiceTag = VoiceXML_generator.declareVoiceTag(elem);
    _builder.append(_declareVoiceTag, "");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final IfExp elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStructure = VoiceXML_generator.declareStructure(elem);
    _builder.append(_declareStructure, "");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Statement elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareStatement = VoiceXML_generator.declareStatement(elem);
    _builder.append(_declareStatement, "");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final Transition elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareTransition = VoiceXML_generator.declareTransition(elem);
    _builder.append(_declareTransition, "");
    return _builder;
  }
  
  public static CharSequence declareStructure(final IfExp elem) {
    CharSequence _xblockexpression = null;
    {
      VoiceXML_generator.condinitial = VoiceXML_generator.cond;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!-- If structure declaration -->");
      _builder.newLine();
      _builder.newLine();
      _builder.append("<!-- ");
      CondBlock _block = elem.getBlock();
      CharSequence _declareCondBlock = VoiceXML_generator.declareCondBlock(_block);
      _builder.append(_declareCondBlock, "");
      {
        EList<CondBlock> _blocks = elem.getBlocks();
        boolean _notEquals = (!Objects.equal(_blocks, null));
        if (_notEquals) {
          {
            EList<CondBlock> _blocks_1 = elem.getBlocks();
            for(final CondBlock e : _blocks_1) {
              _builder.newLineIfNotEmpty();
              _builder.append("<!-- ELSE ");
              CharSequence _declareCondBlock_1 = VoiceXML_generator.declareCondBlock(e);
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
          _builder.append("<!--ELSE -->");
          _builder.newLineIfNotEmpty();
          Block _defaultBlock_1 = elem.getDefaultBlock();
          CharSequence _declareBlock = VoiceXML_generator.declareBlock(_defaultBlock_1);
          _builder.append(_declareBlock, "");
        }
      }
      {
        String _cond = VoiceXML_generator.cond = VoiceXML_generator.condinitial;
        boolean _notEquals_2 = (!Objects.equal(_cond, null));
        if (_notEquals_2) {
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("<!-- End of the if declaration -->");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence declareBlock(final Block elem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<AbstractElement> _sta = elem.getSta();
      for(final AbstractElement c : _sta) {
        CharSequence _declareAbstractElement = VoiceXML_generator.declareAbstractElement(c);
        _builder.append(_declareAbstractElement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence declareCondBlock(final CondBlock elem) {
    CharSequence _xblockexpression = null;
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      if (_equals) {
        BoolExpression _cond = elem.getCond();
        CharSequence _declareBoolExpression = VoiceXML_generator.declareBoolExpression(_cond);
        String _string = _declareBoolExpression.toString();
        VoiceXML_generator.cond = _string;
      } else {
        String _plus = ("(!(" + VoiceXML_generator.cond);
        String _plus_1 = (_plus + "))&amp;&amp;");
        BoolExpression _cond_1 = elem.getCond();
        CharSequence _declareBoolExpression_1 = VoiceXML_generator.declareBoolExpression(_cond_1);
        String _string_1 = _declareBoolExpression_1.toString();
        String _plus_2 = (_plus_1 + _string_1);
        VoiceXML_generator.cond = _plus_2;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("IF cond=");
      BoolExpression _cond_2 = elem.getCond();
      CharSequence _declareBoolExpression_2 = VoiceXML_generator.declareBoolExpression(_cond_2);
      _builder.append(_declareBoolExpression_2, " ");
      _builder.append(" -->");
      _builder.newLineIfNotEmpty();
      {
        Block _action = elem.getAction();
        boolean _notEquals = (!Objects.equal(_action, null));
        if (_notEquals) {
          Block _action_1 = elem.getAction();
          CharSequence _declareBlock = VoiceXML_generator.declareBlock(_action_1);
          _builder.append(_declareBlock, "");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("<!-- ENDIF -->");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareBoolExpression(final CALLSTATUS elem) {
    StringConcatenation _builder = new StringConcatenation();
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
    CharSequence _declareScriptLiteral = VoiceXML_generator.declareScriptLiteral(elem);
    _builder.append(_declareScriptLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final CompareExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    LiteralAbs _left = elem.getLeft();
    CharSequence _declareScriptLiteralAbs = VoiceXML_generator.declareScriptLiteralAbs(_left);
    _builder.append(_declareScriptLiteralAbs, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    LiteralAbs _right = elem.getRight();
    CharSequence _declareScriptLiteralAbs_1 = VoiceXML_generator.declareScriptLiteralAbs(_right);
    _builder.append(_declareScriptLiteralAbs_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final NegExpression elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _op = elem.getOp();
    _builder.append(_op, "");
    BoolExpression _obj = elem.getObj();
    CharSequence _declareBoolExpression = VoiceXML_generator.declareBoolExpression(_obj);
    _builder.append(_declareBoolExpression, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final OperationBool elem) {
    StringConcatenation _builder = new StringConcatenation();
    BoolExpression _left = elem.getLeft();
    CharSequence _declareBoolExpression = VoiceXML_generator.declareBoolExpression(_left);
    _builder.append(_declareBoolExpression, "");
    String _op = elem.getOp();
    String _string = _op.toString();
    String _escapeXml = StringEscapeUtils.escapeXml(_string);
    _builder.append(_escapeXml, "");
    BoolExpression _right = elem.getRight();
    CharSequence _declareBoolExpression_1 = VoiceXML_generator.declareBoolExpression(_right);
    _builder.append(_declareBoolExpression_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareBoolExpression(final Brackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    BoolExpression _obj = elem.getObj();
    CharSequence _declareBoolExpression = VoiceXML_generator.declareBoolExpression(_obj);
    _builder.append(_declareBoolExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Operation elem) {
    StringConcatenation _builder = new StringConcatenation();
    MathExpression _left = elem.getLeft();
    CharSequence _declareMathExpression = VoiceXML_generator.declareMathExpression(_left);
    _builder.append(_declareMathExpression, "");
    String _op = elem.getOp();
    _builder.append(_op, "");
    MathExpression _right = elem.getRight();
    CharSequence _declareMathExpression_1 = VoiceXML_generator.declareMathExpression(_right);
    _builder.append(_declareMathExpression_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = VoiceXML_generator.declareLiteral(elem);
    _builder.append(_declareLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteralAbs = VoiceXML_generator.declareLiteralAbs(elem);
    _builder.append(_declareLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareMathExpression(final MathBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    MathExpression _obj = elem.getObj();
    CharSequence _declareMathExpression = VoiceXML_generator.declareMathExpression(_obj);
    _builder.append(_declareMathExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final Concatenation elem) {
    StringConcatenation _builder = new StringConcatenation();
    ConcatenationExpression _left = elem.getLeft();
    CharSequence _declareConcatenation = VoiceXML_generator.declareConcatenation(_left);
    _builder.append(_declareConcatenation, "");
    ConcatenationExpression _right = elem.getRight();
    CharSequence _declareConcatenation_1 = VoiceXML_generator.declareConcatenation(_right);
    _builder.append(_declareConcatenation_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final LiteralAbs elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteralAbs = VoiceXML_generator.declareLiteralAbs(elem);
    _builder.append(_declareLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareConcatenation(final ConcatenationBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    ConcatenationExpression _obj = elem.getObj();
    CharSequence _declareConcatenation = VoiceXML_generator.declareConcatenation(_obj);
    _builder.append(_declareConcatenation, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareScriptConcatenation(final Concatenation elem) {
    StringConcatenation _builder = new StringConcatenation();
    ConcatenationExpression _left = elem.getLeft();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_left);
    _builder.append(_declareScriptConcatenation, "");
    _builder.append("+");
    ConcatenationExpression _right = elem.getRight();
    CharSequence _declareScriptConcatenation_1 = VoiceXML_generator.declareScriptConcatenation(_right);
    _builder.append(_declareScriptConcatenation_1, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptConcatenation(final LiteralAbs elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareScriptLiteralAbs = VoiceXML_generator.declareScriptLiteralAbs(elem);
    _builder.append(_declareScriptLiteralAbs, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptConcatenation(final ConcatenationBrackets elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    ConcatenationExpression _obj = elem.getObj();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_obj);
    _builder.append(_declareScriptConcatenation, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<value expr=\"");
    String _name = elem.getName();
    String _string = _name.toString();
    String _escapeXml = StringEscapeUtils.escapeXml(_string);
    _builder.append(_escapeXml, "");
    _builder.append("\"/>");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<value expr=\"");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("\"/>");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<value expr=\"");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("\"/>");
    return _builder;
  }
  
  protected static CharSequence _declareVars(final Constant elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<value expr=\"");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("\"/>");
    return _builder;
  }
  
  protected static CharSequence _declareScriptVars(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptVars(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptVars(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptVars(final Constant elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = elem.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final Primitive elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declarePrimitive = VoiceXML_generator.declarePrimitive(elem);
    _builder.append(_declarePrimitive, "");
    return _builder;
  }
  
  protected static CharSequence _declareLiteralAbs(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareLiteral = VoiceXML_generator.declareLiteral(elem);
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
    String _value = elem.getValue();
    _builder.append(_value, "");
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
      CharSequence _declareVars = VoiceXML_generator.declareVars(_v_1);
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
      _builder.append("<value expr=\"session.callerid\"/>");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _name_1 = elem.getName();
      boolean _equals_1 = _name_1.equals("CALLED");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<value expr=\"session.calledid\"/>");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        String _name_2 = elem.getName();
        boolean _equals_2 = _name_2.equals("LASTSTATE");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("<value expr=\"LASTSTATE\"/>");
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          String _name_3 = elem.getName();
          boolean _equals_3 = _name_3.equals("ANSWER");
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("<value expr=\"ANSWER\"/>");
            _xifexpression_3 = _builder_3;
          } else {
            CharSequence _xifexpression_4 = null;
            String _name_4 = elem.getName();
            boolean _equals_4 = _name_4.equals("RECORD");
            if (_equals_4) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("<value expr=\"RECORD\"/>");
              _xifexpression_4 = _builder_4;
            } else {
              CharSequence _xifexpression_5 = null;
              String _name_5 = elem.getName();
              boolean _equals_5 = _name_5.equals("DIGITS");
              if (_equals_5) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("<value expr=\"DIGITS\"/>");
                _xifexpression_5 = _builder_5;
              } else {
                CharSequence _xifexpression_6 = null;
                String _name_6 = elem.getName();
                boolean _equals_6 = _name_6.equals("TIMES");
                if (_equals_6) {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("<value expr=\"times_");
                  _builder_6.append(VoiceXML_generator.state, "");
                  _builder_6.append("_dime\"/>");
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
  
  protected static CharSequence _declareScriptLiteralAbs(final Primitive elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareScriptPrimitive = VoiceXML_generator.declareScriptPrimitive(elem);
    _builder.append(_declareScriptPrimitive, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptLiteralAbs(final Literal elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareScriptLiteral = VoiceXML_generator.declareScriptLiteral(elem);
    _builder.append(_declareScriptLiteral, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptPrimitive(final BoolLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = elem.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptPrimitive(final StringLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("&quot;");
    String _value = elem.getValue();
    _builder.append(_value, "");
    _builder.append("&quot;");
    return _builder;
  }
  
  protected static CharSequence _declareScriptPrimitive(final NumLiteral elem) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = elem.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected static CharSequence _declareScriptLiteral(final Literal elem) {
    CharSequence _xifexpression = null;
    Vars _v = elem.getV();
    boolean _notEquals = (!Objects.equal(_v, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      Vars _v_1 = elem.getV();
      CharSequence _declareScriptVars = VoiceXML_generator.declareScriptVars(_v_1);
      _builder.append(_declareScriptVars, "");
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
  
  protected static CharSequence _declareScriptLiteral(final SESSION elem) {
    CharSequence _xifexpression = null;
    String _name = elem.getName();
    boolean _equals = _name.equals("CALLER");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("session.callerid");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _name_1 = elem.getName();
      boolean _equals_1 = _name_1.equals("CALLED");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("session.calledid");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        String _name_2 = elem.getName();
        boolean _equals_2 = _name_2.equals("LASTSTATE");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("LASTSTATE");
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          String _name_3 = elem.getName();
          boolean _equals_3 = _name_3.equals("ANSWER");
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("ANSWER");
            _xifexpression_3 = _builder_3;
          } else {
            CharSequence _xifexpression_4 = null;
            String _name_4 = elem.getName();
            boolean _equals_4 = _name_4.equals("RECORD");
            if (_equals_4) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("RECORD");
              _xifexpression_4 = _builder_4;
            } else {
              CharSequence _xifexpression_5 = null;
              String _name_5 = elem.getName();
              boolean _equals_5 = _name_5.equals("DIGITS");
              if (_equals_5) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("DIGITS");
                _xifexpression_5 = _builder_5;
              } else {
                CharSequence _xifexpression_6 = null;
                String _name_6 = elem.getName();
                boolean _equals_6 = _name_6.equals("TIMES");
                if (_equals_6) {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("times_");
                  _builder_6.append(VoiceXML_generator.state, "");
                  _builder_6.append("_dime");
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
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<prompt> <break time=\"");
    int _seconds = elem.getSeconds();
    _builder.append(_seconds, "	");
    _builder.append("s\"/></prompt> ");
    _builder.newLineIfNotEmpty();
    _builder.append("</block>");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Data elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Send implementation for HTTP GET with cURL -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<var name=\"response_dime\" /> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<data name=\"response_dime\" method=\"get\" srcexpr=\"");
    ConcatenationExpression _url = elem.getUrl();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_url);
    _builder.append(_declareScriptConcatenation, "	");
    _builder.append("+&quot;?&quot;+");
    Param _value = elem.getValue();
    CharSequence _declareParam = VoiceXML_generator.declareParam(_value);
    _builder.append(_declareParam, "	");
    {
      EList<NotPrimaryParam> _stms = elem.getStms();
      for(final NotPrimaryParam n : _stms) {
        _builder.append("+&quot;&amp;&quot;+");
        Param _value_1 = n.getValue();
        CharSequence _declareParam_1 = VoiceXML_generator.declareParam(_value_1);
        _builder.append(_declareParam_1, "	");
        _builder.append(" ");
      }
    }
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<assign name=\"");
    Vars _vari = elem.getVari();
    CharSequence _declareScriptVars = VoiceXML_generator.declareScriptVars(_vari);
    _builder.append(_declareScriptVars, "    ");
    _builder.append("\" expr=\"response_dime\"/> ");
    _builder.newLineIfNotEmpty();
    _builder.append("</block>");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("<!-- End Send implementation--> ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Send elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Send implementation for HTTP GET with cURL -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<var name=\"response_dime\" /> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<data name=\"response_dime\" method=\"get\" srcexpr=\"");
    ConcatenationExpression _url = elem.getUrl();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_url);
    _builder.append(_declareScriptConcatenation, "	");
    {
      SendBlock _params = elem.getParams();
      boolean _notEquals = (!Objects.equal(_params, null));
      if (_notEquals) {
        _builder.append("+&quot;?&quot;+");
        SendBlock _params_1 = elem.getParams();
        CharSequence _declareSendBlock = VoiceXML_generator.declareSendBlock(_params_1);
        _builder.append(_declareSendBlock, "	");
      }
    }
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("</block>");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("<!-- End Send implementation--> ");
    return _builder;
  }
  
  public static CharSequence declareSendBlock(final SendBlock elem) {
    CharSequence _xblockexpression = null;
    {
      Param _value = elem.getValue();
      CharSequence s = VoiceXML_generator.declareParam(_value);
      int i = 0;
      EList<NotPrimaryParam> _stms = elem.getStms();
      int size = _stms.size();
      boolean _notEquals = (size != 0);
      if (_notEquals) {
        boolean _lessThan = (i < size);
        boolean _while = _lessThan;
        while (_while) {
          {
            String _plus = (s + "+&quot;&amp;&quot;+");
            EList<NotPrimaryParam> _stms_1 = elem.getStms();
            NotPrimaryParam _get = _stms_1.get(i);
            Param _value_1 = _get.getValue();
            CharSequence _declareParam = VoiceXML_generator.declareParam(_value_1);
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
    _builder.append("&quot;");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("=&quot;+escape(");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_value);
    _builder.append(_declareScriptConcatenation, "");
    _builder.append(")");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Say elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<prompt>");
    ConcatenationExpression _that = elem.getThat();
    CharSequence _declareConcatenation = VoiceXML_generator.declareConcatenation(_that);
    _builder.append(_declareConcatenation, "	");
    _builder.append("</prompt>");
    _builder.newLineIfNotEmpty();
    _builder.append("</block>");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Play elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<prompt> ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<audio expr=\"");
    ConcatenationExpression _file = elem.getFile();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_file);
    _builder.append(_declareScriptConcatenation, "		");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</prompt>");
    _builder.newLine();
    _builder.append("</block>");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Record elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<record ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(" name=\"RECORD\" beep=\"true\" maxtime=\"");
    int _time = elem.getTime();
    _builder.append(_time, "");
    _builder.append("\" />");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Reject elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<disconnect/>");
    _builder.newLine();
    _builder.append("</block>");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Hangup elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<disconnect/>");
    _builder.newLine();
    _builder.append("</block>");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final GetDigits elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<field ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(" name=\"field_dime\" type=\"digits?length=");
    int _numDigits = elem.getNumDigits();
    _builder.append(_numDigits, "");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("<block><assign name=\"DIGITS\" expr=\"field_dime\" /></block>");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Dial elem) {
    CharSequence _xblockexpression = null;
    {
      ConcatenationExpression _to = elem.getTo();
      CharSequence to = VoiceXML_generator.declareScriptConcatenation(_to);
      CharSequence _xifexpression = null;
      String _string = to.toString();
      boolean _contains = _string.contains("sip:");
      if (_contains) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<transfer  ");
        {
          boolean _equals = VoiceXML_generator.cond.equals("");
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("cond=\"");
            _builder.append(VoiceXML_generator.cond, "");
            _builder.append("\"");
          }
        }
        _builder.append(" bridge=\"true\" connecttimeout=\"300\" destexpr=\"");
        ConcatenationExpression _to_1 = elem.getTo();
        CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_to_1);
        _builder.append(_declareScriptConcatenation, "");
        _builder.append("\" />");
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<transfer ");
        {
          boolean _equals_1 = VoiceXML_generator.cond.equals("");
          boolean _not_1 = (!_equals_1);
          if (_not_1) {
            _builder_1.append("cond=\"");
            _builder_1.append(VoiceXML_generator.cond, "");
            _builder_1.append("\"");
          }
        }
        _builder_1.append(" bridge=\"true\" connecttimeout=\"300\" destexpr=\"&quot;tel:&quot;+");
        ConcatenationExpression _to_2 = elem.getTo();
        CharSequence _declareScriptConcatenation_1 = VoiceXML_generator.declareScriptConcatenation(_to_2);
        _builder_1.append(_declareScriptConcatenation_1, "");
        _builder_1.append("\" />");
        _xifexpression = _builder_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareVoiceTag(final Call elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(" >");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<data srcexpr=\"&quot;call_dime.php?number_dime=&quot;+");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_to);
    _builder.append(_declareScriptConcatenation, "	");
    _builder.append("\" method=\"get\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<disconnect/>");
    _builder.newLine();
    _builder.append("</block>");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Email elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Email implementation -->");
    _builder.newLine();
    _builder.append("<var name=\"title_email_dime\" exp=\"");
    ConcatenationExpression _title = elem.getTitle();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_title);
    _builder.append(_declareScriptConcatenation, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<var name=\"value_email_dime\" exp=\"");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareScriptConcatenation_1 = VoiceXML_generator.declareScriptConcatenation(_value);
    _builder.append(_declareScriptConcatenation_1, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<var name=\"from_email_dime\" exp=\"");
    ConcatenationExpression _from = elem.getFrom();
    CharSequence _declareScriptConcatenation_2 = VoiceXML_generator.declareScriptConcatenation(_from);
    _builder.append(_declareScriptConcatenation_2, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(" >");
    _builder.newLineIfNotEmpty();
    _builder.append("<data srcexpr=\"&quot;email_dime.php?title_email_dime=&quot;+escape(title_email_dime)+&amp;&quot;value_email=&quot;+escape(value_email_dime)+&amp;&quot;from_email_dime=&quot;+escape(from_email_dime)+&amp;&quot;to_email_dime=");
    ConcatenationExpression _to = elem.getTo();
    _builder.append(_to, "");
    _builder.append("&quot;\" method=\"get\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("</block>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- End Email implementation -->");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Sms elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<block ");
    {
      boolean _equals = VoiceXML_generator.cond.equals("");
      boolean _not = (!_equals);
      if (_not) {
        _builder.append("cond=\"");
        _builder.append(VoiceXML_generator.cond, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<data srcexpr=\"&quot;sms_dime.php?to_dime=&quot;+escape(");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_to);
    _builder.append(_declareScriptConcatenation, "	");
    _builder.append(")+&amp&quot;message_dime=&quot;+escape(");
    ConcatenationExpression _value = elem.getValue();
    _builder.append(_value, "	");
    _builder.append(")+&amp;&quot;from=");
    _builder.append(VoiceXML_generator.number, "	");
    _builder.append("&quot;\" method=\"get\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("</block>");
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final StringVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ConcatenationExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("<block ");
        {
          boolean _equals = VoiceXML_generator.cond.equals("");
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("cond=\"");
            _builder.append(VoiceXML_generator.cond, "");
            _builder.append("\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<assign name=\"");
        String _name = elem.getName();
        _builder.append(_name, "	");
        _builder.append("\" expr=\"");
        ConcatenationExpression _value_1 = elem.getValue();
        CharSequence _declareScriptConcatenation = VoiceXML_generator.declareScriptConcatenation(_value_1);
        _builder.append(_declareScriptConcatenation, "	");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("</block>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("<var name=\"");
    String _name_1 = elem.getName();
    _builder.append(_name_1, "");
    _builder.append("\" ");
    {
      ConcatenationExpression _value_2 = elem.getValue();
      boolean _notEquals_1 = (!Objects.equal(_value_2, null));
      if (_notEquals_1) {
        _builder.append("expr=\"");
        ConcatenationExpression _value_3 = elem.getValue();
        CharSequence _declareScriptConcatenation_1 = VoiceXML_generator.declareScriptConcatenation(_value_3);
        _builder.append(_declareScriptConcatenation_1, "");
        _builder.append("\" ");
      }
    }
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final NumVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      MathExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("<block ");
        {
          boolean _equals = VoiceXML_generator.cond.equals("");
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("cond=\"");
            _builder.append(VoiceXML_generator.cond, "");
            _builder.append("\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<assign name=\"");
        String _name = elem.getName();
        _builder.append(_name, "	");
        _builder.append("\" expr=\"");
        MathExpression _value_1 = elem.getValue();
        CharSequence _declareMathExpression = VoiceXML_generator.declareMathExpression(_value_1);
        _builder.append(_declareMathExpression, "	");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("</block>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("<var name=\"");
    String _name_1 = elem.getName();
    _builder.append(_name_1, "");
    _builder.append("\" ");
    {
      MathExpression _value_2 = elem.getValue();
      boolean _notEquals_1 = (!Objects.equal(_value_2, null));
      if (_notEquals_1) {
        _builder.append("expr=\"");
        MathExpression _value_3 = elem.getValue();
        CharSequence _declareMathExpression_1 = VoiceXML_generator.declareMathExpression(_value_3);
        _builder.append(_declareMathExpression_1, "");
        _builder.append("\"");
      }
    }
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final BoolVariable elem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BoolExpression _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("<block ");
        {
          boolean _equals = VoiceXML_generator.cond.equals("");
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("cond=\"");
            _builder.append(VoiceXML_generator.cond, "");
            _builder.append("\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<assign name=\"");
        String _name = elem.getName();
        _builder.append(_name, "	");
        _builder.append("\" expr=\"");
        BoolExpression _value_1 = elem.getValue();
        CharSequence _declareBoolExpression = VoiceXML_generator.declareBoolExpression(_value_1);
        _builder.append(_declareBoolExpression, "	");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("<block>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("<var name=\"");
    String _name_1 = elem.getName();
    _builder.append(_name_1, "");
    _builder.append("\" ");
    {
      BoolExpression _value_2 = elem.getValue();
      boolean _notEquals_1 = (!Objects.equal(_value_2, null));
      if (_notEquals_1) {
        _builder.append("expr=\"");
        BoolExpression _value_3 = elem.getValue();
        CharSequence _declareBoolExpression_1 = VoiceXML_generator.declareBoolExpression(_value_3);
        _builder.append(_declareBoolExpression_1, "");
        _builder.append("\" ");
      }
    }
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _declareStatement(final Constant elem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Primitive _value = elem.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("<block ");
        {
          boolean _equals = VoiceXML_generator.cond.equals("");
          boolean _not = (!_equals);
          if (_not) {
            _builder.append("cond=\"");
            _builder.append(VoiceXML_generator.cond, "");
            _builder.append("\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<assign name=\"");
        String _name = elem.getName();
        _builder.append(_name, "	");
        _builder.append("\" expr=\"");
        Primitive _value_1 = elem.getValue();
        CharSequence _declareScriptPrimitive = VoiceXML_generator.declareScriptPrimitive(_value_1);
        _builder.append(_declareScriptPrimitive, "	");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("</block>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("<var name=\"");
    String _name_1 = elem.getName();
    _builder.append(_name_1, "");
    _builder.append("\" ");
    {
      Primitive _value_2 = elem.getValue();
      boolean _notEquals_1 = (!Objects.equal(_value_2, null));
      if (_notEquals_1) {
        _builder.append("expr=\"");
        Primitive _value_3 = elem.getValue();
        CharSequence _declareScriptPrimitive_1 = VoiceXML_generator.declareScriptPrimitive(_value_3);
        _builder.append(_declareScriptPrimitive_1, "");
        _builder.append("\" ");
      }
    }
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence declareTransition(final Transition elem) {
    CharSequence _xifexpression = null;
    EVENT _event = elem.getEvent();
    String _name = _event.getName();
    boolean _equals = _name.equals("COMPLETED");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<block ");
      {
        boolean _equals_1 = VoiceXML_generator.cond.equals("");
        boolean _not = (!_equals_1);
        if (_not) {
          _builder.append("cond=\"");
          _builder.append(VoiceXML_generator.cond, "");
          _builder.append("\"");
        }
      }
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("<goto next=\"#");
      State _target = elem.getTarget();
      String _name_1 = _target.getName();
      _builder.append(_name_1, "	");
      _builder.append("\"/>");
      _builder.newLineIfNotEmpty();
      _builder.append("</block>");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      EVENT _event_1 = elem.getEvent();
      String _name_2 = _event_1.getName();
      boolean _equals_2 = _name_2.equals("ERROR");
      if (_equals_2) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<catch ");
        {
          boolean _equals_3 = VoiceXML_generator.cond.equals("");
          boolean _not_1 = (!_equals_3);
          if (_not_1) {
            _builder_1.append("cond=\"");
            _builder_1.append(VoiceXML_generator.cond, "");
            _builder_1.append("\"");
          }
        }
        _builder_1.append(" event=\"error\">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("<goto next=\"#");
        State _target_1 = elem.getTarget();
        String _name_3 = _target_1.getName();
        _builder_1.append(_name_3, "	");
        _builder_1.append("\"/> ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</catch>");
        _builder_1.newLine();
        _builder_1.append("<catch ");
        {
          boolean _equals_4 = VoiceXML_generator.cond.equals("");
          boolean _not_2 = (!_equals_4);
          if (_not_2) {
            _builder_1.append("cond=\"");
            _builder_1.append(VoiceXML_generator.cond, "");
            _builder_1.append("\"");
          }
        }
        _builder_1.append(" event=\"maxtime_disconnect\">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("<goto next=\"#");
        State _target_2 = elem.getTarget();
        String _name_4 = _target_2.getName();
        _builder_1.append(_name_4, "	");
        _builder_1.append("\"/> ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</catch>");
        _builder_1.newLine();
        _builder_1.append("<catch ");
        {
          boolean _equals_5 = VoiceXML_generator.cond.equals("");
          boolean _not_3 = (!_equals_5);
          if (_not_3) {
            _builder_1.append("cond=\"");
            _builder_1.append(VoiceXML_generator.cond, "");
            _builder_1.append("\"");
          }
        }
        _builder_1.append(" event=\"busy\">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("<goto next=\"#");
        State _target_3 = elem.getTarget();
        String _name_5 = _target_3.getName();
        _builder_1.append(_name_5, "	");
        _builder_1.append("\"/> ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</catch>");
        _builder_1.newLine();
        _builder_1.append("<catch ");
        {
          boolean _equals_6 = VoiceXML_generator.cond.equals("");
          boolean _not_4 = (!_equals_6);
          if (_not_4) {
            _builder_1.append("cond=\"");
            _builder_1.append(VoiceXML_generator.cond, "");
            _builder_1.append("\"");
          }
        }
        _builder_1.append(" event=\"noanswer\">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("<goto next=\"#");
        State _target_4 = elem.getTarget();
        String _name_6 = _target_4.getName();
        _builder_1.append(_name_6, "	");
        _builder_1.append("\"/> ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</catch>");
        _builder_1.newLine();
        _builder_1.append("<catch ");
        {
          boolean _equals_7 = VoiceXML_generator.cond.equals("");
          boolean _not_5 = (!_equals_7);
          if (_not_5) {
            _builder_1.append("cond=\"");
            _builder_1.append(VoiceXML_generator.cond, "");
            _builder_1.append("\"");
          }
        }
        _builder_1.append(" event=\"far_end_disconnect\">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("<goto next=\"#");
        State _target_5 = elem.getTarget();
        String _name_7 = _target_5.getName();
        _builder_1.append(_name_7, "	");
        _builder_1.append("\"/> ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</catch>");
        _builder_1.newLine();
        _builder_1.append("<catch ");
        {
          boolean _equals_8 = VoiceXML_generator.cond.equals("");
          boolean _not_6 = (!_equals_8);
          if (_not_6) {
            _builder_1.append("cond=\"");
            _builder_1.append(VoiceXML_generator.cond, "");
            _builder_1.append("\"");
          }
        }
        _builder_1.append(" event=\"near_end_disconnect\">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("<goto next=\"#");
        State _target_6 = elem.getTarget();
        String _name_8 = _target_6.getName();
        _builder_1.append(_name_8, "	");
        _builder_1.append("\"/> ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</catch>");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EVENT _event_2 = elem.getEvent();
        String _name_9 = _event_2.getName();
        boolean _equals_9 = _name_9.equals("HANGUP");
        if (_equals_9) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("<catch ");
          {
            boolean _equals_10 = VoiceXML_generator.cond.equals("");
            boolean _not_7 = (!_equals_10);
            if (_not_7) {
              _builder_2.append("cond=\"");
              _builder_2.append(VoiceXML_generator.cond, "");
              _builder_2.append("\"");
            }
          }
          _builder_2.append(" event=\"connection.disconnect\">");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("<goto next=\"#");
          State _target_7 = elem.getTarget();
          String _name_10 = _target_7.getName();
          _builder_2.append(_name_10, "	");
          _builder_2.append("\"/> ");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("</catch>");
          _xifexpression_2 = _builder_2;
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("<catch  ");
          {
            boolean _equals_11 = VoiceXML_generator.cond.equals("");
            boolean _not_8 = (!_equals_11);
            if (_not_8) {
              _builder_3.append("cond=\"");
              _builder_3.append(VoiceXML_generator.cond, "");
              _builder_3.append("\"");
            }
          }
          _builder_3.append(" event=\"times_");
          _builder_3.append(VoiceXML_generator.state, "");
          _builder_3.append("_event\">");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("\t");
          _builder_3.append("<goto next=\"#");
          State _target_8 = elem.getTarget();
          String _name_11 = _target_8.getName();
          _builder_3.append(_name_11, "	");
          _builder_3.append("\"/> ");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("</catch>");
          _xifexpression_2 = _builder_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence lessCond(final String or, final String st) {
    int _length = or.length();
    int _length_1 = st.length();
    int _minus = (_length - _length_1);
    return or.subSequence(3, _minus);
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
  
  public static CharSequence declareScriptConcatenation(final ConcatenationExpression elem) {
    if (elem instanceof Concatenation) {
      return _declareScriptConcatenation((Concatenation)elem);
    } else if (elem instanceof ConcatenationBrackets) {
      return _declareScriptConcatenation((ConcatenationBrackets)elem);
    } else if (elem instanceof LiteralAbs) {
      return _declareScriptConcatenation((LiteralAbs)elem);
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
  
  public static CharSequence declareScriptVars(final EObject elem) {
    if (elem instanceof BoolVariable) {
      return _declareScriptVars((BoolVariable)elem);
    } else if (elem instanceof Constant) {
      return _declareScriptVars((Constant)elem);
    } else if (elem instanceof NumVariable) {
      return _declareScriptVars((NumVariable)elem);
    } else if (elem instanceof StringVariable) {
      return _declareScriptVars((StringVariable)elem);
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
  
  public static CharSequence declareScriptLiteralAbs(final LiteralAbs elem) {
    if (elem instanceof Literal) {
      return _declareScriptLiteralAbs((Literal)elem);
    } else if (elem instanceof Primitive) {
      return _declareScriptLiteralAbs((Primitive)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareScriptPrimitive(final Primitive elem) {
    if (elem instanceof BoolLiteral) {
      return _declareScriptPrimitive((BoolLiteral)elem);
    } else if (elem instanceof NumLiteral) {
      return _declareScriptPrimitive((NumLiteral)elem);
    } else if (elem instanceof StringLiteral) {
      return _declareScriptPrimitive((StringLiteral)elem);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elem).toString());
    }
  }
  
  public static CharSequence declareScriptLiteral(final Literal elem) {
    if (elem instanceof SESSION) {
      return _declareScriptLiteral((SESSION)elem);
    } else if (elem != null) {
      return _declareScriptLiteral(elem);
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
