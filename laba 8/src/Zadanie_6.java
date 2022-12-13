import java.util.*;

public class Zadanie_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int m = in.nextInt();
        Integer[][] matrix = new Integer[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Введите элемент матрицы " + (i + 1) + " " + (j + 1));
                int a = in.nextInt();
                matrix[i][j] = a;
            }
        }
        System.out.println("исходная матрица");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        int[][] matrix2 = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = matrix[j][m-i-1];
            }
        }
        System.out.println("перевернутая матрица");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}