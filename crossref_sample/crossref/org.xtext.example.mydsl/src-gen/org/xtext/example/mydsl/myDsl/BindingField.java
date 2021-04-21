/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BindingField#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BindingField#getTable <em>Table</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.BindingField#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBindingField()
 * @model
 * @generated
 */
public interface BindingField extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBindingField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BindingField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(Table)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBindingField_Table()
   * @model
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BindingField#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(Table value);

  /**
   * Returns the value of the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' reference.
   * @see #setItem(AbstructItem)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBindingField_Item()
   * @model
   * @generated
   */
  AbstructItem getItem();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.BindingField#getItem <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' reference.
   * @see #getItem()
   * @generated
   */
  void setItem(AbstructItem value);

} // BindingField
