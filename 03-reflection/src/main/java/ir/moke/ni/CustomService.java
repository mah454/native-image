package ir.moke.ni;

public class CustomService {
    public String sayHello(String name) {
        return "Hello %s".formatted(name);
    }
}
