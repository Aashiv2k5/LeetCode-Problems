class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes , (a,b) -> b[1]-a[1]);
        int ans=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize<=0){
                break;
               }
               ans+=Math.min(truckSize,boxTypes[i][0])*boxTypes[i][1];
               truckSize-=boxTypes[i][0];
               
        }
        return ans;
    }
}