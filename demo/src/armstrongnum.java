public class armstrongnum {
    public static int power(int base, int exp){
        int pow= 1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        return pow;
    }
     static int count(int num){
        int c=0;
        while(num>0){
            c++;
            num=num/10;
        }
        return c;
    }
    public static void main(String[] args) {
        int num=1634;
        int n1=num;
        int sum=0;
        int count=count(num);

        while (num>0) {
            int rem= num%10;
             sum=sum+power(rem, count);
             num=num/10;
        }
    
        System.err.println(n1==sum?"armstrongno":"not armstrong");
    }
}
