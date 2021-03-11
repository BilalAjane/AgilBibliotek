package com.bibliotek.bibliotek;

import com.bibliotek.bibliotek.model.Book;
import com.bibliotek.bibliotek.model.Borrower;
import com.bibliotek.bibliotek.model.Media;

import java.time.LocalDate;
import java.util.ArrayList;

public class Loan {

    private ArrayList<Book> bookList;
    private ArrayList<Media> mediaList;
    private LocalDate loanDate;
    private LocalDate deadline;
    private Borrower borrower;

    public Loan(LocalDate loanDate, LocalDate deadline, Borrower borrower) {
        this.loanDate = loanDate;
        this.deadline = deadline;
        this.mediaList = new ArrayList<Media>();
        this.bookList = new ArrayList<Book>();
        this.borrower = borrower;
    }


    public void addBook(Book book){
        bookList.add(book);
    }

    public void addMedia(Media media){
        mediaList.add(media);
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(ArrayList<Media> mediaList) {
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
