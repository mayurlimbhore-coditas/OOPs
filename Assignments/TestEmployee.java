package Assignments;
/*
* Q4) Suppose you are designing a system to manage employees in a company. You have a superclass Employee and two subclasses FullTime Employee and PartTime Employee. The Employee class contains attributes such as name, id, and methods like calculateSalary(),displayDetails (). Both FullTime Employee and PartTime Employee inherit from the Employee class.
• Implement the Employee class with appropriate attributes and methods. • Implement the FullTime Employee class that inherits from Employee and adds specific attributes/methods related to full-time employees, such as salary,
benefits.
• Implement the PartTimeEmployee class that inherits from Employee and adds specific attributes/methods related to part-time employees, such as hourlyRate,
Bonus:
hoursWorked.
• Implement a TestEmployee class with a main method to create instances of FullTime Employee and PartTime Employee, demonstrate inheritance, and call methods from both the superclass and subclasses.*/
class Employee{
    protected String empName;
    protected int empId;

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }
   public double calculateSalary(){
       return 0.0;
   }



    public void displayDetails(){
       System.out.println("Name is: "+empName);
       System.out.println("Emp Id is: "+empId);
   }
}
class FullTimeEmp extends Employee{
    private int salary;
    private int benifits;

    public FullTimeEmp(String empName,int empId,int salary, int benifits) {
        super(empName,empId);
        this.salary = salary;
        this.benifits = benifits;
    }
    @Override
    public double calculateSalary(){
      return salary;
    }
    public void displayFullTimeEmpDetails(){
        System.out.println("Employee name is: "+empName);
        System.out.println("Employee ID is: " + empId);
        System.out.println("Employee salary is: "+calculateSalary());
        System.out.println("Employee benifits are: "+benifits);
    }
}

class PartTimeEmp extends Employee{
    private int workingHrs;
    private int hourlyRates;

    public PartTimeEmp(String empName,int empId,int workingHrs, int hourlyRates) {
        super(empName,empId);
        this.workingHrs = workingHrs;
        this.hourlyRates= hourlyRates;
    }
    @Override
    public double calculateSalary(){
        return workingHrs*hourlyRates;
    }
    public void displayPartTimeEmpDetails(){
        System.out.println("Employee name is: "+empName);
        System.out.println("Employee ID is: " + empId);
        System.out.println("Employee salary is: "+calculateSalary());
        System.out.println("Employee hourly Rates are: "+ hourlyRates);
        System.out.println("Employee working hours are: "+workingHrs);
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        FullTimeEmp fullTime = new FullTimeEmp("Mayur Limbhore",1234,10000,1200);
        PartTimeEmp partTime = new PartTimeEmp("Sanket",2343,8,60);

        fullTime.displayFullTimeEmpDetails();
        partTime.displayPartTimeEmpDetails();
    }
}
