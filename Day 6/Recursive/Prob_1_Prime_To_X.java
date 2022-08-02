import java.util.*;

public class Prob_1_Prime_To_X{
    public static void main(String[] args) {
        int i =0;
        int num =0;
        ArrayList<Integer> listPN = new ArrayList<Integer>();

        for (i = 1; i <= 100; i++)         
        { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	        {
                if(i%num==0)
	            {
 		            counter = counter + 1;
	            }
	        }
            if (counter ==2)
            {
                listPN.add(i);
            }	
        }	

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Prima Number : ");
        Integer inputN = scanner.nextInt();

        System.out.println("Prima Number " + inputN + " is : " + listPN.get(inputN - 1));

        scanner.close();
    }
}