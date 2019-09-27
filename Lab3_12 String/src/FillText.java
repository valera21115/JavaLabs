import java.util.ArrayList;
import java.util.Scanner;

public class FillText {
    public static void fillText(ArrayList<String> text)
    {
        Scanner in=new Scanner(System.in);
        while(true){
            String current = in.nextLine();
            if(current.equals(""))break;
            text.add(current);
        }
    }
}
