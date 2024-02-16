package Assignments;

import java.util.Random;

class Medicine{
    protected String companyName;
    protected String address;

    public void displayLabel(){
        System.out.println("Company Information: ");
        System.out.println("Company Name: "+companyName);
        System.out.println("Company Address: "+address);
    }
}
class Tablets extends Medicine{

    private String tabName ;


    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Tablet Name: "+tabName);
        System.out.println("Descprtion: Keep in cool and dry place");
    }
}
class Oinments extends Medicine{
    private String oinmentName;

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Oinment Name: "+oinmentName);
        System.out.println("Descprtion: For External use only");
    }
}
class Syrup extends Medicine{
    private String syrupName = "Honeytus";

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
                medicines[index] = new Tablets();
            } else if (arr[index] == 2) {
                medicines[index] = new Oinments();
            }
            else{
                medicines[index] = new Syrup();
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
