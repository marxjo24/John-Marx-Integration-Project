//John Marx
/** This contains the code to simulate a restaurant's people.
 * @author John Marx
 *
 */

public class Restaurant {
  String name;
  static int numberOfCustomers = 0;     //Static is when the variable is the same for all objects
  //It is used here so the program can provide a counter for the number of customers
  
  Restaurant(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }
  //The returName method is an example of polymorphism 
  //Every sub-class of the Restaurant class has the method getName
  //When used in the main class, it will return the objects name
  
  static String returnName(Restaurant rest) {
    return rest.getName();
  }
  
  static int returnNumberOfCustomers() {
    return numberOfCustomers;
  }
  //Inheritance is a relationship between the Base/Parent/Super 
  //and the Derived/Child/Sub. In this class the parent is the Restaurant class
  //The Customer class is also a parent to the SoccerMom class
}








