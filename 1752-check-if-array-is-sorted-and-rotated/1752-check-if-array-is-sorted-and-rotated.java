class Solution {
    public boolean check(int[] nums) {
        int co=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                co++;
            }
        }
      if(co<=1)return true;
      return false;
    }
}