// Given a string str, find the length of the longest substring without repeating characters. 

// For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
// For “BBBB” the longest substring is “B”, with length 1.
// For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int max=0;
		String str = sn.nextLine();
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
		     
		    if(set.contains(str.charAt(i))==false)
		    {
		       
		        set.add(str.charAt(i));
		         
		        
		    }
		    else{
		        
		           if(max <=set.size()){
		         
		         max = set.size();
		        }
		         set.clear();
		       
		    }
		       if(max <=set.size()){
		         
		         max = set.size();
		        }
		   
		}
		System.out.println(set);
		System.out.println(max);
	}
}
