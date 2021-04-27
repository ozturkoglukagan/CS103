import java.util.Random;

public class question1 {

    public static void main(String[]args) {
        Random rand = new Random();
    int a = rand.nextInt(100);
    int b = rand.nextInt(20) + 50;
    int c = rand.nextInt(20 + 50);
    int d = rand.nextInt(100) -20;
    int e = rand.nextInt(10)*4;
    System.out.println(a+" "+b+" "+c+" "+d+" "+e);
        
    }
    
}
