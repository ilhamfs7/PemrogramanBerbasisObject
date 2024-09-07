public class Pembeli {
    private String Nama;
    private Integer Bayar;
    private String PilihanMakanan;

    public void setNama(String NewNama) {
        Nama = NewNama;
    }

    public String getNama() {
        return Nama;
    }
    public int hitungKembalian(Integer Bayar, String Makanan) {
        Integer harga = Makanan.equals("Nasi Goreng") ? 15000 : 20000;
        return Bayar - harga;
    }

    // Setter untuk Pilihan Makanan
    public void setPilMakanan(String Makanan) {
        PilihanMakanan = Makanan;
    }

    // Getter untuk Pilihan Makanan
    public String getPilMakanan() {
        return PilihanMakanan;
    }
}
