package soal2;

public class Queue {
    private int maxSize;
    private String[] queArray;
    private int front; // Ujung depan antrian
    private int rear;  // Ujung belakang antrian
    private int nItems; // Jumlah item saat ini

    // Constructor untuk inisialisasi antrian
    public Queue(int s) {
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
        // Mengisi array dengan "Kosong" untuk visualisasi
        for (int i = 0; i < maxSize; i++) {
            queArray[i] = "Kosong";
        }
    }

    // Method untuk menambahkan item ke belakang antrian
    public void insert(String item) {
        if (isFull()) {
            System.out.println("Maaf " + item + ", antrian masih penuh");
        } else {
            // Jika sudah di ujung, kembali ke awal (circular queue)
            if (rear == maxSize - 1) {
                rear = -1;
            }
            rear++;
            queArray[rear] = item;
            nItems++;
            System.out.println(item + " masuk antrian");
        }
    }

    // Method untuk menghapus item dari depan antrian
    public String remove() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        String temp = queArray[front];
        queArray[front] = "Kosong"; // Menandai posisi sebagai kosong
        front++;
        // Jika sudah di ujung, kembali ke awal (circular queue)
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        System.out.println(temp + " Keluar antrian");
        return temp;
    }

    // Cek apakah antrian penuh
    public boolean isFull() {
        return (nItems == maxSize);
    }

    // Cek apakah antrian kosong
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // Method untuk menampilkan isi dari array antrian
    public void display() {
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i]);
            if (i != queArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    // Method untuk menampilkan isi antrian yang sebenarnya
    public void displayQueueContent() {
        if (isEmpty()) {
            System.out.println("antrian kosong");
            System.out.println(nItems + " Person");
        } else {
            int current = front;
            for (int i = 0; i < nItems; i++) {
                System.out.print(queArray[current] + ",");
                current++;
                if (current == maxSize) {
                    current = 0; // Kembali ke awal jika mencapai akhir array
                }
            }
            System.out.println();
        }
    }
}