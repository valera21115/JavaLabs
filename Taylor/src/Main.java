import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int k;
        double x;

        Scanner in = new Scanner(System.in);

        try
        {
        System.out.println("Enter x");
        x = in.nextDouble();
        if(x<-1|| x>1)
        {
            System.out.println("Incorrect data");
            return;
        }
        System.out.println("Enter k");
         k=in.nextInt();
        }
        catch (Throwable ex){
            System.out.println("Error occurred while reading input!");
            return;
        }
        System.out.printf("%.3f",Taylor.calc(x,k));
        System.out.println("\n");
        System.out.printf("%.3f",Math.sqrt(1+x));
    }
}
