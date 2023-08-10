

public class Main
{
	public static void main(String[] args) {
		int n=32145;
		int ans=0;
		int place=1;
		while(n!=0){
		  int rem=n%10;
		  ans=ans+place *(int)Math.pow(10,rem-1);
		  place++;
		  n=n/10;
		}

  
  System.out.println(ans);
	}
}
