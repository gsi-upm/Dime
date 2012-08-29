/**
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Ask#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Ask#getVari <em>Vari</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getAsk()
 * @model
 * @generated
 */
public interface Ask extends VoiceTag, Vars
{
  /**
   * Returns the value of the '<em><b>Question</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' containment reference.
   * @see #setQuestion(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getAsk_Question()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getQuestion();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Ask#getQuestion <em>Question</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' containment reference.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(ConcatenationExpression value);

  /**
   * Returns the value of the '<em><b>Vari</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vari</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vari</em>' attribute.
   * @see #setVari(String)
   * @see org.telcodev.dsl.dime.DimePackage#getAsk_Vari()
   * @model
   * @generated
   */
  String getVari();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Ask#getVari <em>Vari</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vari</em>' attribute.
   * @see #getVari()
   * @generated
   */
  void setVari(String value);

} // Ask
