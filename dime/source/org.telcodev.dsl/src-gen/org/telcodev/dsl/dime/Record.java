/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Record#getTime <em>Time</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Record#getAction <em>Action</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Record#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends VoiceTag
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see org.telcodev.dsl.dime.DimePackage#getRecord_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Record#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getRecord_Action()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getAction();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Record#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ConcatenationExpression value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.telcodev.dsl.dime.DimePackage#getRecord_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Record#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Record
