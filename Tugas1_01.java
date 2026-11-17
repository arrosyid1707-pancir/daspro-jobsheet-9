import java.util.Scanner;
public class Tugas1_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int y = 0;
        int nilai[];
        int total = 0;
        double rata;
        int tertinggi = 0, terendah = 100;

        System.out.print("Masukkan jumlah mahasiswa : ");
        y = sc.nextInt();

        nilai = new int[y];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
            if (nilai[i]>tertinggi){
                tertinggi = nilai[i];
            }
            if (nilai[i]<terendah){
                terendah = nilai[i];
            }
        }
        rata = total/nilai.length;
        System.out.println("--------------------------------");
        System.out.println("Rata rata seluruh mahasisawa : " + rata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("--------------------------------");   
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 74) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
        sc.close();
    }
    
}
