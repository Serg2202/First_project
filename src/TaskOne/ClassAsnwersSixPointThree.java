package TaskOne;

import java.util.Scanner;

//Задание 6.3 - Числа, которые делятся на 3 или на 9.

public class ClassAsnwersSixPointThree {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        String s;
        s=in.nextLine();
        for ( int i=0;i<s.length();i++){
            Integer current = new Integer(s.charAt(i));
            if (current%3==0){
                System.out.println("Число делится на 3: " + s.charAt(i));
            }
            if (current%9==0){
                System.out.println("Число делится на 9: " + s.charAt(i));
            }
        }
    }
}
