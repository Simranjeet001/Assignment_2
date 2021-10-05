/*
 * Course Name: CST8284
 * Student Name: Simranjeet Singh
 * Class name: LendingLibraryController
 * section:304
 *  Due Date: 13 june 2021
 */
package cst8284Assignment2;

import java.util.Scanner;

public class LendingLibraryController {

    private static Scanner input = new Scanner(System.in);
    private LendingLibrary lib;
//    private Book b;
//    private User u;
//    private BookLoan l;

    public LendingLibraryController() {
        lib = new LendingLibrary();

    }

    private static String getResponseTo(String s) {
        System.out.print(s);
        return (input.nextLine());
    }

    /*
      the addBook method below takes the input from user that are required
      to add new book to an array and it also perform other tasks using an
      if else statement. it first verify the isbn number that is oi of proper
       10 digits and perform other tasks. that is it call method of lending library using its object name bookLib
     */
    public void addBook() {
        System.out.println("New Book Entry");
//        System.out.println("Title: ");
        String title = getResponseTo("Title");
//        System.out.println("Author: ");
        String author = getResponseTo("Author");

       // System.out.println("Publication date (year in NNNN format)");
        String year = getResponseTo("Publication date (year in NNNN format)");
        //System.out.println("ISBN number (10 digits):");
        String isbnNumber = getResponseTo("ISBN number (10 digits): ");
        
        if (Book.verifyISBNNumber(isbnNumber)) {
        	if(lib.findBook(isbnNumber)!= null) {
              System.out.println("the book is already Exist");	
        }else {
        	Book book1 = new Book()
        }
    }	}
//            b = new Book(title, author, isbnNumber, year);
//            Book.verifyISBNNumber(isbnNumber);
//            if (b.verifyISBNNumber(isbnNumber)) {
//                bookLib.addBook(b);
//                System.out.println("Book was added");
//            } else {
//                System.out.println("Isbn is invalid");
//            }
//
//        }
//        else {
//            System.out.println("Year not valid");
//        }
//        
//
//    }

    /*
   the changeBook method below takes the input of isbn  from user and first
   verify it then using a foreach loop it changes the Author name,
   publication date and the title of the book and end the string
    at the end which show all the updated details

 */
    public void changeBook() {
        System.out.println("Request to change book details");
        System.out.println("Please enter book ISBN number");
        String isbn = input.nextLine();

        if (b.verifyISBNNumber(isbn)) {
            System.out.println("Enter New Book Title");
            String title = input.nextLine();
            System.out.println("Enter Author Name");
            String author = input.nextLine();
            System.out.println("Enter Publication Date");
            String pubDate = input.nextLine();

            for (Book book : bookLib.getBookReg()) {
                if (book != null && book.getIsbnNumber().equals(isbn)) {
                    book.setAuthor(author);
                    book.setTitle(title);
                    book.setPublicationDate(pubDate);
                    System.out.println("Book was updated");
                    System.out.println(book.toString());
                    break;
                }
            }
        } else {
            System.out.println("Isbn is Invalid");
        }

    }

   /*
   the findBook method below takes the input of isbn  from user and first
   verify it in an array using findBook method then using a foreach loop it changes the Author name,
   publication date and the title of the book and end the string
    at the end which show all the updated details
   */
    public void findBook() {
        System.out.println("Enter Isbn number:");
        Book book = (Book) bookLib.findBook(input.nextLine());
        if (book == null) {
            System.out.println("Book not found");
        } else {
            System.out.println(book.toString());
        }
    }

    /*
    this list book method will list all the books in the array by using a
    foreach loop and an if condition in it which states that if the there
     is no book in an array it will not print ot list anything
     */
    public void listBooks() {
        int bookcount = 1;
        for (Book book : bookLib.getBookReg()) {
            if (book != null) {
                System.out.println("Book #" + bookcount);
                System.out.println(book);
                bookcount++;
            }

        }
    }

        /*
       Same like addBook method this method below takes the input from user that are required
      to add or make new book to an array. Also, This method is using an if else
      statement in which if the user press enter without entering age then it will add 18 by
       default(as per appendix) and the id that the constructor using which is called
       by  lendingLibrary's object name bookLib and the age will be invalid if the program
        did not satisfy any condition
     */
    public void addUser() {
        System.out.println("New User Entry");
        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        System.out.println("User address");
        String address = input.nextLine();
        System.out.println("Age");
        String age = input.nextLine();

        if (age.equals("")){
            u = bookLib.makeUser(1000, firstName, lastName, address, 18);
            bookLib.addUser(u);
            System.out.println("User Was added");
        }
        else if (isValidNumber(age)) {
            u = bookLib.makeUser(1000, firstName, lastName, address, Integer.parseInt(age));
            bookLib.addUser(u);
            System.out.println("User Was added");
        }
        else {
            System.out.println("age is invalid");
        }
    }

    /*
      the change user method below changes the user address by verifying
      the first name and the last name of the user using find user method
      and if the user do not exist it will display an error message and
      id it is valid it will change the user address to the one requested.
       Also, at the end it will the updated details using toString method
     */
    public void changeUser() {
        System.out.println("Request to change Address");
        System.out.println("Enter First Name");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name");
        String lastName = input.nextLine();

        if (bookLib.findUser(firstName, lastName) == null) {
            System.out.println("User Not Exist");
        }
        System.out.println("Enter New address");
        String address = input.nextLine();
        for (User user : bookLib.getUserReg()) {
            if (user != null && user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)) {
                user.setAddress(address);
                System.out.println("User Address was updated");
                System.out.println(user.toString());
                break;
            }
        }
    }

    public void findUser() {

        System.out.println("Enter first name: ");
        String first = input.nextLine();
        System.out.println("Enter last name: ");
        String last = input.nextLine();

        User u = bookLib.findUser(first, last);
        if (u == null) System.out.println("User not found");

        System.out.println(u);

    }

    /*
    this listUsers method will list all the users in the array by using a
    foreach loop and an if condition in it which states that if the there
     is no user in an array it will not print ot list anything if user
     exist it will print the all users one by one in the series in which they were added
     */
    public void listUsers() {
        int userCount = 1;
        for (User user : bookLib.getUserReg()) {
            if (user != null) {
                System.out.println("User #" + userCount);
                System.out.println(user);
                userCount++;
            }
        }
    }

    /*
    This method takes input from the user and adds a new loan entry to the loan register in the
    Lending Library controller. It checks if the loan exixts or no and if it exists it does not adds the loan.
     */
    public void addLoan() {
        System.out.println("New Loan Entry");
        System.out.println("User Last Name: ");
        String lastName = input.nextLine();
        System.out.println("User First Name: ");
        String firstName = input.nextLine();
        System.out.println("Book ISBN Number");
        String isbn = input.nextLine();
        System.out.println("Loan Date(yyyy-mm-dd");
        String dueDate = input.nextLine();

        User user = bookLib.findUser(firstName, lastName);
        if (user == null) {
            System.out.println("User not found");
        }
        Book book = bookLib.findBook(isbn);
        if (book == null) {
            System.out.println("Book not found");
        }
        if (bookLib.isBookLoaned(book)) {
            System.out.println("Book is already loaned");
        } else if (bookLib.userCanBorrow(user)) {
            System.out.println("User is not allowed to borrow more than 2 books");
        }

        BookLoan loan = new BookLoan(user, book, dueDate);
        bookLib.addLoan(loan);
        System.out.println("Loan is added");
        System.out.println(bookLib.findLoan(isbn).toString());

    }


    public void changeLoan() {
        System.out.println("Modify Loan details");
        System.out.println("ISBN number for the loan you want to modify: ");
        String isbn = input.nextLine();

        if (b.verifyISBNNumber(isbn)) {


        for (BookLoan bookLoan : bookLib.getLoanReg()) {
            if (bookLoan != null && bookLoan.getBook().getIsbnNumber().equals(isbn)) {

                System.out.println(bookLoan.toString());

                System.out.println("Enter New Due date");
                String dueDate = input.nextLine();
                bookLoan.setDueDate(dueDate);
            }
            break;
        }
        }else{
            System.out.println("ISbn is invalid");
        }
    }


    public void findLoan() {
        System.out.println("Enter User First Name");
        BookLoan bookLoan = (BookLoan) bookLib.findLoan(input.nextLine());
        if (bookLoan == null) {
            System.out.println("Loan not found");
        } else {
            System.out.println(bookLoan.toString());
        }

    }

        /*
    this listLoans method will list all the Loans in the array by using a
    foreach loop and an if condition in it which states that if the there
     is no Loans exist in an array it will not print ot list anything if Loans
     exist it will print the all Loans one by one in the series in which they were added
     */
    public void listLoans() {
        int loanCount = 1;
        for (BookLoan bookLoan : bookLib.getLoanReg()) {
            if (bookLoan != null) {
                System.out.println("Bookloan #" + loanCount);
                System.out.println(bookLoan);
                loanCount++;
            }
        }
    }

    /*
    this isValidNumber method used to validate that the input(age) entered
     by user is the proper integer and this method has an try catch statement.
      it is used to catch the error that may come if user enter any invalid
      age(improper as it may be string like ten)
     */

    private static Boolean isValidNumber(String input) {

        if (input.equals("")) return true;

        try {
            int age = Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}







