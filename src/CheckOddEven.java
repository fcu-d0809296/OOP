import java.util.Scanner;

public class CheckOddEven {
  /**.*/
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a integer: ");
    int a = scanner.nextInt();
    if (a % 2 == 0) {
      System.out.println("The input integer is Even Number.");
    } else {
      System.out.println("The input integer is Odd Number.");
    }
    scanner.close();
  }

}
