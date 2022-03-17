package kegiatan2;

public class Queue {

    LinkedList link = new LinkedList();

    public void enqueue(String data) {
        link.addLast(data);
    }

    public void dequeue() {
        link.removeFirst();
    }

    public String peek() {
        return link.getFirst();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }

    public int size() {
        return link.size;
    }

    public void display() {
        link.printAll();
    }
}
