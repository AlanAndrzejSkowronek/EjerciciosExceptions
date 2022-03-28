package exceptionsex;

public class Exception6 {
    float a = 10f, b = 2f, c;
    
    public void eX(){
        try {
            if (b % 2 == 0){
                throw new DivideBy2Exception("This divisor is divisible by 2.");
            }
            c = a / b;
            System.out.println(c);
        } catch(DivideBy2Exception e) {
            System.out.println(e);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
