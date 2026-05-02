class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String ans="";
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
             String x = s.substring(i,j+1);
             if(ispalindrome(x) && x.length()>max){
                ans=x;
                max=x.length();

             }
            }
        }return ans;
    }
    public boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        boolean ispal=true;
        while(i<j){
         if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
            ispal=true;
         }
         else{
            return false;
         }
        }
        return ispal;
    }
}