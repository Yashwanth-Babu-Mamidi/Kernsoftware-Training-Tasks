package feb9th;

class Employee {
    String name;
    double salary;

    void displayDetails() {
        System.out.println(name + " - " + salary);
    }
}

class Developer extends Employee {
    Developer() {
        name = "Dev";
        salary = 60000;
    }
}

class Manager extends Employee {
    Manager() {
        name = "Manager";
        salary = 90000;
    }
}

class Test {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.displayDetails();
    }
}
