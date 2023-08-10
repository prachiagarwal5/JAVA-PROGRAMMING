

public class Main
{
	public static void main(String[] args) {
		int n=14;
		int ans=0;
		int mul=1;
  while(n!=0){
      int rem=n%2;
      ans=ans+rem*mul;
      mul=mul*10;
      n=n/2;
  }
  System.out.println(ans);
	}
}
