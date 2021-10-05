/*
 * Course Name: CST8284_CST8284_Object Oriented Programming
 * Student Name: Simranjeet Singh
 * Class name: BookLoan
 * section:304
 *  Due Date: 13 june 2021
 */
package cst8284Assignment2;

public class BookLoan {
    private User user;
    private Book book;
    private String dueDate;

    public BookLoan(User user, Book book, String dueDate) {//constructor of class
        setUser(user);
        setBook(book);
        setDueDate(dueDate);
    }

    /* All the Getters and Setters for the User,Book and dueDate
     */
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /* to String method will return every Bookloan's information(entered) into a
     * proper format as it was asked in assignment to do
     */
    public String toString() {
        return "************UserName: " +getUser().getLastName() 
        	   +" "+ getUser().getFirstName()+"\n" 
        	   + "************Book Title: " + getBook().getTitle() + "\n" 
        	   + "************Author: " + getBook().getAuthor()+"\n" 
        	   +  "************IsbnNumber: " + getBook().getIsbnNumber() + "\n" 
        	   +  "************Due Date: " + getDueDate();
    }
}

