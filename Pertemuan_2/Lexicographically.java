import java.util.Scanner;

public class Lexicographically {
    public static void main(String[] args) {
        Scanner cek = new Scanner(System.in);

        System.out.print("Input kata pertama :");
        String A = cek.next();
        System.out.print("Input kata kedua :");
        String B = cek.next();

        int Panjang = A.length() + B.length();
        System.out.println(Panjang);
        int Indeks = A.compareTo(B);
        String Lexi =(Indeks == 0)?"NO":"YES";
        System.out.println(Lexi);
        String UpA = A.substring(0,1).toUpperCase() + A.substring(1);
        String UpB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.print(UpA);
        System.out.print(" ");
        System.out.print(UpB);
    }
}
