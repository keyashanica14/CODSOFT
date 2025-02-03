import java.util.Scanner;

class ATM {
    private double balance;
    Scanner sc = new Scanner(System.in);
    public ATM(double initialBalance) {

        this.balance = initialBalance;
    }
    
    public void checkBalance() {

        System.out.println("Current Balance: " + balance);
    }
    
    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;
            System.out.println("Successfully deposited: " + amount);
            System.out.println();
            checkBalance();
        } 

        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            System.out.println();
            checkBalance();
        } 

        else if(amount > balance)
            System.out.println("Insufficient balance");

        else 
            System.out.println("Invalid withdrawal amount");
        
    }
    public void Menu(){

        System.out.println("----------Welcome to the ATM----------");
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Choose an option: ");

        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        Again();    

    }
    public void Again(){
            System.out.println();
            System.out.println("Do You Want To Bank Again?");
            System.out.println("1. Yes   2.No");
            int opt= sc.nextInt();

            switch(opt){

            case 1: Menu();
                break;
            case 2:System.out.println("Thank You For Banking With Us... ");
            }
    }
}

class AtmInterface {

    public static void main(String[] args) {
        ATM atm = new ATM(0.0); 
        atm.Menu();
        
       
    }
}
