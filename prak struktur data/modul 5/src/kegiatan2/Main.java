package kegiatan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        binaryTree tree = new binaryTree();
        Scanner input = new Scanner(System.in);
        boolean cek = true;

        while (cek) {
            System.out.println("Traversal Binary Tree");
            System.out.print("1. Tambah data\n2. Tampilkan hasil Traversal\nmasukkan pilihan : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("--Tambah Data--");
                    System.out.print("Ingin menambahkan berapa data? : ");
                    int jumlahData = input.nextInt();
                    for (int i = 0; i < jumlahData; i++) {
                        System.out.print("Masukkan data "+(i+1)+": ");
                        String newData = input.next();
                        tree.insertNode(newData);
                    }

                case 2:
                    System.out.println("Hasil Travelsal");
                    System.out.print("inOrder : ");
                    tree.inOrder(tree.root);
                    System.out.print("\npostOrder : ");
                    tree.postOrder(tree.root);
                    System.out.print("\npreOrder : ");
                    tree.preOrder(tree.root);
                    cek = false;
                    break;
            }
        }
    }
}

