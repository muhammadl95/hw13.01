import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String firstHomeWork;

        final int NUM = 17;

        String word = "years";

        firstHomeWork = (NUM + " " + word);

        System.out.println(firstHomeWork + " " + NUM + " " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }


        System.out.println("Введите ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет " + name);




    }
}