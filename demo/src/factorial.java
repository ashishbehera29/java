public class factorial {
    public static void main(String[] args) {
        int i,fact=1;  
        int number=24;//It is the number to calculate factorial    
        for(i=2;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
    }
}
