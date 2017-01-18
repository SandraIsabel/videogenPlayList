/**
 */
package videogenPlayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see videogenPlayList.VideogenPlayListFactory
 * @model kind="package"
 * @generated
 */
public interface VideogenPlayListPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "videogenPlayList";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/videogenPlayList";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "videogenPlayList";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideogenPlayListPackage eINSTANCE = videogenPlayList.impl.VideogenPlayListPackageImpl.init();

	/**
	 * The meta object id for the '{@link videogenPlayList.impl.PlayListImpl <em>Play List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videogenPlayList.impl.PlayListImpl
	 * @see videogenPlayList.impl.VideogenPlayListPackageImpl#getPlayList()
	 * @generated
	 */
	int PLAY_LIST = 0;

	/**
	 * The feature id for the '<em><b>Media File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST__MEDIA_FILE = 0;

	/**
	 * The number of structural features of the '<em>Play List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Play List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link videogenPlayList.impl.MediaFileImpl <em>Media File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see videogenPlayList.impl.MediaFileImpl
	 * @see videogenPlayList.impl.VideogenPlayListPackageImpl#getMediaFile()
	 * @generated
	 */
	int MEDIA_FILE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE__POSITION_X = 3;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE__POSITION_Y = 4;

	/**
	 * The number of structural features of the '<em>Media File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Media File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link videogenPlayList.PlayList <em>Play List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play List</em>'.
	 * @see videogenPlayList.PlayList
	 * @generated
	 */
	EClass getPlayList();

	/**
	 * Returns the meta object for the reference list '{@link videogenPlayList.PlayList#getMediaFile <em>Media File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Media File</em>'.
	 * @see videogenPlayList.PlayList#getMediaFile()
	 * @see #getPlayList()
	 * @generated
	 */
	EReference getPlayList_MediaFile();

	/**
	 * Returns the meta object for class '{@link videogenPlayList.MediaFile <em>Media File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media File</em>'.
	 * @see videogenPlayList.MediaFile
	 * @generated
	 */
	EClass getMediaFile();

	/**
	 * Returns the meta object for the attribute '{@link videogenPlayList.MediaFile#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see videogenPlayList.MediaFile#getLocation()
	 * @see #getMediaFile()
	 * @generated
	 */
	EAttribute getMediaFile_Location();

	/**
	 * Returns the meta object for the attribute '{@link videogenPlayList.MediaFile#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see videogenPlayList.MediaFile#getDuration()
	 * @see #getMediaFile()
	 * @generated
	 */
	EAttribute getMediaFile_Duration();

	/**
	 * Returns the meta object for the attribute '{@link videogenPlayList.MediaFile#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see videogenPlayList.MediaFile#getText()
	 * @see #getMediaFile()
	 * @generated
	 */
	EAttribute getMediaFile_Text();

	/**
	 * Returns the meta object for the attribute '{@link videogenPlayList.MediaFile#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see videogenPlayList.MediaFile#getPositionX()
	 * @see #getMediaFile()
	 * @generated
	 */
	EAttribute getMediaFile_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link videogenPlayList.MediaFile#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see videogenPlayList.MediaFile#getPositionY()
	 * @see #getMediaFile()
	 * @generated
	 */
	EAttribute getMediaFile_PositionY();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VideogenPlayListFactory getVideogenPlayListFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link videogenPlayList.impl.PlayListImpl <em>Play List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videogenPlayList.impl.PlayListImpl
		 * @see videogenPlayList.impl.VideogenPlayListPackageImpl#getPlayList()
		 * @generated
		 */
		EClass PLAY_LIST = eINSTANCE.getPlayList();

		/**
		 * The meta object literal for the '<em><b>Media File</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY_LIST__MEDIA_FILE = eINSTANCE.getPlayList_MediaFile();

		/**
		 * The meta object literal for the '{@link videogenPlayList.impl.MediaFileImpl <em>Media File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see videogenPlayList.impl.MediaFileImpl
		 * @see videogenPlayList.impl.VideogenPlayListPackageImpl#getMediaFile()
		 * @generated
		 */
		EClass MEDIA_FILE = eINSTANCE.getMediaFile();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_FILE__LOCATION = eINSTANCE.getMediaFile_Location();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_FILE__DURATION = eINSTANCE.getMediaFile_Duration();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_FILE__TEXT = eINSTANCE.getMediaFile_Text();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_FILE__POSITION_X = eINSTANCE.getMediaFile_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_FILE__POSITION_Y = eINSTANCE.getMediaFile_PositionY();

	}

} //VideogenPlayListPackage
