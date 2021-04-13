package HW_CS103.quizzes;

public class quiz03_1 {

    static int x = 15; 
    static int y = 144;
    public static void main(String[] args) { 
                calculateSum(x, y);
        } 
        public static void calculateSum(int x, int y) { 
            int sum=0;
            
            for(int i=x;i<y+1;i++){
                sum=sum+i*i;
            
            }
            System.out.println(sum);
        }
    }
