package entities;

public class bank {
    private int accNumber;
    private String holder;
    private double balance;

    public bank(int accNumber, String holder) {
        this.accNumber = accNumber;
        this.holder = holder;
    }
    public bank(int accNumber, String holder, double initialDeposit) {
        this.accNumber = accNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }
    
    public void deposit(double value){
        balance+=value;
    }

    public void withDraw(double value){
        balance-=(value + 5.00);
    }

    public String toString(){
        return "Account data:\nAccount "
                + accNumber
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);

    }
    public String toString_(){
        return "Updated account data:\nAccount "
                + accNumber
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);

    }
    

}
