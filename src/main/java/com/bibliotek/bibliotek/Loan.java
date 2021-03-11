package com.bibliotek.bibliotek;

import java.time.LocalDate;
import java.util.ArrayList;

public class Loan {

    private ArrayList<Book> bookList;
    private ArrayList<Media> mediaList;
    private LocalDate loanDate;
    private LocalDate deadline;

    public Loan(LocalDate låneDato, LocalDate afleveringsFrist) {
        this.loanDate = låneDato;
        this.deadline = afleveringsFrist;
        this.mediaList = new ArrayList<Media>();
        this.bookList = new ArrayList<Book>();
    }


    public void addBook(Bog bog){
        bookList.add(bog);
    }

    public void addMedia(Medie medie){
        bookList.add(medie);
    }

    public ArrayList<Bog> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Bog> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Medie> getMediaList() {
        return mediaList;
    }

    public void setMediaList(ArrayList<Medie> mediaList) {
        this.mediaList = mediaList;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
