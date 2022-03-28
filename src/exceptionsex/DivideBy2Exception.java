package exceptionsex;

public class DivideBy2Exception extends Exception{
    // Ejercicio 13 ::: Apartado 18
    public DivideBy2Exception(){}
    
    public DivideBy2Exception(String message){ super(message); }
    
    public DivideBy2Exception(Throwable cause){ super(cause); }
    
    public DivideBy2Exception(String message, Throwable cause){ super(message, cause); }
    
    public DivideBy2Exception(String message, 
                              Throwable cause, 
                              boolean enableSupression,
                              boolean writableStackTrace)
    {
        super(message, cause, enableSupression, writableStackTrace);
    }
}
