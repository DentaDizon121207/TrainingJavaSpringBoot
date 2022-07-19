import java.util.*;

public class Prob_3_Pair_Target_Sum{
    
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,5,9,11));
        int target = 11;

        System.out.println("Input : " + nums + " target : " + target);
 
        for (int i = 0; i < nums.size() - 1; i++)
        {
            for (int j = i + 1; j < nums.size(); j++)
            {
                if (nums.get(i) + nums.get(j) == target)
                {
                    System.out.println("Output : [" + i + ", " + j + "]");
                    return;
                }
            }
        }
 
        System.out.println("Pair not found");
    }
    

}