import java.util.*;

class Quadrant {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int x = kbd.nextInt();
      int y = kbd.nextInt();
        if (0 <= x && y <= 0) {
          System.out.print("4");
        } else if (0 >= x && y <= 0) {
          System.out.print("3");
        } else if (0 <= x && y >= 0) {
          System.out.print("1");
        } else {
          System.out.print("2");
        }
        kbd.close();
  }
}