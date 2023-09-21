class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int w = j - i;
            int h = Math.min(height[i], height[j]);
            int area = w * h;
            max = max > area ? max : area;
            if(height[j] > height[i]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}
