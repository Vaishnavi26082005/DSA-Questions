class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int n:nums){
            if(n%3==2){
               c++;
            }
            else if(n%3==1){
                c++;
            }
        }
        return c;
    }
}