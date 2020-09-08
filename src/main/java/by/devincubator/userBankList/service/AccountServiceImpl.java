package by.devincubator.userBankList.service;

import by.devincubator.userBankList.dao.AccountDAO;
import by.devincubator.userBankList.dao.AccountDAOImpl;
import by.devincubator.userBankList.model.Account;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO = new AccountDAOImpl();

    @Override
    public int getSumAccounts() throws SQLException {
        return accountDAO.getSumAccounts();
    }

    @Override
    public List<Account> getAllAccounts() throws SQLException {
        return accountDAO.getAllAccounts();
    }
}
