package kegiatan;

import java.util.ArrayList;


public class kegiatan1 {

    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();

        hewan.add(0,"Angsa");
        hewan.add(1,"Bebek");
        hewan.add(2,"Cicak");
        hewan.add(3,"Domba");
        hewan.add(4,"Elang");
        hewan.add(5,"Gajah");
        hewan.add(6,"Badak");
        hewan.add(7,"Bebek");
        hewan.add(0, "Cicak");
        System.out.println(hewan.indexOf("Cicak"));

        System.out.println("Output 1,2 :");
        System.out.println(hewan);
        System.out.println("Bebek = "+hewan.indexOf("Bebek")+"," +hewan.lastIndexOf("Bebek"));

        hewan.remove(1);
        System.out.println("Output 3 :\n"+hewan);

        System.out.println("Output 4 :");
        System.out.println("Index ke-0 : "+hewan.get(0));
        System.out.println("Index ke-2 : "+hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);

        System.out.println("Output 5 :");
        hewan.set(0,"Ular");
        System.out.println(hewan);
        hewan.add(2,"Itik");
        System.out.println(hewan);

        System.out.println("Output 6 :");
        hewan.subList(2,5).clear();
        System.out.println(hewan);

        System.out.println("Output 7 :");
        System.out.println("Elemen pertama : "+hewan.get(0));
        System.out.println("Elemen Terakhir : "+hewan.get(hewan.size()-1));

        System.out.println("Output 8,9 :");
        System.out.println("Jumlah index : "+hewan.size());
        System.out.println("Posisi index Badak : "+hewan.indexOf("Badak"));



    }
}
