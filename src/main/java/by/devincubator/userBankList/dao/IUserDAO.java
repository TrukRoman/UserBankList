package by.devincubator.userBankList.dao;

import by.devincubator.userBankList.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    List<User> getRichestOfUsers() throws SQLException;
    User getById (int id) throws SQLException;
}
