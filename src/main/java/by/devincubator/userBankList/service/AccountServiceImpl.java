package by.devincubator.userBankList.service;

import by.devincubator.userBankList.dao.IAccountDAO;
import by.devincubator.userBankList.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private IAccountDAO IAccountDAO;

    @Autowired
    public void setAccountDAO(IAccountDAO IAccountDAO) {
        this.IAccountDAO = IAccountDAO;
    }

    @Override
    @Transactional
    public int getSumAccounts() throws SQLException {
        return IAccountDAO.getSumAccounts();
    }

    @Override
    @Transactional
    public List<Account> getAllAccounts() throws SQLException {
        return IAccountDAO.getAllAccounts();
    }
}
