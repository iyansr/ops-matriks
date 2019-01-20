package Matriks;

/**
 * OperasiMatriks
 */
import java.util.Scanner;

public class Matriks {
  Scanner input = new Scanner(System.in);


  //Input nilai Matriks A
  public int[][] matriksA(int baris, int kolom){
    int[][] A = new int[baris][kolom];
		for(int i = 0; i < baris ; i++){
			for(int j = 0; j < kolom ; j++){
				System.out.print("Masukan nilai matriks A ["+ i +"]["+ j +"] : ");
				A[i][j] = input.nextInt();
			}
		}
    return A;
  }

  //Input nilai Matriks A
  public int[][] matriksB(int baris, int kolom){
    int[][] B = new int[baris][kolom];
		for(int i = 0; i < baris ; i++){
			for(int j = 0; j < kolom ; j++){
				System.out.print("Masukan nilai matriks B ["+ i +"]["+ j +"] : ");
				B[i][j] = input.nextInt();
			}
		}
    return B;
  }

      
  //Display hasil operasi matriks
  public void Display(int[][] hasil){
    System.out.println("Hasil Matriks : ");
      for(int[] baris : hasil) {
        for(int kolom : baris){
          System.out.print(kolom + "\t");
        }
        System.out.println();
      }
  }

}