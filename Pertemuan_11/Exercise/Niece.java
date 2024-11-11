package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;

public class Niece {
    private String name;
    private int day;
    private int month;
    private Map<Uncle, String> presents;
    private Family family;

    Niece(String name, int day, int month, Family family) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.family = family;
        presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return day + "/" + month;
    }

    public LocalDate getBirthdayAsDate() {
        return LocalDate.of(0, month, day);
    }

    public int clearPresents() {
        int count = presents.size();
        presents.clear();
        return count;
    }

    public void listPresents() {
        System.out.println("Presents for " + name + ":");
        for (Uncle uncle : presents.keySet()) {
            System.out.println(uncle.getName() + " - " + presents.get(uncle));
        }
        for (Uncle uncle : family.getUncles()) {
            if (!presents.containsKey(uncle)) {
                System.out.println(uncle.getName() + " - No present selected");
            }
        }
    }

    public boolean addPresent(Uncle giver, String present) {
        if (presents.containsValue(present)) {
            return false; // Keponakan sudah menerima hadiah yang sama dari paman lain
        }
        presents.put(giver, present);
        return true;
    }
}
