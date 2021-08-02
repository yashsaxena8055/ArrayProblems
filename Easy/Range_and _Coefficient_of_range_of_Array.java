// Given an array arr of integer elements, the task is to find the range and coefficient of range of the given array where: 
// Range: Difference between the maximum value and the minimum value in the distribution. 
// Coefficient of Range: (Max – Min) / (Max + Min).
// Examples: 

// Input: arr[] = {15, 16, 10, 9, 6, 7, 17} 
// Output: Range : 11 
// Coefficient of Range : 0.478261 
// Max = 17, Min = 6 
// Range = Max – Min = 17 – 6 = 11 
// Coefficient of Range = (Max – Min) / (Max + Min) = 11 / 23 = 0.478261
// Input: arr[] = {5, 10, 15} 
// Output: Range : 10 
// Coefficient of Range : 0.5 
 

public class Main {

    public static void main(String[] args)throws IOException{

              int arr[]={15, 16, 10, 9, 6, 7, 17};
              int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
              for(int i=0;i<arr.length;i++)
              {
                  if(arr[i]<min)
                  {
                      min=arr[i];
                  }
              }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Range: "+(max-min));
        System.out.println("Coefficient of Range is: "+((float)(max-min)/(float) (max+min)));

    }

    }

