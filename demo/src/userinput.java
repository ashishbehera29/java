import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("what is utr name");
             String name = sc.nextLine();
             System.out.println("hello" + name);
        }
    }
}
