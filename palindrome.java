
import java.util.Scanner;// جملة استدعاء للكلاس سكانر 


public class palindrome {
    public static void main(String[] args) {
  
      Scanner in =new Scanner(System.in) ;
        System.out.println("enter number");
        int num=in.nextInt();
        int n=num;
        int x=0;
        int y;
        while(num>0){
            y=num%10;
            x=x*10+y;
            num=num/10;
        }
        if (x==n){
            System.out.println( n+"is a palindrome number");
        }
        else{
             System.out.println( n+"is  not a palindrome number");
        }
        
        
    }
    
}
