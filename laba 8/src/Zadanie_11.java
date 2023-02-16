import java.util.*;
import static java.lang.Math.*;
public class Zadanie_11 {
    public static void vivod (Double[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(String.format("%3.2f", ma[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void zap (Double[][] tr) {
        Scanner in = new Scanner(System.in);
        int n = tr.length;
        for (int i=0; i<n; i++) {
            System.out.println("Введите координаты x вершины " + (i%3+1) + " треугольника " + (i/3+1));
            double a = in.nextDouble();
            tr[i][0]=a;
            System.out.println("Введите координаты y вершины " + (i%3+1) + " треугольника " + (i/3+1));
            double b = in.nextDouble();
            tr[i][1]=b;
        }
    }
    public static void prov (Double[][] tr) {
        int n = tr.length / 3;
        Double[][] trpr = new Double[n][3];
        Double[] trdl = new Double[3];
        for (int i = 0; i < n; i++) {
            if(abs((tr[i*3+1][0]-tr[i*3][0])*(tr[i*3+2][1]-tr[i*3][1])-(tr[i*3+2][0]-tr[i*3][0])*(tr[i*3+1][1]-tr[i*3][1]))>0) {
                trpr[i][0]=(double)1;
                trdl[0]=pow(pow(tr[i*3+1][0]-tr[i*3][0],2)+pow(tr[i*3+1][1]-tr[i*3][1],2),0.5);
                trdl[1]=pow(pow(tr[i*3+2][0]-tr[i*3][0],2)+pow(tr[i*3+2][1]-tr[i*3][1],2),0.5);
                trdl[2]=pow(pow(tr[i*3+1][0]-tr[i*3+2][0],2)+pow(tr[i*3+1][1]-tr[i*3+2][1],2),0.5);
                Arrays.sort(trdl);
                if (trdl[0]-trdl[1]==0 & trdl[0]-trdl[2]==0 & trdl[2]-trdl[1]==0) {
                    trpr[i][1]=(double)1;
                }
                else if (abs(pow(trdl[0],2)+pow(trdl[1],2)-pow(trdl[2],2))<pow(1,-5)) {
                    trpr[i][1]=(double)2;
                }
                else if (trdl[0]-trdl[1]==0 | trdl[1]-trdl[2]==0) {
                    trpr[i][1]=(double)3;
                }
                else {
                    trpr[i][1]=(double)4;
                }
            }
            else {
                trpr[i][0]=(double)0;
                trpr[i][1]=(double)0;
            }
            trpr[i][2]=abs((tr[i*3][0]-tr[i*3+2][0])*(tr[i*3+1][1]-tr[i*3+2][1])-(tr[i*3+1][0]-tr[i*3+2][0])*(tr[i*3][1]-tr[i*3+2][1]))/2;
        }
        vivod(trpr);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N");
        int n = in.nextInt();
        Double[][] tr = new Double[3*n][2];
        zap(tr);
        prov(tr);
    }
}