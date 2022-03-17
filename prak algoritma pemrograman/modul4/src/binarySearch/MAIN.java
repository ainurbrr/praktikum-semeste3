package binarySearch;

import java.util.Scanner;

class MAIN {
    public void binarySearch(String[][] array, String x){

        int b = array.length;
        int k = array[0].length;

        int start=0;
        int end = b*k-1;

        while (start<=end){
            int mid = (start+end)/2;
            int midX = mid/k;
            int midY = mid%k;
            //System.out.println(midX+","+midY);
            int result = x.compareToIgnoreCase(array[midX][midY]);

            if(x.equalsIgnoreCase(array[midX][midY])){
                System.out.println("Nama ditemukan di ("+midX+","+midY+")");
                return;
            }

            if(result > 0){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        System.out.println("Element not found");
        //time complexity O(log n)
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MAIN panggil = new MAIN();

        String[][] asistenLab = {
                {"Alex", "Aqin", "Aril", "Bella"},
                {"Caca", "Dinda", "Dwi", "Egi"},
                {"Farkhan", "Farli", "Gilly","Ichsan"},
                {"Lidya", "Syafei", "Syifa", "Wahyu"}
        };

        System.out.print("Nama yang dicari : ");
        String namaAslab = input.nextLine();

        for (int b=0; b<asistenLab.length; b++){
            for (int k=0; k<asistenLab[0].length; k++){
                System.out.print(asistenLab[b][k]+"\t\t");
            }
            System.out.println();
        }

        panggil.binarySearch(asistenLab,namaAslab);
    }
}