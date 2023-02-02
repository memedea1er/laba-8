import java.util.*;
import static java.lang.Math.*;
public class Zadanie_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        int n = in.nextInt();
        Double[][] matrix = new Double[n][2];
        for (int i=0; i<n; i++) {
            System.out.println("Введите координаты х точки " + (i+1));
            double x = in.nextDouble();
            matrix[i][0]=x;
            System.out.println("Введите координаты y точки " + (i+1));
            double y = in.nextDouble();
            matrix[i][1]=y;
        }
        for (int i=0; i<n; i++) {
            double x=matrix[i][0];
            double y=matrix[i][1];
            if ((x >= -1 & y >= 2.5 * x + 3.5 & y <= -1.5 * x + 3.5) | (x <= 0 & y <= 2.5 * x + 3.5 & y >= -2 * x - 1) | (x >= 0 & y <= -1.5 * x + 3.5 & y >= 3 * x - 1)
                    | (y >= -1 & y <= x - 3 & y <= -1f / 3 * x + 1) | (y <= 0 & y >= x - 7 & y >= -1f / 3 * x + 1) | (y >= 0 & y >= -x + 3 & y <= -0.2 * x + 1.4)
                    | (pow((x + 1), 2) + pow((y - 3), 2) <= 4 & x <= -1) | (pow((x - 4), 2) + pow((y + 1), 2) <= 4 & y <= -1)) {
                System.out.println("Точка (" + x + ";" + y + ") попала в область");
            } else {
                System.out.println("Точка (" + x + ";" + y + ") не попала в область");
            }
        }
    }
}