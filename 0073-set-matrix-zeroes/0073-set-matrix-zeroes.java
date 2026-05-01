class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
 
            for(int j=0;j<matrix[0].length;j++){
                List<Integer>index=new ArrayList<>();
                if(matrix[i][j]==0){
                 index.add(i);
                 index.add(j);
                 list.add(index);
                }
            }
        }

        for(int i=0;i<list.size();i++){
            int row = list.get(i).get(0);
            int col = list.get(i).get(1);
            for(int r=0;r<matrix.length;r++){
                matrix[r][col]=0;
            }
            for(int c =0;c<matrix[0].length;c++){
                matrix[row][c]=0;
            }
        }
    }
}