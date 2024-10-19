class Printer {
    void printDocument(String doc) {
        System.out.println("Printing document: " + doc);
    }
}

class Computer {
    void generateDocument(String content) {
        Printer printer = new Printer();  // Dependency: Computer depends on Printer
        printer.printDocument(content);
    }
}

class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine engine;  // Aggregation: Car has an Engine

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {  // Inheritance: Dog inherits from Animal
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Te4Soal1 {
    public static void main(String[] args) {
        // Dependency example
        System.out.println("Dependency Example:");
        Computer comp = new Computer();
        comp.generateDocument("Laporan Mingguan");

        // Aggregation example
        System.out.println("\nAggregation Example:");
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.drive();

        // Inheritance example
        System.out.println("\nInheritance Example:");
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark();  // Dog-specific method
    }
}
