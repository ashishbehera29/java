public class armstrongno {
    static int power(int base,int exp){
        int pow=1;
        for(int i=1;i<=exp;i++){
        pow=pow*base;
        }
        return pow;

    }
    static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num=153;
        int n1=num;
        int co=count(num);
        int sum=0;
        while (num>0) {
            int rem= num%10;
           sum=sum+power(rem, co);
           num=num/10;
        }
        System.out.println(sum==n1?"armstrongno":"not armstrong no");
    }
    
}
