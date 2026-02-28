class RecentCounter {
    int[] arr;
    int count;
    int ptr;
    public RecentCounter() {
        arr=new int[10000];
        count=0;
        ptr=-1;
    }
    
    public int ping(int t) {
        arr[++ptr]=t;
        for(int i=0;i<=ptr;i++){
            if( t-3000 <= arr[i] && arr[i] <= t ){
                count++;
            }
        }
        int x=count;
        count=0;
        return x;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */