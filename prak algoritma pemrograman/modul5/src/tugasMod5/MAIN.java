package tugasMod5;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        function fc = new function();
        int searchNum, result;

        System.out.print("Masukkan panjang elemen angka yang akan dimasukkan ke array : ");
        int jumlah = input.nextInt();
        System.out.println();
        int[] arr = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka array " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }

        fc.bubbleSort(arr);
        System.out.print("array setelah diurutkan : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nPilih metode search\n1. binarySearch\n2. interpolationSearch\n:");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("==Binary Search==\nmasukkan angka yang akan dicari : ");
                searchNum = input.nextInt();
                result = fc.binarySearch(arr, searchNum);
                if (result == -1) {
                    System.out.println("elemen tidak ditemukan!");
                } else {
                    System.out.println(searchNum + " Ditemukan pada index " + result);
                }

            case 2:
                System.out.print("==Interpolation Search==\nmasukkan angka yang akan dicari : ");
                searchNum = input.nextInt();
                result = fc.interpolationSearch(arr, searchNum);
                if (result == -1) {
                    System.out.println("elemen tidak ditemukan!");
                } else {
                    System.out.println(searchNum + " Ditemukan pada index " + result);
                }
                break;
        }

    }

}
