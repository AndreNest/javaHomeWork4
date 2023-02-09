import java.util.LinkedList;

public class Task02 {
    public static LinkedList<Integer> arr = new LinkedList<>();
    public static void liArr(){
        System.out.println("Список в данный момент: " + arr);
        System.out.println("Введите \"1\" добавить значение в конец списка\nВведите \"2\" Показать и удалить первое значение\nВведите \"3\" Показать первое значение\nВведите \"4\" Главное меню\n");
        int n = Tools.inputInt("Ввод: ");
        switch (n) {
            case 1 :
                arr = Tools.enqueue(arr, Tools.inputInt("Введите значение: "));
                Menu.taskTwoMenu();
            case 2 :
                System.out.println("Число: " +Tools.dequeue(arr));
                Menu.taskTwoMenu();
            case 3 :
                System.out.println("Число: " + Tools.first(arr));
                Menu.taskTwoMenu();
            case 4 :
                Menu.headMenu();
        }
    }
}
