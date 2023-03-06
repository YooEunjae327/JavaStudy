package dependency;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class Optional {

    public static void main(String[] args) {
        Date  now = new Date();
        Date expriation = new Date(now.getTime() + Duration.ofDays(1).toMillis());

        System.out.println(LocalDateTime.now());
        System.out.println(now.getTime() + Duration.ofDays(1).toMillis());
        System.out.println(expriation);
    }
}
