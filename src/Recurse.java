/**
 * Created by erikrudie on 7/21/16.
 */
public class Recurse {

  public static void main (String[] args) {


    System.out.println(isThisAPalindrome("boat"));
    System.out.println(isThisAPalindrome("racecar"));
    System.out.println(isThisAPalindrome("A man, a plan, a canoe, pasta, heros, rajahs, a coloratura, maps, snipe, percale, macaroni, a gag, a banana bag, a tan, a tag, a banana bag again (or a camel), a crepe, pins, Spam, a rut, a Rolo, cash, a jar, sore hats, a peon, a canal – Panama!"));

    System.out.println(reverseString("my String"));

    System.out.println(fib(5));
    System.out.println(fib(10));

  }

  public static boolean isThisAPalindrome(String string) {

    string = string.toLowerCase();
    string = stripString(string);

    if (string == null) {
      return false;
    }
    if (string.length() <= 1) {
      return true;
    }

    if (string.charAt(0) == string.charAt(string.length()-1)) {
//      char[] myArray = new char[string.length()-2];
//      string.getChars(1, string.length() - 1, myArray, 0);
//      String returnString = Arrays.toString(myArray);
      String returnString = string.substring(1, string.length()-1);
      return (isThisAPalindrome(returnString));
    }

    else return false;


  }

  public static String stripString(final String input){
    final StringBuilder builder = new StringBuilder();
    for(final char c : input.toCharArray())
      if(Character.isLetterOrDigit(c))
        builder.append(Character.isLowerCase(c) ? c : Character.toLowerCase(c));
    return builder.toString();
  }

  public static String reverseString(String string) {
    if (string.length() == 1) {
      return string;
    }
    return string.charAt(string.length()-1) + reverseString(string.substring(0, string.length()-1));
  }

  public static int fib(int moreIterations, int total, int last) {

    if (moreIterations > 0) {
      return fib(moreIterations-1, total + last, total);
    } else {
      return total;
    }
  }

  public static int fib(int moreIterations) {
    return fib(moreIterations, 0, 1);
  }


}
