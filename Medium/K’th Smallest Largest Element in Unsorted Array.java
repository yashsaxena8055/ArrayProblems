// Given an array and a number k where k is smaller than the size of the array, we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.

// Examples:  

// Input: arr[] = {7, 10, 4, 3, 20, 15} 
// k = 3 
// Output: 7

// Input: arr[] = {7, 10, 4, 3, 20, 15} 
// k = 4 
// Output: 10 
 
  
  public class Main
{
    public static void Heapify(int arr[],int i)
    {
        int min =i;
        int left=2*i+1,right=2*i+2;
        if(left<=arr.length-1 && arr[left]<arr[min])
        {
            min=left;
        }
        if(right<=arr.length-1 && arr[right]<arr[min])
        {
            min =right;
        }
        if(i!=min)
        {
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            Heapify(arr,min);
        }
        
    }
    public static int  arr[]={ 12, 3, 5, 7, 19 };
    public static int heapSize=arr.length-1;
    public static int ExtractMin(int arr[])
    {
        if(heapSize<0)
        {
            return-1;
        }
        else{
            int min =arr[0];
            arr[0]=arr[heapSize];
            heapSize -=1;
            Heapify(arr,0);
            return min;
        }
        
    }
    public static void BuildHeap(int arr[])
    {
        int size=arr.length;
        for(int i=((size/2)-1);i>=0;i--)
        {
            Heapify(arr,i);
        }
        // for(int i=0;i<arr.length;i++)
        // {
        // 	System.out.println(arr[i]);
        // }
    }
    
	public static void main(String[] args) {
		
		
		BuildHeap(arr);
		int min=0;
		int k=3;
		for(int i=0;i<k;i++)
		{
		    min =ExtractMin(arr);
		    	
		}
	System.out.println(min);
	}
}
