package Recursion;

public class nName {
  public static void main(String[] args) {
    printName(1, 5);
  }

  static void printName(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println("Rohit");
    printName(++i, n);
  }
}
