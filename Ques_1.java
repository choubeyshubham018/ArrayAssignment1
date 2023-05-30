package ArrayAssignment;

import java.util.Arrays;
import java.util.HashMap;

//💡 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//**Example:**
//Input: nums = [2,7,11,15], target = 9
//Output0 [0,1]
//
//**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][
//


public class Ques_1 {

	//Brute ForceApproach
	public static int[] getIndices(int[]arr ,int target) {
		int[]res=new int[2];
		for(int i=0;i<arr.length-2;i++) {
	     int sec=target-arr[i];
		for(int j=i+1;j<arr.length-1;j++) {
			if(arr[j]==sec) {
				res[0]=i;
				res[1]=j;
				return res;
			}
		}
		
		}
		return res;
	}
	
	
	//BetterApproach
	public static void getResult(int[]arr,int target) {
		HashMap<Integer, Integer> hash=new HashMap<>();
		for(int i=0;i<arr.length-1;i++) {
			int key=target-arr[i];
			if(hash.containsKey(key)) {
				System.out.println(hash.get(key) +","+ i);
				break;
			}
			else {
				hash.put(arr[i], i);
			}
		}
	}
	public static void main(String[] args) {
	int arr[]= {-4,-3,2,5,9,4,1,7};
	int target=5;
	int[] res = getIndices(arr, target);
	for(int i=0;i<res.length;i++) {
		System.out.println(res[i]);
	}
	getResult(arr, target);
	}

}
