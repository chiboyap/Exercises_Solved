package Exercise3;
/*  Program created by Uchechi
    Date:   27/09/2020
    Time:   10:31 pm
*/


public class Ex3_11 {
    private String name;
    private double balance;

    //constructor for Ex3_11 (Account)
    public Ex3_11(String name, double balance ){
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }


    //deposit method
    public void deposit (double depositAmount){
        if (depositAmount > 0.0)
            balance = balance + depositAmount ; //adds deposit to balaance

    }

    //withdrawal method
    public void withdrawal (double withdrawalAmount){
        if (withdrawalAmount > balance )
            System.out.println("Withdrawal Amount exceeds balance");
        else
            balance = balance - withdrawalAmount ;
    }

// set balance
    public void setBalance() {
        setBalance();
    }

    public void setBalance (double balance){
        this.balance = balance;
    }


    //method balance return
    public double getBalance (){
        return balance ;
    }

    //method name
    public void setName (String name ){
        this.name = name ;
    }

    //method return name
    public String getName() {
        return name;
    }
}

