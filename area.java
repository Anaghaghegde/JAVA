class test{
    double l,b,h;
    double tri(double b,double h)
    {
        return (b*h)/2;
        
    }
    double rectangle(double l,double b)
    {
        return l*b;
    }
    double square(double l )
    {
        return l*l;
    }
   
}



public class area {
    public static void main(String[] args) {
      test ob1=new test();
      double a1=ob1.tri(10, 20);
      double a2=ob1.rectangle(20, 30);
      double a3=ob1.square(20);
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    }
}
