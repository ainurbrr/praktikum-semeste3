package tugas;

import java.util.Scanner;


public class MAIN {

    public static void main(String[] args) {

        function fc = new function();
        Scanner input = new Scanner(System.in);


        System.out.print("Jumlah Penumpang tiap mobil: ");
        int jumlah = input.nextInt();

        String[] mobil1 = new String[jumlah];
        String[] mobil2 = new String[jumlah];


        System.out.print("1. Selection sort\n2. Bubble sort\nPilih metode sort : ");
        int pilih = input.nextInt();
        System.out.println();

        System.out.print("Penumpang Mobil A: ");
        for (int i = 0; i < jumlah; i++) {          //O(n)
            mobil1[i] = input.next();
        }
        System.out.print("Penumpang Mobil B: ");
        for (int i = 0; i < jumlah; i++) {          //O(n)
            mobil2[i] = input.next();
        }
        System.out.println();

        System.out.print("Daftar penumpang: ");
        String[] gabung = fc.gabung(mobil1, mobil2);
        for (int i = 0; i < gabung.length; i++) {   //O(n)
            System.out.print(gabung[i] + " ");
        }
        System.out.println("\n");
        switch (pilih) {
            case 1:
                System.out.print("Setelah diurutkan menggunakan selection sort: ");
                fc.selectionSort(gabung); //O(n^2)
                break;
            case 2:
                System.out.print("Setelah diurutkan menggunakan bubble sort: ");
                fc.bubbleSort(gabung);  //O(n^2)
                break;
        }
    }
}
