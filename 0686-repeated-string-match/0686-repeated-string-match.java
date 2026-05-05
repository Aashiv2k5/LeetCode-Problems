class Solution {
    public int repeatedStringMatch(String a, String b) {
        String repeata = a;
        int count=1;
        if(repeata.contains(b)){
            return count;
        }
        while(repeata.length()<b.length()){
            repeata+=a;
            count++;
            if(repeata.contains(b)){
                return count;
            }
        }
        repeata+=a;
        count++;
        if(repeata.contains(b)){
            return count;
        }
        return -1;

        
    }
}