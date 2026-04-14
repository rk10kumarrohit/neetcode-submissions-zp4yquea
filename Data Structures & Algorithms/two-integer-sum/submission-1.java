class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> twoSum = new HashMap<Integer,Integer>();
        for(int i =0; i< nums.length; i++) {
            if(twoSum.containsKey(target - nums[i]) && twoSum.get(target - nums[i]) != i) {
                return new int[]{twoSum.get(target - nums[i]),i};
            }
            else {
                twoSum.put(nums[i], i);
            }
        }
        return new int[]{1,2};
    }
}
