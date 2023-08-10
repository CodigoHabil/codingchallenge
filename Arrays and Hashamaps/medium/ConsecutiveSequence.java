class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        int max = 1;

        for(int num : nums) {
            set.add(num);
        }

        int pivot = nums[0];
        int left = pivot - 1;
        int right = pivot + 1; 
        int count = 1;

        for(int i = 0; i < nums.length ; i++) {
            if(set.contains(left) || set.contains(right)) {
                if(set.contains(left)) {
                    count++;
                    left--;
                } 
                if(set.contains(right)) {
                    count++;
                    right++;
                }
            } else {
                count = 1;
                pivot = i + 1 < nums.length ? nums[i + 1] : 0;
                left = pivot - 1;
                right = pivot + 1; 
            }
            max = count >= max ? count : max;
        }
        return max;
    }
}
