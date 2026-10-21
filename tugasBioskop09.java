import java.util.Scanner;

public class tugasBioskop09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            int harga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            int hargaAkhir = (int) (harga - (harga * diskon));

            System.out.println("Harga normal : Rp " + harga);
            System.out.println("Diskon       : " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar  : Rp " + hargaAkhir);
            System.out.println();

            totalTiket += jumlahTiket;
            totalPenjualan += hargaAkhir;
        }

        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual    : " + totalTiket);
        System.out.println("Total penjualan tiket  : Rp " + totalPenjualan);
    }
}