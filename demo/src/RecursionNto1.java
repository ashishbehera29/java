public class RecursionNto1 {
    static void m1(int n) {
        if (n >= 1) {
            System.out.println(n);
            m1(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {  // Correct main method
        m1(5);
    }
}

