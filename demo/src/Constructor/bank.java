package Constructor;
public class bank {
   
        int pin;
        int balence;
        int withdraw;
        void updatepin(int p)
        {
            this.pin=p;
            
        }
        void updatebalence(int amount, int pin){
            if(this.pin == pin) {
            this.balence=this.balence+amount;
            }
            
        }
        void withdraw(int amount, int pin){
            if(this.pin == pin) {
            this.balence=this.balence-amount;
            }
        }
        public static void main(String[] args) {
            bank p1 = new bank();
            p1.updatepin(1234);
            System.out.println(p1.pin);
            p1.updatebalence(1000, 1234);
            p1.updatebalence(8500, 1234);
            System.out.println(p1.balence);
            p1.withdraw(6500, 1234);
            System.out.println(p1.balence);
        }    }
    
