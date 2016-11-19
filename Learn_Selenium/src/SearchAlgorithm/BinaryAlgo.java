package SearchAlgorithm;

public class BinaryAlgo
{
	public int binarySearch(int[] arr, int key)
	{
		int start = 0 ;
	    int end = arr.length -1;
	    
	    while(start<=end)
	    {
	       int mid = (start + end)/2;
		   System.out.println("middle point is: " + mid);
	      if(key == arr[mid])
	     {
	    	return mid;
	     }
	    
	     if(key < arr[mid])
	     {
	    		end = mid -1 ; 
	    		System.out.println("END point is: " + end);
	     }
	    	else 
	     {
	    		start = mid + 1;
	    		System.out.println("START point is: " + start);
	     }
	   }
	    		
		return -1;
	    
	}

	public static void main(String[] args) 
	{
		
        BinaryAlgo bs = new BinaryAlgo();
        int[] arr1 = {1,3,5,9,11,56,100};
        System.out.println("the position of the key 3 is " + bs.binarySearch(arr1, 3) );
               
	}

}
