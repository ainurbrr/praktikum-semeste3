package binarySearch;

public class cobs {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m*n-1;

        while(start <= end){
            int mid=(start+end)/2;
            int midX=mid/n;
            int midY=mid%n;

            if(matrix[midX][midY]==target) {
                System.out.println("Found at" + midX + ", " + midY);
                return true;
            }
            if(matrix[midX][midY]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int a[][] = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };

        searchMatrix(a, 38);
    }
}
// Java program to implement Binary Search for strings
class GFG {

    // Returns index of x if it is present in arr[],
    // else return -1
    static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            // Check if x is present at mid
            if (res == 0)
                return m;

            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        return -1;
    }

    // Driver method to test above
    public static void main(String []args)
    {
        String[] arr = { "contribute", "geeks", "ide", "practice"};
        String x = "contribute";
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}

class coba{
    public boolean binarySearch(String[][] array, String x){

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
                return true;
            }

            if(result > 0){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
       /*String[][] asistenLab = {
                {"Farli", "Bella", "Ichsan", "Wahyu"},
                {"Aril", "Aqin", "Dinda", "Egi"},
                {"Gilly", "Farkhan", "Syafei", "Dwi"},
                {"Lidya", "Syifa", "Caca", "Alex"}
        };*/
        String[][] asistenLab = {
                {"Alex", "Aqin", "Aril", "Bella"},
                {"Caca", "Dinda", "Dwi", "Egi"},
                {"Farkhan", "Farli", "Gilly","Ichsan"},
                {"Lidya", "Syafei", "Syifa", "Wahyu"}
        };




        coba co = new coba();
        co.binarySearch(asistenLab,"farli");
    }
}
