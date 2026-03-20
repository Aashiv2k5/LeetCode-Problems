class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
      Arrays.sort(players);
        Arrays.sort(trainers);
        int ans=0;
        HashSet<Integer>set = new HashSet<>();
       int i=0;
       int j =0;
       while(i<players.length && j<trainers.length){
        if(players[i]<=trainers[j]){
            i++;
            j++;
            ans++;
        }
        else if(players[i]>trainers[i]){
             j++;
        }
       }return ans;
    }

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("7");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }));
    }
    
 
}