import java.util.Scanner;

public class Prob_7_Asterisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        int strInput = input.nextInt();
        input.close();
        topBottom(strInput);
    }
    
    public static void topBottom(int n)
    {
        for (int i = 1; i <= n; i++){
            for (int j = n - 1; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print('*');
            }
            System.out.println();
         }
    }
}