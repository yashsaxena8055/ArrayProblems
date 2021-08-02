// Given an unsorted array having both negative and positive integers. 
// The task is place all negative element at the end of array without changing the order of positive element and negative element.

// Example 1:

// Input : 
// A[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
       int a[]=new int[n];
       int index=0;
      
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
               a[index]=arr[i];
               index++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
               a[index]=arr[i];
               index++;
               
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=a[i];
        }
    }
}
