/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concatenation Brackets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.ConcatenationBrackets#getOpen <em>Open</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.ConcatenationBrackets#getObj <em>Obj</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.ConcatenationBrackets#getClose <em>Close</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getConcatenationBrackets()
 * @model
 * @generated
 */
public interface ConcatenationBrackets extends ConcatenationExpression
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
   * @see org.telcodev.dsl.dime.DimePackage#getConcatenationBrackets_Open()
   * @model
   * @generated
   */
  String getOpen();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.ConcatenationBrackets#getOpen <em>Open</em>}' attribute.
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
   * @see #setObj(ConcatenationExpression)
   * @see org.telcodev.dsl.dime.DimePackage#getConcatenationBrackets_Obj()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getObj();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.ConcatenationBrackets#getObj <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' containment reference.
   * @see #getObj()
   * @generated
   */
  void setObj(ConcatenationExpression value);

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
   * @see org.telcodev.dsl.dime.DimePackage#getConcatenationBrackets_Close()
   * @model
   * @generated
   */
  String getClose();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.ConcatenationBrackets#getClose <em>Close</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Close</em>' attribute.
   * @see #getClose()
   * @generated
   */
  void setClose(String value);

} // ConcatenationBrackets
