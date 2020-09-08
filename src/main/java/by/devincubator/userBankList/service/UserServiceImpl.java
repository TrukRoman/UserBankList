package by.devincubator.userBankList.service;

import by.devincubator.userBankList.dao.UserDAO;
import by.devincubator.userBankList.dao.UserDAOImpl;
import by.devincubator.userBankList.model.User;

import java.sql.SQLException;
import java.util.List;


public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public List<User> getRichestOfUsers() throws SQLException {
        return userDAO.getRichestOfUsers();
    }

    @Override
    public User getById(int id) throws SQLException {
        return userDAO.getById(id);
    }
}
