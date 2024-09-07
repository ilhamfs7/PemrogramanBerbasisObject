import java.util.Scanner;

public class Prak3Soal4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Berapa item yang udah kamu jual :");
        String itemterjual = scan.next();
        int gaji = 0;
        if (Integer.parseInt(itemterjual) >= 40 && Integer.parseInt(itemterjual) < 80) {
            gaji = 500000 + (((Integer.parseInt(itemterjual) * 50000) * 25/100) + ((Integer.parseInt(itemterjual) * 50000) * 10/100));
        } else if (Integer.parseInt(itemterjual) >= 80) {
            gaji = 500000 + (((Integer.parseInt(itemterjual) * 50000) * 35/100) + ((Integer.parseInt(itemterjual) * 50000) * 10/100));
        } else if (Integer.parseInt(itemterjual) < 15) {
            gaji = 500000 - (500000 * 15/100 * (15 - Integer.parseInt(itemterjual))) + ((Integer.parseInt(itemterjual) * 50000) * 10/100);
        } else if (Integer.parseInt(itemterjual) >= 15 && Integer.parseInt(itemterjual) < 40) {
            gaji = 500000 + ((Integer.parseInt(itemterjual) * 50000) * 10/100);
        }
        System.out.print("Gaji kamu bulan ini :" + gaji);
    }
}
