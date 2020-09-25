public class overloading {
  static int sumint(int x, int y) {
    return x + y;
  }
  
  static double sumdouble(double x, double y) {
    return x + y;
  }
  
  public static void main(String[] args) {
  
    int myNum1 = sumint(5, 5);
    double myNum2 = sumdouble(4.2, 6.2);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
