package ArrayAssignment;

/*
 * 
💡 **Q3.** Given a sorted array of distinct integers and a target value, 
return the index if the target is found. If not,
 return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Example 1:**
Input: nums = [1,3,5,6], target = 5

Output: 2


 */
public class Ques_3 {
    public static int getTheTargetIndex(int[]nums,int target) {
    	int res=-1;
    	for(int i=0;i<nums.length;i++) {
    	if(nums[i]>=target) {
    		res=i;
    		break;
    	}
    	if(i==nums.length-1)
    		res=i+1;
    	}
  	return res;
    	
    }
	public static void main(String[] args) {
		int[]nums= {1,3,4,5};
		int tar=6;
		int result = getTheTargetIndex(nums, tar);
         System.out.println(result);
	}

}
