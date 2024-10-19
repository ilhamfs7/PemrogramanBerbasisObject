// Abstract Class Dokumen
abstract class Dokumen {
    protected String judul;
    protected String penulis;
    protected int tahunPublikasi;

    public Dokumen(String judul, String penulis, int tahunPublikasi) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunPublikasi = tahunPublikasi;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunPublikasi() {
        return tahunPublikasi;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
}

// Interface Downloadable
interface Downloadable {
    void download();
}

// Concrete class EBook that extends Dokumen and implements Downloadable
class EBook extends Dokumen implements Downloadable {
    private String formatFile;

    public EBook(String judul, String penulis, int tahunPublikasi, String formatFile) {
        super(judul, penulis, tahunPublikasi);
        this.formatFile = formatFile;
    }

    public String getFormatFile() {
        return formatFile;
    }

    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + judul + " oleh " + penulis + ", " + tahunPublikasi);
        System.out.println("Format File: " + formatFile);
    }

    @Override
    public void download() {
        System.out.println("Mengunduh e-book: " + judul + " dalam format " + formatFile);
    }
}

// Concrete class Jurnal that extends Dokumen
class Jurnal extends Dokumen {
    private String bidang;

    public Jurnal(String judul, String penulis, int tahunPublikasi, String bidang) {
        super(judul, penulis, tahunPublikasi);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    @Override
    public void displayInfo() {
        System.out.println("Jurnal: " + judul + " oleh " + penulis + ", " + tahunPublikasi);
        System.out.println("Bidang: " + bidang);
    }
}

// Concrete class Artikel that extends Dokumen and implements Downloadable
class Artikel extends Dokumen implements Downloadable {
    private String sumber;

    public Artikel(String judul, String penulis, int tahunPublikasi, String sumber) {
        super(judul, penulis, tahunPublikasi);
        this.sumber = sumber;
    }

    public String getSumber() {
        return sumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Artikel: " + judul + " oleh " + penulis + ", " + tahunPublikasi);
        System.out.println("Sumber: " + sumber);
    }

    @Override
    public void download() {
        System.out.println("Mengunduh artikel: " + judul + " dari sumber " + sumber);
    }
}

// Main class to test the system
public class PerpustakaanDigital {
    public static void main(String[] args) {
        // Membuat objek EBook
        EBook ebook1 = new EBook("Pemrograman Java", "Budi", 2022, "PDF");
        ebook1.displayInfo();
        ebook1.download();

        // Membuat objek Jurnal
        Jurnal jurnal1 = new Jurnal("Teknologi AI", "Siti", 2021, "Kecerdasan Buatan");
        jurnal1.displayInfo();

        // Membuat objek Artikel
        Artikel artikel1 = new Artikel("Tren Teknologi 2024", "Andi", 2024, "TechNews");
        artikel1.displayInfo();
        artikel1.download();
    }
}
