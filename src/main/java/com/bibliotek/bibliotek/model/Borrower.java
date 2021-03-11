package com.bibliotek.bibliotek.model;

public class Borrower {


    long id;
    String name;
    String mail;


    public Borrower(long id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String navn) {
        this.name = navn;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Borrower: \n" + "id: " + id + ", name: " + name + ", mail: " + mail;
    }
}
