
package com.mycompany.tiendalogin;


public class User {
    private String user;
    private String password;
    private String name;
    private String lastNAme;
    private String mail;

    public User(String user, String password, String name, String lastNAme, String mail) {
        this.user = user;
        this.password = password;
        this.name = name;
        this.lastNAme = lastNAme;
        this.mail = mail;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
