import java.util.*;

public class Zadaine_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N");
        int n = in.nextInt();
        System.out.println("Введите A");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        ArrayList<Integer> det = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите размер детали");
            int raz=in.nextInt();
            det.add(raz);
        }
        int br=0;
        for (int i = 0; i < det.size(); i++) {
            if (!(det.get(i)<a+b) | !(det.get(i)>a-b)) {
                br++;
            }
        }
        if (br==0) {
            System.out.println("Бракованных деталей нет");
        } else {
            System.out.println("Бракованных деталей " + br);
        }
    }
}
