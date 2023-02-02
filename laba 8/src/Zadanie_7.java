import java.util.*;

public class Zadanie_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int m = in.nextInt();
        Integer[][] matrix = new Integer[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=0;
            }
        }
        int n=1;
        for (int k=0; k<m/2+1; k++) {
            for (int i=0, j=k; i<m-k*2; i++, n++) {
                matrix[i][j]=n;
            }
            n--;
            for (int i=m-2*k-1, j=k; j<m-k; i--, j++, n++) {
                matrix[i][j]=n;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(String.format("%3.0f", (double)matrix[i][j]) + " ");
            }
            System.out.println("");
        }
    }
}