package Assignments;

class BankAccount{
    private String bankName;
    protected String accNumber;
    protected double balance;
    protected String accHolderName;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public void bankDisplay(){
        System.out.println("Bank Details: ");
        System.out.println("Account Holder Name: "+accHolderName);
        System.out.println("Account Number: "+accNumber);
        System.out.println("Account Balance: "+balance);
    }
}
class AtmUse extends BankAccount{
    protected long atmCardNumber;
    private int password;
    protected String expiryDate;

    public void setAtmCardNumber(long atmCardNumber) {
        this.atmCardNumber =  atmCardNumber;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public void atmDisplay(){
        System.out.println("ATM Details: ");
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("ATM card number: " + atmCardNumber);
        System.out.println("Account Number: "+accNumber);
        System.out.println("Expiry date of card: "+expiryDate);
    }
}
public class EndUsers {
    public static void main(String[] args) {

        AtmUse bankDetails = new AtmUse();
        bankDetails.setBankName("Bank of India");
        bankDetails.setAccHolderName("Mayur Limbhore");
        bankDetails.setAccNumber("BOI900509872");
        bankDetails.setBalance(100000);
        bankDetails.setAtmCardNumber(343221442);
        bankDetails.setExpiryDate("01/26");
        bankDetails.bankDisplay();
        bankDetails.atmDisplay();


    }
}

