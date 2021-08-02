// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

// Example 1:

// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4
// Example 2:

// Input:
// N = 10
// A[] = {1,2,3,4,5,6,7,8,10}
// Output: 9

// Your Task :
// You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.

class Solution {
    int MissingNumber(int array[], int n) {
        int sum=(n*(n+1))/2;
        for(int i=0;i<n-1;i++)
        {
            sum -=array[i];
        }
        return sum;
    }
}
