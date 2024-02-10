package collection.taskCollection;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    public String login;
    public String password;
    public LocalDate createdDate;

    public User(String login, String password, LocalDate createdDate) {
        this.login = login;
        this.password = password;
        this.createdDate = createdDate;
    }

    public User(String login) {
        this.login = login;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof User)) return false;

        User user = (User) obj;

        return Objects.equals(login, user.login) && Objects.equals(password, user.password) &&
                Objects.equals(createdDate, user.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, createdDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
