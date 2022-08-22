package shape;

public class circle {
    double redius;
    double height;
    public void getData(double temp)
    {
        redius=temp;
    }
    public double area()
    {
        return((3.1427*(2.0*redius)*(2.0*redius))/4.00);
    }
    
}
