// Nama  : Dyma Dwi Handhara
// NPM   : 25161562069
// Kelas : 2A

public class TiketbioskopStack {

    // === BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10];
    static int top = -1;

    // === BAGIAN 2: Operasi Stack ===

    // Method push() 
    static void push(String tiket) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            stack[top] = tiket;
        }
    }

    // Method pop() 
    static String pop() {
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            String tiketTeratas = stack[top];
            stack[top] = null;
            top--;
            return tiketTeratas;
        }
    }

    // Method peek()
    static String peek() {
        if (isEmpty()) {
            return "Stack kosong";
        } else {
            return stack[top];
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("=================================");
    }

    // === BAGIAN 3: Main Program ===
    public static void main(String[] args) {

        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        tampilkanStack();

        System.out.println("Tiket terakhir masuk: " + peek());
        System.out.println("Tiket dibatalkan: " + pop());
        tampilkanStack();
    }
}
