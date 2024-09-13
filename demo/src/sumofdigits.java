public class sumofdigits {
    public static void main(String[] args) {
        int n =522;
             int sum=0;
        while (n>0) {
            int rem=n%10;
            n=n/10;
           sum=sum+rem;
        }
        System.out.println(sum);
    }
}
