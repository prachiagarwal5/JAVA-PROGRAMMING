//code for sum of all elements of array
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
		System.out.print("the sum of elements are ");
		for( i=0;i<5;i++){
		    sum+=num[i];
	}
	System.out.println(sum);
	}
}
