// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


// Example 1:

// Input:
// N = 4, K = 6
// arr[] = {1, 5, 7, 1}
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.
  
  
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function getPairsCount() which takes arr[], n and k as input parameters and returns the number of pairs that have sum K.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       
       int diff=0,count=0;
      
      
       for(int i=0;i<n;i++)
       {
           diff =k-arr[i];
           
           if(map.containsKey(diff))
           {
               
               count+=map.get(diff);
           }
           
              if(map.containsKey(arr[i]))
              {
                  map.put(arr[i],map.get(arr[i])+1);
              }
              else{
                  map.put(arr[i],1);
              }
          
           
       }
       return count;
    }
}
