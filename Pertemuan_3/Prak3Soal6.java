import java.math.BigInteger;
import java.util.Scanner;

public class Prak3Soal6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input angka A (Maks. 200 digit) :");
        BigInteger a = scan.nextBigInteger().abs();
        System.out.print("Input angka B (Maks. 200 digit) :");
        BigInteger b = scan.nextBigInteger().abs();

        System.out.println(a.add(b));
        System.out.print(a.multiply(b));
    }
}

// Program ini menerapkan bagaimana variable bertipe data BigInteger dikenakan operasi layaknya variable tipe data integer dengan menggunakan fungsi yang ada pada 
// tipe data BigInteger itu sendiri
