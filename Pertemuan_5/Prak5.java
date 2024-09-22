import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent the Program Studi
class Prodi {
    private String namaProdi;
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();
    private List<Dosen> dosenList = new ArrayList<>();
    private List<JadwalKuliah> jadwalList = new ArrayList<>();

    public Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        mahasiswaList.add(mhs);
    }

    public void tambahDosen(Dosen dosen) {
        dosenList.add(dosen);
    }

    public void tambahJadwal(JadwalKuliah jadwal) {
        jadwalList.add(jadwal);
    }

    public List<Dosen> getDosenList() {
        return dosenList;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public List<JadwalKuliah> getJadwalList() {
        return jadwalList;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void tampilkanMahasiswa() {
        System.out.println("Daftar Mahasiswa di Prodi " + namaProdi + ":");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println("Nama: " + mhs.getNama() + ", NIM: " + mhs.getNim());
        }
    }

    public void tampilkanDosen() {
        System.out.println("Daftar Dosen di Prodi " + namaProdi + ":");
        for (Dosen dosen : dosenList) {
            System.out.println("Nama: " + dosen.getNama() + ", Kode Dosen: " + dosen.getKodedosen());
        }
    }

    public void tampilkanJadwal() {
        System.out.println("Jadwal Kuliah di Prodi " + namaProdi + ":");
        for (JadwalKuliah jadwal : jadwalList) {
            System.out.println("Mata Kuliah: " + jadwal.getMatakuliah().getNamamk() +
                    ", Dosen: " + jadwal.getDosen().getNama() +
                    ", Hari: " + jadwal.getHari() +
                    ", Ruangan: " + jadwal.getRuangan() +
                    ", Jam: " + jadwal.getJamke());
        }
    }
}

// General Class for Civitas Akademik
abstract class CivitasAkademik {
    protected String nama;

    public CivitasAkademik(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

// Specialized Class for Dosen
class Dosen extends CivitasAkademik {
    private String kodedosen;

    public Dosen(String nama, String kodedosen) {
        super(nama);
        this.kodedosen = kodedosen;
    }

    public String getKodedosen() {
        return kodedosen;
    }
}

// Specialized Class for Mahasiswa
class Mahasiswa extends CivitasAkademik {
    private String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
}

// Class for JadwalKuliah
class JadwalKuliah {
    private String hari;
    private int jamke;
    private String ruangan;
    private Matakuliah matakuliah;
    private Dosen dosen;

    public JadwalKuliah(String hari, int jamke, String ruangan, Matakuliah matakuliah, Dosen dosen) {
        this.hari = hari;
        this.jamke = jamke;
        this.ruangan = ruangan;
        this.matakuliah = matakuliah;
        this.dosen = dosen;
    }

    public String getHari() {
        return hari;
    }

    public int getJamke() {
        return jamke;
    }

    public String getRuangan() {
        return ruangan;
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }
}

// Class for Matakuliah
class Matakuliah {
    private String namamk;

    public Matakuliah(String namamk) {
        this.namamk = namamk;
    }

    public String getNamamk() {
        return namamk;
    }
}

public class Prak5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Creating Prodi object
        Prodi prodi = new Prodi("D3 Teknik Informatika");

        // Adding Mahasiswa
        prodi.tambahMahasiswa(new Mahasiswa("Muammar", "052"));
        prodi.tambahMahasiswa(new Mahasiswa("Ilham", "053"));
        prodi.tambahMahasiswa(new Mahasiswa("Azzam", "054"));
        prodi.tambahMahasiswa(new Mahasiswa("Raihan", "055"));
        prodi.tambahMahasiswa(new Mahasiswa("Nalendra", "056"));
        prodi.tambahMahasiswa(new Mahasiswa("Nazla", "057"));
        prodi.tambahMahasiswa(new Mahasiswa("Nino", "058"));
        prodi.tambahMahasiswa(new Mahasiswa("Akmal", "059"));
        prodi.tambahMahasiswa(new Mahasiswa("Farrel", "060"));
        prodi.tambahMahasiswa(new Mahasiswa("Radja", "061"));

        // Adding Dosen
        prodi.tambahDosen(new Dosen("Yudi Widhiyasana", "KO013N"));
        prodi.tambahDosen(new Dosen("Santi Sundari", "KO009N"));
        prodi.tambahDosen(new Dosen("Trisna Gelar A", "KO078N"));
        prodi.tambahDosen(new Dosen("Ade Hodijah", "KO060N"));
        prodi.tambahDosen(new Dosen("Muhammad Rizki S", "KO074N"));
        prodi.tambahDosen(new Dosen("Ade Chandra N", "KO001N"));
        prodi.tambahDosen(new Dosen("Zulkifli Arsyad", "KO061N"));
        prodi.tambahDosen(new Dosen("Siti Dwi S", "KO075N"));
        prodi.tambahDosen(new Dosen("Yadhi Aditya P", "KO052N"));
        prodi.tambahDosen(new Dosen("Bambang Wisnuadhi", "KO003N"));

        // Adding MataKuliah
        Matakuliah mk1 = new Matakuliah("Komputer Grafik (TE)");
        Matakuliah mk2 = new Matakuliah("Pengantar Rekayasa Perangkat Lunak (TE)");
        Matakuliah mk3 = new Matakuliah("Komputer Grafik (PR)");
        Matakuliah mk4 = new Matakuliah("Basis Data (PR)");
        Matakuliah mk5 = new Matakuliah("Aljabar Linear (TE)");
        Matakuliah mk6 = new Matakuliah("Proyek 3: Pengembangan Perangkat Lunak Berbasis Web (TE)");
        Matakuliah mk7 = new Matakuliah("Basis Data (TE)");
        Matakuliah mk8 = new Matakuliah("Pemrograman Berbasis Objek (TE)");
        Matakuliah mk9 = new Matakuliah("Pemrograman Berbasis Objek (PR)");
        Matakuliah mk10 = new Matakuliah("Matematika Diskrit II (TE)");
        Matakuliah mk11 = new Matakuliah("Pengantar Rekayasa Perangkat Lunak (PR)");

        // Adding Jadwal
        prodi.tambahJadwal(new JadwalKuliah("Senin", 3, "D105-Kelas", mk1, prodi.getDosenList().get(0)));
        prodi.tambahJadwal(new JadwalKuliah("Senin", 5, "D105-Kelas", mk2, prodi.getDosenList().get(1)));
        prodi.tambahJadwal(new JadwalKuliah("Senin", 7, "D102-Lab. MT", mk3, prodi.getDosenList().get(2)));
        prodi.tambahJadwal(new JadwalKuliah("Selasa", 1, "D106-Lab. SDB", mk4, prodi.getDosenList().get(3)));
        prodi.tambahJadwal(new JadwalKuliah("Selasa", 7, "D101-Kelas", mk5, prodi.getDosenList().get(4)));
        prodi.tambahJadwal(new JadwalKuliah("Rabu", 1, "D116-Lab. PjBL-2", mk6, prodi.getDosenList().get(9)));
        prodi.tambahJadwal(new JadwalKuliah("Kamis", 1, "D105-Kelas", mk7, prodi.getDosenList().get(5)));
        prodi.tambahJadwal(new JadwalKuliah("Kamis", 3, "D105-Kelas", mk8, prodi.getDosenList().get(6)));
        prodi.tambahJadwal(new JadwalKuliah("Kamis", 5, "D116-Lab. PjBL-2", mk9, prodi.getDosenList().get(6)));
        prodi.tambahJadwal(new JadwalKuliah("Kamis", 8, "D108-Kelas", mk10, prodi.getDosenList().get(7)));
        prodi.tambahJadwal(new JadwalKuliah("Jumat", 2, "D116-Lab. PjBL-2", mk11, prodi.getDosenList().get(8)));

        // Displaying Data
        prodi.tampilkanMahasiswa();
        prodi.tampilkanDosen();
        prodi.tampilkanJadwal();

//        Fitur Menu:
//
//        // List of Prodi
//        List<Prodi> prodiList = new ArrayList<>();
//
//        while (true) {
//            System.out.println("\n===== Menu =====");
//            System.out.println("1. Tambah Prodi");
//            System.out.println("2. Tambah Mahasiswa");
//            System.out.println("3. Tambah Dosen");
//            System.out.println("4. Tambah Jadwal");
//            System.out.println("5. Tampilkan Semua Data Mahasiswa");
//            System.out.println("6. Tampilkan Semua Data Dosen");
//            System.out.println("7. Tampilkan Jadwal Kuliah");
//            System.out.println("8. Keluar");
//            System.out.print("Pilih opsi: ");
//            int pilihan = scan.nextInt();
//            scan.nextLine(); // Consume newline
//
//            if (pilihan == 1) {
//                System.out.print("Masukkan nama prodi: ");
//                String namaProdi = scan.nextLine();
//                prodiList.add(new Prodi(namaProdi));
//                System.out.println("Prodi berhasil ditambahkan!");
//            } else if (pilihan == 2) {
//                if (prodiList.isEmpty()) {
//                    System.out.println("Belum ada prodi yang ditambahkan!");
//                } else {
//                    System.out.print("Masukkan nama mahasiswa: ");
//                    String nama = scan.nextLine();
//                    System.out.print("Masukkan NIM: ");
//                    String nim = scan.nextLine();
//                    System.out.println("Pilih Prodi:");
//                    for (int i = 0; i < prodiList.size(); i++) {
//                        System.out.println(i + 1 + ". " + prodiList.get(i).getNamaProdi());
//                    }
//                    int prodiIndex = scan.nextInt() - 1;
//                    scan.nextLine();
//                    prodiList.get(prodiIndex).tambahMahasiswa(new Mahasiswa(nama, nim));
//                    System.out.println("Mahasiswa berhasil ditambahkan!");
//                }
//            } else if (pilihan == 3) {
//                if (prodiList.isEmpty()) {
//                    System.out.println("Belum ada prodi yang ditambahkan!");
//                } else {
//                    System.out.print("Masukkan nama dosen: ");
//                    String nama = scan.nextLine();
//                    System.out.print("Masukkan kode dosen: ");
//                    String kodeDosen = scan.nextLine();
//                    System.out.println("Pilih Prodi:");
//                    for (int i = 0; i < prodiList.size(); i++) {
//                        System.out.println(i + 1 + ". " + prodiList.get(i).getNamaProdi());
//                    }
//                    int prodiIndex = scan.nextInt() - 1;
//                    scan.nextLine();
//                    prodiList.get(prodiIndex).tambahDosen(new Dosen(nama, kodeDosen));
//                    System.out.println("Dosen berhasil ditambahkan!");
//                }
//            } else if (pilihan == 4) {
//                if (prodiList.isEmpty()) {
//                    System.out.println("Belum ada prodi yang ditambahkan!");
//                } else {
//                    System.out.print("Masukkan hari: ");
//                    String hari = scan.nextLine();
//                    System.out.print("Masukkan jam ke: ");
//                    int jamke = scan.nextInt();
//                    scan.nextLine();
//                    System.out.print("Masukkan ruangan: ");
//                    String ruangan = scan.nextLine();
//                    System.out.print("Masukkan nama mata kuliah: ");
//                    String namaMk = scan.nextLine();
//                    Matakuliah matakuliah = new Matakuliah(namaMk);
//
//                    System.out.println("Pilih Dosen:");
//                    for (int i = 0; i < prodiList.size(); i++) {
//                        System.out.println(i + 1 + ". " + prodiList.get(i).getNamaProdi());
//                    }
//                    int prodiIndex = scan.nextInt() - 1;
//                    scan.nextLine();
//
//                    List<Dosen> dosenList = prodiList.get(prodiIndex).getDosenList();
//                    if (dosenList.isEmpty()) {
//                        System.out.println("Belum ada dosen di prodi ini.");
//                    } else {
//                        for (int i = 0; i < dosenList.size(); i++) {
//                            System.out.println(i + 1 + ". " + dosenList.get(i).getNama());
//                        }
//                        int dosenIndex = scan.nextInt() - 1;
//                        scan.nextLine();
//                        Dosen dosen = dosenList.get(dosenIndex);
//
//                        JadwalKuliah jadwal = new JadwalKuliah(hari, jamke, ruangan, matakuliah, dosen);
//                        prodiList.get(prodiIndex).tambahJadwal(jadwal);
//                        System.out.println("Jadwal berhasil ditambahkan!");
//                    }
//                }
//            } else if (pilihan == 5) {
//                if (prodiList.isEmpty()) {
//                    System.out.println("Belum ada prodi yang ditambahkan!");
//                } else {
//                    System.out.println("Pilih Prodi:");
//                    for (int i = 0; i < prodiList.size(); i++) {
//                        System.out.println(i + 1 + ". " + prodiList.get(i).getNamaProdi());
//                    }
//                    int prodiIndex = scan.nextInt() - 1;
//                    scan.nextLine();
//                    prodiList.get(prodiIndex).tampilkanMahasiswa();
//                }
//            } else if (pilihan == 6) {
//                if (prodiList.isEmpty()) {
//                    System.out.println("Belum ada prodi yang ditambahkan!");
//                } else {
//                    System.out.println("Pilih Prodi:");
//                    for (int i = 0; i < prodiList.size(); i++) {
//                        System.out.println(i + 1 + ". " + prodiList.get(i).getNamaProdi());
//                    }
//                    int prodiIndex = scan.nextInt() - 1;
//                    scan.nextLine();
//                    prodiList.get(prodiIndex).tampilkanDosen();
//                }
//            } else if (pilihan == 7) {
//                if (prodiList.isEmpty()) {
//                    System.out.println("Belum ada prodi yang ditambahkan!");
//                } else {
//                    System.out.println("Pilih Prodi:");
//                    for (int i = 0; i < prodiList.size(); i++) {
//                        System.out.println(i + 1 + ". " + prodiList.get(i).getNamaProdi());
//                    }
//                    int prodiIndex = scan.nextInt() - 1;
//                    scan.nextLine();
//                    prodiList.get(prodiIndex).tampilkanJadwal();
//                }
//            } else if (pilihan == 8) {
//                System.out.println("Terima kasih telah menggunakan program ini!");
//                break;
//            } else {
//                System.out.println("Pilihan tidak valid, silakan coba lagi.");
//            }
//        }
//
//        scan.close();
    }
}
