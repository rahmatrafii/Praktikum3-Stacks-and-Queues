package soal2;

public class AppAntrian {
    public static void main(String[] args) {
        // Membuat antrian dengan kapasitas 4
        Queue theQueue = new Queue(4);

        System.out.println(">> beberapa mulai mengantri");
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satrio");
        theQueue.insert("Afrizal");
        theQueue.insert("Sukran"); // Akan ditolak karena penuh
        theQueue.insert("Mahmud"); // Akan ditolak karena penuh
        System.out.println();

        System.out.println(">> isi antrian");
        theQueue.displayQueueContent();
        System.out.println();

        System.out.println(">> satu persatu keluar antrian");
        theQueue.remove();
        theQueue.display();

        theQueue.remove();
        theQueue.display();

        theQueue.remove();
        theQueue.display();

        theQueue.remove();
        theQueue.display();
        System.out.println();

        // Cek kondisi akhir
        theQueue.displayQueueContent();
        theQueue.display();
    }
}
