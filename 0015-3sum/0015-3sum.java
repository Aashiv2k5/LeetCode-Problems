class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        if(nums.length<3){
            return ans;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>0){
                break;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[right]+nums[left];
                int target = nums[i]*-1;
                if(sum==target){
                    ans.add(Arrays.asList(nums[right],nums[left],nums[i]));
                    left++;
                    right--;
                    while(right>left && nums[left] == nums[left-1]) left++;
                    while(left<right && nums[right] == nums[right+1]) right--;
                }
                else if(sum<target){
                 left++;
                }
                else{
                    right--;
                }


            }
        }return ans;
        
    }
}