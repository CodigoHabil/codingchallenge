/*
    Merge Sorted Array

   url: https://leetcode.com/problems/merge-sorted-array/
 */

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {        
        int i = m - 1, j = n - 1, k = n + m - 1;
        while(j >=0 ){
            if(i >=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } 
            else{
                nums1[k--] = nums2[j--];
            }
        }
    }
    
    public void mergeLong(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n, j = 0, k = 0;
        int[] result = new int[length];

        for (int i = 0; i < length; i++){
            if(j < m && k < n){
                result[i] = nums1[j] <= nums2[k] ? nums1[j++] :  nums2[k++];
            } else {
                result[i] =  j < m ?  nums1[j++] :  nums2[k++];
            }
        }

        for (int i = 0; i < length; i++){
            nums1[i] = result[i];
        }
    }

}