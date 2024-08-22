public class Soal {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1 + angka2);
        System.out.println("Hasil 1 "+ hasil);
    }
}

/**
* Program ini merepresentasikan penjumlahan matematika/aritmatika pada bahasa program java dengan menggunakan tipe data Byte.
* Ketika program ini dijalankan, output yang diberikan akan tidak sesuai dengan apa yang kita harapkan.
* Output yang diharapkan adalah menghasilkan angka 131, tetapi output yang diberikan ketika program ini dijalankan adalah -125.
* Output -125, itu dikarenakan operasi penjumlahan matematika/aritmatika pada program tersebut melebihi ukuran/range maksimal yang dimiliki oleh tipe data Byte, dimana range/ukuran dari tipe data Byte dimulai dari -128 hingga 127.
*/
