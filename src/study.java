import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class study {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {1,2,3,4,4,5};

        File file = new File("/Users/tomato/Downloads/test.txt");
        OutputStream outputStream = new FileOutputStream(file);

//        for (byte b : bytes) {
//            outputStream.write(b);
//        }
        outputStream.write(bytes);

        outputStream.close();
    }
}


class Test {
    public void test() {
        System.out.println("test");
    }
}

class  Car extends Test {
    private String modelName;
    private int modelYear;

    public static int a = 12;

    Car(String modelName, int modelYear) {
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    Car() {
        this("소나타", 2016);
    }

    public String getModel() {
        return this.modelYear + "년식" + this.modelName;
    }
}





