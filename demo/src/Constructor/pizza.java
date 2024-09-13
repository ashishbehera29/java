package Constructor;
public class pizza {
    String type="Regular";
    int price= 150;
    String toping1;
    String toping2;
    boolean cheese;

    //pizza with no toping, cheese optional

    pizza(boolean c){
        this.cheese=c;
        if(c==true){
            this.price=this.price+40;
        }
    }

    //pizza with one toping , cheese optional

    pizza(String t1 , boolean c){
        this.toping1=t1;
        this.cheese=c;
        this.price=this.price+30;

        if(c==true){
            this.price=this.price+40;
        }
    }

    //pizza with two toping , cheese optional

    pizza(String t1 , String t2 , boolean c){
        this.toping1=t1;
        this.toping2=t2;
        this.cheese=c;
        this.price=this.price+50;

        if(c==true){
            this.price=this.price+40;
        }
    }
    public static void main(String[] args) {
        pizza p1 = new pizza("panner","mushroom",true);
        System.out.println(p1.type);
        System.out.println(p1.toping1);
        System.out.println(p1.toping2);
        System.out.println(p1.cheese);
        System.out.println(p1.price);
    }
}
