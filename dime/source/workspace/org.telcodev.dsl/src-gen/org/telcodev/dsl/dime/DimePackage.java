/**
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.telcodev.dsl.dime.DimeFactory
 * @model kind="package"
 * @generated
 */
public interface DimePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dime";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.telcodev.org/dsl/Dime";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dime";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DimePackage eINSTANCE = org.telcodev.dsl.dime.impl.DimePackageImpl.init();

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.DocumentImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Sta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__STA = 2;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.AbstractElementImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.StatementImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Com</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__COM = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.StateImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getState()
   * @generated
   */
  int STATE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Times</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TIMES = 1;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TIMEOUT = 2;

  /**
   * The feature id for the '<em><b>Stms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STMS = 3;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.VoiceTagImpl <em>Voice Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.VoiceTagImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getVoiceTag()
   * @generated
   */
  int VOICE_TAG = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOICE_TAG__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Voice Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOICE_TAG_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.CallImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getCall()
   * @generated
   */
  int CALL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__TO = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.DialImpl <em>Dial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.DialImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getDial()
   * @generated
   */
  int DIAL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAL__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAL__TO = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAL_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.PlayImpl <em>Play</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.PlayImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getPlay()
   * @generated
   */
  int PLAY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAY__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAY__FILE = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Play</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAY_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.RecordImpl <em>Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.RecordImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getRecord()
   * @generated
   */
  int RECORD = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__TIME = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__ACTION = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vari</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__VARI = VOICE_TAG_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.RejectImpl <em>Reject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.RejectImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getReject()
   * @generated
   */
  int REJECT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REJECT__NAME = VOICE_TAG__NAME;

  /**
   * The number of structural features of the '<em>Reject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REJECT_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.HangupImpl <em>Hangup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.HangupImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getHangup()
   * @generated
   */
  int HANGUP = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANGUP__NAME = VOICE_TAG__NAME;

  /**
   * The number of structural features of the '<em>Hangup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANGUP_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.GetDigitsImpl <em>Get Digits</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.GetDigitsImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getGetDigits()
   * @generated
   */
  int GET_DIGITS = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DIGITS__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>Num Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DIGITS__NUM_DIGITS = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Question</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DIGITS__QUESTION = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vari</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DIGITS__VARI = VOICE_TAG_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Get Digits</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DIGITS_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.AskImpl <em>Ask</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.AskImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getAsk()
   * @generated
   */
  int ASK = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>Question</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK__QUESTION = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vari</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK__VARI = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ask</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.SendImpl <em>Send</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.SendImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSend()
   * @generated
   */
  int SEND = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND__PARAMS = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND__URL = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Send</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.SendBlockImpl <em>Send Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.SendBlockImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSendBlock()
   * @generated
   */
  int SEND_BLOCK = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_BLOCK__VALUE = 0;

  /**
   * The feature id for the '<em><b>Stms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_BLOCK__STMS = 1;

  /**
   * The number of structural features of the '<em>Send Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.NotPrimaryParamImpl <em>Not Primary Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.NotPrimaryParamImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getNotPrimaryParam()
   * @generated
   */
  int NOT_PRIMARY_PARAM = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_PRIMARY_PARAM__VALUE = 0;

  /**
   * The number of structural features of the '<em>Not Primary Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_PRIMARY_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.ParamImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getParam()
   * @generated
   */
  int PARAM = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.SayImpl <em>Say</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.SayImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSay()
   * @generated
   */
  int SAY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAY__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAY__THAT = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Say</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAY_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.SmsImpl <em>Sms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.SmsImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSms()
   * @generated
   */
  int SMS = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMS__NAME = VOICE_TAG__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMS__VALUE = VOICE_TAG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMS__TO = VOICE_TAG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMS_FEATURE_COUNT = VOICE_TAG_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.EmailImpl <em>Email</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.EmailImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getEmail()
   * @generated
   */
  int EMAIL = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__TITLE = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__FROM = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__VALUE = 3;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL__TO = 4;

  /**
   * The number of structural features of the '<em>Email</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMAIL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.TweetImpl <em>Tweet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.TweetImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getTweet()
   * @generated
   */
  int TWEET = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWEET__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWEET__VALUE = 1;

  /**
   * The number of structural features of the '<em>Tweet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TWEET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.TransitionImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.IfExpImpl <em>If Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.IfExpImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getIfExp()
   * @generated
   */
  int IF_EXP = 22;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXP__BLOCK = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXP__BLOCKS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXP__DEFAULT_BLOCK = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXP_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.CondBlockImpl <em>Cond Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.CondBlockImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getCondBlock()
   * @generated
   */
  int COND_BLOCK = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_BLOCK__COND = 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_BLOCK__ACTION = 2;

  /**
   * The number of structural features of the '<em>Cond Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_BLOCK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.BlockImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Sta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STA = 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.BoolExpressionImpl <em>Bool Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.BoolExpressionImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBoolExpression()
   * @generated
   */
  int BOOL_EXPRESSION = 25;

  /**
   * The number of structural features of the '<em>Bool Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.BracketsImpl <em>Brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.BracketsImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBrackets()
   * @generated
   */
  int BRACKETS = 26;

  /**
   * The feature id for the '<em><b>Open</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETS__OPEN = BOOL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETS__OBJ = BOOL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Close</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETS__CLOSE = BOOL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKETS_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.CompareExpressionImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getCompareExpression()
   * @generated
   */
  int COMPARE_EXPRESSION = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__LEFT = BOOL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__OP = BOOL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION__RIGHT = BOOL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Compare Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPRESSION_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.NegExpressionImpl <em>Neg Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.NegExpressionImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getNegExpression()
   * @generated
   */
  int NEG_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPRESSION__OP = BOOL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPRESSION__OBJ = BOOL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Neg Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPRESSION_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.MathExpressionImpl <em>Math Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.MathExpressionImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getMathExpression()
   * @generated
   */
  int MATH_EXPRESSION = 29;

  /**
   * The number of structural features of the '<em>Math Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.MathBracketsImpl <em>Math Brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.MathBracketsImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getMathBrackets()
   * @generated
   */
  int MATH_BRACKETS = 30;

  /**
   * The feature id for the '<em><b>Open</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_BRACKETS__OPEN = MATH_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_BRACKETS__OBJ = MATH_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Close</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_BRACKETS__CLOSE = MATH_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Math Brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_BRACKETS_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.ConcatenationExpressionImpl <em>Concatenation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.ConcatenationExpressionImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getConcatenationExpression()
   * @generated
   */
  int CONCATENATION_EXPRESSION = 31;

  /**
   * The number of structural features of the '<em>Concatenation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.ConcatenationBracketsImpl <em>Concatenation Brackets</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.ConcatenationBracketsImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getConcatenationBrackets()
   * @generated
   */
  int CONCATENATION_BRACKETS = 32;

  /**
   * The feature id for the '<em><b>Open</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION_BRACKETS__OPEN = CONCATENATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION_BRACKETS__OBJ = CONCATENATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Close</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION_BRACKETS__CLOSE = CONCATENATION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Concatenation Brackets</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION_BRACKETS_FEATURE_COUNT = CONCATENATION_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.StringVariableImpl <em>String Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.StringVariableImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getStringVariable()
   * @generated
   */
  int STRING_VARIABLE = 33;

  /**
   * The feature id for the '<em><b>Com</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VARIABLE__COM = STATEMENT__COM;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VARIABLE__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VARIABLE__VALUE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.NumVariableImpl <em>Num Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.NumVariableImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getNumVariable()
   * @generated
   */
  int NUM_VARIABLE = 34;

  /**
   * The feature id for the '<em><b>Com</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_VARIABLE__COM = STATEMENT__COM;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_VARIABLE__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_VARIABLE__VALUE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Num Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.BoolVariableImpl <em>Bool Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.BoolVariableImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBoolVariable()
   * @generated
   */
  int BOOL_VARIABLE = 35;

  /**
   * The feature id for the '<em><b>Com</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_VARIABLE__COM = STATEMENT__COM;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_VARIABLE__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_VARIABLE__VALUE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bool Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_VARIABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.ConstantImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 36;

  /**
   * The feature id for the '<em><b>Com</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__COM = STATEMENT__COM;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.LiteralAbsImpl <em>Literal Abs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.LiteralAbsImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getLiteralAbs()
   * @generated
   */
  int LITERAL_ABS = 39;

  /**
   * The number of structural features of the '<em>Literal Abs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_ABS_FEATURE_COUNT = CONCATENATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.PrimitiveImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__VALUE = LITERAL_ABS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_COUNT = LITERAL_ABS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.VarsImpl <em>Vars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.VarsImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getVars()
   * @generated
   */
  int VARS = 38;

  /**
   * The number of structural features of the '<em>Vars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.LiteralImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 40;

  /**
   * The feature id for the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__V = BOOL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__NUL = BOOL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.BoolLiteralImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBoolLiteral()
   * @generated
   */
  int BOOL_LITERAL = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL__VALUE = BOOL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.NumLiteralImpl <em>Num Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.NumLiteralImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getNumLiteral()
   * @generated
   */
  int NUM_LITERAL = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_LITERAL__VALUE = MATH_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Num Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_LITERAL_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.StringLiteralImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = PRIMITIVE__VALUE;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.EVENTImpl <em>EVENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.EVENTImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getEVENT()
   * @generated
   */
  int EVENT = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The number of structural features of the '<em>EVENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.SESSIONImpl <em>SESSION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.SESSIONImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSESSION()
   * @generated
   */
  int SESSION = 45;

  /**
   * The feature id for the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__V = LITERAL__V;

  /**
   * The feature id for the '<em><b>Nul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__NUL = LITERAL__NUL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__NAME = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SESSION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.CALLSTATUSImpl <em>CALLSTATUS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.CALLSTATUSImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getCALLSTATUS()
   * @generated
   */
  int CALLSTATUS = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLSTATUS__NAME = BOOL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CALLSTATUS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLSTATUS_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.OperationBoolImpl <em>Operation Bool</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.OperationBoolImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getOperationBool()
   * @generated
   */
  int OPERATION_BOOL = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_BOOL__LEFT = BOOL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_BOOL__OP = BOOL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_BOOL__RIGHT = BOOL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation Bool</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_BOOL_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.OperationImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = MATH_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = MATH_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = MATH_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = MATH_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.telcodev.dsl.dime.impl.ConcatenationImpl <em>Concatenation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.telcodev.dsl.dime.impl.ConcatenationImpl
   * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getConcatenation()
   * @generated
   */
  int CONCATENATION = 49;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__LEFT = CONCATENATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__OP = CONCATENATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION__RIGHT = CONCATENATION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Concatenation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCATENATION_FEATURE_COUNT = CONCATENATION_EXPRESSION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see org.telcodev.dsl.dime.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Document#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.Document#getName()
   * @see #getDocument()
   * @generated
   */
  EAttribute getDocument_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.telcodev.dsl.dime.Document#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.telcodev.dsl.dime.Document#getElements()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link org.telcodev.dsl.dime.Document#getSta <em>Sta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sta</em>'.
   * @see org.telcodev.dsl.dime.Document#getSta()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Sta();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.telcodev.dsl.dime.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Statement#getCom <em>Com</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Com</em>'.
   * @see org.telcodev.dsl.dime.Statement#getCom()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Com();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.telcodev.dsl.dime.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.telcodev.dsl.dime.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.State#getTimes <em>Times</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Times</em>'.
   * @see org.telcodev.dsl.dime.State#getTimes()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Times();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.State#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see org.telcodev.dsl.dime.State#getTimeout()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Timeout();

  /**
   * Returns the meta object for the containment reference list '{@link org.telcodev.dsl.dime.State#getStms <em>Stms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stms</em>'.
   * @see org.telcodev.dsl.dime.State#getStms()
   * @see #getState()
   * @generated
   */
  EReference getState_Stms();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.VoiceTag <em>Voice Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Voice Tag</em>'.
   * @see org.telcodev.dsl.dime.VoiceTag
   * @generated
   */
  EClass getVoiceTag();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.VoiceTag#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.VoiceTag#getName()
   * @see #getVoiceTag()
   * @generated
   */
  EAttribute getVoiceTag_Name();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.telcodev.dsl.dime.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Call#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.telcodev.dsl.dime.Call#getTo()
   * @see #getCall()
   * @generated
   */
  EReference getCall_To();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Dial <em>Dial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dial</em>'.
   * @see org.telcodev.dsl.dime.Dial
   * @generated
   */
  EClass getDial();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Dial#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.telcodev.dsl.dime.Dial#getTo()
   * @see #getDial()
   * @generated
   */
  EReference getDial_To();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Play <em>Play</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Play</em>'.
   * @see org.telcodev.dsl.dime.Play
   * @generated
   */
  EClass getPlay();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Play#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File</em>'.
   * @see org.telcodev.dsl.dime.Play#getFile()
   * @see #getPlay()
   * @generated
   */
  EReference getPlay_File();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Record <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record</em>'.
   * @see org.telcodev.dsl.dime.Record
   * @generated
   */
  EClass getRecord();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Record#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.telcodev.dsl.dime.Record#getTime()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_Time();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Record#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.telcodev.dsl.dime.Record#getAction()
   * @see #getRecord()
   * @generated
   */
  EReference getRecord_Action();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Record#getVari <em>Vari</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vari</em>'.
   * @see org.telcodev.dsl.dime.Record#getVari()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_Vari();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Reject <em>Reject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reject</em>'.
   * @see org.telcodev.dsl.dime.Reject
   * @generated
   */
  EClass getReject();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Hangup <em>Hangup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hangup</em>'.
   * @see org.telcodev.dsl.dime.Hangup
   * @generated
   */
  EClass getHangup();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.GetDigits <em>Get Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Digits</em>'.
   * @see org.telcodev.dsl.dime.GetDigits
   * @generated
   */
  EClass getGetDigits();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.GetDigits#getNumDigits <em>Num Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Digits</em>'.
   * @see org.telcodev.dsl.dime.GetDigits#getNumDigits()
   * @see #getGetDigits()
   * @generated
   */
  EAttribute getGetDigits_NumDigits();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.GetDigits#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Question</em>'.
   * @see org.telcodev.dsl.dime.GetDigits#getQuestion()
   * @see #getGetDigits()
   * @generated
   */
  EReference getGetDigits_Question();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.GetDigits#getVari <em>Vari</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vari</em>'.
   * @see org.telcodev.dsl.dime.GetDigits#getVari()
   * @see #getGetDigits()
   * @generated
   */
  EAttribute getGetDigits_Vari();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Ask <em>Ask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ask</em>'.
   * @see org.telcodev.dsl.dime.Ask
   * @generated
   */
  EClass getAsk();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Ask#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Question</em>'.
   * @see org.telcodev.dsl.dime.Ask#getQuestion()
   * @see #getAsk()
   * @generated
   */
  EReference getAsk_Question();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Ask#getVari <em>Vari</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vari</em>'.
   * @see org.telcodev.dsl.dime.Ask#getVari()
   * @see #getAsk()
   * @generated
   */
  EAttribute getAsk_Vari();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Send <em>Send</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Send</em>'.
   * @see org.telcodev.dsl.dime.Send
   * @generated
   */
  EClass getSend();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Send#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.telcodev.dsl.dime.Send#getParams()
   * @see #getSend()
   * @generated
   */
  EReference getSend_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Send#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.telcodev.dsl.dime.Send#getUrl()
   * @see #getSend()
   * @generated
   */
  EReference getSend_Url();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.SendBlock <em>Send Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Send Block</em>'.
   * @see org.telcodev.dsl.dime.SendBlock
   * @generated
   */
  EClass getSendBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.SendBlock#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.SendBlock#getValue()
   * @see #getSendBlock()
   * @generated
   */
  EReference getSendBlock_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.telcodev.dsl.dime.SendBlock#getStms <em>Stms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stms</em>'.
   * @see org.telcodev.dsl.dime.SendBlock#getStms()
   * @see #getSendBlock()
   * @generated
   */
  EReference getSendBlock_Stms();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.NotPrimaryParam <em>Not Primary Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Primary Param</em>'.
   * @see org.telcodev.dsl.dime.NotPrimaryParam
   * @generated
   */
  EClass getNotPrimaryParam();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.NotPrimaryParam#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.NotPrimaryParam#getValue()
   * @see #getNotPrimaryParam()
   * @generated
   */
  EReference getNotPrimaryParam_Value();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.telcodev.dsl.dime.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Param#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.Param#getValue()
   * @see #getParam()
   * @generated
   */
  EReference getParam_Value();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Say <em>Say</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Say</em>'.
   * @see org.telcodev.dsl.dime.Say
   * @generated
   */
  EClass getSay();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Say#getThat <em>That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>That</em>'.
   * @see org.telcodev.dsl.dime.Say#getThat()
   * @see #getSay()
   * @generated
   */
  EReference getSay_That();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Sms <em>Sms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sms</em>'.
   * @see org.telcodev.dsl.dime.Sms
   * @generated
   */
  EClass getSms();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Sms#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.Sms#getValue()
   * @see #getSms()
   * @generated
   */
  EReference getSms_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Sms#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.telcodev.dsl.dime.Sms#getTo()
   * @see #getSms()
   * @generated
   */
  EReference getSms_To();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Email</em>'.
   * @see org.telcodev.dsl.dime.Email
   * @generated
   */
  EClass getEmail();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Email#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.Email#getName()
   * @see #getEmail()
   * @generated
   */
  EAttribute getEmail_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Email#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.telcodev.dsl.dime.Email#getTitle()
   * @see #getEmail()
   * @generated
   */
  EReference getEmail_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Email#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.telcodev.dsl.dime.Email#getFrom()
   * @see #getEmail()
   * @generated
   */
  EReference getEmail_From();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Email#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.Email#getValue()
   * @see #getEmail()
   * @generated
   */
  EReference getEmail_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Email#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.telcodev.dsl.dime.Email#getTo()
   * @see #getEmail()
   * @generated
   */
  EReference getEmail_To();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Tweet <em>Tweet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tweet</em>'.
   * @see org.telcodev.dsl.dime.Tweet
   * @generated
   */
  EClass getTweet();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Tweet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.Tweet#getName()
   * @see #getTweet()
   * @generated
   */
  EAttribute getTweet_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Tweet#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.Tweet#getValue()
   * @see #getTweet()
   * @generated
   */
  EReference getTweet_Value();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.telcodev.dsl.dime.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Transition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.Transition#getName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Name();

  /**
   * Returns the meta object for the reference '{@link org.telcodev.dsl.dime.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.telcodev.dsl.dime.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.telcodev.dsl.dime.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.IfExp <em>If Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Exp</em>'.
   * @see org.telcodev.dsl.dime.IfExp
   * @generated
   */
  EClass getIfExp();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.IfExp#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.telcodev.dsl.dime.IfExp#getBlock()
   * @see #getIfExp()
   * @generated
   */
  EReference getIfExp_Block();

  /**
   * Returns the meta object for the containment reference list '{@link org.telcodev.dsl.dime.IfExp#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.telcodev.dsl.dime.IfExp#getBlocks()
   * @see #getIfExp()
   * @generated
   */
  EReference getIfExp_Blocks();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.IfExp#getDefaultBlock <em>Default Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Block</em>'.
   * @see org.telcodev.dsl.dime.IfExp#getDefaultBlock()
   * @see #getIfExp()
   * @generated
   */
  EReference getIfExp_DefaultBlock();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.CondBlock <em>Cond Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cond Block</em>'.
   * @see org.telcodev.dsl.dime.CondBlock
   * @generated
   */
  EClass getCondBlock();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.CondBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.CondBlock#getName()
   * @see #getCondBlock()
   * @generated
   */
  EAttribute getCondBlock_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.CondBlock#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.telcodev.dsl.dime.CondBlock#getCond()
   * @see #getCondBlock()
   * @generated
   */
  EReference getCondBlock_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.CondBlock#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.telcodev.dsl.dime.CondBlock#getAction()
   * @see #getCondBlock()
   * @generated
   */
  EReference getCondBlock_Action();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.telcodev.dsl.dime.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Block#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.Block#getName()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.telcodev.dsl.dime.Block#getSta <em>Sta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sta</em>'.
   * @see org.telcodev.dsl.dime.Block#getSta()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Sta();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.BoolExpression <em>Bool Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Expression</em>'.
   * @see org.telcodev.dsl.dime.BoolExpression
   * @generated
   */
  EClass getBoolExpression();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Brackets <em>Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Brackets</em>'.
   * @see org.telcodev.dsl.dime.Brackets
   * @generated
   */
  EClass getBrackets();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Brackets#getOpen <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Open</em>'.
   * @see org.telcodev.dsl.dime.Brackets#getOpen()
   * @see #getBrackets()
   * @generated
   */
  EAttribute getBrackets_Open();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Brackets#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj</em>'.
   * @see org.telcodev.dsl.dime.Brackets#getObj()
   * @see #getBrackets()
   * @generated
   */
  EReference getBrackets_Obj();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Brackets#getClose <em>Close</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Close</em>'.
   * @see org.telcodev.dsl.dime.Brackets#getClose()
   * @see #getBrackets()
   * @generated
   */
  EAttribute getBrackets_Close();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.CompareExpression <em>Compare Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Expression</em>'.
   * @see org.telcodev.dsl.dime.CompareExpression
   * @generated
   */
  EClass getCompareExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.CompareExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.telcodev.dsl.dime.CompareExpression#getLeft()
   * @see #getCompareExpression()
   * @generated
   */
  EReference getCompareExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.CompareExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.telcodev.dsl.dime.CompareExpression#getOp()
   * @see #getCompareExpression()
   * @generated
   */
  EAttribute getCompareExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.CompareExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.telcodev.dsl.dime.CompareExpression#getRight()
   * @see #getCompareExpression()
   * @generated
   */
  EReference getCompareExpression_Right();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.NegExpression <em>Neg Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neg Expression</em>'.
   * @see org.telcodev.dsl.dime.NegExpression
   * @generated
   */
  EClass getNegExpression();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.NegExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.telcodev.dsl.dime.NegExpression#getOp()
   * @see #getNegExpression()
   * @generated
   */
  EAttribute getNegExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.NegExpression#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj</em>'.
   * @see org.telcodev.dsl.dime.NegExpression#getObj()
   * @see #getNegExpression()
   * @generated
   */
  EReference getNegExpression_Obj();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.MathExpression <em>Math Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Expression</em>'.
   * @see org.telcodev.dsl.dime.MathExpression
   * @generated
   */
  EClass getMathExpression();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.MathBrackets <em>Math Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Brackets</em>'.
   * @see org.telcodev.dsl.dime.MathBrackets
   * @generated
   */
  EClass getMathBrackets();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.MathBrackets#getOpen <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Open</em>'.
   * @see org.telcodev.dsl.dime.MathBrackets#getOpen()
   * @see #getMathBrackets()
   * @generated
   */
  EAttribute getMathBrackets_Open();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.MathBrackets#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj</em>'.
   * @see org.telcodev.dsl.dime.MathBrackets#getObj()
   * @see #getMathBrackets()
   * @generated
   */
  EReference getMathBrackets_Obj();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.MathBrackets#getClose <em>Close</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Close</em>'.
   * @see org.telcodev.dsl.dime.MathBrackets#getClose()
   * @see #getMathBrackets()
   * @generated
   */
  EAttribute getMathBrackets_Close();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.ConcatenationExpression <em>Concatenation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concatenation Expression</em>'.
   * @see org.telcodev.dsl.dime.ConcatenationExpression
   * @generated
   */
  EClass getConcatenationExpression();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.ConcatenationBrackets <em>Concatenation Brackets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concatenation Brackets</em>'.
   * @see org.telcodev.dsl.dime.ConcatenationBrackets
   * @generated
   */
  EClass getConcatenationBrackets();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.ConcatenationBrackets#getOpen <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Open</em>'.
   * @see org.telcodev.dsl.dime.ConcatenationBrackets#getOpen()
   * @see #getConcatenationBrackets()
   * @generated
   */
  EAttribute getConcatenationBrackets_Open();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.ConcatenationBrackets#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj</em>'.
   * @see org.telcodev.dsl.dime.ConcatenationBrackets#getObj()
   * @see #getConcatenationBrackets()
   * @generated
   */
  EReference getConcatenationBrackets_Obj();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.ConcatenationBrackets#getClose <em>Close</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Close</em>'.
   * @see org.telcodev.dsl.dime.ConcatenationBrackets#getClose()
   * @see #getConcatenationBrackets()
   * @generated
   */
  EAttribute getConcatenationBrackets_Close();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.StringVariable <em>String Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Variable</em>'.
   * @see org.telcodev.dsl.dime.StringVariable
   * @generated
   */
  EClass getStringVariable();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.StringVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.StringVariable#getName()
   * @see #getStringVariable()
   * @generated
   */
  EAttribute getStringVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.StringVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.StringVariable#getValue()
   * @see #getStringVariable()
   * @generated
   */
  EReference getStringVariable_Value();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.NumVariable <em>Num Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Variable</em>'.
   * @see org.telcodev.dsl.dime.NumVariable
   * @generated
   */
  EClass getNumVariable();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.NumVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.NumVariable#getName()
   * @see #getNumVariable()
   * @generated
   */
  EAttribute getNumVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.NumVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.NumVariable#getValue()
   * @see #getNumVariable()
   * @generated
   */
  EReference getNumVariable_Value();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.BoolVariable <em>Bool Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Variable</em>'.
   * @see org.telcodev.dsl.dime.BoolVariable
   * @generated
   */
  EClass getBoolVariable();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.BoolVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.BoolVariable#getName()
   * @see #getBoolVariable()
   * @generated
   */
  EAttribute getBoolVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.BoolVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.BoolVariable#getValue()
   * @see #getBoolVariable()
   * @generated
   */
  EReference getBoolVariable_Value();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see org.telcodev.dsl.dime.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.Constant#getName()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Value();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see org.telcodev.dsl.dime.Primitive
   * @generated
   */
  EClass getPrimitive();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Primitive#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.telcodev.dsl.dime.Primitive#getValue()
   * @see #getPrimitive()
   * @generated
   */
  EAttribute getPrimitive_Value();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Vars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vars</em>'.
   * @see org.telcodev.dsl.dime.Vars
   * @generated
   */
  EClass getVars();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.LiteralAbs <em>Literal Abs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Abs</em>'.
   * @see org.telcodev.dsl.dime.LiteralAbs
   * @generated
   */
  EClass getLiteralAbs();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.telcodev.dsl.dime.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the reference '{@link org.telcodev.dsl.dime.Literal#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V</em>'.
   * @see org.telcodev.dsl.dime.Literal#getV()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_V();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Literal#getNul <em>Nul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nul</em>'.
   * @see org.telcodev.dsl.dime.Literal#getNul()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Nul();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.BoolLiteral <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Literal</em>'.
   * @see org.telcodev.dsl.dime.BoolLiteral
   * @generated
   */
  EClass getBoolLiteral();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.NumLiteral <em>Num Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Literal</em>'.
   * @see org.telcodev.dsl.dime.NumLiteral
   * @generated
   */
  EClass getNumLiteral();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.telcodev.dsl.dime.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.EVENT <em>EVENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EVENT</em>'.
   * @see org.telcodev.dsl.dime.EVENT
   * @generated
   */
  EClass getEVENT();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.EVENT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.EVENT#getName()
   * @see #getEVENT()
   * @generated
   */
  EAttribute getEVENT_Name();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.SESSION <em>SESSION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SESSION</em>'.
   * @see org.telcodev.dsl.dime.SESSION
   * @generated
   */
  EClass getSESSION();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.SESSION#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.SESSION#getName()
   * @see #getSESSION()
   * @generated
   */
  EAttribute getSESSION_Name();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.CALLSTATUS <em>CALLSTATUS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CALLSTATUS</em>'.
   * @see org.telcodev.dsl.dime.CALLSTATUS
   * @generated
   */
  EClass getCALLSTATUS();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.CALLSTATUS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.telcodev.dsl.dime.CALLSTATUS#getName()
   * @see #getCALLSTATUS()
   * @generated
   */
  EAttribute getCALLSTATUS_Name();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.OperationBool <em>Operation Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Bool</em>'.
   * @see org.telcodev.dsl.dime.OperationBool
   * @generated
   */
  EClass getOperationBool();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.OperationBool#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.telcodev.dsl.dime.OperationBool#getLeft()
   * @see #getOperationBool()
   * @generated
   */
  EReference getOperationBool_Left();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.OperationBool#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.telcodev.dsl.dime.OperationBool#getOp()
   * @see #getOperationBool()
   * @generated
   */
  EAttribute getOperationBool_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.OperationBool#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.telcodev.dsl.dime.OperationBool#getRight()
   * @see #getOperationBool()
   * @generated
   */
  EReference getOperationBool_Right();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.telcodev.dsl.dime.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.telcodev.dsl.dime.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Operation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.telcodev.dsl.dime.Operation#getOp()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.telcodev.dsl.dime.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the meta object for class '{@link org.telcodev.dsl.dime.Concatenation <em>Concatenation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concatenation</em>'.
   * @see org.telcodev.dsl.dime.Concatenation
   * @generated
   */
  EClass getConcatenation();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Concatenation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.telcodev.dsl.dime.Concatenation#getLeft()
   * @see #getConcatenation()
   * @generated
   */
  EReference getConcatenation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.telcodev.dsl.dime.Concatenation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.telcodev.dsl.dime.Concatenation#getOp()
   * @see #getConcatenation()
   * @generated
   */
  EAttribute getConcatenation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.telcodev.dsl.dime.Concatenation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.telcodev.dsl.dime.Concatenation#getRight()
   * @see #getConcatenation()
   * @generated
   */
  EReference getConcatenation_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DimeFactory getDimeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.DocumentImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__ELEMENTS = eINSTANCE.getDocument_Elements();

    /**
     * The meta object literal for the '<em><b>Sta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__STA = eINSTANCE.getDocument_Sta();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.StatementImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Com</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__COM = eINSTANCE.getStatement_Com();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.AbstractElementImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.StateImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Times</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__TIMES = eINSTANCE.getState_Times();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__TIMEOUT = eINSTANCE.getState_Timeout();

    /**
     * The meta object literal for the '<em><b>Stms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STMS = eINSTANCE.getState_Stms();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.VoiceTagImpl <em>Voice Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.VoiceTagImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getVoiceTag()
     * @generated
     */
    EClass VOICE_TAG = eINSTANCE.getVoiceTag();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOICE_TAG__NAME = eINSTANCE.getVoiceTag_Name();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.CallImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__TO = eINSTANCE.getCall_To();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.DialImpl <em>Dial</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.DialImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getDial()
     * @generated
     */
    EClass DIAL = eINSTANCE.getDial();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAL__TO = eINSTANCE.getDial_To();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.PlayImpl <em>Play</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.PlayImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getPlay()
     * @generated
     */
    EClass PLAY = eINSTANCE.getPlay();

    /**
     * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAY__FILE = eINSTANCE.getPlay_File();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.RecordImpl <em>Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.RecordImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getRecord()
     * @generated
     */
    EClass RECORD = eINSTANCE.getRecord();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__TIME = eINSTANCE.getRecord_Time();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD__ACTION = eINSTANCE.getRecord_Action();

    /**
     * The meta object literal for the '<em><b>Vari</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__VARI = eINSTANCE.getRecord_Vari();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.RejectImpl <em>Reject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.RejectImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getReject()
     * @generated
     */
    EClass REJECT = eINSTANCE.getReject();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.HangupImpl <em>Hangup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.HangupImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getHangup()
     * @generated
     */
    EClass HANGUP = eINSTANCE.getHangup();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.GetDigitsImpl <em>Get Digits</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.GetDigitsImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getGetDigits()
     * @generated
     */
    EClass GET_DIGITS = eINSTANCE.getGetDigits();

    /**
     * The meta object literal for the '<em><b>Num Digits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DIGITS__NUM_DIGITS = eINSTANCE.getGetDigits_NumDigits();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_DIGITS__QUESTION = eINSTANCE.getGetDigits_Question();

    /**
     * The meta object literal for the '<em><b>Vari</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DIGITS__VARI = eINSTANCE.getGetDigits_Vari();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.AskImpl <em>Ask</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.AskImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getAsk()
     * @generated
     */
    EClass ASK = eINSTANCE.getAsk();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASK__QUESTION = eINSTANCE.getAsk_Question();

    /**
     * The meta object literal for the '<em><b>Vari</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASK__VARI = eINSTANCE.getAsk_Vari();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.SendImpl <em>Send</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.SendImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSend()
     * @generated
     */
    EClass SEND = eINSTANCE.getSend();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND__PARAMS = eINSTANCE.getSend_Params();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND__URL = eINSTANCE.getSend_Url();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.SendBlockImpl <em>Send Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.SendBlockImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSendBlock()
     * @generated
     */
    EClass SEND_BLOCK = eINSTANCE.getSendBlock();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND_BLOCK__VALUE = eINSTANCE.getSendBlock_Value();

    /**
     * The meta object literal for the '<em><b>Stms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND_BLOCK__STMS = eINSTANCE.getSendBlock_Stms();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.NotPrimaryParamImpl <em>Not Primary Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.NotPrimaryParamImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getNotPrimaryParam()
     * @generated
     */
    EClass NOT_PRIMARY_PARAM = eINSTANCE.getNotPrimaryParam();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_PRIMARY_PARAM__VALUE = eINSTANCE.getNotPrimaryParam_Value();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.ParamImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__VALUE = eINSTANCE.getParam_Value();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.SayImpl <em>Say</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.SayImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSay()
     * @generated
     */
    EClass SAY = eINSTANCE.getSay();

    /**
     * The meta object literal for the '<em><b>That</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAY__THAT = eINSTANCE.getSay_That();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.SmsImpl <em>Sms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.SmsImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSms()
     * @generated
     */
    EClass SMS = eINSTANCE.getSms();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMS__VALUE = eINSTANCE.getSms_Value();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMS__TO = eINSTANCE.getSms_To();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.EmailImpl <em>Email</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.EmailImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getEmail()
     * @generated
     */
    EClass EMAIL = eINSTANCE.getEmail();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMAIL__NAME = eINSTANCE.getEmail_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAIL__TITLE = eINSTANCE.getEmail_Title();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAIL__FROM = eINSTANCE.getEmail_From();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAIL__VALUE = eINSTANCE.getEmail_Value();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMAIL__TO = eINSTANCE.getEmail_To();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.TweetImpl <em>Tweet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.TweetImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getTweet()
     * @generated
     */
    EClass TWEET = eINSTANCE.getTweet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TWEET__NAME = eINSTANCE.getTweet_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TWEET__VALUE = eINSTANCE.getTweet_Value();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.TransitionImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.IfExpImpl <em>If Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.IfExpImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getIfExp()
     * @generated
     */
    EClass IF_EXP = eINSTANCE.getIfExp();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXP__BLOCK = eINSTANCE.getIfExp_Block();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXP__BLOCKS = eINSTANCE.getIfExp_Blocks();

    /**
     * The meta object literal for the '<em><b>Default Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXP__DEFAULT_BLOCK = eINSTANCE.getIfExp_DefaultBlock();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.CondBlockImpl <em>Cond Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.CondBlockImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getCondBlock()
     * @generated
     */
    EClass COND_BLOCK = eINSTANCE.getCondBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COND_BLOCK__NAME = eINSTANCE.getCondBlock_Name();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_BLOCK__COND = eINSTANCE.getCondBlock_Cond();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_BLOCK__ACTION = eINSTANCE.getCondBlock_Action();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.BlockImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__NAME = eINSTANCE.getBlock_Name();

    /**
     * The meta object literal for the '<em><b>Sta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STA = eINSTANCE.getBlock_Sta();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.BoolExpressionImpl <em>Bool Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.BoolExpressionImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBoolExpression()
     * @generated
     */
    EClass BOOL_EXPRESSION = eINSTANCE.getBoolExpression();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.BracketsImpl <em>Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.BracketsImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBrackets()
     * @generated
     */
    EClass BRACKETS = eINSTANCE.getBrackets();

    /**
     * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRACKETS__OPEN = eINSTANCE.getBrackets_Open();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRACKETS__OBJ = eINSTANCE.getBrackets_Obj();

    /**
     * The meta object literal for the '<em><b>Close</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRACKETS__CLOSE = eINSTANCE.getBrackets_Close();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.CompareExpressionImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getCompareExpression()
     * @generated
     */
    EClass COMPARE_EXPRESSION = eINSTANCE.getCompareExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_EXPRESSION__LEFT = eINSTANCE.getCompareExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_EXPRESSION__OP = eINSTANCE.getCompareExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_EXPRESSION__RIGHT = eINSTANCE.getCompareExpression_Right();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.NegExpressionImpl <em>Neg Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.NegExpressionImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getNegExpression()
     * @generated
     */
    EClass NEG_EXPRESSION = eINSTANCE.getNegExpression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEG_EXPRESSION__OP = eINSTANCE.getNegExpression_Op();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEG_EXPRESSION__OBJ = eINSTANCE.getNegExpression_Obj();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.MathExpressionImpl <em>Math Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.MathExpressionImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getMathExpression()
     * @generated
     */
    EClass MATH_EXPRESSION = eINSTANCE.getMathExpression();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.MathBracketsImpl <em>Math Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.MathBracketsImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getMathBrackets()
     * @generated
     */
    EClass MATH_BRACKETS = eINSTANCE.getMathBrackets();

    /**
     * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATH_BRACKETS__OPEN = eINSTANCE.getMathBrackets_Open();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_BRACKETS__OBJ = eINSTANCE.getMathBrackets_Obj();

    /**
     * The meta object literal for the '<em><b>Close</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATH_BRACKETS__CLOSE = eINSTANCE.getMathBrackets_Close();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.ConcatenationExpressionImpl <em>Concatenation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.ConcatenationExpressionImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getConcatenationExpression()
     * @generated
     */
    EClass CONCATENATION_EXPRESSION = eINSTANCE.getConcatenationExpression();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.ConcatenationBracketsImpl <em>Concatenation Brackets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.ConcatenationBracketsImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getConcatenationBrackets()
     * @generated
     */
    EClass CONCATENATION_BRACKETS = eINSTANCE.getConcatenationBrackets();

    /**
     * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCATENATION_BRACKETS__OPEN = eINSTANCE.getConcatenationBrackets_Open();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION_BRACKETS__OBJ = eINSTANCE.getConcatenationBrackets_Obj();

    /**
     * The meta object literal for the '<em><b>Close</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCATENATION_BRACKETS__CLOSE = eINSTANCE.getConcatenationBrackets_Close();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.StringVariableImpl <em>String Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.StringVariableImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getStringVariable()
     * @generated
     */
    EClass STRING_VARIABLE = eINSTANCE.getStringVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VARIABLE__NAME = eINSTANCE.getStringVariable_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_VARIABLE__VALUE = eINSTANCE.getStringVariable_Value();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.NumVariableImpl <em>Num Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.NumVariableImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getNumVariable()
     * @generated
     */
    EClass NUM_VARIABLE = eINSTANCE.getNumVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUM_VARIABLE__NAME = eINSTANCE.getNumVariable_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUM_VARIABLE__VALUE = eINSTANCE.getNumVariable_Value();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.BoolVariableImpl <em>Bool Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.BoolVariableImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBoolVariable()
     * @generated
     */
    EClass BOOL_VARIABLE = eINSTANCE.getBoolVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_VARIABLE__NAME = eINSTANCE.getBoolVariable_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOL_VARIABLE__VALUE = eINSTANCE.getBoolVariable_Value();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.ConstantImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.PrimitiveImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE__VALUE = eINSTANCE.getPrimitive_Value();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.VarsImpl <em>Vars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.VarsImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getVars()
     * @generated
     */
    EClass VARS = eINSTANCE.getVars();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.LiteralAbsImpl <em>Literal Abs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.LiteralAbsImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getLiteralAbs()
     * @generated
     */
    EClass LITERAL_ABS = eINSTANCE.getLiteralAbs();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.LiteralImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>V</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__V = eINSTANCE.getLiteral_V();

    /**
     * The meta object literal for the '<em><b>Nul</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__NUL = eINSTANCE.getLiteral_Nul();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.BoolLiteralImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getBoolLiteral()
     * @generated
     */
    EClass BOOL_LITERAL = eINSTANCE.getBoolLiteral();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.NumLiteralImpl <em>Num Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.NumLiteralImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getNumLiteral()
     * @generated
     */
    EClass NUM_LITERAL = eINSTANCE.getNumLiteral();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.StringLiteralImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.EVENTImpl <em>EVENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.EVENTImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getEVENT()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEVENT();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEVENT_Name();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.SESSIONImpl <em>SESSION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.SESSIONImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getSESSION()
     * @generated
     */
    EClass SESSION = eINSTANCE.getSESSION();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SESSION__NAME = eINSTANCE.getSESSION_Name();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.CALLSTATUSImpl <em>CALLSTATUS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.CALLSTATUSImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getCALLSTATUS()
     * @generated
     */
    EClass CALLSTATUS = eINSTANCE.getCALLSTATUS();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALLSTATUS__NAME = eINSTANCE.getCALLSTATUS_Name();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.OperationBoolImpl <em>Operation Bool</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.OperationBoolImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getOperationBool()
     * @generated
     */
    EClass OPERATION_BOOL = eINSTANCE.getOperationBool();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_BOOL__LEFT = eINSTANCE.getOperationBool_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_BOOL__OP = eINSTANCE.getOperationBool_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_BOOL__RIGHT = eINSTANCE.getOperationBool_Right();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.OperationImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OP = eINSTANCE.getOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

    /**
     * The meta object literal for the '{@link org.telcodev.dsl.dime.impl.ConcatenationImpl <em>Concatenation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.telcodev.dsl.dime.impl.ConcatenationImpl
     * @see org.telcodev.dsl.dime.impl.DimePackageImpl#getConcatenation()
     * @generated
     */
    EClass CONCATENATION = eINSTANCE.getConcatenation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__LEFT = eINSTANCE.getConcatenation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCATENATION__OP = eINSTANCE.getConcatenation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCATENATION__RIGHT = eINSTANCE.getConcatenation_Right();

  }

} //DimePackage
