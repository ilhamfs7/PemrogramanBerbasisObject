import java.util.Scanner;

public class Prak3Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input kata-katamu kawan :");
        String kalimat = scan.nextLine();
        int banyakkata = kalimat.split("[^A-Za-z]+").length;
        System.out.println("Banyak Kata di kalimat kamu yaitu \n" + banyakkata);

        String[] kataperkata = kalimat.split("[^A-Za-z]+");
        for (String kata : kataperkata) {
            System.out.println(kata);
        }
    }
}