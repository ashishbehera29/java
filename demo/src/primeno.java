import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
          int n= sc.nextInt();
           int count=0;
          for(int i=1;i<=n;i++){
            if(n%i==0){
              count++;
            }
          }
          System.out.println(count);
          System.out.println(count==2?"prime":"notprime");
        }

    }
}
