package Assignments;
/*
* Q3). Create a class Medicine to represent a drug manufactured by a pharmaceutical company. Provide a function displayLabel() in this class to print Name and address of the company.
Derive Tablet, Syrup and Ointment classes from the Medicine class.
Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine.
For example, in case of tablets, it could be "store in a cool dry place", in case of ointments it could be "for external use only" etc. Create a class TestMedicine. Write main function to do the following: Declare an array of Medicine references of size 10 Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. Refer Java API Documentation to find out random generation features. Check the polymorphic behavior of the displayLabel() method.







*/
import java.util.Random;

class Medicine{
    protected String companyName;
    protected String address;

    public Medicine(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    public void displayLabel(){
        System.out.println("Company Information: ");
        System.out.println("Company Name: "+companyName);
        System.out.println("Company Address: "+address);
    }
}
class Tablets extends Medicine{

    private String tabName ;

    public Tablets(String tabName,String companyName,String address) {
        super(companyName,address);
        this.tabName = tabName;
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Tablet Name: "+tabName);
        System.out.println("Descprtion: Keep in cool and dry place");
    }
}
class Oinments extends Medicine{
    private String oinmentName;
    public Oinments(String oinmentName,String companyName,String address) {
        super(companyName,address);
        this.oinmentName = oinmentName;
    }


    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Oinment Name: "+oinmentName);
        System.out.println("Descprtion: For External use only");
    }
}
class Syrup extends Medicine{
    private String syrupName;
    public Syrup(String syrupName,String companyName,String address) {
        super(companyName,address);
        this.syrupName = syrupName;
    }


    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Syrup Name: "+syrupName);
        System.out.println("Descprtion: Use under prescribtion of Doctor");
    }
}
public class TestMedicines {
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[10];

        int arr [] = new int[10];

        for(int index = 0;index<arr.length;index++){
            Random rNumber = new Random();
            int num = rNumber.nextInt(3)+1;
            arr[index] = num;
        }
        for(int index = 0;index< medicines.length;index++){
            if(arr[index] == 1){
                medicines[index] = new Tablets("Parectomol","Cipla","kothrud");
            } else if (arr[index] == 2) {
                medicines[index] = new Oinments("Dr.Otho oil","RelaxPharmas","Himachal ");
            }
            else{
                medicines[index] = new Syrup("Dabur Honytus","Dabur","Ranjangoan");
            }
        }
        for (int i = 0; i < medicines.length; i++) {
            medicines[i].displayLabel();
            if (medicines[i] instanceof Tablets) {
                System.out.println("Object at index " + i + " is a Tablet");
            } else if (medicines[i] instanceof Oinments) {
                System.out.println("Object at index " + i + " is a Oinment");
            } else if (medicines[i] instanceof Syrup) {
                System.out.println("Object at index " + i + " is a Syrup");
            }
        }


    }
}
