package Application;

import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Account;
import Model.Exception.Exception;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		
		System.out.printf("Enter the amount for withdraw: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch (Exception e) {
			System.out.print("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.print("Unexpected error!");
		}

		sc.close();

	}

}
