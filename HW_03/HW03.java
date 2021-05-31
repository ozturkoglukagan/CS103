
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class HW03 {
    public static File file=new File("/Users/kaganozturkoglu/Desktop/VS Code Workspace/CS103/HW_03/employees.txt");
    
    public static void main(String[] args) throws IOException {
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        System.out.println("Welcome to my employee program.");
        mainMenu(scanInt, scanStr);
      
       
        /* addEmployee(scanInt, scanStr);
        readEmployee(scanInt, scanStr);
        coderInfo();*/

    }
    public static void mainMenu(Scanner scanInt,Scanner scanStr) throws IOException {
        int control =0;
        System.out.println("\nPlease enter the number to proceed with the option.");
        System.out.println("1. Add Employee \n2. Read Employee \n3. Quit");
        control=scanInt.nextInt();
        switch (control) {
            case 1:
            addEmployee(scanInt, scanStr);
                break;
            case 2:
            readEmployee(scanInt, scanStr);
                break;
            case 3:
            coderInfo();    
            break;
        }
        
    }
    public static void readEmployee(Scanner scanInt,Scanner scanStr) throws IOException {
        Scanner scanFile=new Scanner(file);
        /* for debugging purposes
        System.out.println("working");*/
        
        while(scanFile.hasNext()){
            //reading from the txt file
            String tempLine=scanFile.nextLine();
            //splitting contents to an array
            String[] strArray=tempLine.split(" ");
            
            /* for debugging purposes
            printArray(strArray);*/
            
            // setting age to an integer to check in boolean line
            int tempAge=Integer.parseInt(strArray[2]);
            
            /* for debugging purposes
            System.out.println(tempAge);*/
            
            
            //check and print
            if(tempAge<=25 && strArray[3].toLowerCase().equals("male")){
                System.out.println(strArray[0]+" from department of "+strArray[5]+" is male and younger than 25.");
                
            } 
            
        }
        mainMenu(scanInt, scanStr);
    }
    // for debugging purposes
    public static void printArray(String [] strArray) {
        for(int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
        
    }
    //my information on github
    public static void coderInfo() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~>   Employee Simulator   <~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("               Created by github.com/ozturkoglukagan   05/31/21\n");

        System.out.println("----------------------------------------------------------------------------\n");

    }
    //to add employees to the txt file
    public static void addEmployee(Scanner scanInt,Scanner scanStr)throws IOException{
        //to print the information provided by user to the txt file 
        FileWriter fw=new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);

        System.out.println("Please enter your employee's information.");
        System.out.print("Name: ");
        String temp=scanStr.nextLine();
        pw.print(temp+" ");


        System.out.print("ID: ");
        int tempint=scanInt.nextInt();
        pw.print(tempint+" ");


        System.out.print("Age: ");
        tempint=scanInt.nextInt();
        pw.print(tempint+" ");


        System.out.print("Gender: ");
        temp=scanStr.nextLine();
        pw.print(temp+" ");


        System.out.print("Phone Number: ");
        temp=scanStr.nextLine();
        pw.print(temp+" ");
        
        System.out.print("Department: ");
        temp=scanStr.nextLine();
        pw.print(temp+" \n");

        pw.close();
        mainMenu(scanInt, scanStr);
    }

    public static void diceSum(Scanner scan) {
        Random rand= new Random();
        int dice1=0;
        int dice2=0;
        int tempNum=0;
        int count=0;
        System.out.println("Please enter a desired dice sum: ");
        int desiredNum=scan.nextInt();
        System.out.println("Desired dice sum: "+desiredNum);
        while(tempNum!=desiredNum){
            dice1=rand.nextInt(7);
            dice2=rand.nextInt(7);
            tempNum=dice1+dice2;
            System.out.println(dice1+" and "+dice2+" = "+tempNum);
            count++;
        }
        System.out.println("Program found the desired answer in "+count+" tries.");
    }
}