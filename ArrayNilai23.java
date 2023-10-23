import java.util.Scanner;

public class ArrayNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0 ; i < 10; i++){
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int j = 0; j < 10; j++){
            System.out.println("Nilai akhir ke-" + j + " adalah " + nilaiAkhir[j]);
        }
    }
}
