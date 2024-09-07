import java.util.Scanner;

public class Prak3Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] pisah = new String[3];
        boolean ulangi = false;
        while(!ulangi) {
            System.out.println("Input angka A (spasi) Operator Matematika (spasi) angka B");
            String mtk = scan.nextLine();
            pisah = mtk.split(" ");
            if (Integer.parseInt(pisah[0]) < 1 || Integer.parseInt(pisah[2]) < 1 || Integer.parseInt(pisah[0]) > 1000 || Integer.parseInt(pisah[2]) > 1000) {
                System.out.println("Maaf, batas inputan angka A atau angka B adalah pada rentang 1 - 1000 saja, ulangi ya!\n");
                ulangi = false;
            } else {
                ulangi = true;
            }
        }
        switch(pisah[1]) {
            case "+":
                System.out.print("Hasil akhir : " + (Integer.parseInt(pisah[0]) + Integer.parseInt(pisah[2])));
                break;
            case "-":
                System.out.print("Hasil akhir : " + (Integer.parseInt(pisah[0]) - Integer.parseInt(pisah[2])));
                break;
            case "*":
                System.out.print("Hasil akhir : " + (Integer.parseInt(pisah[0]) * Integer.parseInt(pisah[2])));
                break;
            case "/":
                System.out.print("Hasil akhir : " + (Integer.parseInt(pisah[0]) / Integer.parseInt(pisah[2])));
                break;
            case "%":
                System.out.print("Hasil akhir : " + (Integer.parseInt(pisah[0]) % Integer.parseInt(pisah[2])));
                break;
        }
    }
}

// Program ini akan melakukan sebuah operator matematika dengan menyesuaikannya terhadap inputan operator yang dilakukan oleh user
