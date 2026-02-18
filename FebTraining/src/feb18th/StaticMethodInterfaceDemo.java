package feb18th;

interface MathUtility {

    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodInterfaceDemo {

    public static void main(String[] args) {

        int result = MathUtility.add(10, 20);
        System.out.println("Addition: " + result);
    }
}
