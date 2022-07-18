import java.util.Scanner;

public class Prob_2_XO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input X or O : ");
        String strInput = input.nextLine();
        input.close();

        int x = 0, o = 0;
        strInput = strInput.toUpperCase();
        if (strInput.contains("X") || strInput.contains("O") || strInput.contains("XO"))
        {
            for (int i = 0; i < strInput.length(); ++i) {
                char chars = strInput.charAt(i);

                if (chars == 'X')
                {
                    x++;
                }
                else if (chars == 'O')
                {
                    o++;
                }              
            }

            boolean isSame = false;
            if (x == o)
            {
                isSame = true;
            }

            System.out.println(isSame);
        }
        else
        {
            System.out.println("Input must be contain X or O");
        }
    }
}