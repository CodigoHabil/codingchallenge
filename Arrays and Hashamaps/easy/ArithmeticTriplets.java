class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length - 2; i++) {
            if(set.contains(nums[i] + diff)) {
                if(set.contains(diff + nums[i] + diff)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
