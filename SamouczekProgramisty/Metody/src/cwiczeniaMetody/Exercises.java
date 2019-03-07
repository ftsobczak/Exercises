package cwiczeniaMetody;

import java.util.Arrays;

public class Exercises
{
    public static void main(String[] args)
    {
        System.out.println(myName());
        math(50.5,42.5);
        System.out.println(isEven(3));
        System.out.println(couldDivideBy3and5(30));
        System.out.println(thirdPow(2));
        System.out.println(sqrt(16));
        System.out.println(triangle(10,8,6));
    }

    private static String myName()
    {
        return "Mam na imię Filip";
    }

    private static void math(double x, double y)
    {
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
    }

    private static boolean isEven(int x)
    {
        if (x%2==0)
            return true;
        return false;
    }

    private static boolean couldDivideBy3and5(int x)
    {
        if (x%3==0 && x%5==0)
            return true;
        return false;
    }

    private static double thirdPow(double x)
    {
        //return x*x*x;
        return Math.pow(x,3);
    }
    private static double sqrt(double x)
    {

        return Math.sqrt(x);
    }
    private static boolean triangle(double x, double y, double z)
    {
        double[] sides = {x,y,z};
        Arrays.sort(sides);
        return ((Math.pow(sides[0],2))+(Math.pow(sides[1],2))==(Math.pow(sides[2],2)));

    }


}
