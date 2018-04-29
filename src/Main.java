import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.*;
import java.util.Date;
import java.util.Scanner;

/** This is the main class where most of the code takes place.
 * @author John Marx
 *
 */
public class Main {
  /** This is the main method.
   * @param args An argument array.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter Your Name");
    String usersname = scan.nextLine();
    System.out.println("Hello " + usersname);
    System.out.println();

    System.out.println("Enter a integer");
    int num1 = GoodInt.getGoodInt();
    System.out.println(num1 + " Is Now A Double");
    System.out.println((double) num1);
    System.out.println();

    System.out.println("Enter A Double");
    double num2 = GoodDouble.getGoodDouble();
    System.out.println(num2 + " Is Now A Integer");
    System.out.println((int) num2);
    System.out.println();

    System.out.println("The difference between " + (int) num2 + " and " + num1 + " is: "
        + Math.abs((int) num2 - num1));
    System.out.println(num1 + " plus " + (int) num2 + " is: " + (num1 + (int) num2));
    System.out.println(num1 + " times " + num2 + " is: " + num1 * num2);

    System.out.println("Enter an integer to be divided by " + num2);
    int num4 = GoodInt.getGoodInt();
    try {
      System.out
          .println((int) num4 + " divided by " + (int) num2 + " is: " + (int) num4 / (int) num2);
    } catch (Exception ex) {
      System.out.println("You can't divide a number by zero");
    }

    System.out.println();
    System.out.println("The decimal was removed due to it being an integer " + "division");
    System.out.println("The remainder of " + num4 + " divided by " + num2 + " is: " + num4 % num2);
    System.out.println();

    System.out.println("Enter a sentence");
    String sentence1 = scan.nextLine();
    System.out.println(sentence1 + " is now upper cased: ");
    System.out.println(sentence1.toUpperCase());
    System.out.println();
    System.out.println(sentence1 + " is now lower cased: ");
    System.out.println(sentence1.toLowerCase());
    System.out.println();
    try {
      System.out.println("I removed the first 4 characters of the sentence using " + "substring: ");
      System.out.println(sentence1.substring(4));
    } catch (Exception e) {
      System.out.println("  The sentence was not long enough to perform substring");
    }

    System.out.println();
    System.out.println("Using the trim method, the following string will have the leading "
        + "and trailing spaces removed");
    String sentence2 = "                    Lots of tabs                ";
    System.out.println(sentence2);
    System.out.println(sentence2.trim());
    System.out.println();

    System.out.println("Enter a integer between 1 and 20");
    double num3 = GoodDouble.getGoodDouble();
    num3 = (int) num3; // If user enters a double then this changes it to a int

    if (num3 >= 1 && num3 <= 20) {
      int counter = 1;
      System.out.println("The number " + (int) num3 + " is a product of:");
      while (counter < 21) {
        if (num3 % (counter) == 0) {
          System.out.println("  ~" + counter);
        }
        ++counter;
      }
    } else {
      System.out.println("That is not a number between 1 and 20");
    }
    System.out.println();

    System.out.println("Enter a grade you received on a test");
    String grade = scan.nextLine();
    // The switch gives the user an output based on the grade they received
    switch (grade) {
      case "A":
        System.out.println("Good Job");
        break;
      case "B":
        System.out.println("Your Above Average");
        break;
      case "C":
        System.out.println("Your Average");
        break;
      case "D":
        System.out.println("Your Below Average");
        break;
      case "F":
        System.out.println("Good Job! You failed");
        break;
      default:
        System.out.println("That is not a valid grade");
        break;
    }
    // Uses the CalculateVolume class to get the volume from the values that the
    // user gives
    System.out.println();
    System.out.println("The program will now calculate volume using a separate class.");
    System.out.println();
    System.out.println("Enter the width for a box");
    Volume volume1 = new Volume();
    volume1.setWidth(GoodDouble.getGoodDouble()); // sets the width
    System.out.println("Enter the width for the box");
    volume1.setHeight(GoodDouble.getGoodDouble()); // sets the height
    System.out.println("Enter the length for the box");
    volume1.setLength(GoodDouble.getGoodDouble()); // sets the length
    System.out.println();
    volume1.getVolume(); // Calculates the volume in separate class and
    // displays it

    System.out.println("The program will now emulate a bank");
    System.out.println("NOTE: the bank balance can not become negative");
    System.out.println("How much money do you want in this bank?");
    double startMoney = GoodDouble.getGoodDouble();
    System.out.println(
        "What is your interest at the bank? Enter the interest as a decimal not a percent");
    Bank fakeBank1 = new Bank(startMoney);
    fakeBank1.setInterest(GoodDouble.getGoodDouble());
    System.out.println("It is time to make a withdraw. Enter an amount to withdraw");
    fakeBank1.makeWithdraw(GoodDouble.getGoodDouble());
    System.out.println("You can make a deposit now. Enter a number to deposit");
    fakeBank1.makeDeposit(GoodDouble.getGoodDouble());
    System.out.println("Now we will find the compound interest over time");
    System.out.println("Enter the number of periods as a whole number,"
        + " then enter the number of years as a whole number");
    System.out.println(
        "The compound interest is: $" + fakeBank1.getInterestOvertime(fakeBank1.getBankBalance(),
            fakeBank1.getInterest(), GoodInt.getGoodInt(), GoodInt.getGoodInt()));

    System.out.println("Enter 5 integers to be placed into an array");
    int s = 0;

    Integer[] newarray = new Integer[5];
    while (s < 5) {
      newarray[s] = GoodInt.getGoodInt();
      s++;
    }
    boolean test = false;
    System.out.println("The program will now find the smallest value in the array");
    int smallest = newarray[0];
    for (int i = 1; i < newarray.length; i++) {
      if (newarray[i] < smallest) {
        smallest = newarray[i];
      }
    }

    System.out.println("The smallest value is: " + smallest);

    System.out.println("The program will now find the sum of the array");
    int sum = 0;
    for (int i : newarray) {
      sum += i;
    }
    System.out.println("The sum is: " + sum);

    System.out.println();
    System.out.println("Enter value to be found in the array");
    int value = GoodInt.getGoodInt();
    for (int w = 0; w < newarray.length; w++) {
      if (newarray[w] == value) {
        System.out.println("The value " + value + " is found at index " + w);
        test = true;
      }
    }
    if (test == false) {
      System.out.println("The value " + value + " was not found.");
    }

    System.out.println();
    System.out.println("Enter a string");
    StringBuilder experiment = new StringBuilder();
    experiment.append(scan.nextLine());
    System.out.println("Now enter a string to be entered into the old string using append");
    String insertSomeString = scan.nextLine();
    experiment.append(insertSomeString);
    System.out.println("The new string is:");
    System.out.println(experiment);
    System.out.println("Now enter the starting index for the delete method");
    int start = GoodInt.getGoodInt();
    System.out.println("Now enter the ending index for the delete method");
    int ending = GoodInt.getGoodInt();
    try {
      experiment.delete(start, ending);
      System.out.println("The new string is:");
      System.out.println(experiment);
    } catch (Exception e) {
      System.out.println("The numbers were out of range");
    }

    System.out.println("Now enter the starting position for insert");
    int starting = GoodInt.getGoodInt();
    System.out.println(
        "Now enter string to be enterted into the old string at the point " + starting);
    String someString = scan.nextLine();
    try {
      experiment.insert(starting, someString);
      System.out.println("The new string is:");
      System.out.println(experiment);
    } catch (Exception ex) {
      System.out.println("The number entered was not in the length of the string");
    }

    // SoccerMom is a subclass of customer,allowing someone to create a Customer object while
    // keeping
    // it's methods from the SoccerMom class
    System.out.println("\nThe program will now demonstrate polymorphism using a restaurant class.");
    Restaurant restaurant1 = new Restaurant("McDonald's");
    Employee employee1 = new Employee("Dave", 20000);
    Customer customer1 = new Customer("Ryan", 5); //
    Customer customer2 = new SoccerMom("Sherri", 0.05); // This is polymorphism
    System.out.println("The 1st restaurant name is " + Restaurant.returnName(restaurant1));
    System.out.println("One of the employee's name is " + Restaurant.returnName(employee1));
    System.out.println("One of the customer's name is " + Restaurant.returnName(customer1));
    System.out.println(
        "Another one of the customer's name is " + Restaurant.returnName(customer2) + "\n");
    System.out.println("Ryan's dialog is:  " + customer1.speak());
    System.out.println("Sherri's dialog is:  " + customer2.speak());


    DateFormat dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
    Date date = new Date();
    System.out.println("Today is: " + dateFormat.format(date));
    LocalTime currentTime = LocalTime.now();
    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
    System.out.println("The time is: " + timeFormat.format(currentTime));
    System.out.println();

    // Lambda Expression
    // Allows for a simpler version of a argument to a method
    // The example bellow allows the programmer to use a math operation
    // after specifying the operation he/she wants to use and the two numbers

    Main tester = new Main();
    MathOperation addition = (int a, int b) -> a + b;
    MathOperation subtraction = (a, b) -> a - b;
    MathOperation multiplication = (int a, int b) -> {
      return a * b;
    };
    MathOperation division = (int a, int b) -> a / b;

    System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
    System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
    System.out.println("10 / 5 = " + tester.operate(10, 5, division));
    
    System.out.println("Press enter to end program");
    scan.next();
  }

  interface MathOperation {
    int operation(int a, int b);
  }

  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }
}



