
package exceptionsex;

public class ExceptionsEX {
    public static void salto (){
        System.out.println();
        System.out.println("--------------");
        System.out.println();
    }
    public static void main(String[] args) {
        Exception1 ex1 = new Exception1(); 
        Exception2 ex2 = new Exception2();
        Exception3 ex3 = new Exception3(); 
        Exception4 ex4 = new Exception4();
        Exception5 ex5 = new Exception5(); 
        Exception6 ex6 = new Exception6();
        Exception7 ex7 = new Exception7(); 
        Exception8 ex8 = new Exception8();
        Exception9 ex9 = new Exception9();
        
        ex1.eX(); salto(); 
        ex2.eX(); salto();
        ex3.eX(); salto(); 
        ex4.eX(); salto();
        ex5.eX(); salto(); 
        ex6.eX(); salto();
        ex7.eX(); salto(); 
        ex8.eX(); salto();
        ex9.eX(); salto();
    }
}
