package exceptionsex;

public class Exception8 {

    public void eX() {
        try {
            int a = 10, b = 0;
            int result;
            try {
                result = a / b;
            } catch (ArithmeticException e) {
                System.out.print("Divide by zero situation has occurred. ");
                System.out.println("Rethrowing this exception.");
                throw (e);
            }
        } catch (Exception e) {
            System.out.println("Outer try block...exception caught.");
        }
    } 
}
