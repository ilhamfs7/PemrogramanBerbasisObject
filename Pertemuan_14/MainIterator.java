import java.util.ArrayList;
import java.util.Iterator;

// Collection class
class NameRepository implements Iterable<String> {
    private ArrayList<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    @Override
    public Iterator<String> iterator() {
        return names.iterator();
    }
}

// Client
public class MainIterator {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        repository.addName("Alice");
        repository.addName("Bob");
        repository.addName("Charlie");

        for (String name : repository) {
            System.out.println(name);
        }
    }
}