import java.util.Scanner;

public class Prob_4_BP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input number: ");
        int strInput = input.nextInt();
        input.close();
        
        int x = 0;
        
        for (int i = 2; i <= strInput; i++)
        {
            if (strInput % i == 0)
            {
                x++;
            } 
        }
        
        if (x == 1)
        {
            System.out.println(strInput+" Bilangan Prima");
        }
        else
        {
            System.out.println(strInput+" Bukan Bilangan Prima");
        } 
    }
}