package dependency.methodconstructor;

public class Constructor {

    public static void main(String[] args) {
        Example example = new Example(13);

        example.getVal();
    }
}

class Example {
    int val = 0;

    Example(int val) {
        this.val = val;
    }

    Example() {
    }

    public void getVal() {
        System.out.println(val);
    }

}
