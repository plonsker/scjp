public class Mouse {
  public boolean hasWheel;
  private int clickCount;

  public int rightClick(double d) {
    int response = (int) d;
    return response;
  }

  public String wheelClick() {
    if(hasWheel) {
      double pi = 3.14159;
      String greeting = "The mouse at the " + pi;
      return greeting;
    } else {
      String error = "No wheel found";
      return error;
    }
  }

  public void leftClick(int clickCount) {
    System.out.println("Left click " + clickCount + " times");
    this.clickCount = clickCount;
  }
}