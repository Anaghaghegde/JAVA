interface Rectangle{
    float area_rect(float x,float y);

}
interface Triangle{
float area_tri(float x, float y);
}
class Area implements Rectangle,Triangle{
    public float area_rect(float x,float y)
    {
        return(x*y);
    }
    public float area_tri(float x,float y)
    {
        return((x*y)/2);
    }

}

public class prg4 {
    public static void main(String[] args) {
        Area a=new Area();
        System.out.println("Area of rectangle :"+a.area_rect(2,20));
        System.out.println("Area of triangle:"+a.area_tri(10,20));
    }
    
}
