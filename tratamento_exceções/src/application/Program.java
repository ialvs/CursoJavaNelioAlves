package application;

import java.util.Locale;

import entities.Account;
import exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Account account = new Account(8021, "Bob Brown", 0.0, 300.0);

		try {
			account.withdraw(1);
			System.out.println(account.getBalance());
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
