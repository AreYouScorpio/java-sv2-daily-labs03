package day04;

public class MatrixOperations {

    public boolean isUpperTriangle(int[][] matrix){

        for(int i=1; i<matrix.length;i++){
            for (int j=0; j<i; j++) {
                if (matrix[i][j] !=0) {
                    return false;
                }
            }
        }
        return true;
    }

}