class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] mask = new int[matrix.length][matrix[0].length];

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                mask[i][j]=1;
            }
        }

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]==0) solution(mask,matrix,i,j);
            }
        }

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(mask[i][j]==-1) matrix[i][j] = 0;
            }
        }     
    }

    void solution(int[][] mask ,int[][] matrix, int i, int j){
        
        for(int I=0 ; I < matrix.length ; I++){
            mask[I][j] = -1;
        }

        for(int J=0 ; J < matrix[i].length ; J++){
            mask[i][J] = -1;
        }
    }
}