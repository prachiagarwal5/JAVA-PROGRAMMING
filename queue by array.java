

public class Main
{   
    
     static int queue[]=new int[6];
    static int max_size=6;
     static int front=-1;
     static int rear=-1;
    public static void enqueue(int X)
    {
        if(rear==max_size-1){
            System.out.println("the queue is full");
        }
        else{
            if(rear==-1 & front==-1){
                rear=rear+1;
                front=front+1;
                queue[rear]=X;
            }
            else{
                rear=rear+1;
                queue[rear]=X;
            }
        }
    }
    public static void dequeue()
    {
        if(front==-1 && rear==-1){
            System.out.println("the queue is empty");
        }
        else{
            if(front==rear){
                front=-1;
                rear=-1;
                System.out.println("the queue is empty now");
            }
            else{
                front=front+1;
            }
        }
    }
    public static void printqueue()
    {
        System.out.println(queue[rear]);
    }
	public static void main(String[] args) {
	    enqueue(5);
	    enqueue(7);
	    dequeue();
	printqueue();
	
	}
}
