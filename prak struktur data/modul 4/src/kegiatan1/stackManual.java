package kegiatan1;


public class stackManual {
    int maxSize;
    char[] arr;
    int top = -1;

    public stackManual(int size) {
        maxSize = size;
        arr = new char[maxSize];
    }

    public void push(char newData) {
        arr[++top] = newData;
    }

    public char pop() {
        return arr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public String ReverseString(String str) {

        char[] reverseString = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            push(str.charAt(i));
        }

        int i = 0;
        while (!isEmpty()) {
            reverseString[i++] = pop();
        }

        return new String(reverseString);
    }
}
