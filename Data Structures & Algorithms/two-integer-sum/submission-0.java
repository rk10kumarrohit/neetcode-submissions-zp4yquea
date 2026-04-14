class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> twoSum = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i =0; i< nums.length; i++) {
            if(twoSum.containsKey(target - nums[i]) && twoSum.get(target - nums[i]) != i) {
                result[0] = twoSum.get(target - nums[i]);
                result[1] = i;
                break;
            }
            else {
                twoSum.put(nums[i], i);
            }
        }
        return result;
    }
}
