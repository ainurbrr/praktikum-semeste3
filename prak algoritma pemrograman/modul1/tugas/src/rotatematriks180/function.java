package rotatematriks180;

public class function {

    public void rotate180(int[][] matriks){

        for (int b = matriks.length-1; b >= 0; b--){  //linear karena tergantung nilai input O(n)
            for (int k = matriks.length-1; k >= 0; k--){  //linear O(n)
                System.out.print(matriks[b][k]+" ");  //misal ini baris x. dapat diabaikan
            }
            System.out.println();   //misal ini baris y. dapat diabaikan
        }

    }
}

/*jadi notasi Big O dapat ditulis O(n*n) atau O(n^2)
karena yang x dan y dapat diabaikan
 */
