package binarySearch;

public class binNew {
    public void findRow(String[][] arr,int n, int m, String x){
        int l = 0;
        int r = n-1;

        int mid;

        while(l <= r){
            mid = (l+r)/2;
            int cekKiri = x.compareToIgnoreCase(arr[mid][0]);
            System.out.println(cekKiri);
            if(cekKiri == 0){
                System.out.println("Nama ditemukan di ("+mid+","+0+")");
                return;
            }

            int cekKanan = x.compareToIgnoreCase(arr[mid][m-1]);
            System.out.println(cekKanan);
            if(cekKanan == 0){
                int kolom = m-1;
                System.out.println("Nama ditemukan di ("+mid+","+kolom+")");
                return;
            }

            if(cekKiri>0 && cekKanan<0){
                binarySearch(arr,n, m, x, mid);
                return;
            }

            if(cekKiri<0){
                r = mid -1;
            }
            if (cekKanan>0){
                l = mid+1;
            }

        }
        System.out.println("Element tidak ditemukan");

    }
    public void binarySearch(String[][] array, int n, int m,  String str, int x){


        int l=0;
        int r=m-1;
        int mid;

        while (l<=r){
            mid = (l+r)/2;


            int result = str.compareToIgnoreCase(array[x][mid]);

            if(result==0){
                System.out.println("Nama ditemukan di ("+x+","+mid+")");
                return;
            }

            if(result > 0){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
            System.out.println("Element not found");
        }
    }


    public static void main(String[] args) {

        String[][] asistenLab = {
                {"Alex", "Aqin", "Aril", "Bella"},
                {"Caca", "Dinda", "Dwi", "Egi"},
                {"Farkhan", "Farli", "Gilly","Ichsan"},
                {"Lidya", "Syafei", "Syifa", "Wahyu"}
        };

        binNew tes = new binNew();

        tes.findRow(asistenLab,4,4,"dwi");
    }
}


