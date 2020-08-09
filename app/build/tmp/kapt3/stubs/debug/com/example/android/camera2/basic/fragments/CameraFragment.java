package com.example.android.camera2.basic.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 t2\u00020\u0001:\u0001tB\u0005\u00a2\u0006\u0002\u0010\u0002J3\u0010S\u001a\u00020F2\u0006\u0010T\u001a\u00020\u00102\f\u0010U\u001a\b\u0012\u0004\u0012\u00020W0V2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020[H\u0002J&\u0010\\\u001a\u0004\u0018\u00010?2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010bH\u0016J\b\u0010c\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020dH\u0016J\u001a\u0010f\u001a\u00020d2\u0006\u0010g\u001a\u00020?2\b\u0010a\u001a\u0004\u0018\u00010bH\u0017J-\u0010h\u001a\u00020\u00102\u0006\u0010i\u001a\u00020\u00142\u0006\u0010j\u001a\u00020k2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0012H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010lJ\u0019\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020pH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010qJ\u0011\u0010r\u001a\u00020pH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010sR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020 X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u0014\u00104\u001a\u00020 X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0014\u00106\u001a\u00020,X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\b\u001a\u0004\b;\u0010<R\u000e\u0010>\u001a\u00020?X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R\u000e\u0010C\u001a\u00020DX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010G\u001a\b\u0012\u0004\u0012\u00020,0+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010.\"\u0004\bI\u00100R \u0010J\u001a\b\u0012\u0004\u0012\u00020,0+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010.\"\u0004\bL\u00100R\u000e\u0010M\u001a\u00020NX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010O\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u00108\"\u0004\bQ\u0010R\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006u"}, d2 = {"Lcom/example/android/camera2/basic/fragments/CameraFragment;", "Landroidx/fragment/app/Fragment;", "()V", "animationTask", "Ljava/lang/Runnable;", "getAnimationTask", "()Ljava/lang/Runnable;", "animationTask$delegate", "Lkotlin/Lazy;", "args", "Lcom/example/android/camera2/basic/fragments/CameraFragmentArgs;", "getArgs", "()Lcom/example/android/camera2/basic/fragments/CameraFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "camera", "Landroid/hardware/camera2/CameraDevice;", "cameraHandler", "Landroid/os/Handler;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "cameraThread", "Landroid/os/HandlerThread;", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "getCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "characteristics$delegate", "exposureTime", "", "getExposureTime", "()J", "setExposureTime", "(J)V", "frac", "imageReader", "Landroid/media/ImageReader;", "imageReaderHandler", "imageReaderThread", "intensidad", "", "", "getIntensidad", "()Ljava/util/List;", "setIntensidad", "(Ljava/util/List;)V", "intensidadTodos", "getIntensidadTodos", "setIntensidadTodos", "interval", "getInterval", "n", "getN", "()I", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "overlay", "Landroid/view/View;", "previousMillis", "getPreviousMillis", "setPreviousMillis", "relativeOrientation", "Lcom/example/android/camera/utils/OrientationLiveData;", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "tiempos", "getTiempos", "setTiempos", "tiemposTodos", "getTiemposTodos", "setTiemposTodos", "viewFinder", "Lcom/example/android/camera/utils/AutoFitSurfaceView;", "x", "getX", "setX", "(I)V", "createCaptureSession", "device", "targets", "", "Landroid/view/Surface;", "handler", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeCamera", "Lkotlinx/coroutines/Job;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onStop", "onViewCreated", "view", "openCamera", "manager", "cameraId", "", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveResult", "Ljava/io/File;", "result", "Lcom/example/android/camera2/basic/fragments/CameraFragment$Companion$CombinedCaptureResult;", "(Lcom/example/android/camera2/basic/fragments/CameraFragment$Companion$CombinedCaptureResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "takePhoto", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class CameraFragment extends androidx.fragment.app.Fragment {
    
    /**
     * AndroidX navigation arguments
     */
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    /**
     * Host's navigation controller
     */
    private final kotlin.Lazy navController$delegate = null;
    
    /**
     * Detects, characterizes, and connects to a CameraDevice (used for all camera operations)
     */
    private final kotlin.Lazy cameraManager$delegate = null;
    
    /**
     * [CameraCharacteristics] corresponding to the provided Camera ID
     */
    private final kotlin.Lazy characteristics$delegate = null;
    
    /**
     * Readers used as buffers for camera still shots
     */
    private android.media.ImageReader imageReader;
    
    /**
     * [HandlerThread] where all camera operations run
     */
    private final android.os.HandlerThread cameraThread = null;
    
    /**
     * [Handler] corresponding to [cameraThread]
     */
    private final android.os.Handler cameraHandler = null;
    
    /**
     * Performs recording animation of flashing screen
     */
    private final kotlin.Lazy animationTask$delegate = null;
    
    /**
     * [HandlerThread] where all buffer reading operations run
     */
    private final android.os.HandlerThread imageReaderThread = null;
    
    /**
     * [Handler] corresponding to [imageReaderThread]
     */
    private final android.os.Handler imageReaderHandler = null;
    
    /**
     * Where the camera preview is displayed
     */
    private com.example.android.camera.utils.AutoFitSurfaceView viewFinder;
    
    /**
     * Overlay on top of the camera preview
     */
    private android.view.View overlay;
    
    /**
     * The [CameraDevice] that will be opened in this fragment
     */
    private android.hardware.camera2.CameraDevice camera;
    
    /**
     * Internal reference to the ongoing [CameraCaptureSession] configured with our parameters
     */
    private android.hardware.camera2.CameraCaptureSession session;
    
    /**
     * Live data listener for changes in the device orientation relative to the camera
     */
    private com.example.android.camera.utils.OrientationLiveData relativeOrientation;
    private int x = 0;
    private final long interval = 3000L;
    private long previousMillis = 0L;
    private final int n = 20;
    private long exposureTime = 100000000L;
    private final long frac = 100000000L;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> intensidad;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> tiempos;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> intensidadTodos;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> tiemposTodos;
    private static final java.lang.String TAG = null;
    
    /**
     * Maximum number of images that will be held in the reader's buffer
     */
    private static final int IMAGE_BUFFER_SIZE = 3;
    
    /**
     * Maximum time allowed to wait for the result of an image capture
     */
    private static final long IMAGE_CAPTURE_TIMEOUT_MILLIS = 5000L;
    public static final com.example.android.camera2.basic.fragments.CameraFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * AndroidX navigation arguments
     */
    private final com.example.android.camera2.basic.fragments.CameraFragmentArgs getArgs() {
        return null;
    }
    
    /**
     * Host's navigation controller
     */
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    /**
     * Detects, characterizes, and connects to a CameraDevice (used for all camera operations)
     */
    private final android.hardware.camera2.CameraManager getCameraManager() {
        return null;
    }
    
    /**
     * [CameraCharacteristics] corresponding to the provided Camera ID
     */
    private final android.hardware.camera2.CameraCharacteristics getCharacteristics() {
        return null;
    }
    
    /**
     * Performs recording animation of flashing screen
     */
    private final java.lang.Runnable getAnimationTask() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final int getX() {
        return 0;
    }
    
    public final void setX(int p0) {
    }
    
    public final long getInterval() {
        return 0L;
    }
    
    public final long getPreviousMillis() {
        return 0L;
    }
    
    public final void setPreviousMillis(long p0) {
    }
    
    public final int getN() {
        return 0;
    }
    
    /**
     * Begin all camera operations in a coroutine in the main thread. This function:
     * - Opens the camera
     * - Configures the camera session
     * - Starts the preview by dispatching a repeating capture request
     * - Sets up the still image capture listeners
     */
    private final kotlinx.coroutines.Job initializeCamera() {
        return null;
    }
    
    public final long getExposureTime() {
        return 0L;
    }
    
    public final void setExposureTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getIntensidad() {
        return null;
    }
    
    public final void setIntensidad(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getTiempos() {
        return null;
    }
    
    public final void setTiempos(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getIntensidadTodos() {
        return null;
    }
    
    public final void setIntensidadTodos(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getTiemposTodos() {
        return null;
    }
    
    public final void setTiemposTodos(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public CameraFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/android/camera2/basic/fragments/CameraFragment$Companion;", "", "()V", "IMAGE_BUFFER_SIZE", "", "IMAGE_CAPTURE_TIMEOUT_MILLIS", "", "TAG", "", "createFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "extension", "CombinedCaptureResult", "app_debug"})
    public static final class Companion {
        
        /**
         * Create a [File] named a using formatted timestamp with the current date and time.
         *
         * @return [File] created.
         */
        private final java.io.File createFile(android.content.Context context, java.lang.String extension) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        /**
         * Helper data class used to hold capture metadata with their associated image
         */
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/android/camera2/basic/fragments/CameraFragment$Companion$CombinedCaptureResult;", "Ljava/io/Closeable;", "image", "Landroid/media/Image;", "metadata", "Landroid/hardware/camera2/CaptureResult;", "orientation", "", "format", "(Landroid/media/Image;Landroid/hardware/camera2/CaptureResult;II)V", "getFormat", "()I", "getImage", "()Landroid/media/Image;", "getMetadata", "()Landroid/hardware/camera2/CaptureResult;", "getOrientation", "close", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class CombinedCaptureResult implements java.io.Closeable {
            @org.jetbrains.annotations.NotNull()
            private final android.media.Image image = null;
            @org.jetbrains.annotations.NotNull()
            private final android.hardware.camera2.CaptureResult metadata = null;
            private final int orientation = 0;
            private final int format = 0;
            
            @java.lang.Override()
            public void close() {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.media.Image getImage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.hardware.camera2.CaptureResult getMetadata() {
                return null;
            }
            
            public final int getOrientation() {
                return 0;
            }
            
            public final int getFormat() {
                return 0;
            }
            
            public CombinedCaptureResult(@org.jetbrains.annotations.NotNull()
            android.media.Image image, @org.jetbrains.annotations.NotNull()
            android.hardware.camera2.CaptureResult metadata, int orientation, int format) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.media.Image component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.hardware.camera2.CaptureResult component2() {
                return null;
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int component4() {
                return 0;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @org.jetbrains.annotations.NotNull()
            public final com.example.android.camera2.basic.fragments.CameraFragment.Companion.CombinedCaptureResult copy(@org.jetbrains.annotations.NotNull()
            android.media.Image image, @org.jetbrains.annotations.NotNull()
            android.hardware.camera2.CaptureResult metadata, int orientation, int format) {
                return null;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}