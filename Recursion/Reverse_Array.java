package Recursion;

import java.util.Arrays;

public class Reverse_Array {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int i = 0;
    int j = arr.length - 1;
    reverseArray(arr, i, j);
    System.out.println(Arrays.toString(arr));
  }

  static void reverseArray(int arr[], int i, int j) {
    if (i > j) {
      return;
    }
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    reverseArray(arr, i + 1, j - 1);
  }
}
