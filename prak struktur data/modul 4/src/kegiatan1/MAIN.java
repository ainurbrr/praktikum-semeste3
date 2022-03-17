package kegiatan1;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        stackManual stack = new stackManual(20);

        System.out.print("Masukkan input : ");
        String str = input.nextLine();
        System.out.println("Reversed : " + stack.ReverseString(str));

    }
}
