class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int n = nums.length;
        int one = 0 ;
        int two = 0;
        for (int ele : nums){
            if (ele == 0  ){
                zero++;
            }
            else if (ele == 1){
                one++;

            }
            else two++;
        }   
            int range = 0;
        for (int j = 0 ; j<zero ;j++){
            nums[range++] = 0;
             
        }
        for (int j = 0 ; j< one  ;j++){
            nums[range++] = 1;

        }
        for (int j = range ; j<nums.length;j++){
            nums[range++] = 2 ; 

        }
    }
}