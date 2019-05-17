package se.lexicon.PeopeList;

public class Person {

	/*Private static field for counting
	 * the number of initiated objects*/
	private static int idCounter=1;
	
	
	/* Private fields - cannot be accessed from 
	 * outside the class without getters/setters
	 * */
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	
	/*Constructor for initiating a new Person object
	*/
	public Person(String firstName, String lastName, int age) {
		
		//remember the prio!!
		 
		id = idCounter++;
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/* Get method for field firstName
	 *@return String firstName -private field inaccessible from outside the class . */
	public String getFirstName () {
		return firstName;
	}
	
	/* Set method for field firstName - sets private field firstName to param firstName
	 *@return null . 
	 *@param String firstName. */
	public void setFirstname (String firstName) {
			
			this.firstName = firstName;
	}
	
	
	/* Get method for field LastName
	 *@return String LastName -private field otherwise inaccessible from outside the class . */
	public String getLastName () {
		return lastName;
	}
	
	/* Set method for field lastName - sets private field lasttName to param lastName
	 *@return null . 
	 *@param String firstName. */
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	/* Get method for field LastName
	 *@return String containing private fields firstName & LastName. */
	public String getFullName () {
		
		return firstName + ' '+lastName;
	}
	
	
	/* Set method for field age - sets private field age to param age
	 *@return null . 
	 *@param int age. */
	public void setAge (int age) {
		this.age = age;
	}
	
	/* Get method for field age
	 *@return int age - private field otherwise inaccessible from outside the class. */
	public int getAge () {
			
			return age;
	}
	
	/* Get method for field id
	 *@return int id - private field otherwise inaccessible from outside the class. */
	public int getId() {
		return id;
	}
	
	/* overrides object.toString 
	 * return String containing field int id,  
	 * fields firstName & lastName by calling getFullname 
	 * and private field age*/
	@Override
	public String toString() {
		return "Person\nId:"+id
				+"\nName:"+getFullName()+
				"\nAge:"+age;
	}
	
	}
