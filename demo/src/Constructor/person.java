package Constructor;
public class person {
    int pin;
    int balace;
   
    void upadtepin(int p){
           this.pin=p;
    }
    void deposit(int amount,int pin){
        if(this.pin==pin){
        this.balace=this.balace+amount;
        }else{
            System.out.println("INCORRECT PIN");
        }
    }
    void withdraw(int amount,int pin){
        if(this.pin==pin){
        this.balace=this.balace-amount;
        }else{
            System.out.println("INCORRECT PIN");
        }
    }
    public static void main(String[] args) {
        person p1= new person();
        p1.upadtepin(1234);
        System.out.println(p1.pin);
        p1.upadtepin(4231);
        System.out.println(p1.pin);
        p1.deposit(15000,4231);
        System.out.println(p1.balace);
        p1.deposit(1000,4231);
        System.out.println(p1.balace);
         p1.deposit(1000,5432);
        System.out.println(p1.balace);
        p1.withdraw(6000, 4231);
        System.out.println(p1.balace);
    }
}
