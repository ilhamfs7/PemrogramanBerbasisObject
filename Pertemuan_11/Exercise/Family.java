package Exercise;

import java.util.*;

public class Family {
    private Map<String, Uncle> uncles;
    private List<Niece> nieces;

    public Family() {
        uncles = new TreeMap<>();
        nieces = new ArrayList<>();
    }

    public boolean addNiece(String name, int day, int month) {
        // Periksa apakah nama keponakan sudah ada
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return false;
            }
        }
        // Tambahkan keponakan baru dan urutkan berdasarkan tanggal lahir
        Niece newNiece = new Niece(name, day, month, this);
        nieces.add(newNiece);
        nieces.sort(Comparator.comparing(Niece::getBirthdayAsDate));
        return true;
    }

    public boolean addUncle(String name) {
        if (uncles.containsKey(name)) {
            return false;
        }
        // Buat objek Uncle dengan referensi ke Family
        uncles.put(name, new Uncle(name, this));
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        return uncles.get(name);
    }

    public void listNieces() {
        for (Niece niece : nieces) {
            System.out.println(niece.getName() + " - Birthday: " + niece.getBirthday());
        }
    }

    public void listUncles() {
        for (Uncle uncle : uncles.values()) {
            System.out.println(uncle.getName());
        }
    }

    public Collection<Niece> getNieces() {
        return nieces;
    }

    public Collection<Uncle> getUncles() {
        return uncles.values();
    }
}
