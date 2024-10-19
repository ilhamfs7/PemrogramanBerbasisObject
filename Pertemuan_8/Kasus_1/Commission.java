public class Commission extends Hourly {
    double totalSales;
    double commissionrate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionrate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionrate = commissionrate;
        this.totalSales = 0.0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        // Hitung gaji berdasarkan jam kerja
        double basePay = super.pay();
        // Hitung komisi
        double commissionPay = commissionrate * totalSales;
        // Set totalSales kembali ke 0
        totalSales = 0;
        // Kembalikan total gaji (gaji pokok + komisi)
        return basePay + commissionPay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
