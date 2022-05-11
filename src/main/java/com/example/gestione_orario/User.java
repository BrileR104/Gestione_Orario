package com.example.gestione_orario;

public class User {
    private String username;
    private String password;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(User u){
        return username.equals(u.username) && password.equals(u.password);
    }

    public boolean equals(String u, String p){
        return username.equals(u) && password.equals(p);
    }

}