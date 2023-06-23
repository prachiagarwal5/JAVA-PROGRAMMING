import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter the step of rotation of array");
		int d=sc.nextInt();
		int [] num=new int[n];
		int [] temp=new int[n];
		int i;
		int k=0;
		System.out.println("enter the values in array");
		for(i=0;i<n;i++){
		    num[i]=sc.nextInt();
		}
	for(i=d;i<n;i++){
       temp[k]=num[i];
       k++;
     }
	for(i=0;i<d;i++){
	    temp[k]=num[i];
	    k++;
	}
	for(i=0;i<n;i++){
	    num[i]=temp[i];
	}
	for(i=0;i<n;i++){
	    System.out.print(num[i]+",");
	}
	}
}
