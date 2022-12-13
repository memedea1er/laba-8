import java.util.*;

public class Zadanie_2 {
    public static String prov(ArrayList<Integer> p) {
        boolean pol=false, otr=false;
        for (int i = 0; i < p.size()-2; i++) {
            if (p.get(i)+p.get(i+1)!=p.get(i+2)) {
                return "не соответствует";
            }
            else if (p.get(i)<1 | p.get(i+1)<1) {
                otr=true;
            }
            else if (p.get(i)>=1 & p.get(i+1)>=1) {
                pol=true;
            }
        }
        if (pol & otr) {
            return "смешанная";
        }
        else if (pol & !otr) {
            return "положительная";
        }
        else if (!pol & otr) {
            return "отрицательная";
        }
        return "привет";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N");
        int n = in.nextInt();
        ArrayList<Integer> p1 = new ArrayList();
        ArrayList<Integer> p2 = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент последовательности 1");
            int a=in.nextInt();
            p1.add(a);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент последовательности 2");
            int a=in.nextInt();
            p2.add(a);
        }
        System.out.println("Последовательность 1 " + prov(p1));
        System.out.println("Последовательность 2 " + prov(p2));
    }
}
