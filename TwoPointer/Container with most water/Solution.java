class Solution {
    public int maxArea(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int ans = 0;
        while(start < end){
            if(nums[start] < nums[end]){
                ans = Math.max(ans, (end - start) * nums[start]);
                start++;
            }
            else{
                ans = Math.max(ans, (end - start) * nums[end]);
                end--;
            }
        }
        return ans;
    }
}