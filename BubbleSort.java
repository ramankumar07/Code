/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class BubbleSort
{
    void BS(int arr[], int n)
    {
        for(int k=1; k<=n-1; k++)
        {
            int flag = 0;
            for(int i =0; i <= n-k-1; i++)
            {
                if(arr[i] > arr[i+1] )
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = 1;
                    
                }
            }
            if(flag == 0) break;
        }
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		    
		}
		BubbleSort obj1 = new BubbleSort();
		obj1.BS(arr,n);
		
		for(int i = 0;i<n;i++)
		{
		    System.out.print(arr[i]+ " ");
		    
		}
	}
}
