//code for sum of odd numbers
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	 int i;
	 int sum=0;
		int [] num = new int[5];
		System.out.println("enter the number");
		for( i=0;i<5;i++){
		    num[i]=s.nextInt();
		}
		System.out.print("the sum of  odd numbers is");
		for( i=0;i<5;i++){
		    if(num[i]%2!=0){
		        sum+=num[i];
		        }
	}
		  System.out.println(sum);
	}
}
