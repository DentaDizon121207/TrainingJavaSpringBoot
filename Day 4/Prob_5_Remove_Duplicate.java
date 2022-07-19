import java.util.*;

public class Prob_5_Remove_Duplicate
{    
    public static void main(String[] args)
    {
        ArrayList<Integer> ListArray1 = new ArrayList<>(Arrays.asList(2, 3, 3, 3, 6, 9, 9));
        HashSet<Integer> result = new HashSet<Integer>(ListArray1);

        System.out.println("Input : " + ListArray1) ;
        System.out.println("Output : " + result.size());
    }
    
}