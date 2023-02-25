//ALPHABETICAL  PATTERN
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        
        for(int i=65;i<=69;i++){
            for(int j=65;j<=i;j++){
             System.out.print((char)j); 
             
            }
            System.out.println(" ");    
            }
         }
}
