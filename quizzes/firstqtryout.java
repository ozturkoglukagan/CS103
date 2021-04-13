public class firstqtryout{
    public static void main(String[] args){
        String str1 = "Welcome to CS103!";	
        System.out.println(str1.substring(2, 6));
        
        String str2 = str1.substring(1,4);
        System.out.println(str2.toUpperCase());
        System.out.println(str2.indexOf("c"));
        
        String str3 = str1.substring(8,10);
        str3 = str3 + str2;
        System.out.println(str3.length());
        System.out.println(str3);
       }
    }