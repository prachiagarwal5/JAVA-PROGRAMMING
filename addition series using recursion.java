

public class Main
{
    public static int sum(int x, int y){
        if(x>y){
            return 0;
        }
        return x+sum(x+1,y);
      
    }
	public static void main(String[] args) {
		  System.out.println(sum(1,6));
	}
}
