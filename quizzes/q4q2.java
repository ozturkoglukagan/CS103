import java.util.Scanner;

public class q4q2 {
    public static void main(String[] args){
        Scanner myScanner= new Scanner(System.in);
        int temp=0;int oddCount=0;int numSum=0;int loopCount=0;
        System.out.println("Enter the amount of numbers that you wanted to sum: ");
        loopCount=myScanner.nextInt();
        for(int k = 0; k<loopCount ;k++){
            System.out.println("Please enter the number "+(k+1)+":");
            temp=myScanner.nextInt();
            numSum+=temp;
            if(temp%2==1){
                oddCount++;
            }
        }
        System.out.println("Sum of the "+loopCount+" numbers are: "+numSum+"\nOdd Number count: "+oddCount);
    }
}
