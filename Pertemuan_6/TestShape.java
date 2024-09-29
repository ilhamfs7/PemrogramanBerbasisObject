public class TestShape {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.setColor("Dark Blue");
        shape.setFilled(false);
        System.out.println("This shape have " + shape.getColor() + " color, and its " + shape.isFilled() + " filled");

        Shape shape1 = new Shape();
        System.out.println("This shape have " + shape1.getColor() + " color, and its " + shape1.isFilled() + " filled");
    }
}
