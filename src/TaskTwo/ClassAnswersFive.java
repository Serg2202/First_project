package TaskTwo;

import java.util.Scanner;

// Задание 5 - Ввести n чисел с консоли.
//Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
public class ClassAnswersFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести n целых чисел с консоли разной длины через пробел: ");
        String[] arrayString = in.nextLine().split(" ");

        System.out.println("Содержит одинаковое кол-во четных и нечетных чисел: ");
        for (String nums : arrayString) {
            int countCH = 0;
            int countNCH = 0;
            if (Integer.parseInt(nums) % 2 == 0 && nums.length() > 1) {// тут обработаются ттолько те кот четные,
                // и длина которых больше одного символа
                for (int i = 0; i < nums.length(); i++) {
                    if (nums.charAt(i) % 2 == 0) {
                        countCH++;
                    } else {
                        countNCH++;
                    }
                }
                if (countCH == countNCH) {
                    System.out.println(nums + " ");
                }
            }
        }
    }
}
