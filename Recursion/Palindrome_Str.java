package Recursion;

public class Palindrome_Str {
  public static void main(String[] args) {
    String str = "ROHIT";
    System.out.println(str.length());
    boolean check = checkLeftandRight(0, str, str.length());
    if (!check) {
      System.out.println("Not a Palindrome");
    } else {
      System.out.println("Palindrome");
    }
  }

  static boolean checkLeftandRight(int i, String str, int n) {
    if (i >= (str.length() / 2)) {
      return true;
    }
    if (str.charAt(i) != str.charAt(n - i - 1)) {
      return false;
    }
    return checkLeftandRight(i + 1, str, n);
  }

}
