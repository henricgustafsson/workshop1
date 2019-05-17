package se.lexicon.PeopeList;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Scanner scanner = new Scanner(System.in);
	
	/* Initiates Person objects in people array, iterates through them & displays
	 * properties using overridden toString method.
	 * @returns null.*/
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        Person nisse = new Person("Nisse","Persson",11);
        /*System.out.println(nisse.getFirstName());
        System.out.println(nisse.getLastName());
        System.out.println(nisse.getFullName());
        System.out.println(nisse.getAge());
        System.out.println(nisse.getId()); */
        
       // System.out.println(nisse);
        
        Person[] people = new Person[4];
        
        people[0] = nisse;
        people[1] = new Person("Svenne","Persson",12);
        people[2] = new Person("Lisa","Persson",13);
        //people[3] = new Person("Tor-Leif","Persson",5);
        
        
        //iterates through the array people & prints out Person object using overridden toString method
       /* for (int i = 0; i < people.length; i++) {
        	//checks if iteration  is null in order to avoid out of bounds 
        	if (people[i] != null) {
        		System.out.println(people[i]);
			}
			
		} */
        
        //advanced for - or foreach. In c# it would say foreach person in people.
       /*for (Person person : people) {
    	  
    	   if (person != null) {
    		   
       			System.out.println(person);
			}
    	  //System.out.println(person);
    	   
    	  
       }
       
       String name1 = "ulf";
	   String name2 = "ul";
	   name2 =name2 + "f";
	   
	   System.out.println(name1.equals(name2)); */
        
        String userName = askForName("Username");
        int userAge = askUserForNumber();
        String password = askForName("Password");
       
        System.out.println(userName + ' ' + userAge + ' ' + password);
    }
    
    /* method is static because main is static
	 *@return int number */
    static int askUserForNumber() {
    	
    	System.out.print("Input number: ");
    	int number = scanner.nextInt();
    	scanner.nextLine(); //remove unwanted waste from nextln() "\n"
    	return number;
    }
    
    /*method is static because main is static
	 *@return string -user input */
    static String askForName(String nameOfInput) {
    	
    	System.out.print("Input " + nameOfInput + ": ");
    	
    	
    	return scanner.nextLine();
    }
    
    
}
