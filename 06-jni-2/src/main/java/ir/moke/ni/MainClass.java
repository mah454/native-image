package ir.moke.ni;

import ir.moke.ni.jni.NativeLibrary;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(NativeLibrary.sum(12, 22));
    }
}
