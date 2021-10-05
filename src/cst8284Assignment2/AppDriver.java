/*
 * Course Name: CST8284_300
 * Student Name: Simranjeet Singh
 * Class name: AppDriver
 * section:304
 *  Due Date: 13 june 2021
 */
package cst8284Assignment2;

import java.util.Scanner;

class AppDriver {
    private static final int APP_EXIT = 0;
    private static final int APP_ADD_BOOK = 1;
    private static final int APP_MOD_BOOK = 2;
    private static final int APP_FIND_BOOK = 3;
    private static final int APP_LIST_BOOKS = 4;
    private static final int APP_ADD_USER = 5;
    private static final int APP_MOD_USER = 6;
    private static final int APP_FIND_USER = 7;
    private static final int APP_LIST_USERS = 8;
    private static final int APP_ADD_LOAN = 9;
    private static final int APP_MOD_LOAN = 10;
    private static final int APP_FIND_LOAN = 11;
    private static final int APP_LIST_LOANS = 12;



    private static Scanner input = new Scanner(System.in);
    LendingLibraryController appcontrol;// object of lendingLibraryController which used to called the methods of controller class

    /*public method which is called by main class to start the program
     * and this use a do while loop. in which choice is an user input which is coming from user at run time
     * when user selected any number to perform any task
     */
    public void startApp() {
    	appcontrol = new LendingLibraryController();
        int choice;
        do {
            choice = displayAppMenu();
            executeMenuItem(choice);
        } while (choice != APP_EXIT);// it will exit when the user enter 0 which is initializes equal to APP_Exit
    }


    //executeMenuItem(choice);

    /*
     * this is display menu which contain the information about the tasks and
     * every task corresponds to a number(that user can enter to perform any task
     * and it returns the input of the user entered at the stream
     */
    private int displayAppMenu() {
        System.out.println("Enter a selection from the following menu:\r\n" +
                "1. Enter a new book\r\n" +
                "2. Modify the book details. Enter the book isbn number\r\n" +
                "3. Find a book by isbn number\r\n" +
                "4. Display list of all books\r\n" + "\n" +
                "5. Add a new user\r\n" +
                "6. Modify user details\r\n" +
                "7. Find a user by name\r\n" +
                "8. Display all users\r\n" + "\n" +
                "9. Add a loan. Link a user name to a book by isbn number\r\n" +
                "10. Modify a loan. Loan is identified by isbn number\r\n" +
                "11. Find a loan. Loan is identified by isbn number\r\n" +
                "12. Display all loans\r\n" + "\n" +
                "0. Exit program");


        return input.nextInt();

    }

    /*
     * This Execute method will call the methods of controller class
     *  using its object and it calls methods of other class depend on
     *  which operation or task user want to perform
     */
    private void executeMenuItem(int choice) {
        switch (choice) {
            case APP_ADD_BOOK:
                appcontrol.addBook();
                break;
            case APP_MOD_BOOK:
                appcontrol.changeBook();
                break;

            case APP_FIND_BOOK:
                appcontrol.findBook();
                break;
            case APP_LIST_BOOKS:
                appcontrol.listBooks();
                break;
            case APP_ADD_USER:
                appcontrol.addUser();
                break;
            case APP_MOD_USER:
                appcontrol.changeUser();
                break;

            case APP_FIND_USER:
                appcontrol.findUser();
                break;
            case APP_LIST_USERS:
                appcontrol.listUsers();
                break;
            case APP_ADD_LOAN:
                appcontrol.addLoan();
                break;
            case APP_MOD_LOAN:
                appcontrol.changeLoan();
                break;

            case APP_FIND_LOAN:
                appcontrol.findLoan();
                break;
            case APP_LIST_LOANS:
                appcontrol.listLoans();
                break;
            case APP_EXIT:
                System.out.println("Exiting.......");
                break;
            default:
                System.out.println("Unknown operation requested, Please enter other input");//only if user enter any wrong input
        }


    }
}