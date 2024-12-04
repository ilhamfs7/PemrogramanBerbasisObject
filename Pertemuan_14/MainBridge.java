// Abstraction
abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}

// Implementor
interface DrawingAPI {
    void drawCircle(double radius, double x, double y);
}

// Concrete Implementor
class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double radius, double x, double y) {
        System.out.println("Drawing API1: Circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// Concrete Implementor
class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double radius, double x, double y) {
        System.out.println("Drawing API2: Circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// Refined Abstraction
class Circle extends Shape {
    private double radius;
    private double x, y;

    public Circle(DrawingAPI drawingAPI, double radius, double x, double y) {
        super(drawingAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(radius, x, y);
    }
}

// Client
public class MainBridge {
    public static void main(String[] args) {
        Shape circle1 = new Circle(new DrawingAPI1(), 5.0, 1.0, 2.0);
        Shape circle2 = new Circle(new DrawingAPI2(), 10.0, 3.0, 4.0);

        circle1.draw();
        circle2.draw();
    }
}
