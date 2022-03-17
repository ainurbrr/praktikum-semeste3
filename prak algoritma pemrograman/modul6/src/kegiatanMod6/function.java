package kegiatanMod6;

public class function {
    int[] array;

    public int getMax(int[] array){
        int max=array[0];
        for (int i=0; i< array.length; i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public int getMin(int[] array){
        int min=array[0];
        for (int i=0; i<array.length; i++){
            if (array[i]<min){

                min=array[i];
            }
        }
        return min;
    }

    public void linearSearch(int[] array, int find){
        for (int i=0; i<array.length; i++){
            if (find==array[i]){
                System.out.println(array[i]+" ditemukan diindex "+i);
                return;
            }
        }
        System.out.println("elemen tidak ditemukan!");
    }
}
