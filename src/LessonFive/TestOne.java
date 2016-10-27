package LessonFive;

/**
 * Created by USER on 26.10.2016.
 */
public class TestOne {
    int a;
    TestOne(int i){
        a=i;
    }
    TestOne incrByTen(){
        TestOne temp=new TestOne(a+10);//создаептся новый объект и заносится 2+10
        return temp;
    }
}
class RetOb{
    public static void main(String[] args) {
        TestOne ob1=new TestOne(2);// создание объекта и заносится 2
        TestOne ob2;

        ob2=ob1.incrByTen();// создали
        System.out.println("ob1.a:" + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2=ob2.incrByTen();
        System.out.println("ob2.a after second increase:" + ob2.a );// новая ссылка на новый объект уже равна 22
    }
}
