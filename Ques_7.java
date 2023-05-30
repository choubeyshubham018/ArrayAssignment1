package ArrayAssignment;

/*
 * 
💡 **Q7.** Given an integer array nums, move all 0's to the end of it 
while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]


 */
public class Ques_7 {


	public static int[] getResult(int[]nums) {
		int i=0;
		while(i<nums.length-1) {
			if(nums[i]==0) {
				for(int j=i+1;j<nums.length;j++) {
					if(nums[j]!=0) {
						nums[i]=nums[j];
						nums[j]=0;
						break;
					}
				
				}
				
				
			}
			i++;
		}
		return nums;
	}
	public static void main(String[] args) {
	 int[]arr= {0,1,0,3,12};
	 int[] result = getResult(arr);
	 for (int i : result) {
		System.out.print(i+" ");
	}

	}

}
