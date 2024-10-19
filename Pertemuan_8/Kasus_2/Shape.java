public abstract class Shape {
    protected String shapeName;
    abstract double area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return "Nama bentuknya adalah " + shapeName;
    }
}
