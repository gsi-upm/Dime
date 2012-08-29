/**
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brackets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Brackets#getOpen <em>Open</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Brackets#getObj <em>Obj</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Brackets#getClose <em>Close</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getBrackets()
 * @model
 * @generated
 */
public interface Brackets extends BoolExpression
{
  /**
   * Returns the value of the '<em><b>Open</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Open</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Open</em>' attribute.
   * @see #setOpen(String)
   * @see org.telcodev.dsl.dime.DimePackage#getBrackets_Open()
   * @model
   * @generated
   */
  String getOpen();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Brackets#getOpen <em>Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Open</em>' attribute.
   * @see #getOpen()
   * @generated
   */
  void setOpen(String value);

  /**
   * Returns the value of the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' containment reference.
   * @see #setObj(BoolExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getBrackets_Obj()
   * @model containment="true"
   * @generated
   */
  BoolExpression getObj();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Brackets#getObj <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' containment reference.
   * @see #getObj()
   * @generated
   */
  void setObj(BoolExpression value);

  /**
   * Returns the value of the '<em><b>Close</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Close</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Close</em>' attribute.
   * @see #setClose(String)
   * @see org.telcodev.dsl.dime.DimePackage#getBrackets_Close()
   * @model
   * @generated
   */
  String getClose();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Brackets#getClose <em>Close</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Close</em>' attribute.
   * @see #getClose()
   * @generated
   */
  void setClose(String value);

} // Brackets
