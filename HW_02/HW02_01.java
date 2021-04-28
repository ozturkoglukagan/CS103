import java.util.Scanner;

public class HW02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //forLoop();
        /*
         * System.out.println("Please enter the a b and c with order: "); int
         * a=scan.nextInt(); int b=scan.nextInt(); int c=scan.nextInt(); quadratic(a, b,
         * c);
         */

        // printPalindrome(scan);

        /*
         * System.out.println("Please enter a month and a day (with numbers): "); int
         * month=scan.nextInt(); int day=scan.nextInt();
         * System.out.println(season(month, day));
         */

        /* System.out.println(medianOf3(10, 10, 8)); */
    }

    public static int medianOf3(int n1, int n2, int n3) {
        if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                return n1;
            } else {
                return n3;
            }
        } else if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                return n2;
            } else {
                return n3;
            }
        } else {
            if (n1 < n2) {
                return n1;
            } else {
                return n2;
            }
        }
    }

    public static String season(int month, int day) {
        if (month < 4) {
            if (month == 3 && day > 15) {
                return "Spring";
            } else {
                return "Winter";
            }
        } else if (month < 7) {
            if (month == 6 && day > 15) {
                return "Summer";
            } else {
                return "Spring";
            }
        } else if (month < 10) {
            if (month == 9 && day > 15) {
                return "Fall";
            } else {
                return "Summer";
            }
        } else if (month < 13) {
            if (month == 12 && day > 15) {
                return "Winter";
            } else {
                return "Fall";
            }
        }
        return "a problem occured please try again";

    }

    public static void printPalindrome(Scanner s) {
        String input = "Error! Try again.";
        boolean checker = false;
        System.out.println("Please enter a word to check its palindromeness: ");
        input = s.nextLine();

        input = input.toLowerCase();

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                checker = true;
            } else {
                System.out.println(i + ". index mismatch");
                checker = false;
                break;

            }
        }
        if (checker) {
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is not a palindrome!");
        }

    }

    public static void quadratic(int a, int b, int c) {
        double firstRoot = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);
        double secondRoot = (-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
        System.out.println("First root = " + firstRoot);
        System.out.println("Second root = " + secondRoot);
    }

    public static void forLoop() {
        int k1 = 1;
        int k2 = 1;
        System.out.print(k1 + " " + k2 + " ");
        for (int i = 0; i < 18; i++) {

            k2 += k1;
            k1 = k2 - k1;

            System.out.print(k2 + " ");
        }

    }

}
