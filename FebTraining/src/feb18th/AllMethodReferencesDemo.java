package feb18th;

import java.util.function.*;
import java.util.*;

class MethodReferenceExample {

    // 1️⃣ Static method
    static void staticMethod() {
        System.out.println("Static Method Reference");
    }

    // 2️⃣ Instance method
    void instanceMethod() {
        System.out.println("Instance Method Reference");
    }

    // 4️⃣ Constructor
    MethodReferenceExample() {
        System.out.println("Constructor Reference");
    }
}

public class AllMethodReferencesDemo {

    public static void main(String[] args) {

        // 1️⃣ Static Method Reference
        Runnable r1 = MethodReferenceExample::staticMethod;
        r1.run();

        // 2️⃣ Instance Method Reference (object)
        MethodReferenceExample obj = new MethodReferenceExample();
        Runnable r2 = obj::instanceMethod;
        r2.run();

        // 3️⃣ Instance Method Reference (arbitrary object)
        List<String> list = Arrays.asList("java", "spring", "microservices");
        list.forEach(String::toUpperCase);
        list.forEach(System.out::println);

        // 4️⃣ Constructor Reference
        Supplier<MethodReferenceExample> s =
                MethodReferenceExample::new;
        s.get();
    }
}
