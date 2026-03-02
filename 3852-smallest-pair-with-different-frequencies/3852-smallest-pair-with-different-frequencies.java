class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
       
        int[]  ans =new int[2];
        ans[0]=-1;
        ans[1]=-1;       
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(!map.get(list.get(i)).equals(map.get(list.get(j)))){
                    ans[0]=Math.min(list.get(i),list.get(j));
                    ans[1]=Math.max(list.get(j),list.get(i));
                    return ans;
                }
            }

        }
        return ans;
        
    }
}