
package exceptionsex;

public class Exception2 {
    String s = null;
    
    public void eX (){
        try {
            int length = s.length();
            System.out.println("Length of String s:" + length);
        } catch (NullPointerException e) {
            System.out.println("Ejercicio 6 / Apartado 18");
            System.out.println("I caught the exception!: " + e);
        }
    }
}
