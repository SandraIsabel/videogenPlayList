/**
 */
package videogenPlayList;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see videogenPlayList.VideogenPlayListPackage
 * @generated
 */
public interface VideogenPlayListFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideogenPlayListFactory eINSTANCE = videogenPlayList.impl.VideogenPlayListFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Play List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Play List</em>'.
	 * @generated
	 */
	PlayList createPlayList();

	/**
	 * Returns a new object of class '<em>Media File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media File</em>'.
	 * @generated
	 */
	MediaFile createMediaFile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VideogenPlayListPackage getVideogenPlayListPackage();

} //VideogenPlayListFactory
