package bankmanagementsystem;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
     
	Scanner input = new Scanner(System.in);
     DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
     
     public int setCustomerNumber(int customerNumber)	{
    	 this.customerNumber = customerNumber;
    	 return customerNumber;
     }
     
     public int getCustomerNumber() {
    	 return customerNumber;
     }
     
     public int setPinNumber(int pinNumber) {
    	 this.pinNumber = pinNumber;
    	 return pinNumber;
     }
     
     public int getPinNumber() {
    	 return pinNumber;
     }
     
     public double getCheckingBalance() {
    	 return checkingBalance;
     }
     
     public double getSavingBalance() {
    	 return savingBalance;
     }
     
     public double calcCheckingWithdraw(double amount) {
    	 checkingBalance = (checkingBalance - amount);
    	 return checkingBalance;
     }
     
     public double calcSavingWithdraw(double amount) {
    	 savingBalance = (savingBalance - amount);
    	 return savingBalance;
     }
     
     public double calcCheckingDeposit(double amount) {
    	 checkingBalance = (checkingBalance + amount);
    	 return checkingBalance;
     }
     
     public double calcSavingDeposit(double amount) {
    	 savingBalance = (savingBalance + amount);
    	 return savingBalance;
     }
     
     public void getCheckingWithdrawInput() {
    	 System.out.println("Checking Amount Balance: " + moneyFormat.format(checkingBalance));
    	 System.out.println("Amount you want to withdraw from checking Account: ");
    	 double amount = input.nextDouble();
    	 
    	 if((checkingBalance - amount) >= 0) {
    		 calcCheckingWithdraw(amount);
             System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
         }
    	 else {
    		 System.out.println("Balance cannot be negative." + "\n");
    	 }
     }
     
     public void getSavingWithdrawInput() {
    	 System.out.println("Savings Account Balance: " + moneyFormat.format(savingBalance));
    	 System.out.println("Amount you want to withdraw from Savings Account: ");
    	 double amount = input.nextDouble(); 
    	 
    	 if((savingBalance - amount) >= 0) {
    		 calcSavingWithdraw(amount);
    		 System.out.println("New Savings Account balance: " + savingBalance + "\n"); 
    	 }
    	 else
    		System.out.println("Balance cannot be negative." + "\n");	 
     }
     
     public void getCheckingDepositInput() {
    	 System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
    	 System.out.println("Amount you want to deposit to Checking Account: ");
    	 double amount = input.nextDouble();
    	 if((checkingBalance + amount) >= 0) {
    		 calcCheckingDeposit(amount);
    		 System.out.println("New Checking Account Balance:  " + moneyFormat.format(checkingBalance) + "\n");
    	 }
    	 else
    		 System.out.println("Balance cannot be negative." + "\n");
     }
     
     public void getSavingDepositInput() {
    	 System.out.println("Savings Account Balance: " + moneyFormat.format(savingBalance));
    	 System.out.println("Amount you want to deposit to Savings Account: ");
    	 double amount = input.nextDouble(); 
    	 
    	 if((savingBalance + amount) >= 0) {
    		 calcSavingWithdraw(amount);
    		 System.out.println("New Savings Account balance: " + moneyFormat.format(savingBalance) + "\n"); 
    	 }
    	 else
    		System.out.println("Balance cannot be negative." + "\n");	 
     }
     
     private int customerNumber;
     private int pinNumber;
     private double checkingBalance = 0;
     private double savingBalance = 0;
     
     
}
