package Sorting;

// Java program to find number of 
// rotations in a sorted and rotated
// array.
import java.util.*;
import java.lang.*;
import java.io.*;

public class ArrayRotation3
{
	public static int arrayRotateCheck(int arr[])
	{
		// We basically find index of minimum
		// element
		int min = arr[0], min_index = -1;
		for (int i = 0; i < arr.length; i++)
		{
			if (min > arr[i])
			{
				min = arr[i];
				min_index = i;
			}
		} 
		return min_index;
	}

}
// This code is contributed by Chhavi
