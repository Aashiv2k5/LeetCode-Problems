class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int greed=0;
        int cookie=0;
        while(greed<g.length && cookie<s.length){
        if(g[greed]<=s[cookie]){
        ans++;
        greed++;
        cookie++;
        }
        else if(g[greed]>s[cookie]){
            cookie++;
        }
        }
        return ans;
        
    }
}