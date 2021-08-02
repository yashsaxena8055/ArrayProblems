//Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.

// Input:
// N = 5
// vector = {1, 1, 1, 1, 1}
// X = 1
// Output: 
// 5
// Explanation: Frequency of 1 is 5
  
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)throws IOException{

       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter No of Elements");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter ELements");
        String str[]=br.readLine().split(" ");
        int arr[]=new int[n];
        System.out.println("Enter Number to search it frequency");
        int x=Integer.parseInt(br.readLine());
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);

            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println("Frequency of "+x+" is equals to "+map.get(x));

    }

    }

