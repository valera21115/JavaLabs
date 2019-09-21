public class SortCol
{
    public static void sortCol(int startPos, int endPos, int [][] Arr)
    {

        if (startPos >= endPos)
        {
            return;
        }
        int i = startPos, j = endPos;
        int curPos = i - (i - j) / 2;
        while (i < j)
        {
            while (i < curPos && (Arr[i][0] >= Arr[curPos][0]))
            {
                i++;
            }
            while (j > curPos && (Arr[curPos][0] >= Arr[j][0]))
            {
                j--;
            }
            if (i < j)
            {
                int[] temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
                if (i == curPos)
                {
                    curPos = j;
                }
                else if (j == curPos)
                {
                    curPos = i;
                }
            }
        }
        sortCol(curPos+1, endPos,Arr);
        sortCol(startPos, curPos, Arr);

    }
}
