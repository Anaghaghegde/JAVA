class outer
{
    int outer_x=100;
    class inner_cls
    {
        int inner_y=200;
        void imethod()
        {
            System.out.println("ACCESSING FROM INNER CLASS");
            System.out.println(outer_x);
            System.out.println(inner_y+outer_x);
        }
    }
    void display()
    {
        inner_cls ob1=new inner_cls();
        System.out.println("The value of inner cls"+ob1.inner_y);
        System.out.println("The value for inner variable"+outer_x);
    }
}



public class inner_cls {
    public static void main(String[] args) {
        outer obname=new outer();
        obname.display();
        outer.inner_cls ob2=obname.new inner_cls();
        ob2.imethod();
    }
    
}
