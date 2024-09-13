public class sumfact1 {
    
 static int factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
 }
 public static void main(String[] args) {
    int n=123;
    int n1=n;
    int sum=0;
    while(n>0){
        int rem=n%10;
        sum=sum+factorial(rem);
        n=n/10;
    }
    System.err.println(sum==n1?"strong no":"not strong no");
 }
}
