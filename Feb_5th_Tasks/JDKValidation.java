public class JDKValidation {

    public static void main(String[] args) {

        System.out.println("Compilation Successful!");

        System.out.println("Explanation:");
        System.out.println("JDK (Java Development Kit) is required to compile Java code.");
        System.out.println("JRE (Java Runtime Environment) can only run compiled code.");
        System.out.println("JVM (Java Virtual Machine) executes bytecode.");
    }
}

/*
Compilation Flow:
1. javac JDKValidation.java  --> Requires JDK
2. java JDKValidation       --> Uses JRE + JVM
*/
