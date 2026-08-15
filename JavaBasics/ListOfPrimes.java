import java.util.*;

class ListOfPrimes{

    public static void main(String args[]){
        int a = 272, z = 0;
        int[] arr = new int[a/2];

        for (int i = 3; i < a/2 + 1; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0 && i != j)
                    break;
                else if (j == a/2)
                {
                    arr[z] = i;
                    z++;
                    
                }
            }            
        }
        System.out.println(Arrays.toString(arr));
    }
}