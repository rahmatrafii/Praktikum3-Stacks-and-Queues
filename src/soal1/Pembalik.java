package soal1;

public class Pembalik {
    private String input;
    private String output;

    // Constructor
    public Pembalik(String in) {
        input = in;
        output = "";
    }

    // Method untuk membalik string
    public String balik() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);

        // 1. Push setiap karakter dari input ke dalam stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }

        // 2. Pop setiap karakter dari stack dan gabungkan ke output
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch; // append
        }
        return output;
    }
}