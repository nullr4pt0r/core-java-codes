package time;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Time {

    public static void main(String[] args) {
    Instant time = Instant.now();
    Instant prev = Instant.now();
    long diff = ChronoUnit.MINUTES.between(time, prev);
    if(diff >= 55){
        System.out.println(diff);
    }

        System.out.println(time+" "+prev+" "+diff);
    }
}
