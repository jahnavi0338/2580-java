package CRM;

public class Bank {
    public static void main(String[] args) {
        String customerName = "G S Jahnavi";
        String accountNumber = "AB0876543890";
        int customerIFSCCode = 2341678;
        double balance = 5000.56;
        boolean isActive = true;
        int numberOfTransactions = 5;
        double depositAmount = 1000.0;
        double withdrawalAmount = 700.0;

        // Perform deposit and withdrawal
        double totalAmountAfterDeposit = balance + depositAmount;
        numberOfTransactions++;
        double totalAmountAfterWithdrawal = totalAmountAfterDeposit - withdrawalAmount;
         numberOfTransactions++;
        boolean isMinimumBalance = balance <= 1000;

        boolean isVerified = depositAmount > 0 && isActive;

       

        
        System.out.println("Account holder name: " + customerName);
        //System.out.println("Account number: " + accountNumber);
        //System.out.println("IFSC Code: " + customerIFSCCode);
        //System.out.println("Minimum balance warning: " + isMinimumBalance);
        //System.out.println("Account is active: " + isActive);
        //System.out.println("Deposit verified: " + isVerified);
        System.out.println("Final balance: " + totalAmountAfterWithdrawal);
        System.out.println("Number of transactions: " + numberOfTransactions);

    }
}
