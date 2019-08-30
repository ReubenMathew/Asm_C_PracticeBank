import javafx.util.Pair;
class NumArray {
    private int[] sum;
    public NumArray(int[] nums) {
        sum = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++){
            sum[i+1] = sum[i] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return sum[j+1]-sum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

/*
Caching method using Hashmap
 private Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();
 public NumArray(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = i; j < nums.length; j++){
                sum += nums[j];
                Pair p = new Pair(i,j); 
                map.put(p,sum);
            }
        }
    }
    
    public int sumRange(int i, int j) {
        Pair p1 = new Pair(i,j);
        return map.get(p1);
    }
*/
