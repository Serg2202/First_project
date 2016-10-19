import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 17.10.2016.
 */
//6.5
public class Lesson_answers_four {
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