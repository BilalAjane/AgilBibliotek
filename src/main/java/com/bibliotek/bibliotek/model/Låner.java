package com.bibliotek.bibliotek.model;

public class Låner {


    long id;
    String navn;
    String mail;


    public Låner(long id, String navn, String mail) {
        this.id = id;
        this.navn = navn;
        this.mail = mail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Låner: \n" + "id: " + id + ", navn: " + navn + ", mail: " + mail;
    }
}
