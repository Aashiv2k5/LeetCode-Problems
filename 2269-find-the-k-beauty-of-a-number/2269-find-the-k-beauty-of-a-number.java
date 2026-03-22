class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String number = String.valueOf(num);
        int left=0;
        int right = k;
        while(right<=number.length()){
            String curr = number.substring(left,right);
            int x = Integer.valueOf(curr);
            if ( x!=0 && num % x==0){
                count++;
            }
            left++;
            right++;
        }
        return count;
        
    }
}