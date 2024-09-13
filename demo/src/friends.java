public class friends {
    public static void main(String[] args) {
        int totalmember= 4;
        int dose =135;
        int totaldoseprize= totalmember*dose;
        float gstprize= (18/100.0f)*totaldoseprize;
        float totalamount=totaldoseprize+gstprize;
        System.out.println(totalamount);
    }
}
