package feb9th;

class Circle implements Shape {
    double radius = 5;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
