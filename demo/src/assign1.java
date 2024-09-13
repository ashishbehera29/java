import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
     
            int originalno = n;
            int count = 0;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            count = count / 2;
            System.out.println(count);

            int power = (int) Math.pow(10, count);
            System.out.println(power);

            
            int num1 = originalno / power;  
            int num2 =originalno % power;  
            System.out.println(num1);
            System.out.println(num2);

            int sum = num1 + num2;
            System.out.println(sum);
        }
    }
}

