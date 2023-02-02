import java.util.*;

public class Zadanie_9 {
    public static void vivod (Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(String.format("%3.0f", (double)matrix[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void nol(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=0;
            }
        }
    }
    public static void odin(Integer[][] matrix, int ni, int nj) {
        int n = matrix.length/2;
        int p=1;
        for (int k=0; k<n/2+1; k++) {
            int i=k+ni, j=k+nj;
            while (i<n-k*2+ni) {
                matrix[i][j]=p;
                i++; p++;
            }
            i--; p--;
            while (j<n-k+nj & i>k-1+ni) {
                matrix[i][j]=p;
                i--; j++; p++;
            }
            i++; j--; p--;
            while (j>k+nj) {
                matrix[i][j]=p;
                j--; p++;
            }
        }
    }
    public static void dva(Integer[][] matrix, int ni, int nj) {
        int n = matrix.length/2;
        int p=1;
        for (int k=0; k<n/2+1; k++) {
            int i=k+ni, j=k+nj;
            while (i<n-k+ni) {
                matrix[i][j]=p;
                i++; p++;
            }
            i--; p--;
            while (j<n-k+nj) {
                matrix[i][j]=p;
                j++; p++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = in.nextInt();
        Integer[][] matrix = new Integer[2*n][2*n];
        nol(matrix);
        odin(matrix, 0, 0);
        dva(matrix, 0, n);
        dva(matrix, n, 0);
        odin(matrix, n, n);
        vivod(matrix);
    }
}