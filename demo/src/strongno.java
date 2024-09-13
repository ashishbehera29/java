public class strongno {
    static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
            res *= i; 
        return res; 
    } 
  
    public static void main(String[] args) {
        int num= 123;
        int org=num;
        int sum=0;
        while (num>0) {
            int rem= num%10;
            sum=sum+factorial(rem);
            num=num/10;
        }
        System.out.println(sum==org?"strongno":"notstrongno");
    
    }
}
