package petle;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getNumberFrom0toX(3);
        System.out.println();
        getNumberFrom0ToXWhileLoop(4);

        System.out.println();

        numberFromBehindIn3Lines(1556);

        System.out.println();

        printCharPerLine(1995);

        System.out.println();

        reverseString("Pierwszy");

        System.out.println();

        System.out.println(integerToBinary(21));
        System.out.println();
        integerToBinary2(21);

        System.out.println();

        isItPalindrom("Kobyła ma mały bok");

        System.out.println();

        printArray(new int[] {1,2,3,6,9});
        System.out.println();

        sortArray(new int[] {5,8,2,1,0,9,8});
        System.out.println();
        sortArrayVer2(new int[] {5,8,2,1,0,9,8});




    }

    //ZADANIE 1

    private static void getNumberFrom0toX(int x) {
        if (x > 0)
            for (int i = 0; i <= x; i++)
                System.out.println(i);
        else
            System.out.println("Proszę podać dodatnią liczbę");
    }

    //ZADANIE 2

    private static void getNumberFrom0ToXWhileLoop(int x) {
        int i = 0;
        if (x > 0)
            while (i <= x)
                System.out.println(i++);
        else
            System.out.println("Proszę podać dodatnią liczbę");
    }

    //ZADANIE 3 - ArrayFacory


    //ZADANIE 4


    //Sposób 1

    private static void numberFromBehindIn3Lines(int x) {
        String intToStr = Integer.toString(x);
        char[] text = intToStr.toCharArray();
        char tmp;
        for (int i = 0; i < text.length / 2; i++) {
            tmp = text[i];
            text[i] = text[text.length - i - 1];
            text[text.length - i - 1] = tmp;
        }
        for (char i : text) {
            System.out.println(i);
        }
    }

    //Sposób 2

    private static void printCharPerLine(int number) {
        while (number > 0) {
            int tmp = number % 10;
            number /= 10;
            System.out.println(tmp);
        }
    }

    //ZADANIE 5

    private static void reverseString(String text)
    {
        char[] splittedText = text.toCharArray();
        char tmp;
        for (int i = 0; i <splittedText.length/2; i++)
        {
            tmp = splittedText[i];
            splittedText[i] = splittedText[splittedText.length-1-i];
            splittedText[splittedText.length-1-i] = tmp;
        }
        for (char i:splittedText) {
            System.out.print(i);
        }
    }

    //ZADANIE 6


    //Sposób pierwszy

    private static String integerToBinary(int x)
    {
        return Integer.toBinaryString(x);
    }

    //Sposób drugi

    private static void integerToBinary2(int x)
    {
        String binary = "";

        while (x>0)
        {
            binary += x%2;
            x/=2;
        }
        System.out.print(binary);


    }


    //ZADANIE 7

    private static void isItPalindrom(String text)
    {
        text = text.replace(" ", "");
        //System.out.println(text);
        char[] palindrom = text.toCharArray();
        boolean isItTheSame = false;
        for (int i = 0; i<palindrom.length/2; i++)
        {
            char a = palindrom[i];
            char b = palindrom[palindrom.length - 1 - i];
            if (a==b)
            {
                isItTheSame = true;
            }
            else
                isItTheSame = false;
        }
        if (isItTheSame)
            System.out.println("Tak, to jest palindrom!");
        else
            System.out.println("Nie, to nie jest palindrom!");
    }

    //ZADANIE 8

    private static void printArray(int[] array)
    {
        String[] strArray = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        for (int i = 0; i < strArray.length; i++)
        {
            strArray[i] = "Liczba";
        }
        System.out.println(Arrays.toString(strArray));

    }


    //ZADANIE 9

    //Sposób 1

    private static void sortArray(int[] array)
    {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    //Sposób 2

    private static void sortArrayVer2(int[] array)
    {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int current = 0; current < array.length - 1 - i; current++) {
                int next = current + 1;
                if (array[current] > array[next]) {
                    tmp = array[next];
                    array[next] = array[current];
                    array[current] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}