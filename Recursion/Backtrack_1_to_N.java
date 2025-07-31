package Recursion;

public class Backtrack_1_to_N {
  public static void main(String[] args) {
    BacktracktoN(5, 5);
  }

  static void BacktracktoN(int i, int n) {
    if (i < 1) {
      return;
    }
    BacktracktoN(i - 1, n);
    System.out.println(i);
  }
}
