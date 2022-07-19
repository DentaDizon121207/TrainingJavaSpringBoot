import java.util.*;

public class Prob_1_Array_Merge
{
    public static void main(String[] args)
    {

        ArrayList<String> ListNm1 = new ArrayList<String>();
        ArrayList<String> ListNm2 = new ArrayList<String>();

        ArrayList<String> ListNm3 = new ArrayList<String>();
        ArrayList<String> ListNm4 = new ArrayList<String>();

        FirstExample(ListNm1, ListNm2);
        SecondExample(ListNm3, ListNm4);
    }

    public static void FirstExample(ArrayList<String> ListNm1, ArrayList<String> ListNm2)
    {
        // Add elements to ArrayList 1
        ListNm1.add("kazuya");
        ListNm1.add("jin");
        ListNm1.add("lee");

        // Add elements to ArrayList 2
        ListNm2.add("kazuya");
        ListNm2.add("feng");

        //Input
        System.out.println("Input: " + ListNm1 + ", " + ListNm2);

        ArrayList<String> lstJoinName = new ArrayList<String>();
        
        for (int i = 0; i < ListNm1.size(); ++i)
        {
            String name = ListNm1.get(i);
            lstJoinName.add(name);
        }

        for (int i = 0; i < ListNm2.size(); ++i)
        {
            String name = ListNm2.get(i);
            lstJoinName.add(name);
        }
        
        // create HashSet
        HashSet<String> result = new HashSet<String>(lstJoinName);

        //Output
        System.out.println("Output : " + result);
        System.out.println("\n");
    }

    public static void SecondExample(ArrayList<String> ListNm3, ArrayList<String> ListNm4)
    {
        // Add elements to ArrayList 1
        ListNm3.add("lee");
        ListNm3.add("jin");

        // Add elements to ArrayList 2
        ListNm4.add("kazuya");
        ListNm4.add("panda");

        //Input
        System.out.println("Input: " + ListNm3 + ", " + ListNm4);

        ArrayList<String> lstJoinName = new ArrayList<String>();
        
        for (int i = 0; i < ListNm3.size(); ++i)
        {
            String name = ListNm3.get(i);
            lstJoinName.add(name);
        }

        for (int i = 0; i < ListNm4.size(); ++i)
        {
            String name = ListNm4.get(i);
            lstJoinName.add(name);
        }
        
        // create HashSet
        HashSet<String> result = new HashSet<String>(lstJoinName);

        //Output
        System.out.println("Output: " + result);
    }
}