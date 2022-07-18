import java.util.Scanner;

public class Prob_5_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input your words: ");
        String strInput = input.nextLine();
        input.close();

        String appendInput = "";
        strInput = strInput.toLowerCase();
        for (int i = (strInput.length() - 1); i >= 0; i--)
        {
            appendInput = appendInput + strInput.charAt(i);
        }

        if (strInput.equals(appendInput.toLowerCase()))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}