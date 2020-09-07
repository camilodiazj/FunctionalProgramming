import java.util.function.Function;

public class HighOrderFunction {

  private Function <String, String> toUpperCaseOf = String::toUpperCase;

  public static void main(String[] args) {
    HighOrderFunction functions = new HighOrderFunction();

    printWordInUpperCase(functions.toUpperCaseOf,"función");

    String lowerCase = getLowerCaseOf().apply("FUNCIÓN");
    System.out.println(lowerCase);
  }

  public static void printWordInUpperCase(Function<String, String> function, String word){
    System.out.println(function.apply(word));
  }

  public static Function<String, String> getLowerCaseOf() {
    Function <String, String> toLowerCaseOf = String::toLowerCase;
    return toLowerCaseOf;
  }
}
