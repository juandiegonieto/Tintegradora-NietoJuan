package ui;
import java.util.Scanner;

public class MaterialesADomicilio {

    public static void intialice() {
        final int ROUGH_CONSTRUCTION = 1300000;
        final int WHITE_WORK = 2600000;
        final int PAINTING = 980000;      
    }

    public static int menu(Scanner in) {
        int menuAnswer;
        System.out.println("----__________----");
        System.out.println("----|  MENU  |----");
        System.out.println("----**********----");
        System.out.println("");
        System.out.println("Ingrese el numero: ");
        System.out.println("(1) Ingreso de Materiales.");
        System.out.println("(2) Ingresar ubicacion actual.");
        System.out.println("(3) Mostrar precio.");
        System.out.println("(4) Salir.");
        
        menuAnswer = in.nextInt();    
        return menuAnswer;
    }

    public static int materialsSize(Scanner in) {
        int productsSize;
        System.out.println("");
        System.out.println("Ingrese porfavor, la cantidad de materiales a comprar: ");
        productsSize = in.nextInt();
        return productsSize;
    }

    public static String[] solicitateProductsNames(int productsSize, Scanner in) {
        String[] productsNames = new String[productsSize];
        for(int i=0;i<productsNames.length;i++) {
            System.out.println("");
            System.out.println("Ingrese el nombre del producto # "+(i+1));
            productsNames[i] = in.nextLine();
        }
        return productsNames;
    }

    public static float[] solicitateProductsAmount(int productsSize, Scanner in) {
        float[] productsAmount = new float[productsSize];
        for(int i=0;i<productsAmount.length;i++) {
            System.out.println("");
            System.out.println("Ingrese la cantidad del producto # "+(i+1));
            productsAmount[i] = in.nextFloat();
            in.nextLine();
        }
        return productsAmount;
    }

    public static int[] solicitateProductsUseDestination(int productsSize, Scanner in) {
        int[] productsUseDestination = new int[productsSize];
        System.out.println("");
        System.out.println("(1) Para la obra negra.");
        System.out.println("(2) Para la obra blanca.");
        System.out.println("(3) Para pintar.");
        for(int i=0;i<productsUseDestination.length;i++) {
            System.out.println("");
            System.out.println("Ingrese el uso para el producto del producto # "+(i+1));
            productsUseDestination[i] = in.nextInt();
            in.nextLine();
        }
        return productsUseDestination;
    }

    public static void menuConditions(int menuAnswer, int productsSize, Scanner in) {
        boolean finished = false;
        menuAnswer = menu(in);
        while (finished != true) {
            if(menuAnswer == 1) {
                productsSize = materialsSize(in);

            }else if(menuAnswer == 2) {

            }else if (menuAnswer == 3) {

            }else if (menuAnswer == 4) {

            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        intialice();
        int menuAnswer = menu(in);
        menuConditions(menuAnswer, in);
    }
}