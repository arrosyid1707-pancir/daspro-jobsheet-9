import java.util.Scanner;

public class SearchNilaiMod01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array nilai: ");
        int n = input.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen nilai ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = input.nextInt();
        boolean ditemukan = false;
        int indeksKetemu = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                ditemukan = true;
                indeksKetemu = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nilai " + key + " berhasil ditemukan pada indeks ke-" + indeksKetemu + ".");
        } else {
            System.out.println("Mohon maaf, nilai " + key + " tidak ditemukan di dalam array yang Anda masukkan.");
        }

        input.close();
    }
}