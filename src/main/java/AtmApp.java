import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Atm myAtm = new Atm(500, "1234");

        System.out.println("Welcome to the Bank of Java");
        System.out.println("Please enter your pin");
        String userEnteredPin = input.nextLine(); // string stored from user input

        while(myAtm.accessAccount(userEnteredPin) == false){
            System.out.println("Incorrect pin");
            userEnteredPin = input.nextLine();
        }
        System.out.println("Please choose and option");
        System.out.println("Press 1 to check balance");
        System.out.println("Press 2 to do a deposit");
        System.out.println("Press 3 to withdrawal");
        System.out.println("Press 4 to exit");
        String userChoice = input.nextLine();

        while(!userChoice.equals("4")){
            if(userChoice.equals("1")){
                System.out.println("Your Balance is " + myAtm.getBalance());
            }else if(userChoice.equals("2")){
                System.out.println("How much is Deposit");
                int amountToDespost = input.nextInt();
                myAtm.deposit(amountToDespost);
            }else if (userChoice.equals("3")){
                System.out.println("How much for Withdrawal");
                int amountToWithdrawl = input.nextInt();
                myAtm.withdrawl(amountToWithdrawl);
            }else {
                System.out.println("Error! Press 1 - 4 from menu");
            }
            System.out.println("Please choose and option");
            System.out.println("Press 1 to check Balance");
            System.out.println("Press 2 to do a Deposit");
            System.out.println("Press 3 to Withdrawal");
            System.out.println("Press 4 to Exit");
            userChoice = input.nextLine();
        }
        System.out.println("Thanks for banking");
        input.close();
    }
}
