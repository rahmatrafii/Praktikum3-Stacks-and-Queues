package soal1;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    // Constructor
    public Stack(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1; // Belum ada item
    }

    // Method untuk memasukkan karakter ke dalam stack
    public void push(char j) {
        if (isFull()) {
            System.out.println("Maaf, stack sudah penuh");
        } else {
            stackArray[++top] = j;
        }
    }

    // Method untuk mengeluarkan karakter dari stack
    public char pop() {
        if (isEmpty()) {
            System.out.println("Maaf, stack kosong");
            return 0;
        } else {
            return stackArray[top--];
        }
    }

    // Cek apakah stack kosong
    public boolean isEmpty() {
        return (top == -1);
    }

    // Cek apakah stack penuh
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
