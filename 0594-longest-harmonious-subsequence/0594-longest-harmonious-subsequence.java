class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
         int left = 0;
         int right = 0;
         int ans=0;
         while(right<nums.length){
           int min=nums[left];
            int max=nums[right];
            if(max-min==1){
                ans=Math.max(ans,Math.abs(left-right)+1);
                right++;
            }
            else if(max-min>1){
               left++;
            }
            else if(max-min<1){
                right++;
            }
         }
         return ans;
      

    }
}