import java.util.Scanner;

public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int lulus = 0,tdkLulus = 0;
        double total = 0,totalLulus = 0,totalTidakLulus = 0;
        double rata2;
        double rata2lulus = 0,rata2tidaklulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int mhs = sc.nextInt();
        int [] nilaiMhs = new int[mhs];


        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            }

        for (int i = 0 ; i < nilaiMhs.length;i++){
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length;i++){
            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                lulus += 1;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tdkLulus += 1;
            }
        }
        rata2lulus = totalLulus / lulus;
        rata2tidaklulus = totalTidakLulus / tdkLulus;
        System.out.println("Rata - rata nilai lulus = " + rata2lulus);
        System.out.println("Rata - rata nilai tidak lulus = " + rata2tidaklulus);
        }
    }

