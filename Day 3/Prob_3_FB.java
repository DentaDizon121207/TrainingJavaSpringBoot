import java.util.Scanner;

public class Prob_3_FB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input number : ");
        int strInput = input.nextInt();
        input.close();
        
        System.out.println("Output Factor :");

        int factor = 0;

        for (int i = 0; i <= strInput; i++)
        {
            factor++;

            if (strInput % factor == 0)
            {
                System.out.print(factor + " ");
            }
        }
    }
}