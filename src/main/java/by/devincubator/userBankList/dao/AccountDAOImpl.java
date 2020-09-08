package by.devincubator.userBankList.dao;

import by.devincubator.userBankList.util.DBConnection;

import java.sql.*;

public class AccountDAOImpl implements AccountDAO {
    DBConnection DBConnection = new DBConnection();

    @Override
    public int getSumAccounts() throws SQLException {
        Connection connection = DBConnection.getConnection();
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
}
