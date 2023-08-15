
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();

	   int	nst=(n/2)+1;
	  int	nst1=(n/2);
	  int	nsp=-1;
	  int i=1;
	int	row=1;
		while(row<=n){
		    for( i=1;i<=nst;i++){
		     System.out.print("* ");   
		    }
		    for( i=1;i<=nsp;i++){
		     System.out.print("  ");   
		    }
		    for(i=1;i<=nst1;i++){
		     System.out.print("* ");   
		    }
		    if(row<=(n/2)){
		        nst--;
		        if(row!=1){
		        nst1--;
		        }
		        nsp+=2;
		    }
		    else{
		        nst++;
		        if(row!=n-1){
		        nst1++;
		        }
		        nsp-=2;
		    }
		    row++;
		    System.out.println();
		}
	}
}
