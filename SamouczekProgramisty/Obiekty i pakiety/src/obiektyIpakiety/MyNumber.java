package obiektyIpakiety;

public class MyNumber
{
    public static void main(String[] args)
    {
        MyNumber num = new MyNumber(5);
        x=10;
        System.out.println(num.isOdd() + " " + num.getPow() + " " + num.add());
        System.out.println(num.getSqrt());
        System.out.println(num.isEven());
        System.out.println(num.subtract());

    }

    private double number;
    private static double x;

    private MyNumber(double number)
    {
        this.number = number;
    }

    private boolean isOdd()
    {
        return number%2!=0;
    }
    private boolean isEven()
    {
        return number%2==0;
    }

    private double getSqrt()
    {
        return Math.sqrt(number);
    }
     private double getPow()
     {
         return Math.pow(number, x);
     }
     private double add()
     {
         return number + x;
     }

     private double subtract()
     {
         return number - x;
     }

}
