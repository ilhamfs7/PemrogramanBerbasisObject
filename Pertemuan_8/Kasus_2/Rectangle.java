public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String shapeName, double widht, double length) {
        super("Rectangle");
        this.width = widht;
        this.length = length;
    }

    @Override
    double area() {
        return width * length;
    }

    @Override
    public String toString() {
        return super.toString() + " of width " + width + " of length " + length;
    }
}
