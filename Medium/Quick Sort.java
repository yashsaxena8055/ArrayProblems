// Array is indexed from 0 to n-1



class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high)
    {
        int q=partition(arr,low,high);
        quickSort(arr,low,q-1);
        quickSort(arr,q+1,high);
        
    }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivort=arr[high];
   int i=low-1;
   for(int j=low;j<high;j++)
   {
       if(arr[j]<=pivort)
       {
           i++;
           int temp=0;
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
   }
           int temp=0;
           temp=arr[i+1];
           arr[i+1]=arr[high];
           arr[high]=temp;
          
   return ++i;
    } 
   
}
