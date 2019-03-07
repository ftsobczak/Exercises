package myInterface;

public class Triangle implements Figure
{
    private double sideA;
    private double sideB;
    private double sideC;
    private double perimeter;
    private  double area;

    Triangle(double sideA, double sideB)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = Math.sqrt(sideA*sideA+sideB*sideB);
    }

    @Override
    public double getPerimeter()
    {
        perimeter = sideA+sideB+sideC;
        perimeter *= 100;
        perimeter = Math.round(perimeter);
        perimeter /= 100;

        return perimeter;
    }

    @Override
    public double getArea()
    {
        area = (sideA*sideB)/2;
        area *= 100;
        area = Math.round(area);
        area /= 100;

        return area;
    }

    @Override
    public String getType()
    {
        return "Triangle";
    }
}
