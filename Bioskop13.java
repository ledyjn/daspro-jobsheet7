import java.util.Scanner;

public class Bioskop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        String pilihan = "y";

        do {
            System.out.print("Masukkan jumlah tiket: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid.");
                continue;
            }

            double hargaTotal = jumlahTiket * 50000;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalSetelahDiskon = hargaTotal - (hargaTotal * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalSetelahDiskon;

            System.out.println("Total: Rp " + totalSetelahDiskon);

            System.out.print("Lanjut (y/t)? ");
            pilihan = sc.next();

        } while (pilihan.equalsIgnoreCase("y"));

        System.out.println("Total seluruh tiket: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);

        sc.close();
    }
}