public class Sudhapro2 {
    String name;
    int empage;
    int empid;
    int contactno;
    String empcurrentcity;

    void info(){
        System.out.println("Employee Name : " +name);
        System.out.println("Employee Age : " +empage);
        System.out.println("Employee ID : " +empid);
        System.out.println("Employee Contact Number : " +contactno);
        System.out.println("Employee City : " +empcurrentcity);

    }

    public static void main(String[] args) {
        Sudhapro2 Employee = new Sudhapro2();

        Employee.name = "RAVI KUMAR";
        Employee.empage = 25;
        Employee.empid = 2007;
        Employee.contactno = 22334455;
        Employee.empcurrentcity = "Bangalore";

        // Calling method
        Employee.info();

    // JAVA CONSTRUCTOR


    }
}


