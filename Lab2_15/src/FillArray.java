import java.util.Random;

public  class FillArray
{
    public static void fillArr( int[][] arr)
    {
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                arr[i][j] = rnd.nextInt(100);
            }
        }
    }
}
