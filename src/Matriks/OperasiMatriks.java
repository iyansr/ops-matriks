package Matriks;

/**
 * OperasiMatriks
 */
import java.util.Scanner;

public class OperasiMatriks {
  Scanner input = new Scanner(System.in);


    public int[][] Penjumlahan( int n, int[][]matriksA, int[][]matriksB) {
      int[][]hasil = new int [n][n];
      for(int i = 0; i < n ; i++){
        for(int j = 0; j < n ; j++){
          hasil[i][j] = matriksA[i][j] + matriksB[i][j];
        }
      }
      return hasil;
    }

    public int[][] Perkalian(int barisA,int kolomA, int barisB, int kolomB, int[][]A, int[][]B){
      int[][] C = new int[barisA][kolomB];
      //Perkalian
    for(int i = 0; i < barisA; i++){
      for(int j = 0; j < kolomB; j++){
        for(int k = 0; k < barisB; k++){
          C[i][j] += A[i][k] * B[k][j];
        }
      }
    }
    return C;
    }



}