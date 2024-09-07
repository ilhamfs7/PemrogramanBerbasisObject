import java.util.Scanner;

public class MainMakanan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pembeli ObjPembeli = new Pembeli();
        Penjual ObjPenjual = new Penjual();
        MenuMakanan ObjMM = new MenuMakanan();

        System.out.println("Nama Pembeli :");
        String NamaPem = scan.next();
        ObjPembeli.setNama(NamaPem);

        System.out.println("Nama Penjual :");
        String NamaPen = scan.next();
        ObjPenjual.setNama(NamaPen);

        ObjMM.Makanan();

        System.out.println("Pilihan Makanan :");
        Integer Pilihan = scan.nextInt();
        String PilMakanan = (Pilihan == 1)?"Nasi Goreng":"Mie Goreng";
        ObjPembeli.setPilMakanan(PilMakanan);
        ObjPenjual.setPesanan(PilMakanan);

        Integer harga = (PilMakanan.equals("Nasi Goreng")) ? 15000 : 20000;
        System.out.println("Pembayaran yang harus anda bayar adalah Rp" + harga);
        System.out.print("Bayar :");
        Integer i = scan.nextInt();
        Integer Kembalian = ObjPembeli.hitungKembalian(i, PilMakanan);

        System.out.println("Nama Pembeli : " + ObjPembeli.getNama());
        System.out.println("Nama Penjual : " + ObjPenjual.getNama());
        System.out.println("Makanan yang Dipesan : " + ObjPembeli.getPilMakanan());
        System.out.println("Kembalian : " + Kembalian);

    }
}

// Program ini adalah contoh penerapan enkapsulasi yang dilakukan dengan menerapkan bagaimana sebuah sistem beli makanan dilakukan. Selain MainMakanan.java; didukung juga dengan program lainnya yaitu MenuMakanan.java; Pembeli.java; Penjual.java
