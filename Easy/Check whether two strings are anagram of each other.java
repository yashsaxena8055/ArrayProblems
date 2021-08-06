// Write a function to check whether two given strings are anagram of each other or not. 
// An anagram of a string is another string that contains the same characters, only the order of characters can be different.
// For example, “abcd” and “dabc” are an anagram of each other.

// check-whether-two-strings-are-anagram-of-each-other

                                                                       
                                                                   // MY SOLUTION 

// import java.util.*;
// public class Main
// {
// 	public static void   main(String[] args) {
	
// 	  String str1="forgeeksgeeks";
// 	  String str2="geeksforgeeks";
// 	   HashSet<Character> set= new HashSet<>();
	  
	   
// 	   HashMap<Character,Integer> map=new HashMap<>();
// 	    HashMap<Character,Integer> map2=new HashMap<>();
// 	  for(int i=0;i<str1.length();i++)
// 	  {
// 	      if(map.containsKey(str1.charAt(i)))
// 	      {
// 	          map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
// 	      }
// 	      else{
// 	          map.put(str1.charAt(i),1);
// 	      }
// 	  }
// 	  for(int i=0;i<str1.length();i++)
// 	  {
// 	      if(map2.containsKey(str1.charAt(i)))
// 	      {
// 	          map2.put(str1.charAt(i),map2.get(str1.charAt(i))+1);
// 	      }
// 	      else{
// 	          map2.put(str1.charAt(i),1);
// 	      }
// 	  }
// 	  for(int i=0;i<str1.length();i++)
// 	  {
// 	      set.add(str1.charAt(i));
// 	  }
// 	  for(int i=0;i<str2.length();i++)
// 	  {
// 	      if(set.contains(str2.charAt(i)))
// 	      {
// 	         if(map.get(str2.charAt(i))!=map2.get(str2.charAt(i)))
// 	         {
// 	             System.out.println("No");
// 	             System.out.println("No");
// 	             return ;
// 	         }
// 	      }
// 	      else{
// 	          System.out.println("No");
// 	            return ;
// 	      }
	      
// 	  }
// 	 System.out.println("Yes");
// 	   return ;
	  
// 	}
// }


                                           // OPTIMIZED SOLUTION FROM GEEKS FOR GEEKS  IN TIME COMPLEXITY O(N);

public class Main
{
	static int NO_OF_CHARS = 256;
 
// function to check if two strings
// are anagrams of each other
static boolean areAnagram(char[] str1,
                          char[] str2)
{
     
    // Create a count array and initialize
    // all values as 0
    int[] count = new int[NO_OF_CHARS];
    int i;
 
    // For each character in input strings,
    // increment count in the corresponding
    // count array
    for(i = 0; i < str1.length; i++)
    {
        count[str1[i]]++;
        count[str2[i]]--;
    }
 
    // If both strings are of different
    // length. Removing this condition
    // will make the program fail for
    // strings like "aaca" and "aca"
    if (str1.length != str2.length)
        return false;
 
    // See if there is any non-zero
    // value in count array
    for(i = 0; i < NO_OF_CHARS; i++)
        if (count[i] != 0)
        {
            return false;
        }
    return true;
}
 
// Driver code
public static void main(String[] args)
{
    char str1[] = "abcd".toCharArray();
    char str2[] = "aabc".toCharArray();
 
    // Function call
    if (areAnagram(str1, str2))
        System.out.print("The two strings are " +
                         "anagram of each other");
    else
        System.out.print("The two strings are " +
                         "not anagram of each other");
}
}
