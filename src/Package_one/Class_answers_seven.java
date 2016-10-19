package Package_one;


import java.util.Arrays;

import static Package_one.ArrayInverter.invert;

/**
 * Created by USER on 19.10.2016.
 */

//урок 4 от Ярослава
public class Class_answers_seven {
    public static void main(String[] args) {
  /*
    String strInt = "123"; String strDouble="123.456";
        int x; double y;
        x=Integer.parseInt(strInt);
        y=Double.parseDouble(strDouble);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        strInt=String.valueOf(x + 1);
        strDouble=String.valueOf(y + 1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDouble=" + strDouble);
        String str;
        str="num=" + 345;
        System.out.println(str);

*/
  /*
  //разный вывод разных типов данных
        System.out.println(Integer.toString(262));
        System.out.println(Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));
*/
  /*
        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(b));
*/
        //обращаемся к нашему классу со стаканами
        //перед этим создали папку и переместили туда наши 2 класса связанных, тогда
        int[] a = {1, 2, 3, 4, 5};
        test(a);
        invert(a);
        test(a);
        test(new int[]{11,22,33});


    }

    private static void test(int[] a) {
        System.out.println(Arrays.toString(a));
    }

}
