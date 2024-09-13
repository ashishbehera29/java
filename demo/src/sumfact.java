public class sumfact {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int sum=0;
        int num=123;

        while(num>0){
            int rem= num%10;
            sum=sum+fact(rem);
            num=num/10;
        }
        System.out.println(sum);
    }
}
