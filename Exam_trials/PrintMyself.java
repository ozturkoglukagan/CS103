package HW_CS103.Exam_trials;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintMyself {
    public static void main(String[] args) throws FileNotFoundException {
      /*  Scanner scanFile=new Scanner(new File("PrintMyself.java"));
        while(scanFile.hasNext()){
            
            System.out.println(scanFile.nextLine());

        }*/
        double height =1;
        double base = 1;
        calculateArea(base, height);

    }
    public static double calculateArea(double base,double height) {
        double area=base*height/2;
        return area;
     }
   
   
   
   
    /* public static String getFileName(){
        Scanner scan= new Scanner(System.in);
        String name=" ";
        while(!name.equals("good.txt")){
            System.out.print("Type a file name: ");
            String name=scan.nextLine();  
        }
        return name;
    }
    public static void printBox(Scanner scan, int line) {
        System.out.print("+");
        for(int i=0;i<line+2;i++){
            System.out.print("-");
        }
        System.out.print("+\n");
        while(scan.hasNext()){
            System.out.print("| ");
            String tempName=scan.nextLine();
            if (tempName.length()<=line) {
                System.out.print(tempName);
                for (int i =0;i<line-tempName.length();i++) {
                    System.out.print(" ");
                }
            } else {
                System.out.print(tempName);
            }
            
            System.out.print(" |\n");
        }
        System.out.print("+");
        for(int i=0;i<line+2;i++){
            System.out.print("-");
        }
        System.out.print("+");
    }
    public static void printEntireFile() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a file name: ");
        String name=scan.nextLine();
        Scanner scanFile=new Scanner(new File(name));
        while(scanFile.hasNext()){
            
            System.out.println(scanFile.nextLine());

        }
        
        
    }
}
*/}