import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp,j;
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int [] num=new int[n];
		int i;
		System.out.println("enter the values in array");
		for(i=0;i<n;i++){
		    num[i]=sc.nextInt();
		}
	for(i=0;i<n;i++){
	    for(j=i+1;j<n;j++){
	    if(num[i]<num[j]){
	        temp=num[j];
	        num[j]=num[i];
	        num[i]=temp;
	    }
	    }
	}
		for(i=0;i<n;i++){
System.out.print( num[i]+",");
}
	}
}
