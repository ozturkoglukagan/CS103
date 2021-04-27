import java.util.Scanner;

public class quiz05 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = console.nextInt();
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {

            sum += (number % 10) * (number % 10);
            number /= 10;

        }
        System.out.println(sum);

    }
}
