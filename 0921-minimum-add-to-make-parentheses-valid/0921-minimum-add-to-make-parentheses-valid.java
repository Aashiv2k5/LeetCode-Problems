class Solution {
    public int minAddToMakeValid(String s) {
        int opencount=0;
        int closecount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')' && opencount>0){
                opencount--;
            }
            else if(s.charAt(i) == '(' )
            {
                 opencount++;
            }
            else {
                closecount++;
            }
        }
        return closecount+opencount;
        
    }
}