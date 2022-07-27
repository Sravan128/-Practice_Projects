package lesson4;

import java.util.Scanner;


public class SubSequence {

	public static int longestSubSeq(int subArr[],int n)
	{
		int arrlen[]=new int[n]; 
		
		   arrlen[0] = 1;       

		for (int i = 1; i < n; i++) {      
		  for (int j = 0; j < i; j++) {    
		       if (subArr[j] < subArr[i] && arrlen[j] > arrlen[i])
		            arrlen[i] = arrlen[j];
		       }
		            arrlen[i]++;            
		       }	
		   int lis = 0;
		   for (int i = 0; i<n; i++)      
		      lis = Math.max(lis, arrlen[i]);
		   return lis;
		}
	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int n;
		n=sin.nextInt();
		int arr[] = new int[n]; 
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sin.nextInt();
			}
		System.out.println("Length of the Longest Increasing Sub Sequence:"+longestSubSeq(arr, n));
	}
}

