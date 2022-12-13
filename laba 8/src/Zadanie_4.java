import java.util.*;

public class Zadanie_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = in.nextInt();
        ArrayList<Integer> sor = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент для сортировки");
            int a = in.nextInt();
            sor.add(a);
        }
        boolean sorted = false;
        while (sorted == false) {
            sorted=true;
            for (int i = 0; i < sor.size()-1; i++) {
                if (sor.get(i)>sor.get(i+1)) {
                    Collections.swap(sor,i,i+1);
                    sorted=false;
                }
            }
        }
        for (int i = 0; i < sor.size(); i++) {
            System.out.printf(sor.get(i)+" ");
        }
    }
}
