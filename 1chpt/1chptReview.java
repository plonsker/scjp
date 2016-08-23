// The following code appears in a file named Plant.java. What is the result of compiling this source file?

public class Plant {
  public boolean flowering;
  public Leaf [] leaves;
}

class Leaf {
  public String color;
  public int length;
}

/* The code compiles successfully and two bytecode files are generated: Plant.class and Leaf.class

The code does not contain any compiler errors. It is valid to define multiple classes in a single file as long as only one of them is public and the others have default access

*/