
package exceptionsex;

public class Exception1  {
    int AA = 5;
    int BB = 0;
    
    public void eX(){
        System.out.println("Ejercicio número 1;");
        try {
            System.out.println(AA / BB);
        } catch (ArithmeticException e) {
            System.out.println("Ejercicio 4 / Apartado 18");
            System.out.println("I caught the exception!: " + e);
        }
        System.out.println("After the calculation.");
    }
}
