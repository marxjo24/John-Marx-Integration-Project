/** This the Employee class, it is a sub class the Restaurant class. It is meant 
 * to simulate an employee.
 * @author John Marx
 *
 */
public class Employee extends Restaurant {
  private double salery;


  Employee(String name, double salery) {
    super(name);
    this.salery = salery;

  }

  void setSalery(double sal) {
    salery = sal;
  }
  
  @Override 
  String getName() {
    return name;
  }
}