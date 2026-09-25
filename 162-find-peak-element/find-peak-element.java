class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int peak = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>peak){
                peak = nums[i];
                idx = i;
            }
        }
        return idx;
    }
}