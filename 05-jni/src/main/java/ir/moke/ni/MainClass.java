package ir.moke.ni;

import ir.moke.ni.jni.JniNativeLoader;
import ir.moke.ni.jni.NativeLibrary;

public class MainClass {

    static  {
        JniNativeLoader.load("native-library.so");
    }
    public static void main(String[] args) {
        int result = NativeLibrary.sum(12, 22);
        System.out.println(result);
    }
}
