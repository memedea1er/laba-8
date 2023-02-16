import java.util.*;
public class Zadanie_12 {

    public static void vivod (Double[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
                System.out.print(String.format("%3.2f", ma[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void zap (Double[][] ma) {
        Scanner in = new Scanner(System.in);
        int r = ma.length;
        for (int i=0; i<r; i++) {
            for (int j=0; j<r; j++) {
                System.out.println("Введите элемент матрицы "+(i+1)+" "+(j+1));
                double a = in.nextDouble();
                ma[i][j]=a;
            }
        }
        System.out.println("Вы ввели матрицу");
        vivod(ma);
    }
    public static void nol(Double[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
                ma[i][j]=(double)0;
            }
        }
    }
    public static void prov (Double[][] mog, Double[][] mob) {
        int r = mog.length;
        boolean pr = true;
        Double[][] mrs = new Double[r][r];
        nol(mrs);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < r; k++) {
                    mrs[i][j]+=mog[i][k]*mob[k][j];
                }
                if (i==j) {
                    if (mrs[i][j]!=1) {
                        pr=false;
                    }
                }
                else {
                    if (mrs[i][j]!=0) {
                        pr=false;
                    }
                }
            }
        }
        if (pr==true) {
            System.out.println("Матрица B является обратной матрицей к А");
        }
        else {
            System.out.println("Матрица B не является обратной матрицей к А");
        }
        System.out.println("A*B=");
        vivod(mrs);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы A и B");
        int r = in.nextInt();
        Double[][] mog = new Double[r][r];
        Double[][] mob = new Double[r][r];
        zap(mog);
        zap(mob);
        prov(mog,mob);
    }
}