package by.devincubator.userBankList.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int account_id;
    private int account;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "account")
    @JoinColumn(name = "user_id")
    private User user;

    public Account() {
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "{ account_id=" + account_id +
                ", account=" + account +
                '}';
    }
}
