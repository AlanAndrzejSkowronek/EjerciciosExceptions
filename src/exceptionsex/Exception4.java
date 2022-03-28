
package exceptionsex;

public class Exception4 {
    int arrayIndex = 14;
    int[] iArray = new int[5];
    
    public void eX(){
        try {
            iArray[arrayIndex] = 1500;
            System.out.println("After the array index access attempt");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ejercicio 10 / Apartado 18");
            System.out.println("I caught the exception!");
        }
    }
}
