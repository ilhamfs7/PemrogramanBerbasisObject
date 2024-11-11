package Exercise;

import java.util.HashMap;
import java.util.Map;

public class Uncle {
    private String name;
    private Map<Niece, String> presents;
    private Family family;

    Uncle(String name, Family family) {
        this.name = name;
        this.family = family;
        presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsValue(description)) {
            return false; // Paman tidak bisa memberikan hadiah yang sama kepada keponakan lain
        }
        if (!recipient.addPresent(this, description)) {
            return false; // Keponakan sudah menerima hadiah yang sama dari paman lain
        }
        presents.put(recipient, description);
        return true;
    }

    public void listPresents() {
        System.out.println("Presents from Uncle " + name + ":");
        for (Niece niece : presents.keySet()) {
            System.out.println(niece.getName() + " - " + presents.get(niece));
        }
        for (Niece niece : family.getNieces()) {
            if (!presents.containsKey(niece)) {
                System.out.println(niece.getName() + " - No present selected");
            }
        }
    }
}
