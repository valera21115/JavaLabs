import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> text=new ArrayList<>();

        System.out.println("Enter a text(End of a text is empty string)");
        FillText.fillText(text);

        System.out.println("Reversed strings of a text: ");
        ReverseStrings.reverseStrings(text);
    }
}