package cobakeg1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Mau Menampilkan hasil luas dalam bentuk? :");
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to Double");
        System.out.println("Masukkan pilihan 1 / 2 :");
        int pilih = input.nextInt();


        if (pilih==1){
            System.out.println("Masukkan nilai alas dan tinggi segitiga secara berurutan : ");
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            Segitiga<Integer> luasTipeInt = new Segitiga<>(alas, tinggi);
            System.out.println("Luas Segitiga dalam Integer : "+luasTipeInt.getResultAsInt());

        }else if(pilih==2){
            System.out.println("Masukkan nilai alas dan tinggi segitiga secara berurutan : ");
            double alas = input.nextDouble();
            double tinggi = input.nextDouble();
            Segitiga<Double> luasTipeDouble = new Segitiga<>(alas, tinggi);
            System.out.println("Luas Segitiga dalam Double : "+luasTipeDouble.getResultAsDouble(alas,tinggi));
        }

    }
}
