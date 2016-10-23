package Task_one;

import java.util.Scanner;

/*Задание 6. Ввести с консоли n целых чисел. На консоль вывести:
6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых
цифр.
*/
public class ClassAnswersSixPointFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res = "";
        System.out.println("Введите целые 3-х значные числа: ");
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 100 && nums[i] <= 999) {
                int a;
                int b;
                int c;
                a = nums[i] / 100;
                b = (nums[i] % 100) / 10;
                c = nums[i] - (a * 100) - (b * 10);
                if (a != b && b != c && a != c) {
                    res += nums[i] + " ";
                }
            }
        }
        System.out.println("Не содержат одинаковых цифер: " + res);
    }
}
