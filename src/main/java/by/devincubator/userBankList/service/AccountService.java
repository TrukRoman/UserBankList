package by.devincubator.userBankList.service;

import by.devincubator.userBankList.model.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountService {
    int getSumAccounts() throws SQLException;
    List<Account> getAllAccounts() throws SQLException;
}
