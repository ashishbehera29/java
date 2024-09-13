public class rahul {
    public static void main(String[] args) {
        int appleweight = 825;
        double applecostperkg=295;
        double tax1= 2.5;
        double tax2=2.5;

        double appleweightkg = appleweight / 1000.0;

        double totalprize= appleweightkg * applecostperkg;

        double cgst = (tax1/100)* totalprize;
        double sgst = (tax2/100) * totalprize;

        double total = totalprize + cgst+sgst;

        System.out.println(totalprize);

        System.out.println(total);

    }
}
