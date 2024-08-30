import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inputkan Nilai Tugas :");
        float Tugas = scanner.nextFloat();
        System.out.println("Inputkan Nilai ETS :");
        float ETS = scanner.nextFloat();
        System.out.println("Inputkan Nilai EAS :");
        float EAS = scanner.nextFloat();

        float NilaiAkhir = (Tugas * 20/100) + (ETS * 35/100) + (EAS * 45/100);
        char Indeks = (NilaiAkhir >= 80.00)?'A':(NilaiAkhir < 80.00 && NilaiAkhir >= 75.00)?'B':(NilaiAkhir < 75.00 && NilaiAkhir >= 65.00)?'C':(NilaiAkhir < 65.00 && NilaiAkhir >= 49.00)?'D':'E';
        System.out.println("Nilai AKhir Anda :" +NilaiAkhir);
        System.out.println("Indeks Nilai Anda :" +Indeks);
    }
}
