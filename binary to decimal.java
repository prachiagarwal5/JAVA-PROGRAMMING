

public class Main
{
	public static void main(String[] args) {
		int n=1110;
		int ans=0;
		int mul=1;
  while(n!=0){
      int rem=n%10;
      ans=ans+rem*mul;
      mul=mul*2;
      n=n/10;
  }
  System.out.println(ans);
	}
}
