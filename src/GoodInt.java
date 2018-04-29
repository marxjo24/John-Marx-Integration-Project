//John Marx
/** This contains the code to check if the entered integer is non-crashable.
 * @author John Marx
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodInt {
  static Scanner scan = new Scanner(System.in);

  static int getGoodInt() {
    int x1 = 0;
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        x1 = scan.nextInt();
        goodInput = true;
      } catch (InputMismatchException ex) {
        System.out.println("This requires an integer");
        scan.nextLine();
      } 
    }
    return x1;
  }
}
