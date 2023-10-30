import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp = 0;
        int total = 0;

        System.out.print("Banyaknya elemen: ");
        int index = sc.nextInt();

        int[] nilai = new int[index];

        for (int i = 0; i < index; i++){
            System.out.print("Masukkan nilai ke -" + (i+1) +": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rata2 = 0;
        rata2 = (double) total / index;

        for (int i = 0; i < index; i++) {
            for (int j = 1; j < index - i; j++) {
                if (nilai[j - 1] > nilai[j]) {
                    temp = nilai[j];
                    nilai[j] = nilai[j - 1];
                    nilai[j - 1] = temp;
                }
            }
        }

        System.out.println("Jadi nilai tertingi adalah " + nilai[index - 1]);
        System.out.println("Dan nilai terendahnya adalah " + nilai[0]);
        System.out.println("Lalu rata - ratanya adalah " + rata2);

    }
}
