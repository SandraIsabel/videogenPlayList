/**
 */
package videogenPlayList.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import videogenPlayList.MediaFile;
import videogenPlayList.PlayList;
import videogenPlayList.VideogenPlayListFactory;
import videogenPlayList.VideogenPlayListPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideogenPlayListPackageImpl extends EPackageImpl implements VideogenPlayListPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaFileEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see videogenPlayList.VideogenPlayListPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VideogenPlayListPackageImpl() {
		super(eNS_URI, VideogenPlayListFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VideogenPlayListPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VideogenPlayListPackage init() {
		if (isInited) return (VideogenPlayListPackage)EPackage.Registry.INSTANCE.getEPackage(VideogenPlayListPackage.eNS_URI);

		// Obtain or create and register package
		VideogenPlayListPackageImpl theVideogenPlayListPackage = (VideogenPlayListPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VideogenPlayListPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VideogenPlayListPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVideogenPlayListPackage.createPackageContents();

		// Initialize created meta-data
		theVideogenPlayListPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVideogenPlayListPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VideogenPlayListPackage.eNS_URI, theVideogenPlayListPackage);
		return theVideogenPlayListPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayList() {
		return playListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayList_MediaFile() {
		return (EReference)playListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaFile() {
		return mediaFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaFile_Location() {
		return (EAttribute)mediaFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaFile_Duration() {
		return (EAttribute)mediaFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaFile_Text() {
		return (EAttribute)mediaFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaFile_PositionX() {
		return (EAttribute)mediaFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMediaFile_PositionY() {
		return (EAttribute)mediaFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideogenPlayListFactory getVideogenPlayListFactory() {
		return (VideogenPlayListFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		playListEClass = createEClass(PLAY_LIST);
		createEReference(playListEClass, PLAY_LIST__MEDIA_FILE);

		mediaFileEClass = createEClass(MEDIA_FILE);
		createEAttribute(mediaFileEClass, MEDIA_FILE__LOCATION);
		createEAttribute(mediaFileEClass, MEDIA_FILE__DURATION);
		createEAttribute(mediaFileEClass, MEDIA_FILE__TEXT);
		createEAttribute(mediaFileEClass, MEDIA_FILE__POSITION_X);
		createEAttribute(mediaFileEClass, MEDIA_FILE__POSITION_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(playListEClass, PlayList.class, "PlayList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayList_MediaFile(), this.getMediaFile(), null, "MediaFile", null, 0, -1, PlayList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaFileEClass, MediaFile.class, "MediaFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaFile_Location(), ecorePackage.getEString(), "location", null, 0, 1, MediaFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaFile_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, MediaFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaFile_Text(), ecorePackage.getEString(), "text", "", 0, 1, MediaFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaFile_PositionX(), ecorePackage.getEString(), "positionX", null, 0, 1, MediaFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaFile_PositionY(), ecorePackage.getEString(), "positionY", null, 0, 1, MediaFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VideogenPlayListPackageImpl
