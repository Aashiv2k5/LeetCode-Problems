class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int currans=0;
        for(int i=0;i<nums.length;i++){
            currans+=nums[i];
            ans=Math.max(currans,ans);
            if(currans<0){
                currans=0;
            }
            

        }
        return ans;
    }
}