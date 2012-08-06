/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Statement#getCom <em>Com</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Com</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Com</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Com</em>' attribute.
   * @see #setCom(String)
   * @see org.telcodev.dsl.dime.DimePackage#getStatement_Com()
   * @model
   * @generated
   */
  String getCom();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Statement#getCom <em>Com</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Com</em>' attribute.
   * @see #getCom()
   * @generated
   */
  void setCom(String value);

} // Statement
