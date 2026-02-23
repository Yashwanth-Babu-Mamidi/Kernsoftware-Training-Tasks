package feb17th;

public class Example1_ExceptionIntro {
    public static void main(String[] args) {

        System.out.println("Program Started");

        int a = 10;
        int b = 0;

        int c = a / b;   // ArithmeticException

        System.out.println("Result: " + c);
        System.out.println("Program Ended");
    }
}