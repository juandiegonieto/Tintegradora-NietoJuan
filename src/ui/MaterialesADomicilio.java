import java.util.*;
public class MaterialesADomicilio {

    public void intialice() {
        final int ROUGH_CONSTRUCTION = 1300000;
        final int WHITE_WORK = 2600000;
        final int PAINTING = 980000;
        String[] nombreDeProductos;
        float[] productAmount;
        int[] productUseDestination;
        int answer, ubication, productsSize;     
        boolean finished = false;
    }

    public int programMenu(boolean finished, int ubication, int answer) {

        while(finished =! true ) {
            System.out.println("----__________----");
            System.out.println("----|  MENU  |----");
            System.out.println("----**********----");
            System.out.println("");
            System.out.println("Ingrese su localidad: \n(1) Norte.\n(2) Centro\n(3) Sur");
            ubication = in.nextInt();
            System.out.println("");
            System.out.println("Ingrese el numero: ");
            System.out.println("(1.) Ingreso de Materiales.");
            System.out.println("(2.) Salir y mostrar precio");
            answer = in.nextInt();
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}