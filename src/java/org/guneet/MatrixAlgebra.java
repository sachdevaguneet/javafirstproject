package org.guneet.Super;
/**
 * Created by gunee on 3/19/2016.
 */
public class MatrixAlgebra {

    public static int getEigenvalue(int [][] matrix){
        return matrix[0][0] * matrix [1][1] - matrix[0][1] * matrix [1][0];
    }

    public static void main(String[] args){

        int [][] matrix= new int [2][2];
        matrix [0][0]= 5;
        matrix [0][1]= 7;
        matrix[1][0]= 3;
        matrix [1][1]= 4;
        System.out.println(getEigenvalue(matrix));

        int[][] matrix33= new int[3][3];
        for (int i = 0; i<3; i++){
            for(int j=0;j<3; j++){
                matrix33[i][j] = i + j;
            }
        }

        int [][] matrix1= new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] matrix3 = new int[2][2];

        for( int i= 0; i<2;i++){
            for(int j=0; j<2; j++){
                matrix1[i][j]= matrix33[i+1][j+1];
            }
        }

        matrix2[0][0] = 1;
        matrix2[0][1] = 3;
        matrix2[1][0]= 2;
        matrix2[1][1]= 4;


        for( int i= 0; i<2;i++){
            for(int j=0; j<2; j++){
                matrix3[i][j]= matrix33[i+1][j];
            }
        }

        int e1= getEigenvalue(matrix1);
        int e2 = getEigenvalue(matrix2);
        int e3 = getEigenvalue(matrix3);

        System.out.println(matrix33[0][0] * e1 - matrix33[0][1]* e2 + matrix33[0][2] *e3);
    }
}
