package kegiatan2;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }
}

public class LinkedList {
    Node first, last;
    int size = 0;

    public void addLast(String dataBaru) {
        Node nodeBaru = new Node(dataBaru); // 1. buat node baru
        if (first == null) {//jika LinkedList masih Kosong
            first = nodeBaru;
            last = nodeBaru;
        } else {//jika LinkedList sudah ada node
            last.next = nodeBaru;
            last = nodeBaru;
        }
        size++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void removeFirst() {
        first = first.next;
        size--;
    }


    public String getFirst() {
        return first.data;
    }

    public void printAll() {
        Node current = first;//i=0;
        int i = 1;
        while (current != null) {//i<last
            System.out.println(i + ". " + current.data + " ");
            current = current.next;//i++
            i++;
        }
    }
}
