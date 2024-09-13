package Constructor;
//model number should be LAP2024DELL1001, LAP2024DELL1002
// if the name is dell and the year of manufature is 2024 the the model name shoud be LAP2024DELL1001


public class laptop {
    

        static int num=1001;
        final static String prefix="LAP";
     
          String model_number ;
        int year_of_manufature;
        String brand;
        String model;
        int price;
       
    
      
    
        public laptop( int year_of_manufature, String brand, String model, int price) {
            this.model_number = prefix + year_of_manufature+ brand + num++;
            this.year_of_manufature = year_of_manufature;
            this.brand = brand;
            this.model = model;
            this.price = price;
        }
        void details(){
            System.out.println(model_number);
            System.out.println(year_of_manufature);
            System.out.println(brand);
            System.out.println(model);
            System.out.println(price);
        }
    public static void main(String[] args) {
       laptop l1 = new laptop(  2024, "DELL", "INSPRIDON", 50000);
       l1.details();
       laptop l2 = new laptop(  2024, "DELL", "INSPRIDON", 50000);
       l2.details();
    }
        
    }

