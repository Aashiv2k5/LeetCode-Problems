class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int max=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
            
           }
           else{
            map.put(arr[i],1);
           }
        }
        for(int j = arr.length-1;j>=0;j--){
            if(map.get(arr[j])==arr[j]){
                return arr[j];
            }
        }return -1;
    }
}