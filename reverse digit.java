//code for reverse  of the digits
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	 int i,num,rem;
	 int rev=0;
		System.out.println("enter the number");
		    num=s.nextInt();
		    while(num!=0){
   rev = rev* 10 + num % 10;
        num = num / 10;
		           }
		           System.out.println("the reverse of number  is "+rev);
	}
}
