/*
package latihan;

import kegiatan2.Node;

public class coba {
    public void addAscending(int newData) {
        Node newNode = new Node(newData);
        if (first == null) {
            first = last = newNode;
        } else if (newData <= first.data) {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        } else if (newData >= last.data) {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        } else {
            Node current = first;
            while (current != null) {
                if (newData <= current.data) {
                    Node temp = current.prev;
                    newNode.next = current;
                    newNode.prev = current.prev;
                    current.prev = newNode;
                    temp.next = newNode;
                    break;
                }
                current = current.next;
            }

        }
    }
}
*/
