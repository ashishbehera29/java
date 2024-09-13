import java.util.Scanner;
public class duckno {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num= sc.nextInt();
            int flag=0;
            while (num>0) {
                int rem= num%10;
                if(rem==0){
                    flag=1;
                    break;
                }
                num=num/10;
            }
            if(flag==1){
                System.out.println("duckno");
            }else{
            System.out.println("notduck no");
            }
        }
    }
    
}
