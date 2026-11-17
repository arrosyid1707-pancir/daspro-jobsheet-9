
import java.util.Scanner;

public class Tugas2_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        boolean ditemukan = false;
        String cariMenu = "";
        String[] pesan = new String[7];
        int[] harga1 = new int[7];
        int[] jumlah1 = new int[7];
        int jumlah;
        int total = 0;
        int banyakPesanan = 0;

        do {
            System.out.print("Masukkan menu (Ketik 'close' untuk selesai): ");
            cariMenu = sc.nextLine();

            if (cariMenu.equalsIgnoreCase("close")) {
                break;
            }

            ditemukan = false;

            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(cariMenu)) {

                    ditemukan = true;

                    System.out.println("Menu  : " + menu[i]);
                    System.out.println("Harga : " + harga[i]);
                    System.out.print("Jumlah : ");
                    jumlah = sc.nextInt();
                    sc.nextLine();

                    pesan[banyakPesanan] = menu[i];
                    harga1[banyakPesanan] = harga[i];
                    jumlah1[banyakPesanan] = jumlah;

                    banyakPesanan++;

                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Menu tidak tersedia!");
            }
            
        } while (true);

        System.out.println("\n========== TOTAL PESANAN ==========");

        for (int u = 0; u < banyakPesanan; u++) {

            System.out.println("Menu   : " + pesan[u]);
            System.out.println("Harga  : " + harga1[u]);
            System.out.println("Jumlah : " + jumlah1[u]);

            total += harga1[u] * jumlah1[u];

            System.out.println("----------------------------");
        }

        System.out.println("Total biaya : Rp" + total);

        sc.close();
    }
}
