package latihan;

public class BubleSort {
    public static void main(String[] args) {
        int[] arr= {5, 7, 2, 9, 3};

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j< arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    //proses swap arr[j+1] dan arr[j]
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0; i< arr.length; i++){
            if(i==arr.length-1){
            System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }

    }
}
