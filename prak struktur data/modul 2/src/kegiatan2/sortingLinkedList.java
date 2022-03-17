package kegiatan2;

public class sortingLinkedList {
    Node first, last;

    public void addData(int dataBaru) {

        Node nodeBaru = new Node(dataBaru); // 1. buat node baru

        if (first == null) { //jika node masih kosong
            first = last = nodeBaru;
        } else {
            last.next = nodeBaru;
            nodeBaru.prev = last;
            last = nodeBaru;
        }

    }

    public void sortLinkedList() {
        Node current = first, index;
        int temp;

        while (current != null) {
            index = current.next;

            while (index != null) {

                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }

    }

    public void printAll() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}


class MAIN {
    public static void main(String[] args) {

        sortingLinkedList sortLL = new sortingLinkedList();

        sortLL.addData(8);
        sortLL.addData(7);
        sortLL.addData(1);
        sortLL.addData(4);
        sortLL.addData(6);
        sortLL.addData(2);
        sortLL.addData(3);
        
        System.out.print("Before : ");
        sortLL.printAll();
        sortLL.sortLinkedList();
        System.out.print("\nAfter Sort : ");
        sortLL.printAll();
    }
}
