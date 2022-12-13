import java.util.*;

public class Zadanie_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int m = in.nextInt();
        Integer [][] matrix = new Integer[m][m];
        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                System.out.println("Введите элемент матрицы "+(i+1)+" "+(j+1));
                int a = in.nextInt();
                matrix[i][j]=a;
            }
        }
        System.out.println("введенная матрица");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        for (int b=-m+1; b<m; b++) {
            int dia=0;
            for (int i=0; i<m; i++) {
                for (int j=0; j<m; j++) {
                    if (i+j == m-1+b) {
                        dia+=matrix[i][j];
                    }
                }
            }
            System.out.println("Сумма элементов диагонали: "+dia);
        }
    }
}