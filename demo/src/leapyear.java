import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            if(year%4==0 && year%100!=0){
                System.out.println("leap yera");
            }
            else if( year %400==0){
                System.out.println("leap year");
            }
            else{
            System.out.println("not leap yar");
            }
        }
    }
}
