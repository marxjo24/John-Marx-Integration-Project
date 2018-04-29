// John Marx
/** This contains the code to calculate a volume of a box.
 * @author John Marx
 *
 */
public class Volume {

  private double width;          
  private double height;         
  private double length;
  private double volume;  
  
  public void setWidth(double wid) { // This is a header
    width = wid;
  }

  public void setHeight(double hei) { // The parameter is hei
    height = hei;
  }

  public void setLength(double leng) {
    length = leng;
  }

  /** Calculates the volume of a box.
   * 
   */
  public void getVolume() {
    volume = width * height * length;
    System.out.println("The volume is " + volume); // System.out.println is the call
    // ("The volume is " + volume) is the argument
  }

}
