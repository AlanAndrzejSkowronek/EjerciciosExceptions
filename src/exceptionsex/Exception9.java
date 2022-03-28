package exceptionsex;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Exception9 {
    
    public void eX(){
        System.out.println("This program will sleep for 10 seconds.");
        
        LocalDateTime x = LocalDateTime.now();
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            LocalDateTime y = LocalDateTime.now();
            System.out.println("Catch exception");
            System.out.println("Time passed till exception was caught: " + x.until(y, ChronoUnit.MILLIS));
        }
    }
}
