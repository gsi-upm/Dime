/**
 * <copyright>
 * </copyright>
 *
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.SendBlock#getValue <em>Value</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.SendBlock#getStms <em>Stms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getSendBlock()
 * @model
 * @generated
 */
public interface SendBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Param)
   * @see org.telcodev.dsl.dime.DimePackage#getSendBlock_Value()
   * @model containment="true"
   * @generated
   */
  Param getValue();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.SendBlock#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Param value);

  /**
   * Returns the value of the '<em><b>Stms</b></em>' containment reference list.
   * The list contents are of type {@link org.telcodev.dsl.dime.NotPrimaryParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stms</em>' containment reference list.
   * @see org.telcodev.dsl.dime.DimePackage#getSendBlock_Stms()
   * @model containment="true"
   * @generated
   */
  EList<NotPrimaryParam> getStms();

} // SendBlock
