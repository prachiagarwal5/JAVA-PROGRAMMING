
import java.util.Scanner;
//sum of even n number:
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();
        int i=1,sum=0,j=0;
        while(i<=a){
            if(j%2==0){
                sum+=j;
                j+=2;
                i++;
            }
    }
    System.out.println(sum);
}
}
