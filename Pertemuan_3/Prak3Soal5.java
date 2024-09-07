import java.util.Scanner;

public class Prak3Soal5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input 4 buah plat nomor yang terdiri dari 4 digit angka dan dipisahkan dengan spasi:");
        String plat = scan.nextLine();
        String gabung = plat.replaceAll(" ", "");
        long putusan = (Long.parseLong(gabung)-999999) % 5;
        if (putusan == 0) {
            System.out.print("Berhenti");
        } else {
            System.out.print("Jalan");
        }
    }
}

// Program ini menerapkan sebuah sistem buka tutup jalan dengan mengandalkan sebuah operasi matematika yang dikenakan pada 4 plat nomor yang berbeda
