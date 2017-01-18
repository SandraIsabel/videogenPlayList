/**
 */
package videogenPlayList.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import videogenPlayList.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideogenPlayListFactoryImpl extends EFactoryImpl implements VideogenPlayListFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VideogenPlayListFactory init() {
		try {
			VideogenPlayListFactory theVideogenPlayListFactory = (VideogenPlayListFactory)EPackage.Registry.INSTANCE.getEFactory(VideogenPlayListPackage.eNS_URI);
			if (theVideogenPlayListFactory != null) {
				return theVideogenPlayListFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VideogenPlayListFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideogenPlayListFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VideogenPlayListPackage.PLAY_LIST: return createPlayList();
			case VideogenPlayListPackage.MEDIA_FILE: return createMediaFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayList createPlayList() {
		PlayListImpl playList = new PlayListImpl();
		return playList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaFile createMediaFile() {
		MediaFileImpl mediaFile = new MediaFileImpl();
		return mediaFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideogenPlayListPackage getVideogenPlayListPackage() {
		return (VideogenPlayListPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VideogenPlayListPackage getPackage() {
		return VideogenPlayListPackage.eINSTANCE;
	}

} //VideogenPlayListFactoryImpl
