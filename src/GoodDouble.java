//John Marx
/** This contains the code to check if the entered double value is non-crashable. 
 * @author John Marx
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodDouble {
  static Scanner scan = new Scanner(System.in);
  
  static double getGoodDouble() {
    double x1 = 0;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        x1 = scan.nextDouble();
        goodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("This requires an double");
        scan.nextLine();
      }
    }
    return x1;
  }
}


