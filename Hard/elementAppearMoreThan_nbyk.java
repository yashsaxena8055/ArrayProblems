// Given an array of size n and a number k, find all elements that appear more than n/k times

// Given an array of size n, find all elements in array that appear more than n/k times. 
//   For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, then the output should be [2, 3]. 
//     Note that size of array is 8 (or n = 8), so we need to find all elements that appear more than 2 (or 8/4) times. 
//   \There are two elements that appear more than two times, 2 and 3. 

    import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int arr[]={3, 1, 2, 2, 1, 2, 3, 3} ;
	HashSet<Integer> set =new HashSet<>();
    int n=arr.length,k=4;
    k= n/k;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++)
    {
        if(map.containsKey(arr[i]))
        {
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
    }
    for(int i=0;i<n;i++)
    {
        if(map.get(arr[i])>k)
          set.add(arr[i]);
    }
    System.out.println(set);
	}
}
