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
   static int sum=0;
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
public  static void printlist(){
    if (head==null){
        System.out.println("the is is empty");
    }
    else{
        Node currnode=head;
   while(currnode!=null){
       sum+=currnode.data;
       System.out.print(currnode.data+"->");
       currnode=currnode.next;
   }
   System.out.println("Null");
    System.out.println("sum of the linked list " + sum);
   
    }
}
public static void Reverse(){
    if (head==null || head.next==null){
        return;
    }
    Node prevnode=head;
    Node currnode=head.next;
    while(currnode!=null){
        Node nextnode=currnode.next;
        currnode.next=prevnode;
        //updation for upcoming node 
        prevnode=currnode;
        currnode=nextnode;
    }
    head.next=null;
    head=prevnode;
}
	public static void main(String[] args) {
		addfirst(3);
		addfirst(2);
		addfirst(1);
		addlast(4);
		addlast(5);
		printlist();
	}
}

