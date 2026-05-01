class Solution {
    public void sortColors(int[] nums) {

        int[] arr =new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[0]++;
            }
            else if(nums[i]==1){
                arr[1]++;
            }
            else{
                arr[2]++;
            }
        }
        int index=0;
        for(int i=0;i<arr.length;i++){
            int color=arr[i];
            if(i==0){
                for(int j=0;j<color;j++){
                    nums[index++]=0;
                }
            }
            else if(i==1){
                for(int j=0;j<color;j++){
                    nums[index++]=1;
                }
            }

            else {
                for(int j=0;j<color;j++){
                    nums[index++]=2;
                }
            }
        }
        
    }
}