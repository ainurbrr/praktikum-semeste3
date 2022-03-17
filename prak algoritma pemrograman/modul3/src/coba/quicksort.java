package coba;

import java.util.Arrays;



public class quicksort {

    public static void QuicksortString(String[] stringArray, int start, int end) {
        int i = start;
        int k = end;
        if (k - i >= 1) {
            String pivot = stringArray[i];
            while (k > i) {
                //String pivot = stringArray[i];
                while (stringArray[i].compareTo(pivot) <= 0 && i <= end && k > i){
                    i++;}
                while (stringArray[k].compareTo(pivot) > 0 && k >= start && k >= i){
                    k--;}
                if (k > i){
                    swap(stringArray, i, k);}
            }
            swap(stringArray, start, k);
            QuicksortString(stringArray, start, k - 1);
            QuicksortString(stringArray, k + 1, end);
        }
    }
    public static void swap(String[] array, int index1, int index2) {
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        String[] Hewan = {"Gajah", "Kuda", "Ikan", "Ayam", "Bebek"};
        QuicksortString(Hewan,0,Hewan.length-1);
        System.out.println(Arrays.toString(Hewan));

    }

    // Java program for 3-Way Radix Quicksort

}
class GFG {

    // swapping method.
    public static void swp(String[] s, int x, int y)
    {
        String tmp = s[x];
        s[x] = s[y];
        s[y] = tmp;
    }

    // sort method.
    public static void srt(String[] s, int start, int last,
                           int character_index)
    {
        // base condition if no further index possible.
        if (start >= last)
            return;

        // first making a start pointer for dividing the
        // list from start to start_pointer.
        int start_pointer = start;

        // last_pointer and last are the boundaries for the
        // third list.
        int last_pointer = last;

        // taking the ascii value of the pivot at the index
        // given.
        int char_ascii_value_pivot = s[start].charAt(character_index);

        int pointer = start + 1;

        // starting a pointer to scan the whole array to
        // sort.
        while (pointer <= last) {

            // ASCII value of char at the position of all
            // the strings to compare with that of the pivot
            // char.
            int char_ascii_value_element = s[pointer].charAt(character_index);

            // if the element has char less than pivot than
            // swapping it with the top element and
            // incrementing the top boundary of the first
            // list.
            if (char_ascii_value_pivot > char_ascii_value_element) {
                swp(s, start_pointer, pointer);
                start_pointer++;

                // incrementing the pointer to check for
                // next string.
                pointer++;
            }
            else

                // if found larger character than it is
                // replaced by the element at last_pointer
                // and lower boundary is raised by
                // decrementing it.
                if (char_ascii_value_pivot
                        < char_ascii_value_element) {
                    swp(s, last_pointer, pointer);
                    last_pointer--;
                    pointer++;
                }

                // if character is the same as that of the pivot
                // then no need to swap and move the pointer on
                else {
                    pointer++;
                }
        }

        // now performing same sort on the first list
        // bounded by start and start_pointer with same
        // character_index
        srt(s, start, start_pointer - 1, character_index);

        // if we have more character left in the pivot
        // element than recll quicksort on the second list
        // bounded by  start_pointer and last_pointer and
        // next character_index.
        if (char_ascii_value_pivot >= 0)
            srt(s, start_pointer, last_pointer, character_index + 1);

        // lastly the third list with boundaries as
        // last_pointer and last.
        srt(s, last_pointer + 1, last, character_index);
    }

    public static void main(String[] args) throws Exception
    {
        // predefined array of five element all of same
        // length.
        String s[] = { "Gajah", "Kuda", "Ikan", "Ayam", "Bebek" };

        // calling sort function to sort the array using
        // 3-way-radix-quicksort.
        srt(s, 0, s.length-1, 0);

        // printing the sorted array;
        // here w are calling function by passing parameters
        // using references .
        System.out.println(Arrays.toString(s));
    }
}
