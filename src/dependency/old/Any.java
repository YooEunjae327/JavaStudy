package dependency.old;

public class Any {

    class A {
        public void print() {
            System.out.println(this.getClass());
        }
    }

    public void main(String[] args) {
        A a = new A();

    }
}
