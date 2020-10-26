import java.util.Scanner;

public class Queue_Array 
{
    static int front =-1,rear=-1,queue[],size;
    static Scanner sc=new Scanner(System.in);
   
    static
    {
        System.out.println("Enter Size of Queue: ");
        size=sc.nextInt();
        queue=new int[size];
    }
    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.println("\nEnter Your Choice: ");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. PEEK");
            System.out.println("4. DISPLAY");
            System.out.println("5. EXIT");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    ENQUEUE();
                    break;
                case 2:
                    DEQUEUE();
                    break;
                case 3:
                    PEEK();
                    break;
                case 4:
                    DISPLAY();
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid Choice!!!!");

            }
        }

    }

    public static void ENQUEUE()
    {
        System.out.print("\n Enter Value to be Added in Queue: ");
        int value=sc.nextInt();

        if(front == -1 && rear==-1)
        {
            front=0;
            rear=0;
            queue[rear]=value;
        }else
            if(rear==size-1)
            {
                System.out.println("Queue OverFlow");
            }else
            {
                queue[++rear]=value;
            }
    }
    public static void DEQUEUE()
    {
        if(front==-1 && rear == -1)
        {
            System.out.println("Queue is Empty!!!");
        }else
            if(front == rear)
            {
                System.out.print("\nDequeued Element is : "+queue[front]);
                front=-1;
                rear=-1;
            }else
                {
                System.out.print("\nDequeued Element is : "+queue[front++]);
                }
    }
    public static void PEEK()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue is Empty!!!");
        }else
            {
            System.out.print("\n Queue Peek Element is :  "+queue[front]);
            }
    }
    public static void DISPLAY()
    {
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty!!!");
        }else
            {
            System.out.print("\n Queue Elements are:  ");
            for(int i=front;i<=rear;i++)
            {
                System.out.print(queue[i]+" ");
            }
        }
    }
}
