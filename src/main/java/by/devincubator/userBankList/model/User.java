package by.devincubator.userBankList.model;

public class User {
    private int user_id;
    private String name;
    private String surname;

    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "id=" + user_id +
                " " + name +
                " " + surname;
    }
}
