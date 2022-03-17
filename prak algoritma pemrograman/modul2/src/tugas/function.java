package tugas;

public class function {

    public void selectionSort(String[] nama) {
        for (int i = 0; i < nama.length - 1; i++) { //kuadratik karena ada nested loop maka O(n^2)
            int indexMin = i;
            String strMin = nama[i];
            for (int j = i + 1; j < nama.length; j++) {
                if (nama[j].compareTo(strMin) < 0) {
                    strMin = nama[j];
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                String temp = nama[indexMin];
                nama[indexMin] = nama[i];
                nama[i] = temp;
            }
        }
        for (int i = 0; i < nama.length; i++) {     //linear O(n)
            if (i == nama.length - 1) {
                System.out.print(nama[i] + "\n");
            } else {
                System.out.print(nama[i] + ",");
            }
        }
    }

    public void bubbleSort(String[] nama) {

        for (int i = 0; i < nama.length - 1; i++) {        //kuadratik karena ada nested loop maka O(n^2)
            for (int j = 0; j < nama.length - i - 1; j++) {
                String namaAfter = nama[j + 1];
                if (nama[j].compareTo(namaAfter) > 0) {
                    //proses swap arr[j+1] dan arr[j]
                    String temp = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nama.length; i++) {     //linear O(n)
            if (i == nama.length - 1) {
                System.out.print(nama[i] + "\n");
            } else {
                System.out.print(nama[i] + ",");
            }
        }
    }

    public String[] gabung(String[] mobilA, String[] mobilB) {
        int totIndex = mobilA.length + mobilB.length;

        String[] mobilAll = new String[totIndex];

        System.arraycopy(mobilA, 0, mobilAll, 0, mobilA.length);
        System.arraycopy(mobilB, 0, mobilAll, mobilA.length + 0, mobilB.length);


        return mobilAll;
    }
}
