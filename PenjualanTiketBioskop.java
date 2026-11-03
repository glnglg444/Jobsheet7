import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlahTiket, totalTiket = 0, pelanggan = 0;
        double diskon, hargaAwal, hargaAkhir, totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk berhenti): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.");
                continue;
            }
            
            if (jumlahTiket == 0) {
                break;
            }

            hargaAwal = jumlahTiket * HARGA_TIKET;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            hargaAkhir = hargaAwal - (hargaAwal * diskon);

            System.out.println("Harga awal  : Rp " + hargaAwal);
            System.out.println("Diskon      : " + (diskon * 100) + "%");
            System.out.println("Total bayar : Rp " + hargaAkhir);
            System.out.println();

            totalTiket += jumlahTiket;
            totalPenjualan += hargaAkhir;
            pelanggan++;
        } while (jumlahTiket != 0);

        System.out.println("=== REKAP PENJUALAN HARI INI ===");
        System.out.println("Jumlah pelanggan    : " + pelanggan);
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
        sc.close();
    }
}