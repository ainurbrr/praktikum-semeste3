package tugas1;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        String str = "XYZ";
        String answer = "";
        permute pm = new permute();
        System.out.print("1. Permutasi menggunakan rekursif \n2. Permutasi tanpa rekursif\nPilih : ");
        Scanner input = new Scanner(System.in);
        int pilih = input.nextInt();

        switch (pilih){
            case 1 :
                System.out.println("Berikut Hasil Permutasi String '"+str+"' adalah :");
                pm.permuteWithRecursive(str,answer);
                break;
            case 2 :
                System.out.println("Berikut Hasil Permutasi String '"+str+"' adalah :");
                pm.permuteNonRecursive(str);
                break;
        }
    }
}
