package com.qf.pojo;

public class User {

    private Integer id;

    private String name;

    private String password;

    private String birth;

    private String idCard;

    private String tel;

    private String balance;

    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", birth='" + birth + '\'' +
                ", idCard='" + idCard + '\'' +
                ", tel='" + tel + '\'' +
                ", balance='" + balance + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, String password, String birth, String idCard, String tel, String balance, String username) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.birth = birth;
        this.idCard = idCard;
        this.tel = tel;
        this.balance = balance;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
