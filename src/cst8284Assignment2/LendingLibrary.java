/*
 * Course Name: CST8284_Object Oriented Programming
 * Student Name: Simranjeet Singh
 * Class name: LendingLibrary
 * section:304
 *  Due Date: 13 june 2021
 */
package cst8284Assignment2;

public class LendingLibrary {
    //Initializing class fields
    private static final int MAX_BOOK_NUMBER = 10;
    private static final int MAX_USER_NUMBER = 5;
    private static final int MAX_LOAN_NUMBER = 5;
    
    private static final int MAX_LOAN_PER_USER = 2;

    /*
    Indexes for the Arrays which initially has been set to 0
     */
    private static int lastBookIndex = 0;
    private static int lastUserIndex = 0;
    private static int lastLoanIndex = 0;

    //Initializing Arrays
    private Book[] libBooks;


    private User[] libUsers;


    private BookLoan[] libBookLoans;
    
    //getters and setters for the last indexes of book ,bookloan, user
    public int getLastBookIndex() {
    	return lastBookIndex;
    }
    public int getlastUserIndex() {
    	return lastUserIndex;
    }
    public int getlastLoanIndex() {
    	return lastLoanIndex;
    }


    /*
    Constructor of the class Containing initializing of arrays
     */
    public LendingLibrary() {
    	libBooks = new Book[MAX_BOOK_NUMBER];
    	
    	libUsers = new User[MAX_USER_NUMBER];
    	
    	libBookLoans = new BookLoan[MAX_LOAN_NUMBER];
     }
    
    /*
     * Getters and setters for the user book and library.
     */
    public Book[] getLibBooks() {
		return libBooks;
	}
	public void setLibBooks(Book[] libBooks) {
		this.libBooks = libBooks;
	}
	public User[] getLibUsers() {
		return libUsers;
	}
	public void setLibUsers(User[] libUsers) {
		this.libUsers = libUsers;
	}
	public BookLoan[] getLibBookLoans() {
		return libBookLoans;
	}
	public void setLibBookLoans(BookLoan[] libBookLoans) {
		this.libBookLoans = libBookLoans;
	}
	public User makeUser(String firstName, String lastName, String address, int age) {
        return new User(lastUserIndex,firstName, lastName, address, age);
    }

    /*this addUser method with return type boolean Creates a details
     * (that means it add the user to an array if the condition passes and then increment teh index)
     * about User. first it verify the loan in the find
     * user by isbn number if it's null the it save that information in an array
     */
    public boolean addUser(User u) {
        if (findUser(u.getFirstName(), u.getLastName()) == null) {
            libUsers[lastUserIndex] = u;
            lastUserIndex++;
            return true;
        }
        return false;
    }

    /*this addBook method with return type boolean Creates a details
     * (that means it add the book to an array if the condition passes)
     * about book. first it verify the loan in the find
     * user by isbn number if it's null the it save that information in an array
     */
    public boolean addBook(Book b) {
        if (findBook(b.getIsbnNumber()) == null) {
            bookReg[lastBookIndex] = b;
            lastBookIndex++;
            return true;
        }
        return false;
    }

    /*this method Create a details about loan of the book. first it verify the loan in the find
     *   user by isbn number if it's null the it save that information in an array
     */
    public boolean addLoan(BookLoan l) {
        if (findLoan(l.getBook().getIsbnNumber()) == null) {
            loanReg[lastLoanIndex] = l;
            lastLoanIndex++;
            return true;
        }
        return false;
    }

    /*
     * Methods findUser is used to find the user
     * using an for each loop on User Array and an if else statement
     * which add further properties that is the user null then it will return null
     */
    public User findUser(String firstName, String lastName) {

        for (User user : userReg) {
            if (user == null) return null;
            else if (user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)) return user;
        }
        return null;
    }

    /*
     * Methods findBook is used to find the book
     * using an for each loop and an if else statement which add further
     */
    public Book findBook(String isbnNumber) {

        for (Book book : bookReg) {
            if (book == null) return null;
            else if (book.getIsbnNumber().equals(isbnNumber)) return book;
        }
        return null;
    }

    /*
     * Methods findLoan is used to find the loan information from an array BookLoan
     *  using an for each loop and an if else statement which add further
     */
    public BookLoan findLoan(String isbnNumber) {
        for (BookLoan bookLoan : loanReg) {
            if (bookLoan == null) return null;
            else if (bookLoan.getBook().getIsbnNumber().equals(isbnNumber)) return bookLoan;
        }
        return null;
    }

    /*
     * this userCanBorrow method verify that  is the user allowed to borrow a new book as the book limit is 2
     */
    public boolean userCanBorrow(User u) {
        for (User user : userReg) {
            if (user.getFirstName().equals(u.getFirstName()) && (user.getLastName().equals(u.getLastName()))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /*this isBookLoaned method verify that the book is loaned or not
    using a foreach loop then return true or false
     */
    public boolean isBookLoaned(Book b) {

        for (Book book : bookReg) {
            if (book.getIsbnNumber().equals(b.getIsbnNumber())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* All the Getters for the arrays Book[],User[], BookLoan[] which is used to
     list or print the details about all the users,loans, books at request(when user type 4,8,12 at the input stream)
     */
    public Book[] getBookReg() {
        return bookReg;
    }

    public User[] getUserReg() {
        return userReg;
    }

    public BookLoan[] getLoanReg() {
        return loanReg;
    }
}

    

    	
    	
    

