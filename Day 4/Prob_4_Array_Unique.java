import java.util.*;

public class Prob_4_Array_Unique
{    
    public static void main(String[] args)
    {
        ArrayList<Integer> ListArray1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> ListArray2 = new ArrayList<>(Arrays.asList(1,3,5,10,16));
        ArrayList<Integer> result = new ArrayList<Integer>();

        System.out.println("Input : " + ListArray1 + " dan " + ListArray2);
 
        for (int i = 0; i <= ListArray1.size() - 1; i++)
        {
            if(!ListArray2.contains(ListArray1.get(i)))
                result.add(ListArray1.get(i));
        }

        System.out.println("Output : " + result);
    }
    
}