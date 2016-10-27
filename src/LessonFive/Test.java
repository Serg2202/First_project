package LessonFive;

/**
 * Created by USER on 26.10.2016.
 */
public class Test {
    int a, b;
    Test (int i, int j){
        a=i;
        b=j;
    }
    void meth (Test o){
        o.a*=2;
        o.b/=2;
    }
    void meth (int a, int b){
        a*=2;
        b/=2;
    }
}
class PassObjRef{
    public static void main(String[] args) {
        Test ob=new Test(15,20);
        int x=10;int y=10;
        ob.meth(x,y);
        System.out.println("x and y before call:" + x + " " + y);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
