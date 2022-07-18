import java.util.Scanner;

public class Prob_1_VC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input your words: ");
        String strInput = input.nextLine();
        input.close();
        
        int vocal = 0, consonants = 0, digits = 0, characters = 0;
        strInput = strInput.toLowerCase();
        
        for (int i = 0; i < strInput.length(); ++i) {
            char ch = strInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') //check if character is any of a, e, i, o, u
            {
                ++vocal;
            }
            else if ((ch >= 'a' && ch <= 'z')) //check if character is in between a to z
            {
                 ++consonants;
            }
            else if (ch >= '0' && ch <= '9') //check if character is in between 0 to 9
            {
                ++digits;
            }
            else if (ch == ' ') //check if character is space
            {
                characters++;
            }
        }

        int CountInput = strInput.length() - characters;
        System.out.println("Vocal: " + vocal);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Count Character: " + CountInput);
    }
}