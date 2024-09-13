public class fibonnaciseries {
    public static void main(String[] args) {
        int n=10,n1=0,n2=1,sum=0,i=1;
        while(i<=n){
            System.out.println(n1);
            sum=n1+n2;
            n1=n2;
            i++;
        }
    }
}
