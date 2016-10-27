package TaskOne;

import java.util.Scanner;

//6.Ввести с консоли n целых чисел. На консоль вывести: 6.4. Числа, которые делятся на 5 и на 7.
public class ClassAnswersSixPointFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        String s;
        s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            Integer current = new Integer(s.charAt(i));


            if (current % 5 == 0) {
                System.out.println("Число делится на 5: " + s.charAt(i));
            }


            if (current % 7 == 0) {
                System.out.println("Число делится на 7: " + s.charAt(i));
            }

        }
    }
}


