import java.util.Scanner;

public class husq2 {
    
    public static void main(String[] args){
        Scanner console= new Scanner(System.in);
       
        int counter=0;
        int toplam=0;
        System.out.println("Please enter number count;");
        int sayi=console.nextInt();
       
        System.out.println("Enter the numbers; ");
        for(int i = 0; i<sayi ;i++){
            int number=console.nextInt();
            toplam=toplam+number;
            if(number%2==1){
                counter++;
            }
        }
        System.out.println("Sum of the numbers: "+toplam);
        System.out.println("Number of Odd numbers: "+counter);
    }

}
