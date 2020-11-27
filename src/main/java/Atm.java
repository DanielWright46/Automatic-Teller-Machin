public class Atm {
    private int initalBalance;
    private String pin;

    //getter
    public int getBalance() {
        return initalBalance;
    }
    //constructor
    public Atm(int initalBalance, String pin) {
        this.initalBalance = initalBalance;
        this.pin = pin;
    }
    // methods of behavior
    public void deposit(int amountToDespost) {
        initalBalance += amountToDespost;
    }

    public void withdrawl(int amountToWithdrawl) {
        if(amountToWithdrawl > initalBalance){
            initalBalance-= 0;
        }else {
            initalBalance -= amountToWithdrawl;
        }
    }

    public boolean accessAccount(String userEnteredPin) {
        if(userEnteredPin.equals(pin)) {
            return true;
        }else {
            return false;
        }
    }
}
