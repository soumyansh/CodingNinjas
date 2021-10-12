package rough;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray
{
	/* Java Function to print leaders in an array */
	public static void leaders(int[] input)
	{
		if(input.length==1){
            System.out.print(input[0]);
            return;
        }
		if(input.length==0){
           
            return;
        }
		List<Integer>li=new ArrayList<Integer>();
		int max_from_right = input[input.length-1];

		/* Rightmost element is always leader */
		//System.out.print(max_from_right + " ");
		li.add(max_from_right);
		for (int i = input.length-2; i >= 0; i--)
		{
			if (max_from_right < input[i])
			{		
			max_from_right = input[i];
			//System.out.print(max_from_right + " ");
			li.add(max_from_right);
			}
		}
		for (int i = li.size()-1; i>=0; i--) {
			System.out.print(li.get(i)+" ");
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args)
	{
		LeadersInArray lead = new LeadersInArray();
		int arr[] = new int[]{};
		int n = arr.length;
		leaders(arr);
	}
}
