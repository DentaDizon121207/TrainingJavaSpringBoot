import java.util.*;
import java.lang.Math;

public class Prob_1_Simple_Equations
{
    public static void main(String[] args)
    {
        Result();
    }

    public static void Result()
    {
        System.out.println("Input A: ");
        Scanner inputan = new Scanner(System.in);
        Integer inputA = inputan.nextInt();
        
        System.out.println("Input B: ");
        Integer inputB = inputan.nextInt();

        System.out.println("Input C: ");
        Integer inputC = inputan.nextInt();

        ArrayList<String> ListResult = new ArrayList<String>();

        for(Integer x = 0; x < 10; x++) {
            for(Integer y = 0; y < 10; y++) 
            {
                for(Integer z = 0; z < 10; z++)
                {
                    Integer res1 = x + y + z;
                    Integer res2 = x * y * z;
                    Double res3 = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);

                    if(res1 == inputA && res2 == inputB && res3 == (double) inputC)
                    {
                        ListResult.add(x + " " + y + " " + z);
                    }
                }
            }
        }
        
        if(ListResult.size() == 0)
        {
            System.out.println("No Solution");
        }
        else
        {
            for(String DecResult: ListResult)
            {
                System.out.println(DecResult);
            }
        }
        inputan.close();
    }
}