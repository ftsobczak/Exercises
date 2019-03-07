package scanner;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args)
    {

        printString();
    }
    private static void printString()
    {
        String text;
        String inputString;
        String inputStringWithoutSpace;
        char[] charArray;
        char[] reverseString;
        boolean isItPalindrom = false;

        //Pobieranie ciągu znaków od użytkownika.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz coś:");

        inputString = scanner.nextLine();

        //Usuwanie spacji i zamiana Stringa w tablicę char

        inputStringWithoutSpace = inputString.replace(" ", "");
        charArray = inputStringWithoutSpace.toCharArray();

        //Dopasowanie końcówki do liczebnika

        if (charArray.length==1)
            text = " znaku.";
        else
            text = " znaków.";

        //Wyświetlenie liczby znaków tekstu podanego przez użytkownika (bez spacji)

        System.out.println("Ten tekst składa się z: " + charArray.length + text);

        //Sprawdzenie, czy podany tekst jest palindromem

        for (int i = 0; i < charArray.length/2; i++)
        {
            char current = charArray[i];
            char opposit = charArray[charArray.length-1-i];
            if (current==opposit)
                isItPalindrom = true;

        }
        if (isItPalindrom)
            System.out.println("Ten tekst, to palindrom.");
        else
            System.out.println("Ten tekst, to nie palindrom.");

        //Odwrócenie podanego tekstu

        reverseString = inputString.toCharArray();

        for (int i = 0; i < reverseString.length/2; i++)
        {
            char tmp = reverseString[i];
            reverseString[i] = reverseString[reverseString.length-1-i];
            reverseString[reverseString.length-1-i] = tmp;
        }

        System.out.print("Twój tekst od tyłu wygląda tak: ");
        for (char i:reverseString) {
            System.out.print(i);
        }


    }
}
