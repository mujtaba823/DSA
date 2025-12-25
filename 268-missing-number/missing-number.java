class Solution {
    public int missingNumber(int[] nums) {
       int  n = nums.length;
        int x = 0;
        int sum = n*(n+1)/2;
        for(int i = 0 ;i<n;i++){
            x += nums[i]; 

        }
        return sum - x;
    }
}