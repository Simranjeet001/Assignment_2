/*
 * Course Name: CST8284_CST8284_Object Oriented Programming
 * Student Name: Simranjeet Singh
 * Class name: User
 * section:304
 *  Due Date: 13 june 2021
 * i added one Constructor in this class to chain it other to get the desired output as per appendix.
 */
package cst8284Assignment2;

public class User {

	private static final int DEFAULT_AGE = 18;
    private static int useNextID = 1000;// this is a static counter which gets incremented automatically
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private int age;


    public User(String firstName, String lastName) {
        this(firstName, lastName, "");// used "" to chain with the other constructor
    }

    /* I Created one Constructor here as i was unable to set the age to 18
     * by default and was also unable to make increment of that userCount without this constructor
     * (as u mentioned in appendix). So i created it and linked it to other
     */
    public User(String firstName, String lastName, String address, int age) {
        this(useNextID++, firstName, lastName, address, age);
    }


    public User(String first, String last, String address) {
        this( first, last, address,DEFAULT_AGE);
    }

    public User(int id, String firstName, String lastName, String address, int age) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setAge(age);
       
    }

    /* All the Getters and Setters for the id(which is static counter),First name, Last name , address and age(if entered)
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* to String method will return every User's information(entered) into a
     * proper format as it was asked in assignment to do
     */
    public String toString() {
        return "************User ID: " + getId() + " \n" 
             + "************First Name: " + getFirstName() + "\n " 
             + "************Last Name: " + getLastName() + "\n " 
             + "************Address: " + getAddress() + "\n " 
             + "************Age: " + getAge()+ "/n";
    }


}
