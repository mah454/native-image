package ir.moke.ni;

import java.lang.reflect.Method;

public class MainClass {
    public static void main(String[] args) {
        try {
            Class<?> customServiceClass = Class.forName("ir.moke.ni.CustomService");
            Object instance = customServiceClass.getDeclaredConstructor().newInstance();
            Method sayHelloMethod = customServiceClass.getDeclaredMethod("sayHello", String.class);
            String response = (String) sayHelloMethod.invoke(instance, "Mahdi");
            System.out.println(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
