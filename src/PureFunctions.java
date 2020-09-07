public class PureFunctions {

  static int total = 0;

  public static void main(String[] args) {

    System.out.println("Result 1:   " + impureSum(5,4));
    System.out.println("Result 2:   " + impureSum(5,4));
    System.out.println("Result 3:   " + impureSum(5,4));

    /**
     *  More logic // other logic
     *
     *
     */

    System.out.println("Result n:   " + impureSum(5,4));

  }

  public static int pureSum(int a, int b){
    return a + b;
  }

  public static int impureSum(int a, int b){
    total = total + a + b;
    return total;
  }

}
