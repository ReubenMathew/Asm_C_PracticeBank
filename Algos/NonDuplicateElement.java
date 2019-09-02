class Solution {
	    private Map<Integer, Integer> db  = new HashMap<Integer, Integer>();
	        public int singleNumber(int[] nums) {
			        int counter = 0;
				        for(int i = 0; i < nums.length; i++){
						            if(!db.containsKey(nums[i])){
								                    counter += nums[i];
										                    db.put(nums[i],0);
												                }else if(db.containsKey(nums[i])){
															                counter -= nums[i];
																	                db.remove(nums[i]);
																			            }
							            }
					        return counter;
						    }
}

// From https://leetcode.com/problems/single-number/
// // O(n) time complexity
// // this is the only way I could avoid quadratic time complexity
// // original approach would be a frequency checker using two for loops
