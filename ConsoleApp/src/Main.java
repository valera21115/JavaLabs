import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            Scanner ins=new Scanner(System.in);
            int choice;
            int n;
            String s;
            String sb;
            while (true)
            {
                displayMenu();
                System.out.println("Please select a menu item : ");
                choice=in.nextInt();
                switch (choice)
                {
                    case 1:
                    {
                        System.out.println("Enter a number: ");
                        n=in.nextInt();
                        System.out.println("Factorial of this number: "+ Main.fct(n)+"\n");
                        break;
                    }
                    case 2:
                        System.out.println("Enter a string\n");
                        s=ins.nextLine();
                        StringBuffer buffer = new StringBuffer(s);
                        buffer.reverse();
                        System.out.println("Reverse string: "+ buffer+"\n");
                        break;
                    case 3:
                        System.out.println("Enter a first string ");
                        s=ins.nextLine();
                        System.out.println("Enter a second string ");
                        sb=ins.nextLine();
                        boolean isContain = s.contains(sb);
                        if(isContain)
                        {
                            System.out.println("The string contains the entered substring\n");
                        }
                        else
                        {
                        System.out.println("The string does not contain the entered substring\n");
                        }
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Error! Incorrect choice of menu\n\nPlease, choise menu :");
                }
            }
        }
        public static int fct(int n)
        {
            int k=1;
            for(int i=1;i<=n;i++)
            { k*=i;
            }
            return k;
        }
        public static void displayMenu()
    {
	    int menu_items_count;
        menu_items_count = 4;
        String[] MenuItem=new String[menu_items_count];
        MenuItem[0] = "Factorial of a number";
        MenuItem[1] = "Reverse a string";
        MenuItem[2] = "Substring in a string";
        MenuItem[3] = "Exit";
        for (int i = 0; i < menu_items_count; i++)
        {
            System.out.println(i + 1 + ". " + MenuItem[i]);
        }

    }
}
