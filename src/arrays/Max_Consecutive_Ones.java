package arrays;

public class Max_Consecutive_Ones {
	public static void main(String args[]) {
		int arr[] = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int globalMax = 0;
        int localMax = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                localMax++;
            }
            if(nums[i] == 0){
                if(localMax > globalMax){
                    globalMax = localMax;
                }
                localMax = 0;
            }
        }
        if(localMax > globalMax){
            globalMax = localMax;
        }
        return globalMax;
    }
}
