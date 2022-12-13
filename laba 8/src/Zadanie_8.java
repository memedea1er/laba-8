import java.util.*;

public class Zadanie_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = in.nextInt();
        Integer[][] matrix = new Integer[n][n];
        int p=1, i=0, j=n-1;
        for (int k=0; k<n; k++) {
            while (i<n & j<n) {
                matrix[i][j]=p;
                i++; j++; p++;
            }
            if (i==n & j==n) {
                j-=2; i--;
            }
            else {
                if (i>=n) {
                    i--; j-=2;
                }
                if (j>=n) {
                    j--;
                }
            }
            while (i>=0 & j>=0) {
                matrix[i][j]=p;
                i--; j--; p++;
            }
            if (i==-1 & j==-1) {
                i+=2; j++;
            }
            else {
                if (i<0) {
                    i++;
                }
                if (j<0) {
                    j++; i+=2;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}