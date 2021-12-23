package arrays;

public class Find_Numbers_With_Even_Number_Of_Digits {

	public static void main(String[] args) {
		int arr[] = {12,345,2,6,7896};
		System.out.println(findNumbers(arr));
	}
	
	public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            String num = Integer.toString(nums[i]);
            if(num.length()%2 == 0){
                count++;
            }
        }
        return count;
    }

}
