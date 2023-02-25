//ALPHABETICAL  PATTERN
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        char k=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
             System.out.print((char)k); 
             k++;
            }
            System.out.println(" ");    
            }
         }
}
