import java.util.*;

public class Prob_2_Angka
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arrListNum = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);  
        System.out.print("Input your number: ");
        String strInput = input.nextLine();
        input.close();
        
        if (strInput.matches("[0-9]*"))
        {
            for (int i = 0; i < strInput.length(); ++i)
            {
                char ch = strInput.charAt(i);
                String strNum = String.valueOf(ch);
                Integer number = Integer.parseInt(strNum);

                arrListNum.add(number);
            }
            
            HashSet<Integer> sortDuplicateLstNum = new HashSet<>(arrListNum);
            ArrayList<Integer> resultArrListNum = new ArrayList<Integer>();

            for (Integer item : sortDuplicateLstNum)
            {
                if (arrListNum.stream().filter(x -> !x.equals(item)).count() == arrListNum.size() - 1)
                {
                    resultArrListNum.add(item);
                }
            }

            //Output
            System.out.println("Output : " + resultArrListNum);
        }
        else
        {
            System.out.println("your input must be number");
        }
        
    }
}