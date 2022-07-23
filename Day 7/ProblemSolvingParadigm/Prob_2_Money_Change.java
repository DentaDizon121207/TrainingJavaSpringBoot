import java.util.Vector;
  
class Prob_2_Money_Change 
{
    public static void main(String[] args) 
    {
        int val = 432;
        System.out.println("Input : " + val);
        System.out.print("Output :");
        findMin(val);
    }

    public static void findMin(int input)
    {
        int ListInput[] = {1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
        int InputDec = ListInput.length;

        Vector<Integer> intVector = new Vector<>();
        
        for (int i = InputDec - 1; i >= 0; i--)
        {
            while (input >= ListInput[i]) 
            {
                input -= ListInput[i];
                intVector.add(ListInput[i]);
            }
        }
  
        for (int i = 0; i < intVector.size(); i++)
        {
            System.out.print(" " + intVector.elementAt(i) + " ");
        }
    }
}