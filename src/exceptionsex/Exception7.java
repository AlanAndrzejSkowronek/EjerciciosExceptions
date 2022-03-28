package exceptionsex;

import java.time.LocalDateTime;

public class Exception7 {
    int arrayIndex = 14;
    int[] iArray = new int[5];
    
    public void eX(){
        try {
            iArray[arrayIndex] = 1500;
            System.out.println("After the array index access attempt");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ejercicio 20 / Apartado 18");
            System.out.println("I caught the exception!");
        }
        finally{ System.out.println(LocalDateTime.now()); }
    }
}
