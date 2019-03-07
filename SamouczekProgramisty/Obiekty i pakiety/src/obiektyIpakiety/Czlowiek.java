package obiektyIpakiety;

public class Czlowiek
{
    public static void main(String[] args)
    {

        Human[] ludzie = new Human[5];
        ludzie[0] = new Human(25,52,190,"Jan", true);
        System.out.println(ludzie[0].getAge() + " " + ludzie[0].getHeight());
    }
}
class Human
{
    private Integer age;
    private Double weight;
    private Double height;
    private String name;
    private Boolean isMale;

    public Human(int age, double weight, double height, String name, boolean isMale)
    {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public String getName()
    {
        return name;
    }

    public boolean getIsMale()
    {
        return isMale;
    }
}