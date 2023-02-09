import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Task01 {
    public static void sortArray(){
        System.out.println("Сколько значений будет в списке?");
        int n = Tools.inputInt("Ввод: ");
        System.out.println("Минимальное значение? ");
        int a = Tools.inputInt("Ввод: ");
        System.out.println("Максимальное значение: ");
        int b = Tools.inputInt("Ввод: ");
        LinkedList<Integer> arr = new LinkedList<>();
        LinkedList<Integer> arrRev = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            arr.add(ThreadLocalRandom.current().nextInt(a,b));
        }
        for (int i = arr.size() - 1; i > -1; i--) {
            arrRev.add(arr.get(i));
        }
        System.out.println("Полученный список: " + arr);
        System.out.println("Развернутый список: " +arrRev);
        Menu.taskOneMenu();
    }
}
