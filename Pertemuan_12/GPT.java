import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPT extends JFrame implements ActionListener {
    private JTextField namaField, alamatField, telpField;
    private JCheckBox steakBox, spaghettiBox, pizzaBox;
    private JLabel totalBayarLabel;
    private JTextArea dataPenjualanArea;
    private JButton tambahButton;
    private int totalBayar;

    public GPT() {
        setTitle("Aplikasi Pemesanan Makanan");
        setSize(450, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Panel Judul
        JLabel titleLabel = new JLabel("APLIKASI PEMESANAN", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(10, 5, 430, 30);
        add(titleLabel);

        // Panel Data Customer
        JPanel panelCustomer = new JPanel();
        panelCustomer.setLayout(null);
        panelCustomer.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        panelCustomer.setBounds(10, 30, 200, 130);
        add(panelCustomer);

        JLabel namaLabel = new JLabel("Nama:");
        namaLabel.setBounds(10, 20, 80, 25);
        panelCustomer.add(namaLabel);

        namaField = new JTextField();
        namaField.setBounds(90, 20, 100, 25);
        panelCustomer.add(namaField);

        JLabel alamatLabel = new JLabel("Alamat:");
        alamatLabel.setBounds(10, 50, 80, 25);
        panelCustomer.add(alamatLabel);

        alamatField = new JTextField();
        alamatField.setBounds(90, 50, 100, 25);
        panelCustomer.add(alamatField);

        JLabel telpLabel = new JLabel("No Telp:");
        telpLabel.setBounds(10, 80, 80, 25);
        panelCustomer.add(telpLabel);

        telpField = new JTextField();
        telpField.setBounds(90, 80, 100, 25);
        panelCustomer.add(telpField);

        // Panel Pilih Menu
        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));
        panelMenu.setBounds(220, 30, 200, 130);
        add(panelMenu);

        steakBox = new JCheckBox("Steak (Rp20000)");
        steakBox.setBounds(10, 20, 160, 25);
        panelMenu.add(steakBox);

        spaghettiBox = new JCheckBox("Spagheti(Rp15000)");
        spaghettiBox.setBounds(10, 50, 160, 25);
        panelMenu.add(spaghettiBox);

        pizzaBox = new JCheckBox("Pizza(Rp30000)");
        pizzaBox.setBounds(10, 80, 160, 25);
        panelMenu.add(pizzaBox);

        // Label Total Bayar
        JLabel totalLabel = new JLabel("TOTAL BAYAR");
        totalLabel.setBounds(220, 160, 100, 25);
        add(totalLabel);

        totalBayarLabel = new JLabel("0");
        totalBayarLabel.setFont(new Font("Arial", Font.BOLD, 20));
        totalBayarLabel.setBounds(220, 190, 150, 25);
        add(totalBayarLabel);

        // Tombol Tambah
        tambahButton = new JButton("TAMBAH");
        tambahButton.setBounds(330, 160, 80, 20);
        tambahButton.addActionListener(this);
        add(tambahButton);

        // Area Data Penjualan
        dataPenjualanArea = new JTextArea();
        dataPenjualanArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(dataPenjualanArea);
        scrollPane.setBounds(10, 220, 410, 230);
        add(scrollPane);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton) {
            totalBayar = 0;
            StringBuilder pesanan = new StringBuilder("Pesanan : \n");

            if (spaghettiBox.isSelected()) {
                totalBayar += 15000;
                pesanan.append("- Spagheti (15000)\n");
            }
            if (pizzaBox.isSelected()) {
                totalBayar += 30000;
                pesanan.append("- Pizza (30000)\n");
            }
            if (steakBox.isSelected()) {
                totalBayar += 20000;
                pesanan.append("- Steak (20000)\n");
            }

            totalBayarLabel.setText("Rp. " + totalBayar);

            // Menampilkan data pesanan ke area teks
            String customerData = "Nama: " + namaField.getText() + "\n" +
                    "Alamat: " + alamatField.getText() + "\n" +
                    "Telp : " + telpField.getText() + "\n" +
                    "-------------------------------------\n" +
                    pesanan.toString() +
                    "-------------------------------------\n" +
                    "Total Bayar : Rp. " + totalBayar + "\n\n";
            dataPenjualanArea.append(customerData);
        }
    }

    public static void main(String[] args) {
        new GPT();
    }
}