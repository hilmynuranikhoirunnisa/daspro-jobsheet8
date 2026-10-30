import java.util.Scanner;

public class Tugas3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah Toko minimal 1. ");
            sc.close();
            return;
        }
        int totalBarangSemuaToko = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.print("Masukkan Jumlah Pelanggan Toko " + toko + ": ");
            int jumlahPelanggan = sc.nextInt();

            if ( jumlahPelanggan < 0) {
                System.out.print("Masukkan Jumlah Pelanggan tidak boleh negatif. ");
                sc.close();
                return;
            }
            int totalBarangToko = 0;

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("Jumlah Barang yang Dibeli Pelanggan " + pelanggan + " di Toko " + toko + ": ");
                int jumlahBarang = sc.nextInt();

                if (jumlahBarang < 0) {
                    System.out.println("Jumlah Barang tidak boleh negatih.");
                    sc.close();
                    return;
                }

                totalBarangToko += jumlahBarang;

                }
                System.out.println("Toko " + toko + " - Pelanggan: " + jumlahPelanggan + ", Total Barang: " + totalBarangToko);
                 
                totalBarangSemuaToko += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
            }
        }
        System.out.println("Total Barang Seluruh Toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan Barang Terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
