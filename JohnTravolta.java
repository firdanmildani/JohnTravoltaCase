import java.util.Scanner;

public class JohnTravolta {
    public static void main(String args[]) {
        double gaji_normal;
        double gaji_perjam;
        double gaji_lembur;
        int jam_kerja;
        int jam_kerja_normal;
        int jam_lembur;
        double gaji_total;
        double pengeluaran;
        double tabungan;

        System.out.println("Menghitung Jumlah Gaji & Tabungan John Travolta");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jam Kerja        : ");
        jam_kerja = input.nextInt();
        input.close();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukan Gaji Perjam        : ");
        gaji_perjam = input1.nextDouble();
        input1.close();

        if (jam_kerja > 40) {
            jam_lembur = jam_kerja - 40;
            jam_kerja_normal = jam_kerja - jam_lembur;

            gaji_normal = jam_kerja_normal * gaji_perjam;
            gaji_lembur = (int) (jam_lembur * 1.5 * gaji_perjam);

            gaji_total = gaji_lembur + gaji_normal;

        }

        else {
            gaji_normal = gaji_perjam * jam_kerja;
            gaji_total = gaji_normal;
        }

        System.out.println("Jadi Gaji Total John Travolta Sebesar = " + gaji_total);

        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukan Pengeluaran        : ");
        pengeluaran = input2.nextDouble();
        input2.close();

        if (gaji_total > pengeluaran) {
            tabungan = gaji_total - pengeluaran;
            System.out.println("Bisa menabung sebanyak = " + tabungan);
        } else if (gaji_total == pengeluaran) {
            System.out.println("Tidak bisa menabung");
        } else {
            System.out.println("Cari tambahan");
        }
    }
}
