import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row size");
		int m=sc.nextInt();
		System.out.println("enter the column size");
		int n=sc.nextInt();		
		int a[][]=new int[m][n];
		int i,j;
		for(i=0;i<m;i++){
		    for(j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
      System.out.println("an matrix with reverse of column");
		for(i=(m-1);i>=0;i--){
		    for(j=0;j<n;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}

