package by.devincubator.userBankList.service;

import by.devincubator.userBankList.dao.AccountDAO;
import by.devincubator.userBankList.dao.AccountDAOImpl;

import java.sql.SQLException;

public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO = new AccountDAOImpl();

    @Override
    public int getSumAccounts() throws SQLException {
        return accountDAO.getSumAccounts();
    }
}
