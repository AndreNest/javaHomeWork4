import java.util.LinkedList;

public class Menu {

    public static LinkedList<Integer> arr = new LinkedList<>();
    public static void headMenu(){
        System.out.println("Введите \"1\" для задания №1\nВведите \"2\" для задания №2\nВведите \"3\" для закрытия программы\n");
        int num = Tools.inputInt("Ввод: ");
        switch (num){
            case 1 :
                taskOneMenu();
            case 2:
                taskTwoMenu();
            case 3:
                break;
            default:
                headMenu();

        }

    }
    public static void taskOneMenu(){
        System.out.println("Введите \"1\" для создания и разворота списка!\nВведите \"2\" для выхода в главное меню\n");
        int num = Tools.inputInt("Ввод: ");
        switch (num){
            case 1 :
                Task01.sortArray();
            case 2 :
                headMenu();
            default:
                taskOneMenu();
        }

    }
    public static void taskTwoMenu(){
        Task02.liArr();
    }
}
