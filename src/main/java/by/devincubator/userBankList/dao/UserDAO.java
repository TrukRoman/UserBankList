package by.devincubator.userBankList.dao;

import by.devincubator.userBankList.model.Account;
import by.devincubator.userBankList.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class UserDAO implements IUserDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getRichestOfUsers() {
        Session session = sessionFactory.getCurrentSession();

        List<User> users = session.createQuery("from User").list();
        List<Account> accounts = session.createQuery("from Account").list();

        Optional<Account> maxAccount = accounts
                .stream()
                .max(Comparator.comparing(Account::getAccount));

        int maxValue = maxAccount.get().getAccount();

        return users.stream().filter(user -> user.getAccount().getAccount() == maxValue).collect(Collectors.toList());
    }

    @Override
    public User getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }
}
