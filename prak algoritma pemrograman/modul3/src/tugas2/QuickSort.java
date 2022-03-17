package tugas2;

import java.util.Arrays;

public class QuickSort {

    private static void quickSort(String[] strings, int start, int end) //time complexity kuadratik worst case O(n^2)
    {

        int a = start;
        int b = end;

        if (b - a >= 1)
        {
            while (b > a)
            {
                String pivot = strings[a];

                while (strings[a].compareTo(pivot) < 0 ){
                    a++;
                }

                while (strings[b].compareTo(pivot) > 0 ){
                    b--;
                }

                if (b > a) {
                    swap(strings, a, b);
                }
            }

            swap(strings, start, b);

            quickSort(strings, start, b - 1);

            quickSort(strings, b + 1, end);
        }
    }

    private static void swap(String[] strings, int i, int j)
    {
        String temp = strings[i];
        strings[i] = strings[j];
        strings[j] = temp;
    }

    public static void main(String[] args) {
        String[] hewan = {"Gajah", "Kuda", "Ikan", "Ayam", "Bebek"};
        quickSort(hewan, 0, hewan.length-1);
        System.out.print(Arrays.toString(hewan));
    }
}
