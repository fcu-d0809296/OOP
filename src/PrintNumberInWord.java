import java.util.Scanner;
public class PrintNumberInWord {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    String list[] = {"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    System.out.print("Enter a integer: ");
    int i = scanner.nextInt();
    System.out.print("The input integer is ");
    
    if (i<1 || i>9) {
      System.out.printf("\"%s\"","OTHER");
    }else {
      System.out.printf("\"%s\"",list[i-1]);
    }
  }

}
