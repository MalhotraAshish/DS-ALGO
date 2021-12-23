package arrays;

import java.util.Arrays;

public class Squares_Of_A_Sorted_Array {
	public static void main(String[] args) {
		int arr[] = { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(sortedSquares(arr)));
	}

	// T.C. = O(nlog(n) S.C = O(1)
	/*
	 * public static int[] sortedSquares(int[] nums) { for(int i = 0; i<nums.length;
	 * i++){ nums[i] = nums[i] * nums[i]; } Arrays.sort(nums); return nums; }
	 */

	// TC = O(n) S.C = O(n)
	public static int[] sortedSquares(int[] nums) {
		int square[] = new int[nums.length];
		int start = 0;
		int end = nums.length - 1;
		int startSq = 0;
		int endSq = 0;
		int index = nums.length - 1;
		while (start < end) {
			startSq = nums[start] * nums[start];
			endSq = nums[end] * nums[end];
			if (startSq > endSq) {
				start++;
				square[index] = startSq;
			} else {
				end--;
				square[index] = endSq;
			}
			index--;
		}
		return square;
	}

}
