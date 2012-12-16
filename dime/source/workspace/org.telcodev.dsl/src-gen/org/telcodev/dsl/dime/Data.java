/**
 */
package org.telcodev.dsl.dime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.telcodev.dsl.dime.Data#getVari <em>Vari</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Data#getValue <em>Value</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Data#getStms <em>Stms</em>}</li>
 *   <li>{@link org.telcodev.dsl.dime.Data#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.telcodev.dsl.dime.DimePackage#getData()
 * @model
 * @generated
 */
public interface Data extends VoiceTag
{
  /**
   * Returns the value of the '<em><b>Vari</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vari</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vari</em>' reference.
   * @see #setVari(Vars)
   * @see org.telcodev.dsl.dime.DimePackage#getData_Vari()
   * @model
   * @generated
   */
  Vars getVari();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Data#getVari <em>Vari</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vari</em>' reference.
   * @see #getVari()
   * @generated
   */
  void setVari(Vars value);

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
   * @see org.telcodev.dsl.dime.DimePackage#getData_Value()
   * @model containment="true"
   * @generated
   */
  Param getValue();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Data#getValue <em>Value</em>}' containment reference.
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
   * @see org.telcodev.dsl.dime.DimePackage#getData_Stms()
   * @model containment="true"
   * @generated
   */
  EList<NotPrimaryParam> getStms();

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
   * @see org.telcodev.dsl.dime.DimePackage#getData_Url()
   * @model containment="true"
   * @generated
   */
  ConcatenationExpression getUrl();

  /**
   * Sets the value of the '{@link org.telcodev.dsl.dime.Data#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(ConcatenationExpression value);

} // Data
