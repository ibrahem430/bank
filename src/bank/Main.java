package bank;

public class Main {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount("644676875", 0);
		// open a new account with this information (644676875,0)
		System.out.println("acount number is " + obj.getAccountNunber());
		System.out.println("acount number is " + obj.getBalance());
		// make some transaction
		obj.deposit(700);
		obj.withdrow(500);
		obj.deposit(1000);
		obj.deposit(404);
		obj.deposit(3937);
		obj.withdrow(644);
		obj.deposit(863);
		obj.withdrow(555);
		obj.withdrow(5205);
		obj.deposit(3937);
		obj.withdrow(644);
		obj.deposit(863);
		obj.withdrow(555);
		System.out.println("current balanse is " + obj.getBalance());

	}

}
