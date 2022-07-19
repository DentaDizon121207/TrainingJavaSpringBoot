import java.util.*;

public class Prob_4_Array_Unique
{    
    public static void main(String[] args)
    {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,3,5,10,16));
        ArrayList<Integer> result = new ArrayList<Integer>();

        System.out.println("Input : " + arr1 + " dan " + arr2);
 
        for (int i = 0; i <= arr1.size() - 1; i++)
        {
            if(!arr2.contains(arr1.get(i)))
                result.add(arr1.get(i));
        }

        System.out.println("Output : " + result);
    }
    
}