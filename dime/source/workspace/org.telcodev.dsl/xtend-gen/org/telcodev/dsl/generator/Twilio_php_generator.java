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
import org.telcodev.dsl.generator.Twilio;

@SuppressWarnings("all")
public class Twilio_php_generator {
  private static String appName;
  
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
  
  private static Set<String> variablesId;
  
  private static HashMap variables;
  
  private static HashMap constants;
  
  private static Set<String> constantsId;
  
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
    String _readFile = CopyFile.readFile("res/twilio_php/Slim/Environment.php");
    fsa.generateFile("res/Slim/Environment.php", _readFile);
    String _readFile_1 = CopyFile.readFile("res/twilio_php/Slim/Log.php");
    fsa.generateFile("res/Slim/Log.php", _readFile_1);
    String _readFile_2 = CopyFile.readFile("res/twilio_php/Slim/LogWriter.php");
    fsa.generateFile("res/Slim/LogWriter.php", _readFile_2);
    String _readFile_3 = CopyFile.readFile("res/twilio_php/Slim/Middleware.php");
    fsa.generateFile("res/Slim/Middleware.php", _readFile_3);
    String _readFile_4 = CopyFile.readFile("res/twilio_php/Slim/Route.php");
    fsa.generateFile("res/Slim/Route.php", _readFile_4);
    String _readFile_5 = CopyFile.readFile("res/twilio_php/Slim/Router.php");
    fsa.generateFile("res/Slim/Router.php", _readFile_5);
    String _readFile_6 = CopyFile.readFile("res/twilio_php/Slim/Slim.php");
    fsa.generateFile("res/Slim/Slim.php", _readFile_6);
    String _readFile_7 = CopyFile.readFile("res/twilio_php/Slim/View.php");
    fsa.generateFile("res/Slim/View.php", _readFile_7);
    String _readFile_8 = CopyFile.readFile("res/twilio_php/Slim/Exception/Pass.php");
    fsa.generateFile("res/Slim/Exception/Pass.php", _readFile_8);
    String _readFile_9 = CopyFile.readFile("res/twilio_php/Slim/Exception/RequestSlash.php");
    fsa.generateFile("res/Slim/Exception/RequestSlash.php", _readFile_9);
    String _readFile_10 = CopyFile.readFile("res/twilio_php/Slim/Exception/Stop.php");
    fsa.generateFile("res/Slim/Exception/Stop.php", _readFile_10);
    String _readFile_11 = CopyFile.readFile("res/twilio_php/Slim/Http/Headers.php");
    fsa.generateFile("res/Slim/Http/Headers.php", _readFile_11);
    String _readFile_12 = CopyFile.readFile("res/twilio_php/Slim/Http/Request.php");
    fsa.generateFile("res/Slim/Http/Request.php", _readFile_12);
    String _readFile_13 = CopyFile.readFile("res/twilio_php/Slim/Http/Response.php");
    fsa.generateFile("res/Slim/Http/Response.php", _readFile_13);
    String _readFile_14 = CopyFile.readFile("res/twilio_php/Slim/Http/Util.php");
    fsa.generateFile("res/Slim/Http/Util.php", _readFile_14);
    String _readFile_15 = CopyFile.readFile("res/twilio_php/Slim/Middleware/ContentTypes.php");
    fsa.generateFile("res/Slim/Middleware/ContentTypes.php", _readFile_15);
    String _readFile_16 = CopyFile.readFile("res/twilio_php/Slim/Middleware/Flash.php");
    fsa.generateFile("res/Slim/Middleware/Flash.php", _readFile_16);
    String _readFile_17 = CopyFile.readFile("res/twilio_php/Slim/Middleware/MethodOverride.php");
    fsa.generateFile("res/Slim/Middleware/MethodOverride.php", _readFile_17);
    String _readFile_18 = CopyFile.readFile("res/twilio_php/Slim/Middleware/PrettyExceptions.php");
    fsa.generateFile("res/Slim/Middleware/PrettyExceptions.php", _readFile_18);
    String _readFile_19 = CopyFile.readFile("res/twilio_php/Slim/Middleware/SessionCookie.php");
    fsa.generateFile("res/Slim/Middleware/SessionCookie.php", _readFile_19);
    String _readFile_20 = CopyFile.readFile("res/twilio_php/Services/Twilio.php");
    fsa.generateFile("res/Services/Twilio.php", _readFile_20);
    String _readFile_21 = CopyFile.readFile("res/twilio_php/Services/twilio_ssl_certificate.crt");
    fsa.generateFile("res/Services/twilio_ssl_certificate.crt", _readFile_21);
    String _readFile_22 = CopyFile.readFile("res/twilio_php/Services/Twilio/AutoPagingIterator.php");
    fsa.generateFile("res/Services/Twilio/AutoPagingIterator.php", _readFile_22);
    String _readFile_23 = CopyFile.readFile("res/twilio_php/Services/Twilio/Capability.php");
    fsa.generateFile("res/Services/Twilio/Capability.php", _readFile_23);
    String _readFile_24 = CopyFile.readFile("res/twilio_php/Services/Twilio/InstanceResource.php");
    fsa.generateFile("res/Services/Twilio/InstanceResource.php", _readFile_24);
    String _readFile_25 = CopyFile.readFile("res/twilio_php/Services/Twilio/ListResource.php");
    fsa.generateFile("res/Services/Twilio/ListResource.php", _readFile_25);
    String _readFile_26 = CopyFile.readFile("res/twilio_php/Services/Twilio/Page.php");
    fsa.generateFile("res/Services/Twilio/Page.php", _readFile_26);
    String _readFile_27 = CopyFile.readFile("res/twilio_php/Services/Twilio/PartialApplicationHelper.php");
    fsa.generateFile("res/Services/Twilio/PartialApplicationHelper.php", _readFile_27);
    String _readFile_28 = CopyFile.readFile("res/twilio_php/Services/Twilio/RequestValidator.php");
    fsa.generateFile("res/Services/Twilio/RequestValidator.php", _readFile_28);
    String _readFile_29 = CopyFile.readFile("res/twilio_php/Services/Twilio/Resource.php");
    fsa.generateFile("res/Services/Twilio/Resource.php", _readFile_29);
    String _readFile_30 = CopyFile.readFile("res/twilio_php/Services/Twilio/RestException.php");
    fsa.generateFile("res/Services/Twilio/RestException.php", _readFile_30);
    String _readFile_31 = CopyFile.readFile("res/twilio_php/Services/Twilio/TinyHttp.php");
    fsa.generateFile("res/Services/Twilio/TinyHttp.php", _readFile_31);
    String _readFile_32 = CopyFile.readFile("res/twilio_php/Services/Twilio/Twiml.php");
    fsa.generateFile("res/Services/Twilio/Twiml.php", _readFile_32);
    String _readFile_33 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Account.php");
    fsa.generateFile("res/Services/Twilio/Rest/Account.php", _readFile_33);
    String _readFile_34 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Accounts.php");
    fsa.generateFile("res/Services/Twilio/Rest/Accounts.php", _readFile_34);
    String _readFile_35 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Application.php");
    fsa.generateFile("res/Services/Twilio/Rest/Application.php", _readFile_35);
    String _readFile_36 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Applications.php");
    fsa.generateFile("res/Services/Twilio/Rest/Applications.php", _readFile_36);
    String _readFile_37 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/AuthorizedConnectApp.php");
    fsa.generateFile("res/Services/Twilio/Rest/AuthorizedConnectApp.php", _readFile_37);
    String _readFile_38 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/AuthorizedConnectApps.php");
    fsa.generateFile("res/Services/Twilio/Rest/AuthorizedConnectApps.php", _readFile_38);
    String _readFile_39 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/AvailablePhoneNumber.php");
    fsa.generateFile("res/Services/Twilio/Rest/AvailablePhoneNumber.php", _readFile_39);
    String _readFile_40 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/AvailablePhoneNumbers.php");
    fsa.generateFile("res/Services/Twilio/Rest/AvailablePhoneNumbers.php", _readFile_40);
    String _readFile_41 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Call.php");
    fsa.generateFile("res/Services/Twilio/Rest/Call.php", _readFile_41);
    String _readFile_42 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Calls.php");
    fsa.generateFile("res/Services/Twilio/Rest/Calls.php", _readFile_42);
    String _readFile_43 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Conference.php");
    fsa.generateFile("res/Services/Twilio/Rest/Conference.php", _readFile_43);
    String _readFile_44 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Conferences.php");
    fsa.generateFile("res/Services/Twilio/Rest/Conferences.php", _readFile_44);
    String _readFile_45 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/ConnectApp.php");
    fsa.generateFile("res/Services/Twilio/Rest/ConnectApp.php", _readFile_45);
    String _readFile_46 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/ConnectApps.php");
    fsa.generateFile("res/Services/Twilio/Rest/ConnectApps.php", _readFile_46);
    String _readFile_47 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/IncomingPhoneNumber.php");
    fsa.generateFile("res/Services/Twilio/Rest/IncomingPhoneNumber.php", _readFile_47);
    String _readFile_48 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/IncomingPhoneNumbers.php");
    fsa.generateFile("res/Services/Twilio/Rest/IncomingPhoneNumbers.php", _readFile_48);
    String _readFile_49 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Member.php");
    fsa.generateFile("res/Services/Twilio/Rest/Member.php", _readFile_49);
    String _readFile_50 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Members.php");
    fsa.generateFile("res/Services/Twilio/Rest/Members.php", _readFile_50);
    String _readFile_51 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Notification.php");
    fsa.generateFile("res/Services/Twilio/Rest/Notification.php", _readFile_51);
    String _readFile_52 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Notifications.php");
    fsa.generateFile("res/Services/Twilio/Rest/Notifications.php", _readFile_52);
    String _readFile_53 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/OutgoingCallerId.php");
    fsa.generateFile("res/Services/Twilio/Rest/OutgoingCallerId.php", _readFile_53);
    String _readFile_54 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/OutgoingCallerId.php");
    fsa.generateFile("res/Services/Twilio/Rest/OutgoingCallerIds.php", _readFile_54);
    String _readFile_55 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Participant.php");
    fsa.generateFile("res/Services/Twilio/Rest/Participant.php", _readFile_55);
    String _readFile_56 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Participants.php");
    fsa.generateFile("res/Services/Twilio/Rest/Participants.php", _readFile_56);
    String _readFile_57 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Queue.php");
    fsa.generateFile("res/Services/Twilio/Rest/Queue.php", _readFile_57);
    String _readFile_58 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Queues.php");
    fsa.generateFile("res/Services/Twilio/Rest/Queues.php", _readFile_58);
    String _readFile_59 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Recording.php");
    fsa.generateFile("res/Services/Twilio/Rest/Recording.php", _readFile_59);
    String _readFile_60 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Recordings.php");
    fsa.generateFile("res/Services/Twilio/Rest/Recordings.php", _readFile_60);
    String _readFile_61 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Sandbox.php");
    fsa.generateFile("res/Services/Twilio/Rest/Sandbox.php", _readFile_61);
    String _readFile_62 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/ShortCode.php");
    fsa.generateFile("res/Services/Twilio/Rest/ShortCode.php", _readFile_62);
    String _readFile_63 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/ShortCodes.php");
    fsa.generateFile("res/Services/Twilio/Rest/ShortCodes.php", _readFile_63);
    String _readFile_64 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/SmsMessage.php");
    fsa.generateFile("res/Services/Twilio/Rest/SmsMessage.php", _readFile_64);
    String _readFile_65 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/SmsMessages.php");
    fsa.generateFile("res/Services/Twilio/Rest/SmsMessages.php", _readFile_65);
    String _readFile_66 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Transcription.php");
    fsa.generateFile("res/Services/Twilio/Rest/Transcription.php", _readFile_66);
    String _readFile_67 = CopyFile.readFile("res/twilio_php/Services/Twilio/Rest/Transcriptions.php");
    fsa.generateFile("res/Services/Twilio/Rest/Transcriptions.php", _readFile_67);
    HashMap<?,?> _hashMap = new HashMap<Object,Object>();
    Twilio_php_generator.variables = _hashMap;
    HashMap<?,?> _hashMap_1 = new HashMap<Object,Object>();
    Twilio_php_generator.constants = _hashMap_1;
    String _className = Twilio_php_generator.className(resource);
    Twilio_php_generator.appName = _className;
    HashSet<String> _hashSet = new HashSet<String>();
    Twilio_php_generator.variablesId = _hashSet;
    HashSet<String> _hashSet_1 = new HashSet<String>();
    Twilio_php_generator.constantsId = _hashSet_1;
    String _plus_2 = ("Creating " + "index");
    String _plus_3 = (_plus_2 + ".php file");
    System.out.println(_plus_3);
    EList<EObject> _contents_1 = resource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    CharSequence _twilioPHP = Twilio_php_generator.toTwilioPHP(((Document) _head_1), resource);
    fsa.generateFile("index.php", _twilioPHP);
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
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("// Required Twilio files");
    _builder.newLine();
    _builder.newLine();
    _builder.append("require \"res/Slim/Slim.php\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Slim files for states simulation. More information in ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("require \"res/Service/Twilio.php\";");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("$app= new Slim();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// Defining constants");
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
    _builder.append("// Declaration of the states");
    _builder.newLine();
    _builder.newLine();
    {
      EList<State> _sta = sm.getSta();
      for(final State c_1 : _sta) {
        CharSequence _declareState = Twilio_php_generator.declareState(c_1);
        _builder.append(_declareState, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("$app->run();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("?>");
    return _builder;
  }
  
  protected static CharSequence _declareGlobalStatement(final Constant elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Twilio_php_generator.constantsId.add(_name);
      String _name_1 = elem.getName();
      Primitive _value = elem.getValue();
      CharSequence _declarePrimitive = Twilio_php_generator.declarePrimitive(_value);
      Twilio_php_generator.constants.put(_name_1, _declarePrimitive);
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
      String _name_1 = elem.getName();
      BoolExpression _value = elem.getValue();
      CharSequence _declareBoolExpression = Twilio_php_generator.declareBoolExpression(_value);
      Twilio_php_generator.variables.put(_name_1, _declareBoolExpression);
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalStatement(final StringVariable elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Twilio_php_generator.variablesId.add(_name);
      String _name_1 = elem.getName();
      ConcatenationExpression _value = elem.getValue();
      CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_value);
      Twilio_php_generator.variables.put(_name_1, _declareConcatenation);
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalStatement(final NumVariable elem) {
    CharSequence _xblockexpression = null;
    {
      String _name = elem.getName();
      Twilio_php_generator.variablesId.add(_name);
      String _name_1 = elem.getName();
      MathExpression _value = elem.getValue();
      CharSequence _declareMathExpression = Twilio_php_generator.declareMathExpression(_value);
      Twilio_php_generator.variables.put(_name_1, _declareMathExpression);
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
      String _plus = ("Generating " + Twilio_php_generator.name);
      String _plus_1 = (_plus + " state.");
      System.out.println(_plus_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// State ");
      String _name_1 = elem.getName();
      _builder.append(_name_1, "");
      _builder.append(" implementation");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("$app->post(\'/");
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
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("header(\"content-type: text/xml\");");
      _builder.newLine();
      {
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(Twilio_php_generator.hangupRedirect, null));
        if (!_notEquals) {
          _and = false;
        } else {
          _and = (_notEquals && false);
        }
        if (_and) {
          _builder.append("\t");
          _builder.append("if($status==\"hangup\"){");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("echo \"<Redirect>");
          _builder.append(Twilio_php_generator.hangupRedirect, "		");
          _builder.append("</Redirect>\";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      {
        boolean _and_1 = false;
        boolean _notEquals_1 = (!Objects.equal(Twilio_php_generator.errorRedirect, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          _and_1 = (_notEquals_1 && false);
        }
        if (_and_1) {
          _builder.append("\t");
          _builder.append("if($status==\"fail\"){");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("echo \"<Redirect>");
          _builder.append(Twilio_php_generator.errorRedirect, "		");
          _builder.append("</Redirect>\";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        boolean _and_2 = false;
        String _name_5 = elem.getName();
        boolean _equals = _name_5.equals("start");
        if (!_equals) {
          _and_2 = false;
        } else {
          _and_2 = (_equals && false);
        }
        if (_and_2) {
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
        }
      }
      {
        int _times = elem.getTimes();
        boolean _notEquals_2 = (_times != 0);
        if (_notEquals_2) {
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("// Times signal appears when the param reached the atribute times of the state");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      {
        int _timeout = elem.getTimeout();
        boolean _notEquals_3 = (_timeout != 0);
        if (_notEquals_3) {
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("// Timeout signal appears when the timeout atribute of the state is reached.");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// Update of the value of the global constants and variables, and the session params.");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// Declaration of the statements of the state.");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("echo \"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?> \";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("echo \"<Response>\";");
      _builder.newLine();
      {
        EList<AbstractElement> _stms = elem.getStms();
        for(final AbstractElement c : _stms) {
          _builder.append("\t");
          CharSequence _declareAbstractElement = Twilio_php_generator.declareAbstractElement(c);
          _builder.append(_declareAbstractElement, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// Update the global variables and the session params.");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      {
        boolean _and_3 = false;
        boolean _notEquals_4 = (!Objects.equal(Twilio_php_generator.completedRedirect, null));
        if (!_notEquals_4) {
          _and_3 = false;
        } else {
          _and_3 = (_notEquals_4 && result);
        }
        if (_and_3) {
          _builder.append("echo \"<Redirect>");
          _builder.append(Twilio_php_generator.completedRedirect, "	");
          _builder.append("</Redirect>\";");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      {
        boolean _notEquals_5 = (!Objects.equal(Twilio_php_generator.errorRedirect, null));
        if (_notEquals_5) {
          _builder.append("echo \"<Redirect>");
          _builder.append(Twilio_php_generator.hangupRedirect, "	");
          _builder.append("</Redirect>\";");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("echo \"</Response>\";");
      _builder.newLine();
      _builder.append("}");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _declareGlobalVariable(final String elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$");
    _builder.append(elem, "");
    _builder.append("=$_REQUEST[\'");
    _builder.append(elem, "");
    _builder.append("\'];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if($");
    _builder.append(elem, "		");
    _builder.append("==\"Digits\"){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("$");
    _builder.append(elem, "			");
    _builder.append("= $_REQUEST[\'Digits\'];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}else if($");
    _builder.append(elem, "		");
    _builder.append("==\"TranscriptionText\"){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("$");
    _builder.append(elem, "			");
    _builder.append("= $_REQUEST[\'TranscriptionText\'];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    return _builder;
  }
  
  protected static CharSequence _declareAbstractElement(final VoiceTag elem) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _declareVoiceTag = Twilio_php_generator.declareVoiceTag(elem);
    _builder.append(_declareVoiceTag, "");
    _builder.append(";");
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
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_url);
    _builder.append(_declareConcatenation, "			");
    {
      SendBlock _params = elem.getParams();
      boolean _notEquals = (!Objects.equal(_params, null));
      if (_notEquals) {
        _builder.append("+\"?\"+");
        SendBlock _params_1 = elem.getParams();
        CharSequence _declareSendBlock = Twilio_php_generator.declareSendBlock(_params_1);
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
            String _plus = (s + "+\"&\"+");
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
    _builder.append("=\"+");
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
    _builder.append(".\"</Say>\\n\" ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Ask elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$_REQUEST[\'");
    String _vari = elem.getVari();
    _builder.append(_vari, "");
    _builder.append("\']=\"TranscriptionText\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("echo \"<Record transcribe=\\\"true\\\" transcribeCallback=\\\"");
    _builder.append(Twilio_php_generator.completedRedirect, "		");
    _builder.append("\\\" /> \\n\"");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Play elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Play>\".");
    ConcatenationExpression _file = elem.getFile();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_file);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"</Play>\\n\" ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Record elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Record action=\\\"");
    _builder.append(Twilio_php_generator.completedRedirect, "");
    _builder.append("\\\" method=\\\"GET\\\" maxLength=\\\"");
    int _time = elem.getTime();
    _builder.append(_time, "");
    _builder.append("\\\" finishOnKey=\\\"*\\\" /> \\n\"");
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
    _builder.append("$_REQUEST[\'");
    String _name = elem.getName();
    _builder.append(_name, "");
    _builder.append("\']=\"Digits\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("echo \"<Gather action=\\\"");
    _builder.append(Twilio_php_generator.completedRedirect, "		");
    _builder.append("\\\" numDigits=\\\"");
    int _numDigits = elem.getNumDigits();
    _builder.append(_numDigits, "		");
    _builder.append("\\\" > <Say>\". ");
    ConcatenationExpression _question = elem.getQuestion();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_question);
    _builder.append(_declareConcatenation, "		");
    _builder.append(".\"</Say> </Gather>\"");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Dial elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Dial callerId=\\\"\".$caller.\"\\\">\\n <Number>\".");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"</Number> \\n </Dial> \\n\"");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Call elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Dial callerId=\\\"\".$caller.\"\\\">\\n <Number>\".");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"</Number> \\n </Dial> \\n\"");
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
    _builder.append(".\"> \\r\\n\") ");
    return _builder;
  }
  
  protected static CharSequence _declareVoiceTag(final Sms elem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("echo \"<Sms from=/\"\".$caller./\".\" to=/");
    ConcatenationExpression _to = elem.getTo();
    CharSequence _declareConcatenation = Twilio_php_generator.declareConcatenation(_to);
    _builder.append(_declareConcatenation, "");
    _builder.append(".\"/\">\".");
    ConcatenationExpression _value = elem.getValue();
    CharSequence _declareConcatenation_1 = Twilio_php_generator.declareConcatenation(_value);
    _builder.append(_declareConcatenation_1, "");
    _builder.append(".\"</Sms>\"");
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
    CharSequence _xblockexpression = null;
    {
      EVENT _event = elem.getEvent();
      boolean _equals = _event.equals("error");
      if (_equals) {
        String _plus = (Twilio_php_generator.appName + ".php?uri=");
        State _target = elem.getTarget();
        String _name = _target.getName();
        String _plus_1 = (_plus + _name);
        Twilio_php_generator.errorRedirect = _plus_1;
      } else {
        EVENT _event_1 = elem.getEvent();
        boolean _equals_1 = _event_1.equals("hangup");
        if (_equals_1) {
          String _plus_2 = (Twilio_php_generator.appName + ".php?uri=");
          State _target_1 = elem.getTarget();
          String _name_1 = _target_1.getName();
          String _plus_3 = (_plus_2 + _name_1);
          Twilio_php_generator.hangupRedirect = _plus_3;
        } else {
          EVENT _event_2 = elem.getEvent();
          boolean _equals_2 = _event_2.equals("completed");
          if (_equals_2) {
            String _plus_4 = (Twilio_php_generator.appName + ".php?uri=");
            State _target_2 = elem.getTarget();
            String _name_2 = _target_2.getName();
            String _plus_5 = (_plus_4 + _name_2);
            Twilio_php_generator.completedRedirect = _plus_5;
          } else {
            EVENT _event_3 = elem.getEvent();
            boolean _equals_3 = _event_3.equals("attemptsLimit");
            if (_equals_3) {
              String _plus_6 = (Twilio_php_generator.appName + ".php?uri=");
              State _target_3 = elem.getTarget();
              String _name_3 = _target_3.getName();
              String _plus_7 = (_plus_6 + _name_3);
              Twilio_php_generator.timesRedirect = _plus_7;
            } else {
              EVENT _event_4 = elem.getEvent();
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
  
  public static CharSequence declareGlobalVariable(final String elem) {
    {
      return _declareGlobalVariable(elem);
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
