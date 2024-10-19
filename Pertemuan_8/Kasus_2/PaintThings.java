import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Shape deck = new Rectangle("Rectangle", 20.0, 35.0);
        Shape bigBall = new Sphere("Sphere", 15.0);
        Shape tank = new Cylinder("Cylinder", 10, 30);

        double deckAmt = paint.amount(deck), ballAmt = paint.amount(bigBall), tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
