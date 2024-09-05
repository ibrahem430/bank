package bank;

public class BankAccount {
private String AccountNumber;
 private double Balance;


 public BankAccount(String accountNumberString ,double initialbalance) {
	 this.AccountNumber=accountNumberString;
	 setBalance(initialbalance);
 }
 public String getAccountNunber() {
	 return AccountNumber;
 }
 public double getBalance() {
	return Balance;

}
 private void setBalance(double Balance) {
	 if (Balance>=0) {
		 this.Balance=Balance;
	 }
	 else {
		 System.out.println("sorry please enter a valid positive number ");
	 }
 }
 public void bankserves() {
	 this.Balance=this.Balance-0.5;
 }
 public void deposit (double amount) {
	 if (amount>0) {
		 setBalance(this.Balance+amount);
	 }else {
		System.out.println("please diposit an amount of 1 jd and higher  ");
	}
 }
 public void withdrow(double amount) {
	 if(amount>0&& amount<=this.Balance) {
		 setBalance(this.Balance-amount);
		 bankserves();
	 }else {
		System.out.println("please correct the withdrawal amount");
	}
 }
}