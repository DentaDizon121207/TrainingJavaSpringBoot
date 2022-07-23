import java.util.*;

class Prob_4_Binary_Search_Algorithm
{
    public static void main(String args[])
    {
        Prob_4_Binary_Search_Algorithm Model = new Prob_4_Binary_Search_Algorithm();
        int ListArray[] = {1, 1, 3, 5, 5, 6, 7};
        int CountArray = ListArray.length;
        int x = 3;
        int result = Model.binarySearch(ListArray, 0, CountArray - 1, x);
        
        System.out.println("Input : " + Arrays.toString(ListArray));
        System.out.println("Output : " + result);
    }

    int binarySearch(int arr[], int a, int b, int c)
    {
        if (b >= a )
        {
            int mid = a  + (b - a) / 2;
            
            if (arr[mid] == c)
            {
                return mid;
            }
                
            if (arr[mid] > c)
            {
                return binarySearch(arr, a , mid - 1, c);
            }
                
            return binarySearch(arr, mid + 1, b, c);
        }
        else
        {
            return -1;
        }
    }
}