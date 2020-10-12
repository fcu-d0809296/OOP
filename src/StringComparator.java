import java.util.Scanner;
public class StringComparator {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string1: ");
    String s1 = scanner.next();
    System.out.println("Enter a string2: ");
    String s2 = scanner.next();
    
    if (s1.equalsIgnoreCase(s2) ) {
      System.out.println("The two strings are the same.");
    } else {
      System.out.println("The two strings are not the same.");
    }
    scanner.close();
  }
  
}
