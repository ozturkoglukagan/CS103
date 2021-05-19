import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempNum =scan.nextInt();
        System.out.println(zeroDigits(tempNum));

        
    }
    public static int zeroDigits(int number){
        int counter=0;
        int times=0;
        String temp=Integer.toString(number);
        while(times<temp.length()){
            if(temp.charAt(times)=='0'){
                counter++;

            }
            times++;
        }
        return counter;
        
    }
}
