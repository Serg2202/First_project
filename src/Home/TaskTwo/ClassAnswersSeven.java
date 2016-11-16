package Home.TaskTwo;

import java.util.Scanner;

// Задание 7 - Ввести n чисел с консоли.
// Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
public class ClassAnswersSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n целых чисел с консоли через пробел: ");
        String[] arrayString = in.nextLine().split(" ");

        for (String nums : arrayString) {
            boolean unique = true;
            if (nums.length() == 1) continue;// если найдет одно число то пропускает его и переходит к след
            for (int j = 0; j < nums.length(); j++) {
                for (int d = 0; d < nums.length(); d++) {
                    if (nums.charAt(j) == nums.charAt(d) && j != d) {
                        unique = false;
                        break;
                    }
                }
            }
            if (unique){
                System.out.println("Число состощее из разных цифр: " + nums);
                break;
            }
        }
    }
}