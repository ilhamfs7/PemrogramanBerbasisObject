public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return Math.PI * radius * radius * 2 * height;
    }

    @Override
    public String toString() {
        return super.toString() + " of width " + radius + " of length " + height;
    }
}
