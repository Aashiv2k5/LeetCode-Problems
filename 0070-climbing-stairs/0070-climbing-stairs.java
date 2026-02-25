class Solution {
    public int climbStairs(int n) {
        Map<Integer,Integer> map =new HashMap<>();
        return climb(n,map);
        
    }
    public int climb(int n,Map<Integer,Integer> map){
        if(n==0 || n==1){
            return 1;
        }
        if(!map.containsKey(n)){
            map.put(n,climb(n-1,map)+ climb(n-2,map));
        }
        
        return map.get(n);
    }
}