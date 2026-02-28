class Solution {
    public String removeDuplicates(String x) {
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<x.length();i++){
            if(stack.empty()){
                stack.push(x.charAt(i));
            }
            else if(stack.peek()!= x.charAt(i)){
                stack.push(x.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        String ans="";
        while (!stack.empty()){
            ans+=stack.pop();
        }
        StringBuilder s =new StringBuilder(ans);
        return s.reverse().toString();
    }
}