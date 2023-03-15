package dependency.methodconstructor;

public class Overloading {
    public static void main(String[] args) {
        Over over = new Over();

        over.display(10);

        over.display(10, 10);

        over.display(10, "10");

    }
}

class Over  {
    public void display(int num1) { System.out.println(num1); }

    public void display(int num1, int num2) { System.out.println(num1 + num2); }

    public void display(int num1, String num2) { System.out.println(num1 + num2); }

}