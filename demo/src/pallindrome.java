public class pallindrome {
    public static void main(String[] args) {
        int num=121;
        int n=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println(sum==n?"pallindrome":"not pallindrome");
    }
}
