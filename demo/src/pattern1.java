public class pattern1 {
    public static void main(String[] args) {
       partten(4);
        
    }

    static void partten(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

