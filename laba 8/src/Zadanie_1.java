import java.util.*;

public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колиечство цифр в двоичной записи числа");
        int n=in.nextInt(), um=1, des=0;
        ArrayList<Integer> num = new ArrayList();
        int j=0;
        while (j<n) {
            System.out.println("Введите цифру двоичного числа (слева направо)");
            int a=in.nextInt();
            if (a>=0 & a<=1) {
                num.add(a);
                j++;
            }
        }
        Collections.reverse(num);
        for (int i = 0; i < num.size(); i++) {
            des+=num.get(i)*um;
            um*=2;
        }
        String dev="";
        while (des>0) {
            dev+=Integer.toString(des%9);
            des/=9;
        }
        dev= new StringBuilder(dev).reverse().toString();
        System.out.println(dev);
    }
}