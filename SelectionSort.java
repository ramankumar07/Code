import java.util.*;
 
public class SelectionSort
{
    
public  void SS(int arr[],int n)
{
    for(int i = 0; i<n-1; i++)
    {
        int imin = i;
        for(int j = i+1;j<n;j++)
        {
            if(arr[j] < arr[imin])
            {
                imin = j;
            }
            
            int temp = arr[i];
            arr[i] = arr[imin];
            arr[imin] = temp;
        }
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
		SelectionSort obj1 = new SelectionSort();
		obj1.SS(arr,n);
		
		for(int i = 0;i<n;i++)
		{
		    System.out.print(arr[i]+ " ");
		    
		}
	}
}