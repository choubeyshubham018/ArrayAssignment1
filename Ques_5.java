package ArrayAssignment;

/*
 * 
💡 **Q5.** You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.


 */
public class Ques_5 {
	
	   public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	        
           int p=m-1;
           int q=n-1;
          for(int i=n+m-1;i>=0;i--){
            
      if(q<0 || p>=0 && nums1[p]>nums2[q]){
                  nums1[i]=nums1[p];
                 if(i>p)
                  nums1[p]=0;
                  p--;
              }
              else {
                  nums1[i]=nums2[q--];
              }

          }
          return nums1;

       }

	public static void main(String[] args) {
		int[]nums1= {1,2,3,0,0,0};
		int[]nums2= {2,5,6};
	   int[] merge = merge(nums1, 3, nums2, nums2.length);
	   for (int i : merge) {
		System.out.print(i+",");
	}
		

	}

}
