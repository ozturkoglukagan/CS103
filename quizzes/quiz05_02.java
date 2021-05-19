import java.util.Scanner;

public class quiz05_02 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("The sum of the square digits of your number is: "+sumOfSqDigits(console));

        
    }
    public static int sumOfSqDigits(Scanner scan) {
        System.out.print("--------------------------------------\nWelcome to my Square Digit Sum Program\n--------------------------------------\nPlease enter the number you want to sum of its square digits: ");
        int number = scan.nextInt();
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            sum += Math.pow(number % 10,2);
            number /= 10;
        }

        return sum;

    }

}