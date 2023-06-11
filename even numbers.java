//code for even numbers
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	 int i;
		int [] num = new int[5];
		System.out.println("enter the number");
		for( i=0;i<5;i++){
		    num[i]=s.nextInt();
		}
		System.out.println("the even numbers are");
		for( i=0;i<5;i++){
		    if(num[i]%2==0){
		        System.out.println(num[i]);
		    }
		    
		}	
	}
}
