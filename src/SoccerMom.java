/** This is the SoccerMom class, it is a sub class of the customer class. It is meant to 
 * simulate a soccer mom.
 * @author Marxj
 *
 */
public class SoccerMom extends Customer {
  private int numberOfComplaints;

  SoccerMom(String name, double money) {
    super(name, money);
    numberOfCustomers++;

  }

  int getNumberOfComplaints() {
    return numberOfComplaints;
  }

  @Override //Overriding is having the same method names 
  //in a base and in a derived class
  String speak() {
    numberOfComplaints++;
    return "Can I speak to the manager";
  }
  
  String getName() {
    return name;
  }
}