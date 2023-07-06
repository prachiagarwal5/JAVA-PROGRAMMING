class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Main
{
    static Node head=null;
    public static void addfirst(int data){
    Node n=new Node(data);
if(head==null){
   head=n;
}
else{
n.next=head;
head=n;
}
}
public static void addlast(int data){
    Node n=new Node(data);
    if(head==null){
        head=n;

    }
    else{
  Node currnode=head;
  while(currnode.next!=null){
      currnode=currnode.next;
  }
  currnode.next=n;
    }
}
public static void dltfirst(){
    if(head==null){
        System.out.println("the list is empty");
    }
    else{
        head=head.next;
    }
}
public static void dltlast(){
    if (head==null){
        System.out.println("the lis is empty");
        return;
    }
            if(head.next==null){//while list has only one node
                head=null;
                return;
            }

                Node secondlast=head;
                Node last=head.next;
                while(last.next!=null){
                   last=last.next;
                   secondlast=secondlast.next;
                }
                secondlast.next=null;
}
public  static void printlist(){
    if (head==null){
        System.out.println("the lis is empty");
    }
    else{
        Node currnode=head;
   while(currnode!=null){
       System.out.print(currnode.data+"->");
       currnode=currnode.next;
   } 
   System.out.println("Null");
    }
}
	public static void main(String[] args) {
		addfirst(10);
		addfirst(120);
		addfirst(113);
		addlast(12);
		addlast(24);
		printlist();
		dltfirst();
		dltlast();
		printlist();
	}
}
