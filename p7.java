import java.util.*;
 class queueException extends Exception{
    public void Error()
    {
        System.out.println("Queue full");

    }
 }


class queue {
    int rear;
    int front;
    int q[];
    queue(int n)
    {
        q=new int[n];
    }

   void insert(int ele)throws queueException
    {
        if(rear==q.length)
        {
            throw new queueException();
        }
        if(front==-1)
        front =0;
        q[rear++]=ele;
    }
    int delete()
    { 
        int ele;
        if(front==-1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(front==rear)
        {
            ele=q[front];
            rear=front=-1;

        }
        else{
            ele=q[front++];
        }
        return ele;
    }
        void display()
        { 
            if(front==-1)
            {
               System.out.println("Queue if empty");
               return;
            }
            for(int i=front;i<rear;i++)
            System.out.println(q[i]+"\t");
        }
    }

    class p7{

public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 System.out.print("Enter size of queue:");
 int size = sc.nextInt();
 queue que=new queue(size);
 try
 {
    while(true){
    System.out.println("\n Queue oparation \n 1.INSERT \n 2.DELETE \n 3.DISPLAY \n 4.EXIT");
    System.out.println("Enter your choice: \n");
    int choice=sc.nextInt();
    switch(choice){
        case 1:System.out.println("\n Enter ele to be inserted");
        que.insert(sc.nextInt());
        break;
        case 2: System.out.println("Deleted item is"+que.delete());
        break;
        case 3: que.display();
        break;
     
        default: System.out.println("Wrong choice");
         return;                
    }

}
 }

catch(queueException e)
{
    e.Error();
}
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println("Queue is empty");

}
}
    }



