package Package_one;

import java.util.ArrayList;
import java.util.HashSet;

public class HappyNumbers {
    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int digit, len;
        String s;

        while (n !=1  && !hs.contains(n)) {
            hs.add(n);
            s = n + "";
            len = s.length();
            n = 0;
            for (int i = 0; i < len; i++) {
                digit = s.charAt(i) - 48;
                n += digit * digit;
            }
        }

        return (n==1);
    }

    public static class ClassAnswersSixPointSeven {
        public static boolean isHappy(int x) {
            ArrayList<Integer> history = new ArrayList<Integer>();
            while (x != 1) {
                history.add(x);
                int sum = 0;
                while (x != 0) {
                    sum += Math.pow(x % 10, 2);
                    x /= 10;
                }
                x = sum;
                if (history.contains(x)) {
                    return false;
                }
            }
            return true;
        }

        public static void printHappyNumbers(int start) {
            int found = 0;
            while (found < 8) {
                if (isHappy(start)) {
                    System.out.println(start);
                }
                start++;
            }
        }

        public static void main(String[] args) {
            printHappyNumbers(100);
        }

    }
}