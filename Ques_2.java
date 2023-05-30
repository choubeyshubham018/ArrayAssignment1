package ArrayAssignment;

/*
💡 **Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
- Return k.

**Example :**
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_*,_*]

**Explanation:** Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores)[

 */
public class Ques_2 {

	public static int[] getResult(int[]nums,int val) {
		if(nums.length==0) return nums;
		int i=0;
		int j=nums.length-1;
		while(i<j) {
			if(nums[i]==val) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j--]=temp;
				
			}
			else {
				i++;
			}
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
          int[]nums= {1,4,2,2,3,2,6};
          int val=2;
          int[] result = getResult(nums, val);
          int k=0;
          for(int x:result) {
        	  System.out.print(x+",");
        	  if(x!=val) k++;
          }
          System.out.println();
          System.out.println("Number of elements which is not eqaul to val is :: "+k);

	}

}
