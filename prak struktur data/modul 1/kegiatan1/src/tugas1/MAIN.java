package tugas1;

class LinkedList {
    Node first, last;

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            last = newNode;

        } else {
            last.next = newNode;
            last = newNode;
        }

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            last = newNode;

        } else {
            newNode.next = first;
            first = newNode;
        }

    }

    public void printAll() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public void replaceData(int index, int dataBaru) {
        Node current = first;
        for (int i=0; i<index; i++){
            if(i == index-1){
                current.data = dataBaru;
            }
            current = current.next;
        }
    }

    public void getIndex(int data){
        Node current = first;
        int i=0;
        while (current != null) {
            if (current.data == data) {
                System.out.println(data+" ada di index ke-"+i);
            }
            current = current.next;
            i++;
        }
    }

    public int getMax() {
        Node current = first;
        int max = 0;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int getMin() {
        Node current = first;
        int min = current.data;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }
}

public class MAIN {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(200);
        l.addFirst(9000);
        l.addFirst(100);
        l.addLast(1000);
        l.addLast(900);
        l.addLast(0);

        System.out.println(l.getMin());
        System.out.println(l.getMax());
        l.replaceData(6, 400);
        l.printAll();
        l.getIndex(1000);
    }
}
