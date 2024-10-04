package com.pluralsight;
import java.awt.print.Book;

public class BOOK {

    private int id;

    private String isbn;

    private String title;

    private boolean isCheckedOut;

    private String checkedOutTo;


    public BOOK(int id, String isbn, String title, String checkedOutTo,boolean isCheckedOut ) {

        this.id = id;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
        this.title = title;
        this.checkedOutTo = checkedOutTo;


}
     public int getId() {
       return id;
 }

      public void setId(int id){
        this.id = id;
 }

     public String getIsbn(){
        return isbn;
 }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
     public String getTitle() {
         return title;
 }
    public String setTitle(String title) {
        this.title = title;
    }

    public String getcheckedOutTo(){
        return checkedOutTo;
    }
    public String setcheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;

        {

     public boolean isCheckedOut() {
         return isCheckedOut;
     }





 }