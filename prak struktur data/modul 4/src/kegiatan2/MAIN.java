package kegiatan2;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        boolean session = true;
        int pilih;
        String namaBus;
        Scanner input = new Scanner(System.in);
        Queue dataQueue = new Queue();
        while (session) {
            System.out.println("===Antrian Pemberangkatan Bus===\n1. Tambah Antrian\n2. Berangkatkan Bus\n3. Jumlah Antiran\n4. Bus yang akan berangkat selanjutnya\n5. Tampilkan antrian\n6. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilih = Integer.parseInt(input.nextLine());
            ;
            switch (pilih) {
                case 1:
                    System.out.println("Tambah antrian bus");
                    System.out.print("Masukkan nama bus : ");
                    namaBus = input.nextLine();
                    dataQueue.enqueue(namaBus);
                    break;
                case 2:
                    System.out.println("\nBerangkatkan bus");
                    System.out.println("Bus " + dataQueue.peek() + " sudah berangkat\n");
                    dataQueue.dequeue();
                    break;
                case 3:
                    System.out.println("\nJumlah antrian saat ini : " + dataQueue.size() + "\n");
                    break;
                case 4:
                    System.out.println("\nBus yang akan berangkat selanjutnya : " + dataQueue.peek() + "\n");
                    break;
                case 5:
                    System.out.println("\nSemua Antrian");
                    dataQueue.display();
                    break;
                case 6:
                    if (dataQueue.isEmpty()) {
                        System.out.println("Telah keluar dari sistem");
                        System.exit(0);
                    } else {
                        System.out.println("\nMasih ada bus yang belum berangkat!\n");
                    }
                    break;
            }
        }
    }
}
