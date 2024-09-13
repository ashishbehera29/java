import java.util.Scanner;

public class arrayinput {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int len = sc.nextInt();

            int[] arr = new int[len];

            for(int i = 0; i < len; i++){
                arr[i] = sc.nextInt();
            }
        }
    }
}
