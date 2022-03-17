package tugasMod5;

public class function {

    public int[] bubbleSort(int[] arr) { //time complexity O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int binarySearch(int[] arr, int x) { //time complexity O(log n)
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int interpolationSearch(int[] data, int item) { //time complexity O(log(log n))
        int high = data.length - 1;
        int low = 0;
        int pos;
        while (item >= data[low] && item <= data[high]) {

            pos = low + ((item - data[low]) / (data[high] - data[low])) * (high - low);

            if (high == low) {
                if (data[low] == item) {
                    return low;
                } else {
                    return -1;
                }
            }

            if (data[pos] == item) {
                return pos;
            }

            if (data[pos] < item) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }
}
