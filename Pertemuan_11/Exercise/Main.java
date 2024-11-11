package Exercise;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        // Menambah paman dan keponakan
        family.addUncle("Albert");
        family.addUncle("Bill");
        family.addNiece("Amy", 15, 6);
        family.addNiece("Beatrice", 12, 11);

        // Menambahkan hadiah
        Uncle albert = family.findUncle("Albert");
        Niece amy = family.findNiece("Amy");

        albert.addPresent(amy, "The Wonder of Computers");

        // Menampilkan daftar paman dan keponakan
        family.listUncles();
        family.listNieces();

        // Menampilkan hadiah
        albert.listPresents();
        amy.listPresents();
    }
}