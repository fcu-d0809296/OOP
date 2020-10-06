import java.util.Scanner;

public class KeyboardScanner {

  public static void main(String[] args) {
  // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);

  	System.out.println("Enter a integer: ");
  	int a = scanner.nextInt();
    System.out.println("Enter a float point number: ");
    float b = scanner.nextFloat();
    System.out.println("Enter a you name: ");
  	String c = scanner.nextLine();
  	System.out.println("Hi %s, the multiplication of %d and %f is %e. \r\n" ,c,a,b,b);
	}

}
