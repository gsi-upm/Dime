/**
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Block#getSta <em>Sta</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
  /**
   * Returns the value of the '<em><b>Sta</b></em>' containment reference list.
   * The list contents are of type {@link org.telcodev.dsl.dime.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sta</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sta</em>' containment reference list.
   * @see org.telcodev.dsl.dime.DimePackage#getBlock_Sta()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getSta();

} // Block
