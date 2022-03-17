package kegiatanMod6;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        int size, find;
        function func = new function();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan size array yang akan digunakan : ");
        size = input.nextInt();
        int[] array = new int[size];

        for (int i=0; i<size; i++){
            System.out.print("masukkan elemen array index ke-"+i+" : ");
            array[i] = input.nextInt();
        }

        System.out.println("Implementasi algoritma Brute Force");
        System.out.println("Nilai maksimum dalam array : "+func.getMax(array));
        System.out.println("Nilai minimum dalam array : "+func.getMin(array));

        System.out.print("Linear Search\nmasukkan elemen yang dicari : ");
        find = input.nextInt();
        func.linearSearch(array,find);
    }
}
