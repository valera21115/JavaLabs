import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
     int row;
     int col;

     Scanner in=new Scanner(System.in);

     try
     {
     System.out.println("Enter count of rows: ");
     row=in.nextInt();
     if(row<=0)
     {
         System.out.println("Error! Count of rows must be positive");
         return;
     }
     System.out.println("Enter count of columns:");
     col=in.nextInt();
     if(col<=0)
     {
             System.out.println("Error! Count of columns must be positive");
             return;
     }
     int [][] arr=new int[row][col];

        FillArray.fillArr(arr);
        System.out.println("Initial matrix: ");
        ShowArr.showArr(arr);
        SortCol.sortCol(0,row-1,arr);
        System.out.println("Sorted by first elements of matrix rows: ");
        ShowArr.showArr(arr);
     }
     catch (Throwable wrongType){
        System.out.println("Error occurred while reading input!");
        return;
    }
    }
}
