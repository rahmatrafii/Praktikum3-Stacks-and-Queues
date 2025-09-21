package soal1;

import java.util.Scanner;

public class AppPembalik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        input = "Kasur";
        Pembalik pembalik = new Pembalik(input);
        String hasil = pembalik.balik();
        System.out.println(">> Katanya...");
        System.out.println(input);
        System.out.println(">> Dibalik Menjadi...");
        System.out.println(hasil);

        System.out.println();

        while (true) {
            System.out.print("Masukkan kata: ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Terima kasih!");
                break;
            }

            pembalik = new Pembalik(input);
            hasil = pembalik.balik(); // Memanggil method untuk membalik

            System.out.println("kebalikan: " + hasil);
            System.out.println(); // Memberi spasi untuk input berikutnya
        }
        scanner.close();
    }
}