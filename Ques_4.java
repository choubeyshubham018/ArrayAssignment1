package ArrayAssignment;

/*
 * <aside>
💡 **Q4.** You are given a large integer represented as an integer array digits,
 where each digits[i] is the ith digit of the integer.
 The digits are ordered from most significant to least significant in left-to-right order. 
 The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

</aside>
 */
public class Ques_4 {
	
	public static int[] incrementInteger(int[]nums) {
		if(nums.length==0) return nums;
		int i = nums.length-1;
		while(i>=0) {
		if(nums[i]<9) {
			nums[i]++;
			break;
		}
		else{
			nums[i--]=0;
		}
			
		}
		if(i==-1) {
			int[] res=new int[nums.length+1];
			res[0]=1;

			return res;
		}
		
		return nums;
	}

	public static void main(String[] args) {
		int[]nums= {};
		int[] res = incrementInteger(nums);
		for (int i : res) {
			System.out.print(i+",");
		}

	}

}
