package cwiczeniaMetody;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MyAge
{

    public static void main(String[] args)
    {

        System.out.println("Wpisz datę swojego urodzenia (w formacie yyyy-mm-dd):");
        try {
            LocalDate birthDate;
            Scanner odczyt = new Scanner(System.in);

            birthDate = LocalDate.parse(odczyt.nextLine());


            LocalDate currentDate = LocalDate.now();
            MyAgeCalculator a = new MyAgeCalculator(birthDate,currentDate);

            System.out.println(a.myFullAge());
        }
        catch (DateTimeParseException e)
        {
            System.out.println("Zły format daty");
        }

    }


}
class MyAgeCalculator
{
    private LocalDate birthDate;
    private LocalDate currentDate;

    MyAgeCalculator(LocalDate birthDate, LocalDate currentDate)
    {
        this.birthDate = birthDate;
        this.currentDate = currentDate;
    }

    private static int calculateYears(LocalDate birthDate, LocalDate currentDate)
    {
        return Period.between(birthDate, currentDate).getYears();
    }
    private static int calculateMonths(LocalDate birthDate, LocalDate currentDate)
    {
        return Period.between(birthDate, currentDate).getMonths();
    }
    private static int calculateDays(LocalDate birthDate, LocalDate currentDate)
    {
        return Period.between(birthDate, currentDate).getDays();
    }

    String myFullAge()
    {
        return "Masz: " + MyAgeCalculator.calculateYears(birthDate,currentDate) + " lat, " + MyAgeCalculator.calculateMonths(birthDate,currentDate)+ " miesięscy i " + MyAgeCalculator.calculateDays(birthDate,currentDate) + " dni.";
    }
}