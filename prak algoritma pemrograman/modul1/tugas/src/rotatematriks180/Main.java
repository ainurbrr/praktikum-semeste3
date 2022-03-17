package rotatematriks180;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        function fc = new function();

        Scanner input = new Scanner(System.in);

        int ordo, b, k;

        System.out.print("Masukkan ordo matriks yang akan diputar 180 derajat : ");
        ordo = input.nextInt();
        int[][] matriks = new int[ordo][ordo];

        //meminta inputan sesuai ordo
        for (b = 0; b < ordo; b++){     //linear O(n)
            for (k = 0; k < ordo; k++){ //linear O(n)
                System.out.print("Masukkan nilai elemen matriks baris ke "+(b+1)+" kolom ke "+(k+1)+" : ");
                matriks[b][k]=input.nextInt();

            }
        } //kuadratik
        /*notasi Big O dapat ditulis O(n*n) atau O(n^2)
         */


        //memanggil method rotasi matriks 180 derajat
        fc.rotate180(matriks);
    }
}

