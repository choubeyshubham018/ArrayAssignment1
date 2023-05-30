package ArrayAssignment;

import java.util.HashSet;

/*
 * 
💡 **Q6.** Given an integer array nums, return true if any value appears at least twice 
in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true


 */
public class Ques_6 {

	public static boolean getrepeatedStatus(int[]arr) {
		HashSet<Integer> hash = new HashSet<Integer>();
		for (Integer i : arr) {
			if(hash.contains(i))
				return true;
			else {
				hash.add(i);
			}
			
		}
		
		return false;
	}
	
	public static void main(String[] args) {
        int[]arr= {1,2,3,1};
        boolean status = getrepeatedStatus(arr);
        System.out.println(status);

	}

}
