package org.vti.Backend;

import org.vti.Entity.Account;

import java.util.List;

public interface IAccountRepository {
    List<Account> getAllAccounts();
    void createAccount(Account Account);
}
