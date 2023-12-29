package ir.moke.ni.lib;

import org.graalvm.nativeimage.IsolateThread;
import org.graalvm.nativeimage.c.function.CEntryPoint;

public class HelloWorld {
    @CEntryPoint(name = "sayHello")
    public static void sayHello(IsolateThread thread) {
        System.out.println("Hello dear");
    }
}
