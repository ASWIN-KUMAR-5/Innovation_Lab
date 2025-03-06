package Day3;

public class Company {
    
    static String companyName;
    String employeeName;

    void display(){
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Name: " +employeeName);
    }

    public static void main(String[] args) {
        
        Company c1 = new Company();
        Company c2 = new Company();
        Company c3 = new Company();

        companyName = "ABC";

        c1.employeeName="Aswin";
        c2.employeeName="Logesh";
        c3.employeeName="Aditya";

        c1.display();
        c2.display();
        c3.display();

    }
}

