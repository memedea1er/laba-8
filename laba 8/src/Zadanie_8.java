import java.util.*;

public class Zadanie_8 {
    public static void vivod (Double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(String.format("%.3f", matrix[i][j]).replace(',', '.') + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void block(Double[][] matrix, double na, double ko, int ni, int nj) {
        int n = matrix.length/2, i=0+ni, j=n-1+nj;
        double p=na, sh=(ko-na)/(n*n-1);
        for (int k=0; k<n; k++) {
            while (i<n+ni & j<n+nj) {
                matrix[i][j]=p;
                i++; j++; p+=sh;
            }
            if (i==n+ni & j==n+nj) {
                j-=2; i--;
            }
            else {
                if (i>=n+ni) {
                    i--; j-=2;
                }
                if (j>=n+nj) {
                    j--;
                }
            }
            while (i>=0+ni & j>=0+nj) {
                matrix[i][j]=p;
                i--; j--; p+=sh;
            }
            if (i==-1+ni & j==-1+nj) {
                i+=2; j++;
            }
            else {
                if (i<0+ni) {
                    i++;
                }
                if (j<0+nj) {
                    j++; i+=2;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = in.nextInt();
        Double[][] matrix = new Double[2*n][2*n];
        block(matrix, 0,(double)n/2-1, 0, 0);
        block(matrix, (double)n/2,n-1, 0, n);
        block(matrix, 0,(double)n/2-1, n, 0);
        block(matrix, (double)n/2,n-1, n, n);
        vivod(matrix);
    }
}