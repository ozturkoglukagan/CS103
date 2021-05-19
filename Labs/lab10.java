import java.io.FileNotFoundException;
import java.util.Scanner;

/*Note: All input files that we need for the following exercises can be found on LMS.

exercise 1: Write a Java program that can count the number of words in a file called "hamlet.txt".

input file: hamlet.txt 


====================================
exercise 2: Write a Java program that checks if the given file exists and can be read, calculates the size of the file (in bytes), and prints out the absolute path of the file. You may use "hamlet.txt" file that you used in exercise 1 to test it, or any other file.

====================================
exercise 3: Write a program that reads an input file of hours worked by various employees and reports the total hours worked by each employee.

input file: hours.dat
Content of hours.dat

Erica 7.5 8.5 10.25 8 8.5
Erin 10.5 11.5 12 11 10.75
Simone 8 8 8
Ryan 6.5 8 9.25 8
Kendall 2.5 3


Hints: Some observations on input file: 
i) each line starts with a String (i.e., name of the employee)
ii) after the String token, there are number of values (in the type of double)
iii) each employee may work different number of days



====================================
exercise 4: A variation of the program in exercise 3, when the file content changes (now, each line starts with employee id). Write a program that reads an input file of hours worked by various employees and reports the total hours worked by each employee.

input file: hours2.dat
Content of hours2.dat

101 Erica 7.5 8.5 10.25 8 8.5
783 Erin 10.5 11.5 12 11 10.75
114 Simone 8 8 8
238 Ryan 6.5 8 9.25 8
156 Kendall 2.5 3


Hints: Some observations on input file: 
i) each line starts with an integer (i.e., employee id)
ii) following the employee id, we have names of the employees (which is String)
iii) after the String token, there are number of values (in the type of double)
iv) each employee may work different number of days

The solution we have in exercise 3 would not work for this file. It will print a single line, then will crash with a InputMismatchException error. When the program was adding up the hours for Erica, it accidentally read Erin’s employee ID as more hours worked by Erica and added this number to the sum. This happens since input.hasNextDouble() method ignores whitespaces (e.g., newline character), and will consider 783 (on the second line) as a next double representing working hour for Erika (however, it is an employee ID of Erin). That’s also why the exception occurs on the second iteration of the loop, the program tries to read an employee ID for Erin when the next token in the file is her name, not an double. Thus, you need to write a program that must read an entire line of input at a time, and process that line by itelf.


======================================
exercise 5 (Writing into a file): Write a Hello World program whose output should be written into a file, rather than on a console.

output file: hello.txt





======================================
exercise 6 (reading and Writing files simultaneously):  Write a program that removes excess space in an input file (words.txt), and writes the result both in a file (called word2.txt) and on a console.


input file: words.txt (a file that contains excessive spaces between words)
output file: words2.txt (this file should contain words that are separated nicely)



*/

public class lab10 {
    public static void main() {       
        
    }
    
    
    
    public static void excercise1() throws FileNotFoundException{

        Scanner scanFile=new Scanner(new File("Hamlet.txt"));
        int count =0;
        while(scanFile.hasNext()){
            count++;
        }
        System.out.println(count);
        
    }
}
