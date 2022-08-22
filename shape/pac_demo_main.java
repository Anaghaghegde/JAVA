package shape;

public class pac_demo_main {
    public static void main(String[] args) {
        
    
    square square=new square();
    triangle triangle=new triangle();
    circle circle=new circle();
    square.getData((float)5.5);
    System.out.println("The area of square is "+square.area());
    triangle.getData((double)20.56,(double)23.90);
    System.out.println("The area of trinagle is :"+ triangle.area());
    circle.getData((double)5.5);
    System.out.println("The area of circle:"+circle.area());
}
    
}
