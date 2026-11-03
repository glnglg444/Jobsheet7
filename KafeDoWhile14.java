import java.util.Scanner;

public class KafeDoWhile14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int kopi, teh, roti, totalharga;

        System.out.print("Harga kopi: ");
        int hargakopi = sc.nextInt();
        System.out.print("Harga teh: ");
        int hargaTeh = sc.nextInt();
        System.out.print("Harga roti: ");
        int hargaRoti = sc.nextInt();
        sc.nextLine();

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi:");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh:");
            teh = sc.nextInt();
            System.out.print("Jumlah roti:");
            roti = sc.nextInt();
            totalharga = (kopi * hargakopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus di bayar: Rp." + totalharga);
            sc.nextLine(); 

        } while (true);

        System.out.println("Semua transaksi selesai.");
        
    }
}

