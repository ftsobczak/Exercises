package petle;

public class ArrayFactory {
    public static void main(String[] args)
    {

        ArrayFactory arrayFactory = new ArrayFactory(3);
        int[] ints = arrayFactory.oneDimension();
        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = i + 1;
            System.out.println(ints[i]);
        }

        System.out.println();

        int[][] ints2 = arrayFactory.twoDimension();
        char counter = 'a';
        for (int i = 0; i < ints2.length; i++)
        {
            for (int j = 0; j < ints2[i].length; j++)
            {
                ints2[i][j] = counter++;
                System.out.print((char)ints2[i][j]);
            }
            System.out.println();
        }

        arrayFactory.identityMatrix(8);
    }

    int x;

    private ArrayFactory(int x)
    {
        this.x = x;
    }

    private int[] oneDimension()
    {
        return new int[x];
    }

    private int[][] twoDimension()
    {
        return new int[x][x];
    }

    private void identityMatrix(int x)
    {
        int[][] iMatrix = new int[x][x];
        for (int i = 0; i < iMatrix.length; i++)
        {
            for (int j = 0; j < iMatrix[i].length; j++) {
                if (i == j)
                    iMatrix[i][j] = 1;
                //Przypisywanie 0 jest zbędne, bo tablice int domyślnie są wypełniane zerami.
//                else
//                    iMatrix[i][j] = 0;
                System.out.print(iMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
