import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int myNumber=(int) (Math.random()*100);
            int userNumber=0;

            do{
                System.out.println("Guess my number");
                 userNumber = sc.nextInt();

                if(userNumber==myNumber){
                    System.out.println("correct");
                    break;
                }
                 else if(userNumber>myNumber){
                    System.out.println("your number is too large");
                 }
                 else{
                    System.out.println("your number is too small");
                 }
            }while(userNumber >=0);
            System.out.println("my number");
            System.out.println(myNumber);
        }
    }
}
