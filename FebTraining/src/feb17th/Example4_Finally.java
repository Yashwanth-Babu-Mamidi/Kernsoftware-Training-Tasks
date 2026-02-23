package feb17th;

public class Example4_Finally {
    public static void main(String[] args) {

        try {
            int[] a = {1, 2, 3};
            System.out.println(a[5]);  // ArrayIndexOutOfBoundsException
        }
        catch (Exception e) {
            System.out.println("Exception Handled");
        }
        finally {
            System.out.println("Finally block always executes");
        }
    }
}