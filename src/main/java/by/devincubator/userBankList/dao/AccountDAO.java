package by.devincubator.userBankList.dao;

import by.devincubator.userBankList.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDAO implements IAccountDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public int getSumAccounts() {
        Session session = sessionFactory.getCurrentSession();
        long s = (long) session.createQuery("SELECT sum(account) from Account").getSingleResult();
        int sum = Math.toIntExact(s);
        return sum;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Account>  getAllAccounts() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Account").list();
    }
}
