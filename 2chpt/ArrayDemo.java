public class ArrayDemo {
  public static void main(String [] args) {
    double [] cubics = new double[10];
    for(int i = 0; i < cubics.length; i++) {
      int value = i + 1;
      cubics[i] = value * value * value;
    }

    double [] temp = cubics;
    temp[5] = -1;
    System.out.println(cubics[5]);
    cubics = null;
    for(double a : temp) {
      System.out.print(a + " ");
    }

    temp = new double[20];
  }
}