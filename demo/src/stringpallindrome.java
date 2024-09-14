import java.lang.*;
public class stringpallindrome {

    static boolean paliidrome(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 =  s.charAt(i)+s1;
        }
        if ( s.equals(s1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "adgdaaadhjhikki";
        for (int i = 0; i < str.length(); i++) {
            String temp = "" + str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                temp = temp + str.charAt(j);
                if(paliidrome(temp)){
                System.out.println(temp);
                }
            }

        }
    }

}

