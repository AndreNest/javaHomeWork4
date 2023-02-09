import java.util.LinkedList;
import java.util.Scanner;

public class Tools {
    public static int inputInt(String text) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print(text);
            return sc.nextInt();
        } catch (Exception exception) {
            System.err.println("ОШИБКА! Вы ввели не число!");
        }
        return inputInt("Введите число: ");
    }

    public static LinkedList enqueue(LinkedList arr, int m) {
        arr.add(m);
        Menu.taskTwoMenu();
        return arr;
    }
    public static int dequeue(LinkedList arr){
        int num = (int) arr.pop();
        return num;
    }

    public static int first(LinkedList arr){
        int num = (int) arr.get(0);
        return num;
    }
}
