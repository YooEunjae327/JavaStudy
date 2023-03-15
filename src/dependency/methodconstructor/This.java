package dependency.methodconstructor;

public class This {
    public static void main(String[] args) {
        Example2 example2 = new Example2();

        System.out.println();
    }
}

class Example2 {
    int value1;
    int value2;

    Example2(int value1, int value2) {
        this.value1 = value1;
        //this.value2 = value2;
    }

    Example2(int value2) {
        this.value2 = value2;
    }

    Example2() {
        this(13);
    }

}