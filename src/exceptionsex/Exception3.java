
package exceptionsex;

public class Exception3 {
    int x1 = Integer.MAX_VALUE;
    int x2 = Integer.MAX_VALUE - 1000;
    
    public void eX(){
        try {
            int x3 = Math.addExact(x1, x2);
            System.out.println("X3 value:" + x3);
        } catch (ArithmeticException e) {
            System.out.println("Ejercicio 8 / Apartado 18");
            System.out.println("I caught the exception!: " + e );
        }
    }
}
