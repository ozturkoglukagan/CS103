import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class quiz6 {

    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan= new Scanner(new File("/Users/kaganozturkoglu/vs-workplace/integers.txt"));
        oddNumbers(scan);
        
    }

    public static void oddNumbers(Scanner scan) {
    int totalNumber=0;int sum=0;int oddNumber=0;double oddPercentile=0.0;
    
        while (scan.hasNext()) {
            int tempNumber = scan.nextInt();
            sum+=tempNumber;
            totalNumber++;
            if(tempNumber%2==1){
                oddNumber++;
            }
            
        }
        oddPercentile=(oddNumber*1.0/totalNumber*100);
        System.out.println("-----------------------");
        System.out.println("Number Count: "+totalNumber+"\nSum of the Numbers: "+sum);
        System.out.println("Odd Number Count: "+oddNumber+"\nOdd percentile: "+oddPercentile);
        System.out.println("-----------------------\ngithub: ozturkoglukagan\n-----------------------");

    }
    
}
