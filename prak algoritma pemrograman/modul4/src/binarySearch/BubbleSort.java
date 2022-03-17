package binarySearch;

public class BubbleSort {

    public static void main(String args[]) {
        String[][] arrDataIn =
                {
                        {"abc", "9", "5"},
                        {"xyz", "3", "4"},
                        {"lmn", "7", "3"},
                        {"hij", "1", "3"},
                };

        BubbleSort bs = new BubbleSort();

        String arrSorted[][] = bs.sort(arrDataIn, 0, 1);
        for (int y = 0; y < arrSorted.length; y++) {
            System.out.println("Printing Row Number :" + y);

            for (int z = 0; z < arrSorted[y].length; z++)
                System.out.println("Value : " + arrSorted[y][z]);
        }
    }

    /*
    arrDataIn - Two Dimensional String Array
    iCol  - Column to Sort
    iOrder   - Order of Sort (Ascending / Descending)
    */
    public String[][] sort(String arrDataIn[][], int iCol, int iOrder) {
        String arrTmp[] = new String[arrDataIn[0].length];

        for (int z = 0; z < arrDataIn.length; z++) {
            for (int i = 0; i < arrDataIn.length - (z + 1); i++) {
                if (arrDataIn[i][iCol].compareTo(arrDataIn[i + 1][iCol])>0 && (iOrder == 0)) {
                    for (int j = 0; j < arrDataIn[i].length; j++) {
                        arrTmp[j] = arrDataIn[i][j];
                        arrDataIn[i][j] = arrDataIn[i + 1][j];
                    }

                    for (int m = 0; m < arrTmp.length; m++)
                        arrDataIn[i + 1][m] = arrTmp[m];
                } else if (arrDataIn[i][iCol].compareTo(arrDataIn[i + 1][iCol])<0 && (iOrder == 1)) {
                    for (int j = 0; j < arrDataIn[i].length; j++) {
                        arrTmp[j] = arrDataIn[i][j];
                        arrDataIn[i][j] = arrDataIn[i + 1][j];
                    }

                    for (int m = 0; m < arrTmp.length; m++)
                        arrDataIn[i + 1][m] = arrTmp[m];
                }
            }

        }

        return arrDataIn;
    }

}
