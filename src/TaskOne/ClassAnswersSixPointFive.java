package TaskOne;

import java.util.Scanner;

/*Задание 6. Ввести с консоли n целых чисел. На консоль вывести:
6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых
цифр.
*/
public class ClassAnswersSixPointFive {
    public static void main(String[] args) {
        //region - здесь у нас блок "Получение исходных данных". Объявлен массив интов.
        Scanner in = new Scanner(System.in);
        String res = "";
        System.out.println("Введите целые 3-х значные числа: ");
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        //endregion

        //region - Здесь у нас блок бизнес-логики. здесь у нас непосредственно выполняется сценарий обработки введенных чисели их сравнение.

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
        //endregion
        System.out.println("Не содержат одинаковых цифер: " + res);
    }
}
