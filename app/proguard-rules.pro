# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /home/shyam/Android/Sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#JS Interface
-keep public class com.noshadez.mintubeappdark.JavaScriptInterface
-keep public class * implements com.noshadez.mintubeappdark.JavaScriptInterface
-keepclassmembers class com.noshadez.mintubeappdark.JavaScriptInterface {
    <methods>;
}
#For crashlytics in fabric
-keepattributes SourceFile,LineNumberTable,*Annotation*
-keep public class * extends java.lang.Exception
-printmapping mapping.txt
#For SearchView
-keep class android.support.v7.widget.SearchView { *; }
