public class discount {
    public static void main(String[] args) {
        int p1= 299;
        int p2= 499;
        int p3= 1299;
        int p4=599;

        int total = p1+p2+p3+p4;
        System.out.println(total);
    
        double discount=0.15;
        double discountamount= total*discount;
        double amountpaid = total-discountamount;
        System.out.println(amountpaid);
        System.out.println();
    }
}
