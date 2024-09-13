package demo;

public class decreseing {
    public static void main(String[] args) {
        int flag=0;
        int number=5237;
        int dum= number%10;
        number=number/10;

        while (number>0) {
            int rem= number%10;
            number=number/10;
            if(dum<rem){
                flag=1;
            }
            dum=rem;
        }
        System.out.println(flag==0?"YES":"NO");
    }
    
}
