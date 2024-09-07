import java.util.Scanner;

public class Prak3Soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mau berapa kali input data bro? ");
        int ulang = scan.nextInt();
        String[] ArrKata = new String[ulang];
        String[] ArrAngka = new String[ulang];
        for (int i = 0; i < ulang; i++) {
            boolean terpenuhi = false;
            while(!terpenuhi) {
                System.out.print("Input 1 kata (Maks. 10 huruf) + 1 susunan angka (Rentang susunan angka 0-999) :");
                String kata = scan.next();
                String angka = scan.next();
                int panjangkata = kata.length();
                int panjangangka = angka.length();
                if (panjangkata < 10 && panjangangka <= 3) {
                    terpenuhi = true;
                    ArrKata[i] = kata;
                    ArrAngka[i] = angka;
                } else if (panjangkata > 10 || panjangangka > 3) {
                    System.out.print("Panjang kata atau angka inputan kamu tidak sesuai aturan, ulangi ya!");
                    terpenuhi = false;
                }
            }
        }
        System.out.println("====================");
        for (int i = 0; i < ulang; i++) {
            System.out.printf("%-15s %03d\n", ArrKata[i], Integer.parseInt(ArrAngka[i]));
        }
        System.out.println("====================");
    }
}

// Program ini akan memberikan sebuah output layaknya sebuah tabel dengan memanfaatkan fungsi printf yang sudah lazim ditemui pada bahasa C
