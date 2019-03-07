package scanner;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Main main = new Main();

        printBinary();

        makeAnArray();


    }

    private static void printBinary()
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isInteger = true;
        String binaryNumber = "";
        System.out.println("Wpisz liczbę całkowitą:");


        try
            {
                number = scanner.nextInt();

                binaryNumber = Integer.toBinaryString(number);

                System.out.println("Wersja binarna liczby " + number + " to: " + binaryNumber);
            }
            catch (InputMismatchException e)
            {
                System.out.println("To nie jest liczba całkowita! Spróbuj jeszcze raz.");
                System.out.println();
                printBinary();
            }

    }

    private static void makeAnArray()
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Podaj liczbę całkowitą:");
        try
        {
            n = scanner.nextInt();
            Integer [] array = new Integer[n];
            for (int i = 0; i < array.length; i++)
            {
                array[i] = n;
                n++;
            }
            Arrays.sort(array, Collections.reverseOrder());

//            for (int i = 0; i < array.length; i++)
//            {
//                for (int j = 0; j< array.length-1-i; j++)
//                {
//                    int next = j+1;
//                    if (j<next)
//                    {
//                        int tmp = array[j];
//                        array[j] = array[next];
//                        array[next] = tmp;
//                    }
//                }
//            }

            System.out.println(Arrays.toString(array));
        }
        catch (InputMismatchException e)
        {
            System.out.println("To nie jest liczba całkowita! Spróbuj jeszcze raz.");
            System.out.println();
            makeAnArray();
        }

    }
}
