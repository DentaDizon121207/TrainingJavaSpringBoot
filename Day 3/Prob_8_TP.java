import java.util.Scanner;

public class Prob_8_TP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        int strInput = input.nextInt();
        input.close();

        System.out.print("Output : \n");
        int i = 1;
        if (strInput < 31)
        {
            while(i <= strInput)
            { 
                int j = 1; 
                while(j <= strInput)
                {
                    System.out.print(i*j+"\t");
                    j++;
                }

                i++;
                System.out.println();
            }
        }
        else
        {
            System.out.print("Input must be < 31");
        }
    }
}