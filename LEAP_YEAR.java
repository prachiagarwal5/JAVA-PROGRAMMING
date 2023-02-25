//LEAP YEAR OR NOT
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year!");
        int a=sc.nextInt();
        if((a%4==0 && a%100!=0)|| a%400==0){
        System.out.println("the year is leapyear");    
        }
        else{
        System.out.println("the year is not leapyear");    
        }
    }
}
