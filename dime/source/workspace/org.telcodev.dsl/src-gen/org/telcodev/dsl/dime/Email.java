/**
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Email#getTitle <em>Title</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Email#getFrom <em>From</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Email#getValue <em>Value</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Email#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getEmail()
 * @model
 * @generated
 */
public interface Email extends VoiceTag
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getEmail_Title()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getTitle();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Email#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ConcatenationExpression value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getEmail_From()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getFrom();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Email#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(ConcatenationExpression value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getEmail_Value()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getValue();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Email#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ConcatenationExpression value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getEmail_To()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getTo();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Email#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(ConcatenationExpression value);

} // Email
