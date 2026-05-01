class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans.add(getrow(i));
        }
        return ans;
    }
    public List<Integer>getrow(int rownum){
        List<Integer>list=new ArrayList<>();
        int val=1;
        for(int i=0;i<=rownum;i++){
            list.add(val);
            val=val*(rownum-i)/(i+1);
        }
        return list;
    }
}