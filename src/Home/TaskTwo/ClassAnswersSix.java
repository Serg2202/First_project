package Home.TaskTwo;

//Задание 6 - Ввести n чисел с консоли.
// Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

import java.util.Scanner;

public class ClassAnswersSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести n целых чисел с консоли разной длины через пробел: ");
        String[] arrayString = in.nextLine().split(" ");

        for (String nums : arrayString) {// первый цикл for-each
            boolean FirstFound = false;
            for (int i = 0; i < nums.length()-1; i++) {// берем одно число и передираем в нем все элементы и если все совпало то присваеиваем ему
                if (nums.charAt(i) + 1 == nums.charAt(i + 1)) {
                    FirstFound = true;
                } else break;
            }
            if (FirstFound) {
                System.out.println("Число, цифры в котором идут в строгом порядке возрастания: " + nums);
                break;
            }
        }
    }
}

