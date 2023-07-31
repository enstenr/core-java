import java.util.Arrays;
import java.util.Scanner;

class Puzzle1 {

	/* Name of the class has to be "Main" only if the class is public. */

	public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0)
			{
			    int n = sc.nextInt();
			    int[] arr = new int[n];
			    for(int i=0; i<n; i++)
			    {
			        arr[i]=sc.nextInt();
			    }
			    Arrays.sort(arr);
			    int m =0;
			    int c=1;
			    for(int i=1; i<n; i++) // 5 
			    {						//2 2  3 4 2 
			    	 
			    }
			     
			    
			    System.out.println(n-m);
			    
			    }
			
			        
			}     

			        
			       
}
