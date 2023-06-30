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
			int b[][]=new int[m][n];
			int sum[][]=new int[m][n];
		int i,j,k;
		for(i=0;i<m;i++){
		    for(j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		for(i=0;i<m;i++){
		    for(j=0;j<n;j++){
		        b[i][j]=sc.nextInt();
		    }
		}		
		for(i=0;i<m;i++){
		    for(j=0;j<n;j++){
		         sum[i][j]=0;
		        for(k=0;k<n;k++){
		       
		        sum[i][j]+=a[i][k]*b[k][j];
}
		    }
		}
		for(i=0;i<m;i++){
		    for(j=0;j<n;j++){
		       System.out.print(sum[i][j]+" ");
		    }
		    System.out.println();
		}	 	
	}
}

