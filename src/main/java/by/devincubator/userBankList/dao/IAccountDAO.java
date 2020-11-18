package by.devincubator.userBankList.dao;

import by.devincubator.userBankList.model.Account;

import java.sql.SQLException;
import java.util.List;

public interface IAccountDAO {
    int getSumAccounts() throws SQLException;
    List<Account> getAllAccounts() throws SQLException;
}
