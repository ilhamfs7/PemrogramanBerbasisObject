// Prototype Interface
interface Prototype {
    Prototype clone();
}

// Concrete Prototype
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public String getName() {
        return name;
    }
}

// Client
public class MainPrototype {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Original");
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();

        System.out.println("Original: " + prototype.getName());
        System.out.println("Cloned: " + clonedPrototype.getName());
    }
}
