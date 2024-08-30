import java.util.Scanner;

public class Prak2Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mau ngetes total berapa angka :");
        int T = scanner.nextInt();  // Read the number of test cases

        for (int i = 0; i < T; i++) {
            try {
                System.out.print("Angka yang mau dites :");
                long n = scanner.nextLong();  // Read the input integer
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
