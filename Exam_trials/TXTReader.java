import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TXTReader {

    public static void main(String[] args) throws FileNotFoundException{

        try {

            File txtFile = new File("/Users/kaganozturkoglu/vs-workplace/readme.txt");
            Scanner scan = new Scanner(txtFile);
            int sum = 0;
            int count=0;
            double answer=0;
            while (scan.hasNext()) {
              String data = scan.next();
             

                try{
                    int number = Integer.parseInt(data);
                    sum += number;
                    count++;
                }catch(Exception e){
                    
                }

            }
           
            answer=(sum*1.0)/(count*1.0);
            System.out.println("Sum: " + answer+" "+sum+" "+count);
          } catch (Exception e) {
            System.out.println("An error occurred.");
            
          }
    }
    
}
