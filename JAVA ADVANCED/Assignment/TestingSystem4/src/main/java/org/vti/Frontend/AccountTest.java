package org.vti.Frontend;

import org.vti.Backend.IAccountRepository;
import org.vti.Entity.Account;
import org.vti.Backend.AccountRepository;

import java.util.List;

public class AccountTest {
	public static void main(String[] args) {
		IAccountRepository repository = new AccountRepository();

		System.out.println("***********GET ALL ACCOUNTS***********");

		List<Account> Accounts = repository.getAllAccounts();

		for (Account Account : Accounts) {
			System.out.println(Account);
		}

		System.out.println("\n\n***********CREATE ACCOUNT***********");

		Account accountCreate = new Account();
		accountCreate.setUsername("NguyenVanA");
		accountCreate.setEmail("NguyenVanA@gmail.com");
		accountCreate.setFirstName("A");
		accountCreate.setLastName("Nguyen Van");

		repository.createAccount(accountCreate);

	}
}
