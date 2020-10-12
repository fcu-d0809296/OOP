import java.util.Scanner;

public class KeyboardScanner {
  /** . */
  public static void main(String[] args) { 
    //  Gets the distance between tw points.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a integer: ");
    int a = scanner.nextInt();
    System.out.println("Enter a float point number: ");
    float b = scanner.nextFloat();
    System.out.println("Enter a you name: ");
    String c = scanner.next();
    System.out.printf("Hi %s, the multiplication of %d and %f is %.2e", c, a, b, a*b);
    scanner.close();
  }

}

