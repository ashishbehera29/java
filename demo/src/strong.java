public class strong {
    static void factor(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    static int count(int num){

        int sum=0;
        while (num>0) {
            int rem= num%10;
             sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
    
        factor(count(123));
    
    }
    
}
