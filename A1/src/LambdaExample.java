// File: LambdaExample.java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression
        Greeting g = (name) -> System.out.println("Hello, " + name + "!");
        g.sayHello("Kishore");
    }
}