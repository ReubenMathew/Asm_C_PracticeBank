import java.util.*;
class Solution {
	    public int maxSubArray(int[] nums) {
		            int max = Integer.MIN_VALUE;
			            int curr = 0;
				            for (int i = 0; i < nums.length; i++){
						                curr += nums[i];
								            if(curr > max){
										                    max = curr;
												                }
									                if (curr < 0){
												                curr = 0;
														            }
											        }
					            return max;
						        }
}
    // List all possible combos of subarrays and find maximum sum     
//     // private ArrayList<Integer> sums = new ArrayList<Integer>();
//         // public int maxSubArray(int[] nums) {
//             //     for(int i = 0; i < nums.length; i++){
//                 //         int sum = 0;
//                     //         for(int j = i; j < nums.length; j++){
//                         //             sum += nums[j];
//                             //             sums.add(sum);
//                                 //         }
//                                     //     } 
//                                         //     return Collections.max(sums);
