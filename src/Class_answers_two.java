/**
 * Created by USER on 16.10.2016.
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SyncFailedException;

//задание №5

public class Class_answers_two {
    public static void main(String[] args) {
/*
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a=in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        int sum= a+b;
        System.out.println("Результат будет = " + sum);

        System.out.println("Введите первое число: ");
        int d=in.nextInt();
        System.out.println("Введите второе число: ");
        int e = in.nextInt();
        int sum1= d*e;
        System.out.println("Результат будет = " + sum1);
*/
//задание №6.1


        Scanner in = new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        String s;
        s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            Integer current = new Integer(s.charAt(i));
            if (current % 2 == 0) {
                System.out.println("Четное число: " + s.charAt(i));
            }
            else {
                System.out.println("Нечетное число: " + s.charAt(i));
            }

            //6.3 проверка деления на 3 и на 9
            if (current%3==0){
                System.out.println("Число делится на 3: " + s.charAt(i));
            }
            if (current%9==0){
                System.out.println("Число делится на 9: " + s.charAt(i));
            }

            //6.4 проверка деления на 5 и на 7
            if (current%5==0){
                System.out.println("Число делится на 5: " + s.charAt(i));
            }
            if (current%7==0){
                System.out.println("Число делится на 7: " + s.charAt(i));
            }




        }



    }


}

