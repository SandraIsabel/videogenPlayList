/**
 */
package videogenPlayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Play List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videogenPlayList.PlayList#getMediaFile <em>Media File</em>}</li>
 * </ul>
 *
 * @see videogenPlayList.VideogenPlayListPackage#getPlayList()
 * @model
 * @generated
 */
public interface PlayList extends EObject {
	/**
	 * Returns the value of the '<em><b>Media File</b></em>' reference list.
	 * The list contents are of type {@link videogenPlayList.MediaFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media File</em>' reference list.
	 * @see videogenPlayList.VideogenPlayListPackage#getPlayList_MediaFile()
	 * @model
	 * @generated
	 */
	EList<MediaFile> getMediaFile();

} // PlayList
