package Low_level_stuff;

import java.util.Scanner;

public class occunranceOfNum {
  public static void main(String[] args) {
    int a = 423432534;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number :");

    int check = in.nextInt();
    int temp = a;
    int count = 0;
    while (temp != 0) {
      int digit = temp % 10;
      if (digit == check) {
        count++;
      }
      temp = temp / 10;
    }

    System.err.println("No of times no occurred :" + count);
    in.close();
  }
}
