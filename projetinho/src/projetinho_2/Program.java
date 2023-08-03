package projetinho_2;

import java.util.Locale;
import java.util.Scanner;

import projetinho.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an inital deposit (y/s)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter inital deposit value: ");
			double initalDeposit = sc.nextDouble();
			account = new Account(number, holder, initalDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a Withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		
		sc.close();
	}

}