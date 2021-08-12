// Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

// Example 1:

// Input:
// 5
// 4 2 -3 1 6

// Output: 
// Yes

// Explanation: 
// 2, -3, 1 is the subarray 
// with sum 0.
// Example 2:

// Input:
// 5
// 4 2 0 1 6

// Output: 
// Yes

// Explanation: 
// 0 is one of the element 
// in the array so there exist a 
// subarray with sum 0.
// Your Task:
// You only need to complete the function subArrayExists() that takes array and n as parameters and returns true or false depending upon whether there is a subarray present with 0-sum or not. Printing will be taken care by the drivers code.

// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(n).


class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
       HashSet<Integer> set =new HashSet<>();
       set.add(arr[0]);
       int sum=arr[0];
       for(int i=1;i<arr.length;i++)
       {
           sum+=arr[i];
           if(arr[i]==0)
            return true;
           else if(sum==0)
             return true;
           else if(set.contains(sum))
           {
               return true;
           }
           else{
               set.add(sum);
           }
       }
       return false;
    }
}
