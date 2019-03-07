package arrays;


public class Arrays
{
    public static void main(String[] args)
    {

        Arrays n = new Arrays();
        n.getArray();

        System.out.println(java.util.Arrays.toString(getArray2(new int[] {1,2,3})));

    }
    private char[] array = new char[5];

    private char a = 'a';

    private void getArray()
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i]= a++;
            System.out.println(array[i]);

        }
    }

    private static int[] getArray2(int[] array2)
    {
        return new int[]{array2[2], array2[1], array2[0]};
    }


}
