package by.devincubator.userBankList.service;

import by.devincubator.userBankList.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    List<User> getRichestOfUsers() throws SQLException;
}
