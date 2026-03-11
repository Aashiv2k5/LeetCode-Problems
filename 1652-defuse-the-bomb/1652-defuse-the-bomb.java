class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        if(k==0){
            return arr;
        }
        int start,end,sum=0;
        if(k>0){
            start=1;
            end=k;
        }
        else{
            start=n+k;
            end=n-1;
        }
        for(int i =start;i<=end;i++){
            sum+=code[i%n];
        }
        for(int i=0;i<n;i++){
            arr[i]=sum;
            sum-=code[start%n];
            start++;
            end++;
            sum+=code[end%n];
        }
        return arr;
    }
}