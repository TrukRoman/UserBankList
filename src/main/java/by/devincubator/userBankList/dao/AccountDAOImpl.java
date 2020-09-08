package by.devincubator.userBankList.dao;

import by.devincubator.userBankList.model.Account;
import by.devincubator.userBankList.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    DBConnection dBConnection = new DBConnection();

    @Override
    public int getSumAccounts() throws SQLException {
        Connection connection = dBConnection.getConnection();
        String sql = "select sum(account) from account";
        Statement statement = null;
        int sum = 0;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            sum = resultSet.getInt("sum(account)");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
        return sum;
    }

    @Override
    public List<Account> getAllAccounts() throws SQLException {
        Connection connection = dBConnection.getConnection();
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT account_id, account, user_id FROM account";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Account account = new Account();
                account.setAccount_id(resultSet.getInt("account_id"));
                account.setAccount(resultSet.getInt("account"));
                account.setUser_id(resultSet.getInt("user_id"));
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
        return accounts;
    }
}
