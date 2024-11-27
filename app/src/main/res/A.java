
    // Import the Firebase BoM (see: https://firebase.google.com/docs/android/learn-more#bom)
    implementation(platform("com.google.firebase:firebase-bom:33.6.0"))

    // Firestore
    implementation("com.google.firebase:firebase-firestore-ktx")

    // Other Firebase/Play services deps
    implementation("com.google.firebase:firebase-auth-ktx")

    // Pinned to 20.7.0 as a workaround for issue https://github.com/firebase/quickstart-android/issues/1647
    implementation("com.google.android.gms:play-services-auth:20.7.0")

    // FirebaseUI (for authentication)
    implementation("com.firebaseui:firebase-ui-auth:8.0.2")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    annotationProcessor("androidx.lifecycle:lifecycle-compiler:2.8.7")

    // Third-party libraries
    implementation("me.zhanghai.android.materialratingbar:library:1.4.0")
    implementation("com.github.bumptech.glide:glide:4.16.0")
