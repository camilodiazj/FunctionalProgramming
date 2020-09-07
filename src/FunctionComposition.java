public class FunctionComposition {

  public static void main(String[] args) {

    System.out.println(squarePlusOne(3));

  }

  public static int toSquare(int num){
    /**
     *  f(x) = x^2
     */
    return num * num;
  }

  public static int squarePlusOne(int num1){
    //  g(x) = x + 1

    /**
     *  g(f(x)) = 10
     */
    return toSquare(num1) + 1;
  }
}
