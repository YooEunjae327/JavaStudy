package dependency;

import java.util.Arrays;
import java.util.stream.Stream;

class Parent {
    void display() {
        System.out.println("부모 클래스의 display() 메서드");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("자식 클래스의 display() 메서드");
    }
}

public class standard {
    public static void main(String[] args) {
        Parent pa = new Parent();
        pa.display();

        Child ch = new Child();
        ch.display();

        Parent pc = new Child();
        pc.display();
    }
}
