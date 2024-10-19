import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
//        HardCode
//        Salesperson[] salesStaff = new Salesperson[10];
//
//        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
//        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
//        salesStaff[2] = new Salesperson("James", "Jones", 3000);
//        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
//        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
//        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
//        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
//        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
//        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
//        salesStaff[9] = new Salesperson("Walt", "Smith", 3000);

//        User Input
        Scanner scan = new Scanner(System.in);

        System.out.print("Mau input berapa orang? ");
        int person = scan.nextInt();
        scan.nextLine();
        Salesperson[] salesStaff = new Salesperson[person];
        for (int i = 0; i < person; i++) {
            System.out.print("\nIdentitas orang ke-" + (i + 1));
            System.out.print("\nNama depan : ");
            String namadepan = scan.nextLine();
            System.out.print("Nama belakang : ");
            String namabelakang = scan.nextLine();
            System.out.print("Total sales : ");
            int totalsales = scan.nextInt();
            scan.nextLine();
            salesStaff[i] = new Salesperson(namadepan, namabelakang, totalsales);
        }

        Sorting.insertionShort(salesStaff);
        System.out.println("\nRanking of Sales for the week\n");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
    }
}
