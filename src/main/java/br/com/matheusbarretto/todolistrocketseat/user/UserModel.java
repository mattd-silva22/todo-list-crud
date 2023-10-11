package br.com.matheusbarretto.todolistrocketseat.user;

public class UserModel {
    private String fullname;
    private String username;
    private String email;
    private String password;

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }   

    public String getFullname() {
        return this.fullname;
    }   

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEmail(String email) {
        this.email = email;
    }   

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

}
