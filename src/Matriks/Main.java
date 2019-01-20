package Matriks;

/**
 * Main
 */
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		OperasiMatriks ops = new OperasiMatriks();
		Matriks matriks = new Matriks();
		
		System.out.println("Operasi Penjumlahan Matriks\n");
    System.out.print("Masukkan ukuran matriks : ");
    int m = input.nextInt();
    
		int[][] matriksA = matriks.matriksA(m, m);
		System.out.println("--------------------");
		int[][] matriksB = matriks.matriksB(m, m);
		
		System.out.println("--------------------");
		
    int[][] hasil = ops.Penjumlahan(m, matriksA, matriksB);
    matriks.Display(hasil);
		
		System.out.println("\nOperasi Perkalian Matriks\n");

		System.out.print("Masukkan ukuran baris matriks A : ");
		int barisA = input.nextInt();
		System.out.print("Masukkan ukuran kolom matriks A : ");
		int kolomA = input.nextInt();

		System.out.println("--------------------");
		
		System.out.print("Masukkan ukuran baris matriks B : ");
		int barisB = input.nextInt();
		System.out.print("Masukkan ukuran kolom matriks B : ");
		int kolomB = input.nextInt();
		System.out.println("--------------------");

		if(kolomA != barisB){
			System.out.println("Matriks tidak bisa di kalikan");
			System.exit(0);
		}

		int[][] mA = matriks.matriksA(barisA, kolomA);
		System.out.println("--------------------");
		int[][] mB = matriks.matriksB(barisB, kolomB);

		int[][] mHasil = ops.Perkalian(barisA, kolomA, barisB, kolomB, mA, mB);
		matriks.Display(mHasil);
    
    
    input.close();
  }
}