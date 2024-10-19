public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson (String first, String last, int total) {
        firstName = first;
        lastName = last;
        totalSales = total;
    }

    public String toString() {
        return lastName + ", " + firstName + " \t" + totalSales;
    }

    public boolean equals (Object other) {
        return (lastName.equals(((Salesperson)other).getLastName())
                && firstName.equals(((Salesperson)other).getFirstName()));
    }

    // Method compareTo untuk membandingkan berdasarkan totalSales, lalu nama
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            // Bandingkan berdasarkan total sales
            return other.totalSales - this.totalSales;  // Urutan dari terbesar ke terkecil
        } else {
            // Jika total sales sama, bandingkan berdasarkan nama belakang
            int lastNameComparison = this.lastName.compareTo(other.lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison;  // Urutkan secara alfabetis
            } else {
                // Jika nama belakang juga sama, bandingkan nama depan
                return this.firstName.compareTo(other.firstName);
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
