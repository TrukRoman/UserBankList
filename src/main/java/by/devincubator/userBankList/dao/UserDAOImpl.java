package by.devincubator.userBankList.dao;

import by.devincubator.userBankList.model.User;
import by.devincubator.userBankList.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    DBConnection dBConnection = new DBConnection();

    @Override
    public List<User> getRichestOfUsers() throws SQLException {
        Connection connection = dBConnection.getConnection();
        List<User> users = new ArrayList<>();
        String sql = "select user.user_id, name, surname from user " +
                "left join account on user.user_id = account.user_id " +
                "where account.account=(select max(account) from account)";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                User user = new User();
                user.setUser_id(resultSet.getInt("user_id"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
        return users;
    }

    @Override
    public User getById(int id) throws SQLException {
        Connection connection = dBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        String sql = "SELECT * FROM user WHERE user_id=?";
        User user = new User();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            user.setUser_id(resultSet.getInt("user_id"));
            user.setName(resultSet.getString("name"));
            user.setSurname(resultSet.getString("surname"));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
        return user;
    }
}
