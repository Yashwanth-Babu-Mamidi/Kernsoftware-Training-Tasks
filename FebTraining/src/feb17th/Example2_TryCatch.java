package feb17th;

public class Example2_TryCatch {
    public static void main(String[] args) {

        System.out.println("Program Started");

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program Ended Normally");
    }
}