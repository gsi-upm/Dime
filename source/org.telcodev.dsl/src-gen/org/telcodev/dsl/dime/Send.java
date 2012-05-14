/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Send#getParams <em>Params</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Send#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getSend()
 * @model
 * @generated
 */
public interface Send extends VoiceTag
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(SendBlock)
   * @see org.telcodev.dsl.dime.DimePackage#getSend_Params()
   * @model containment="true"
   * @generated
   */
  SendBlock getParams();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Send#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(SendBlock value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' containment reference.
   * @see #setUrl(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getSend_Url()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getUrl();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Send#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(ConcatenationExpression value);

} // Send
