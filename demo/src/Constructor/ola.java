package Constructor;

public class ola {
    int id;
    int cost;

    ola(int n){
        this.id=n;
    }
    void journey(int type, int distance){
        if(type==0){
            this.cost= distance*20;
        }else  if(type==1){
            this.cost= distance*10;
        }else{
            this.cost=distance*5;
        }
    }
    void display(){
        System.out.println(id +" " +cost+"  ");
    }
public static void main(String[] args) {
    ola o1= new ola(1234);
    o1.journey(2, 10);
    o1.display();
}
}


