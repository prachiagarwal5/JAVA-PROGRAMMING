
import java.util.*;
public class Main
{   
    public static int Boston(int n){

        int sum=0;
       for(int i=2;i<=n;i++){
           while(n%i==0){
               sum+=sum(i);
               n=n/i;
           }
       }
       return sum;
        
    }
    public static int sum(int n){
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans+=rem;
            n=n/10;
        }
        return ans;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int fsum=Boston(n);
		int dsum =sum(n);
		if(fsum==dsum){
		    System.out.println("Boston number");
		}
		else{
		    System.out.println("nope");
		}
	}
}
