package cn.itcast.librarymanagementsystem.model;

public class UserData {
    private  String Username;
    private  String Password;

    public UserData(String Username, String Password) {
        this.Username=Username;
        this.Password=Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
