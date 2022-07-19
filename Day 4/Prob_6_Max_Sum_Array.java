import java.util.*;

public class Prob_6_Max_Sum_Array
{    
    public static void main(String[] args)
    {
        ArrayList<Integer> ListArray1 = new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));
        int k = 3;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i <= ListArray1.size() - 1; i++)
        {        
            int sizetemp = k-1;
            if(i + sizetemp > ListArray1.size() - 1)
                break;

            int value = 0;

            for(int j = i; j <= i + sizetemp ; j++){
                value += ListArray1.get(j);
            }
            
            result.add(value);
        }

        System.out.println("Output : " + Collections.max(result));
    }
    
}