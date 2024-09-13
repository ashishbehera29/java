public class HelloWorld {
    public static void main(String[] args) {
        int num = 28606;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                count++;
            }
            num = num / 10;
        }
        if (count >= 1) {
            System.out.println("duckno");
        } else {
            System.out.println("no duckno");
        }
    }
}
