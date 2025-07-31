package Recursion;

public class Backtrack_N_to_1 {
  public static void main(String[] args) {
    Backtrackto1(1, 5);
  }

  static void Backtrackto1(int i, int n) {
    if (i > n) {
      return;
    }
    Backtrackto1(i + 1, n);
    System.out.println(i);
  }
}
