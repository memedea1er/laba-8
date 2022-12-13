import java.util.*;

public class Zadanie_9 {
    public static void vivod (Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
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
    public static void odin(int n) {
        Integer[][] matrix = new Integer[n][n];
        nol(matrix);
        int p=1;
        for (int k=0; k<n/2+1; k++) {
            int i=k, j=k;
            while (i<n-k*2) {
                matrix[i][j]=p;
                i++; p++;
            }
            i--; p--;
            while (j<n-k & i>k-1) {
                matrix[i][j]=p;
                i--; j++; p++;
            }
            i++; j--; p--;
            while (j>k) {
                matrix[i][j]=p;
                j--; p++;
            }
        }
        vivod(matrix);
    }
    public static void dva(int n) {
        Integer[][] matrix = new Integer[n][n];
        nol(matrix);
        int p=1;
        for (int k=0; k<n/2+1; k++) {
            int i=k, j=k;
            while (i<n-k) {
                matrix[i][j]=p;
                i++; p++;
            }
            i--; p--;
            while (j<n-k) {
                matrix[i][j]=p;
                j++; p++;
            }
        }
        vivod(matrix);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = in.nextInt();
        odin(n); dva(n);
    }
}