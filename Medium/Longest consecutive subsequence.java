// Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 

// Example 1:

// Input:
// N = 7
// a[] = {2,6,1,9,4,5,3}
// Output:
// 6
// Explanation:
// The consecutive numbers here
// are 1, 2, 3, 4, 5, 6. These 6 
// numbers form the longest consecutive
// subsquence.
// Example 2:

// Input:
// N = 7
// a[] = {1,9,3,10,4,20,2}
// Output:
// 4
// Explanation:
// 1, 2, 3, 4 is the longest
// consecutive subsequence.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function findLongestConseqSubseq() which takes the array arr[] and the size of the array as inputs and returns the length of the longest subsequence of consecutive integers. 


// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(N).
//                                                                   ALOGRITHM

// Create an empty hash.
// Insert all array elements to hash.
// Do following for every element arr[i].
// Check if this element is the starting point of a subsequence. To check this, simply look for arr[i] – 1 in the hash, if not found, then this is the first element of a subsequence.
// If this element is the first element, then count the number of consecutive elements present in the hash starting with this element. Iterate from arr[i] + 1 till the last element that can be found.
// If the count is more than the previous longest subsequence found, then update it.


class Solution
{ 
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   Set<Integer> set = new HashSet<>();
	   for(int i=0;i<N;i++)
	   {
	       set.add(arr[i]);
	       
	   }
	 int count=1,max=0;
	 for(int i=0;i<N;i++)
	 {
	     if(set.contains(arr[i]-1)==false)
	     {
	         int j=arr[i] +1;
	         while(set.contains(j))
	         {
	             count++;
	             j++;
	         }
	         if(count>max)
	         {
	             max=count;
	         }
	         count=1;
	     }
	 }
	 return max;
	}
}
