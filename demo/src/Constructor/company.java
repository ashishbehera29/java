package Constructor;
//problem statement 

//AN organization wants to represent an employee detalis in software object each employee 







public class company {

    static int num=1001;
    final static String prefix="TCS";
    String id;
    String name;
    int salary;
    double expeirnce;

    public company( String name, int salary, double expeirnce) {
        this.id = prefix + num++;
        this.name = name;
        this.salary = salary;
        this.expeirnce = expeirnce;
    }

    void details(){
        System.out.println("ID " + id +"name " + name  + " salary " + salary + " exprience " + expeirnce );
    }
public static void main(String[] args) {
    company e1 = new company("asihs", 34567890, 2345678);
    e1.details();
    company e2 = new company("ram", 5678, 1.5);
    e2.details();
}
    
}

