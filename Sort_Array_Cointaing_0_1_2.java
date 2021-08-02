// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


// Your Task:
// You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

class Solution
{
    public static void sort012(int a[], int n)
    {
       int arr[]=new int[n];
       int temp=0;
       for(int i=0;i<n;i++)
       {
           if(a[i]==0)
           {
               arr[temp]=0;
               temp++;
           }
       }
        for(int i=0;i<n;i++)
       {
           if(a[i]==1)
           {
               arr[temp]=1;
               temp++;
           }
       }
        for(int i=0;i<n;i++)
       {
           if(a[i]==2)
           {
               arr[temp]=2;
               temp++;
           }
       }
        for(int i=0;i<n;i++)
       {
          a[i]=arr[i];
       }
       
       
    }
}
