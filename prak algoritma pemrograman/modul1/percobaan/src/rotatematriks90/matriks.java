package rotatematriks90;

public class matriks {
    public static void main(String[] args) {
        //inisialisasi isi matriks
        int arr[][] = {{1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}};

        //proses menampilkan hasil dan memutar matriks sebanyak 90 derajat
        System.out.println("rotate 90 derajat");
        for (int j = 0; j < arr.length; j++) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("rotate 180 derajat");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print("[");
            for (int i = arr.length - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(arr[j][i] + ",");
                } else {
                    System.out.print(arr[j][i]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
