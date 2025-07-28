package Low_level_stuff;

import java.util.Scanner;

public class fibonacci_nthterm {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    int next;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n - 2; i++) {
      next = a + b;
      a = b;
      b = next;
    }
    System.out.println(b);

    in.close();
  }

}
