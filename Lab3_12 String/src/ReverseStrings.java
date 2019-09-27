import java.util.ArrayList;

public class ReverseStrings {
    public static void reverseStrings(ArrayList<String> text) {
        for(String str: text)
        {
            StringBuffer buffer = new StringBuffer(str);
            System.out.println(buffer.reverse());
        }
    }
}
