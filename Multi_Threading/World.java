package Low_level_stuff.Multi_Threading;

public class World implements Runnable {
  public void run() {
    for (;;) {
      System.out.println("hello");
    }
  }
}
