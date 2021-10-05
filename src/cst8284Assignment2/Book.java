/*
 * Course Name: CST8284_Object Oriented Programming
 * Student Name: Simranjeet Singh
 * Author: Samira Quaaz , Simranjeet Singh
 * Class name: Book
 * section:304
 *  Due Date: 13 june 2021
 */

/*
 * this class has code(verifyISBNNumber Method) from the instructor copy provided by professor Samira Quaaz
 */
package cst8284Assignment2;

public class Book {
    //fields
	private static final int ISBN_LENGTH = 10;
    private String title;
    private String author;
    private String publicationDate;
    private String isbnNumber;

    public Book(String title, String author, String isbn, String pubDate) {
        setTitle(title);
        setAuthor(author);
        setIsbnNumber(isbn);
        setPublicationDate(pubDate);

    }

    /* All the Getters and Setters for the Title,Author, Isbn and pubDate
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
//        if(publicationDate.)
//        int pubDate = Integer.parseInt(publicationDate);
//
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    // this method is used to verify is if the isbn entered of proper 10 digits
//    public static boolean verifyISBNNumber(String s) {
//        int num = s.length();//Saving the length of isbn which was entered as string to an int to check is it of 10 proper digits
//        if (num != 10) {
//            return false;
//        }
//        return true;
//    }
    
    /*
     * the code below taken from the instructor's copy of assignment 01
     *  and the author of this code is Professor Samira Quaaz.
     */
	public static boolean verifyISBNNumber(String s) {
		int num=0;
		for (int i=0; i < s.length(); i++) {
			 if (Character.isDigit(s.charAt(i))) {
				 num++;
			 }
		}
		return num == ISBN_LENGTH;
	}

    /* to String below method will return every Book's information(entered) into a
     * proper format as it was asked in assignment to do(in the output section
     */
    public String toString() {
        return "************Title: " + getTitle() + " \n" 
             + "************Author: " + getAuthor() + "\n"
             + "************Publication Date: " + getPublicationDate() + "\n" 
             + "************ISBN: " + getIsbnNumber();
    }
}






