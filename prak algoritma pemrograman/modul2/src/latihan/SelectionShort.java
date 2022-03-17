package latihan;

public class SelectionShort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 9, 3};
        int indexMin = 0; //index nilai terkecil

        for (int i=0; i<arr.length; i++){
            indexMin=i;
            for (int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[indexMin]){
                    indexMin=j;
                }
            }

            //proses swipe nilai setelah mendapat indeks dari nilai terkecil
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin]= temp;
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
