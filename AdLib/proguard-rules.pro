# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keep @com.qihoo.SdkProtected.yqsdk.Keep class **{*;}
-keep,allowobfuscation @interface com.qihoo.SdkProtected.yqsdk.Keep
-keep class com.zues.** { *; }

-keep class javax.** {*;}
-keep class java.** {*;}
-keep class android.webkit.** {*;}
-keepattributes *JavascriptInterface*

# 保留Serializable序列化的类不被混淆
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keep class android.support.v4.**{
    public *;
}
-keep class android.support.v7.**{
    public *;
}
-keep class android.arch.** {*;}

-dontwarn com.dreamfly.**
-keep class com.dreamfly.**{*;}
-dontwarn bb.vv.**
-keep class bb.vv.**{*;}
-dontwarn com.vv.**
-keep class com.vv.**{*;}
