// Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
// Note: Array should start with positive number.
 

// Example 1:

// Input: 
// N = 9
// Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
// Output:
// 9 -2 4 -1 5 -5 0 -3 2
// Example 2:

// Input: 
// N = 10
// Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
// Output:
// 5 -5 2 -2 4 -8 7 1 8 0 


// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function rearrange() which takes the array of integers arr[] and n as parameters. You need to modify the array itself.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

class Solution {
    void rearrange(int arr[], int n) {
       int a[]=new int[n];
       int b[]=new int[n];
       int i=0,j=0;
       for(int k=0;k<n;k++)
       {
           if(arr[k]<0)
           {
               a[i++]=arr[k];
           }
           else{
               b[j++]=arr[k];
           }
       }
       int len1=i,len2=j;
       i=0;
       j=0;
       int flag=0;
       for(int k=0;k<n;k++)
       {
           if(flag==0){
               if(j<len2){
                  arr[k]=b[j];
               }
               else{
                   arr[k]=a[i];
                   i++;
               }
            j++;
            flag=1;
           }
           else{
               if(i<len1){
                   
               arr[k]=a[i];
               }
               else{
                   arr[k]=b[j];
                   j++;
               }
            i++;
            flag=0;
           }
           
       }
    }
}
