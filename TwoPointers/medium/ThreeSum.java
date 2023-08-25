import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        int j = 0;
        int k = 0;
        List<Integer> triplet;
        Set<List<Integer>> control = new HashSet<>();
        for(int i = 0; i < nums.length - 2 ; i++) {
            j = i + 1;
            k = nums.length - 1;
            while(j < k) {
                if(nums[i] + nums[j] +  nums[k] == 0) {
                    triplet = new LinkedList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    control.add(triplet);
                    k--;
                    j++;
                } else if(nums[i] + nums[j] +  nums[k] > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        result.addAll(control);
        return result;
    }
}
