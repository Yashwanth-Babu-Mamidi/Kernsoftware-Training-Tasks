package feb17th;

public class MemoryAllocationDemo {
    // 1. Method Area: Static variables are stored here
    static int staticValue = 100;

    public static void main(String[] args) {
        // 2. Stack: Local primitives (int) are stored in the stack frame
        int primitiveVar = 10;

        // 3. Heap: Objects created with 'new' are stored i	n the heap
        // Stack: 'personRef' is a reference variable stored in the stack
        Person personRef = new Person("Java User", 25);
		
        // 4. Stack: Calling a method creates a new stack frame
        printDetails(personRef, primitiveVar);
        
        // When main ends, stack frames are cleared, but heap objects 
        // remain until Garbage Collection (GC) reclaims them.
    }

    static void printDetails(Person p, int val) {
        // Stack: Local parameters 'p' (reference) and 'val' (primitive) 
        // are stored in this method's stack frame.
        System.out.println("Name: " + p.name + ", Value: " + val);
    }
}

class Person {
    // Heap: Instance variables are part of the object in the heap
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
