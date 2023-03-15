package dependency.old;

final class Car {
    private final String v;
    int a = 1;

    Car(String v) {
        this.v = v ;
    }
}

class sta {
    static String method1() {
        return "test";
    }
}

class test1 {
    int a = 1;

    public test1(int a) {

    }
}

class test2 extends test1 {
    int b = 2;


    test2(int a) {
        super(a);
    }
}

class Mo {
    void display() {
        System.out.println("부모 클래스이 display");
    }
}

class Me extends Mo {
    void display() { System.out.println("자식 클래스의 display()"); }

    void display(String str) {
        System.out.println(str);
    }
}

public class EzChapter {
//    float a = 1.1f;
//
//    byte b = 100;

    public static void main(String[] args) {

        Me me = new Me();
        me.display();
        me.display("값이 들어간 오버로딩");




//        int[] arr = new int[]{1,2,3,4,5};
//        int c = 0;
//
//        for (int e : arr) {
//            System.out.println(e + " ");
//        }

//        Car b = new Car();
//        System.out.println(b.a);
//        System.out.println(sta.method1());

    }



}
