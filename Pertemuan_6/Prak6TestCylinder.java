import java.lang.String;

public class Prak6TestCylinder { // save as "TestCylinder.java"
    public static void main (String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Prak6Cylinder c1 = new Prak6Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume()
                + " color=" + c1.getColor());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Prak6Cylinder c2 = new Prak6Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume()
                + " color=" + c2.getColor());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Prak6Cylinder c3 = new Prak6Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume()
                + " color=" + c3.getColor());

        Prak6Cylinder c4 = new Prak6Cylinder(2.0, 10.0, "purple");
        System.out.println("Cylinder:"
                + " radius=" + c4.getRadius()
                + " height=" + c4.getHeight()
                + " base area=" + c4.getArea()
                + " volume=" + c4.getVolume()
                + " color=" + c4.getColor());
        c4.setColor("blue");
        System.out.println("new color" + c4.getColor());

    }
}