class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = 0;
        int max = 0 ;
        
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1 ) {
                n++;
               
               if (n >max){
                max = n ; 
            }
            }
             if (nums[i]==0 ){
                n = 0 ;
            }
            
        }
        return max;
    }
}