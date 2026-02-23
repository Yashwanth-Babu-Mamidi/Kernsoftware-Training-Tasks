package feb17th;

public class Example6_NestedTry {
    public static void main(String[] args) {

        try {
            System.out.println("Outer Try");

            try {
                int a = 10 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println("Inner Catch");
            }

        }
        catch (Exception e) {
            System.out.println("Outer Catch");
        }
    }
}