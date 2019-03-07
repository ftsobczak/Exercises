package myInterface;

public class Rectangle implements Figure
{
    private double sideA;
    private double sideB;
    private  double perimeter;
    private  double area;

    Rectangle(double sideA, double sideB)
    {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter()
    {
        perimeter = 2*sideA + 2*sideB;
        perimeter *= 100;
        perimeter = Math.round(perimeter);
        perimeter /= 100;
        return perimeter;
    }

    @Override
    public double getArea()
    {
        area = sideA*sideB;
        area *= 100;
        area = Math.round(area);
        area /= 100;
        return area;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }


}
