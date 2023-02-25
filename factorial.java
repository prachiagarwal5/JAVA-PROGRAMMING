//Factorial of any number
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int j=1;
 for (int i=1;i<=n;i++){
     j*=i;

        }
                 System.out.println(j);

         }
}
