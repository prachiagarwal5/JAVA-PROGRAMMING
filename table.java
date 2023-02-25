//Table of any number
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int mul=1;
 for (int i=1;i<=10;i++){
  mul=i*n;
         System.out.printf("%d*%d=%d\n",n,i,mul);
        }

         }
}
