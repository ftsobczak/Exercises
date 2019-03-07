package obiektyIpakiety;

public class Rectangle {

    public static void main(String[] args)
    {

        Rectangle rectangle1 = new Rectangle(5,15);
        System.out.println(rectangle1.getArea() + " " + rectangle1.getDiagonal() + " " + rectangle1.getPerimeter());
    }

    private double height, lenght;

    private Rectangle(double height, double lenght)
    {
        this.lenght = lenght;
        this.height = height;
    }

    private double getArea()
    {
        return lenght*height;
    }

    private double getPerimeter()
    {
        return (2*lenght)+(2*height);
    }

    private double getDiagonal()
    {
        return Math.sqrt(Math.pow(lenght,2)+ Math.pow(height,2));
    }
}
