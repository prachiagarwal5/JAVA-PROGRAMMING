//code for counting the digits
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	 int i,num;
	 int count=0;
		System.out.println("enter the number");
		    num=s.nextInt();
		    while(num!=0){
		       num=num/10;
		       count++;
		           }
		           System.out.println("the length of number is "+count);
	}
}
