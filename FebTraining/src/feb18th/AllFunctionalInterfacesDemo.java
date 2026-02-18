package feb18th;

import java.util.function.*;

public class AllFunctionalInterfacesDemo {

    public static void main(String[] args) {

        // 1️⃣ Predicate<T>  -> boolean test(T)
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Predicate: " + isEven.test(10));

        // 2️⃣ BiPredicate<T, U> -> boolean test(T, U)
        BiPredicate<Integer, Integer> isSumEven =
                (a, b) -> (a + b) % 2 == 0;
        System.out.println("BiPredicate: " + isSumEven.test(10, 20));

        // 3️⃣ Function<T, R> -> R apply(T)
        Function<String, Integer> stringLength =
                s -> s.length();
        System.out.println("Function: " + stringLength.apply("Java"));

        // 4️⃣ BiFunction<T, U, R> -> R apply(T, U)
        BiFunction<Integer, Integer, Integer> add =
                (a, b) -> a + b;
        System.out.println("BiFunction: " + add.apply(10, 30));

        // 5️⃣ Consumer<T> -> void accept(T)
        Consumer<String> printMsg =
                msg -> System.out.println("Consumer: " + msg);
        printMsg.accept("Hello Java 8");

        // 6️⃣ BiConsumer<T, U> -> void accept(T, U)
        BiConsumer<String, Integer> printNameAge =
                (name, age) -> System.out.println("BiConsumer: " + name + " " + age);
        printNameAge.accept("Yash", 25);

        // 7️⃣ Supplier<T> -> T get()
        Supplier<Double> randomValue =
                () -> Math.random();
        System.out.println("Supplier: " + randomValue.get());

        // 8️⃣ UnaryOperator<T> -> T apply(T)
        UnaryOperator<Integer> square =
                n -> n * n;
        System.out.println("UnaryOperator: " + square.apply(5));
    }
}
