import java.util.Scanner;

public class midterm02study {
    public static void main(String[] args) {
        printAcronym("Ananin Amini Sikeym");
    }

    public static void printAcronym(String line){

        Scanner lineScan=new Scanner(line);
        while(lineScan.hasNext()){
            String temp=lineScan.next();
            System.out.print(temp.charAt(0));
        
        }
        
    }
    

}
