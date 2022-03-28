package exceptionsex;

public class Exception5 {
    int arrayIndex = 14;
    int[] iArray = new int[5];
    
    public void eX(){
        try {
            iArray[arrayIndex] = 1500;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ejercicio 11 / Apartado 18");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        System.out.println("After the array index access attempt");
    }
}
