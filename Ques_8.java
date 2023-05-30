package ArrayAssignment;

import java.util.HashSet;

/*
💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return 
them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]
 */
public class Ques_8 {

	public static int[] getResult(int[]nums) {
		int[]res= {-1,-1};
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(hashSet.contains(nums[i])) {
				res[0]=nums[i];

			}
			else {
				hashSet.add(nums[i]);
			}
		}
		for(int i=1;i<=nums.length;i++) {
			if(!hashSet.contains(i)) {
				res[1]=i;
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[]num= {1,4,3,8,9,5,6,7,2};
		int[] result = getResult(num);
		System.out.println(result[0]+" , "+result[1]);
	}

}
