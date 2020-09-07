public class RecursiveFunctions {

  public static void main(String[] args) {
    /**
     *  5! =  5 * 4 * 3 * 2 * 1
     */
    System.out.println(factorial(5));
  }

  // Recursive
  public static int factorial(int n) {
    return n == 1 ? 1 : n * factorial(n - 1);
  }

  // Iterative
  public static int factorialIterative(int n) {
    int t, result;

    result = 1;
    for (t = 1; t <= n; t++) {
      result *= t;
    }
    return result;
  }

}
