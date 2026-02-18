package feb18th;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String value = null;

        Optional<String> optional = Optional.ofNullable(value);

        // orElse
        System.out.println("Value: " + optional.orElse("Default Value"));

        // isPresent
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Value not present");
        }
    }
}
