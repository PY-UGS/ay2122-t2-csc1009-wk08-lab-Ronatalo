import java.util.Scanner;

public class BankDemoTest{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double depositedAmount = input.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(depositedAmount, "1009");

        try{
            System.out.println("Please enter withdrawal amount: ");
            double amount = input.nextDouble();
            input.close();
            checkingAccount.withdraw(amount);
            System.out.println("The balance after withdrawal is: $" + checkingAccount.getBalance());
        }
        
        catch (InsufficientFundsException e){
            double shortBy = checkingAccount.getBalance() - e.getAmount();
            System.out.println("Sorry, but your account is short by: $ " + -shortBy);
        }
    }
}