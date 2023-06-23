import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
       int [] a=new int[n];
       int[] b=new int[n];
		int i,max;
		System.out.println("enter the values in array");
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		max=a[0];
		for(i=0;i<n;i++){
		    if(a[i]>max){
		        max=a[i];
		    }
		}
		max++;
		for(i=0;i<n;i++){
		    b[a[i]]++;
		}
		System.out.println("the array with unique element is");
		for(i=0;i<max;i++){
		    if(b[i]==1)
		    System.out.println(i);
		}

	}
}
