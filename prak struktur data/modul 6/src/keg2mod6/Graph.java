package keg2mod6;

import java.util.*;

public class Graph {
    int simpul;
    LinkedList[] linkedList;

    public Graph(int vertex) {
        simpul = vertex;
        linkedList = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            linkedList[i] = new LinkedList();
        }
    }

    public void addEdge(int asal, int tujuan) {
        linkedList[asal].add(tujuan);
    }


    void DFS(int s) {
        ArrayList<Boolean> dikunjungi = new ArrayList<>();

        for (int i = 0; i < simpul; i++) {
            dikunjungi.add(false);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (stack.empty() == false) {

            s = stack.peek();
            stack.pop();
            if (dikunjungi.get(s) == false) {
                System.out.print(s + " ");
                dikunjungi.set(s, true);
            }
            Iterator<Integer> itr = linkedList[s].iterator();

            while (itr.hasNext()) {
                int v = itr.next();
                if (!dikunjungi.get(v)) {
                    stack.push(v);
                }
            }
        }
    }

    void BFS(int s) {

        boolean dikunjungi[] = new boolean[simpul];

        LinkedList<Integer> queue = new LinkedList();

        dikunjungi[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> itr = linkedList[s].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!dikunjungi[n]) {
                    dikunjungi[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

