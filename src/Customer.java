/** This the customer class. It is a sub class of the restaurant class. It is 
 * meant to simulate a customer.
 * @author John Marx
 *
 */
public class Customer extends Restaurant {
  double money;

  Customer(String name, double money) {
    super(name);
    this.money = money;
    numberOfCustomers++;
  }

  String speak() {
    return "The food is good";
  }
  
  @Override //Overriding is having the same method names 
  //in a base and in a derived class
  String getName() {
    return name;
  }
}