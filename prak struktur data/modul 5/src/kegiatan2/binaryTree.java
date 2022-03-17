package kegiatan2;


class Node{
    Node right,left;
    String data;
    public Node(String data){
        this.data=data;
    }
}
public class binaryTree {
    Node root;
    public void insertNode(String data){
        root = NewNode(root,new Node(data));
    }

    private Node NewNode(Node root, Node newData){
        if (root == null){
            root= newData;
            return  root;
        }

        if (newData.data.compareTo(root.data)<0){
            root.left = NewNode(root.left,newData);
        }else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }
    public void inOrder(Node root){

        if (root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

    }

    public void preOrder(Node root){

        if (root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    public void postOrder(Node root){

        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

        }

    }
}
