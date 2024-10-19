import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] strList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many strings do you want to short? ");
        size = scan.nextInt();
        scan.nextLine();
        strList = new String[size];

        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            strList[i] = scan.nextLine();
        }
        Sorting.insertionShort(strList);
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(strList[i] + " ");
        }
        System.out.println();
    }
}
