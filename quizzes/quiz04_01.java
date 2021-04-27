
import java.util.Scanner;

public class quiz04_01 {
  public static void main(String []args){
    Scanner console = new Scanner(System.in);
    calculator(console);

  }  
  public static void calculator(Scanner console){
     System.out.println("Enter the number that you want the sum digits of: ");
     int number = console.nextInt();
     int length = String.valueOf(number).length();
     int i=0;
     int sum=0;
     while(i<length){
        
        sum=(int) (sum+(number%Math.pow(10, length))/Math.pow(10, i-1));

        length--;
     }
     System.out.println(sum);
    }

}
