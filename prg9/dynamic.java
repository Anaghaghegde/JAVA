package prg9;

public class dynamic implements issimplestack {
    private char[] data;
    private int tos;

    dynamic(int size)
    {
        data=new char[size];
    }

    public void push(char ch){
        if(tos==data.length){
            char[] t=new char[data.length*2];
            for(int i=0;i<data.length;i++)
            t[i]=data[i];
            data=t;

        }
        data[tos]=ch;
        tos++;
    }
    public char pop(){
        if(isEmpty())
        {
          System.out.println("Stack is empty");
          return(char) 0;
        }
        tos--;
        return data[tos];
    }

    public boolean isEmpty()
        {
          return tos==0;

        }
        public boolean isFull(){
            return false;
        }
    
    
}
