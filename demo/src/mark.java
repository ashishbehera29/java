public class mark {
    
public static void main(String[] args) {
    int phy = 45;
    int chem = 57;
    int math = 48;
    int opt = 62;
    float total = phy+chem+math+opt;
    float fullmark= 70*4;

    float percent = (total/fullmark)*100;
    System.out.println(total);
    System.out.println(percent);
}
}
