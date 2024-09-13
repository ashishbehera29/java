public class sunnyno {
    public static void main(String[] args) {
        int num = 276;
        boolean isSunny = false;

        for(int i = 1; i*i <= num + 1; i++){
            if(i*i == num + 1){
                isSunny = true;
                break;
            }
        }

        if (isSunny) {
            System.out.println(num + " is a sunny number");
        } else {
            System.out.println(num + " is not a sunny number");
        }
    }
}
