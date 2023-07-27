/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Node{
    int data;
    Node right;
    Node left;
    
    Node(int val)
    {
        data=val;
        right=null;
        left=null;
    }
}
public class Main
{
    public static void Tree(Node ptr){
        if(ptr == null){
            return;
        }
        Tree(ptr.left);
        Tree(ptr.right);
        System.out.println(ptr.data);
    }
	public static void main(String[] args) {
      Node n1=new Node(27);
       Node n2=new Node(77);
        Node n3=new Node(20);
     Node n4=new Node(37);
      Node n5=new Node(28);
       Node n6=new Node(47);
        Node n7=new Node(29);
        
        n1.left=n2;
        n1.right=n5;
        n2.left=n3;
        n2.right=n4;
        n5.left=n6;
        n5.right=n7;
        
        Node ptr=n1;
        Tree(ptr);
	}
}
