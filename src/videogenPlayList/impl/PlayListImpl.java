/**
 */
package videogenPlayList.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import videogenPlayList.MediaFile;
import videogenPlayList.PlayList;
import videogenPlayList.VideogenPlayListPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Play List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videogenPlayList.impl.PlayListImpl#getMediaFile <em>Media File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayListImpl extends MinimalEObjectImpl.Container implements PlayList {
	/**
	 * The cached value of the '{@link #getMediaFile() <em>Media File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaFile()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaFile> mediaFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideogenPlayListPackage.Literals.PLAY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaFile> getMediaFile() {
		if (mediaFile == null) {
			mediaFile = new EObjectResolvingEList<MediaFile>(MediaFile.class, this, VideogenPlayListPackage.PLAY_LIST__MEDIA_FILE);
		}
		return mediaFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideogenPlayListPackage.PLAY_LIST__MEDIA_FILE:
				return getMediaFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideogenPlayListPackage.PLAY_LIST__MEDIA_FILE:
				getMediaFile().clear();
				getMediaFile().addAll((Collection<? extends MediaFile>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VideogenPlayListPackage.PLAY_LIST__MEDIA_FILE:
				getMediaFile().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VideogenPlayListPackage.PLAY_LIST__MEDIA_FILE:
				return mediaFile != null && !mediaFile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlayListImpl
