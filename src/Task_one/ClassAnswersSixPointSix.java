package Task_one;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by USER on 19.10.2016.
 */
public class ClassAnswersSixPointSix {

//выводит "счастливые" числа как билет в трамвае:) - когда сумма первой половины чисел = сумме второй половине
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        if ((a + b) == (c + d)) {
                            System.out.printf("%d%d%d%d%n", a, b, c, d);
                        }
                    }
                }
            }
        }
    }
}



