import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp;
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		int [] num=new int[n];
		int i;
		System.out.println("enter the values in array");
		for(i=0;i<n;i++){
		    num[i]=sc.nextInt();
		}
	for(i=0;i<(n-1);i++){
	    if(num[i+1]<num[i]){
	        temp=num[i];
	        num[i]=num[i+1];
	        num[i+1]=temp;
	    }
	}
	System.out.println("the kth largest number is"+num[n-k]);
	}
}
