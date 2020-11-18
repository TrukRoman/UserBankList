package by.devincubator.userBankList.service;

import by.devincubator.userBankList.dao.IUserDAO;
import by.devincubator.userBankList.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private IUserDAO IUserDAO;

    @Autowired
    public void setUserDAO(IUserDAO IUserDAO) {
        this.IUserDAO = IUserDAO;
    }

    @Override
    @Transactional
    public List<User> getRichestOfUsers() throws SQLException {
        return IUserDAO.getRichestOfUsers();
    }

    @Override
    @Transactional
    public User getById(int id) throws SQLException {
        return IUserDAO.getById(id);
    }
}
