package ui;
import java.util.Scanner;

public class MaterialesADomicilio {

    static final int ROUGH_CONSTRUCTION = 1300000;
    static final int WHITE_WORK = 2600000;
    static final int PAINTING = 980000; 

    public static int menu(Scanner in) {
        int menuAnswer;
        System.out.println("----__________----");
        System.out.println("----|  MENU  |----");
        System.out.println("----**********----");
        System.out.println("");
        System.out.println("Ingrese el numero: ");
        System.out.println("(1) Ingreso de Materiales.");
        System.out.println("(2) Ingresar ubicacion actual.");
        System.out.println("(3) Ingresar costos de las distintas ferreterias.");
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

    public static int solicitateLocation(Scanner in) {
        int location;
        System.out.println("");
        System.out.println("Ingrese su localizacion: ");
        System.out.println("(1) Norte.");
        System.out.println("(2) Centro.");
        System.out.println("(3) Sur.");
        location = in.nextInt();

        return location;
    }

    public static int[] solicitatePriceHomeCenter(int productsSize,String[] productsNames,Scanner in) {
        int[] productsPriceHomecenter = new int[productsSize];
        for(int i=0;i<productsPriceHomecenter.length;i++) {
            System.out.println("");
            System.out.println("Ingrese el valor de "+productsNames[i]+" en Homecenter: ");
            productsPriceHomecenter[i] = in.nextInt();
        }

        return productsPriceHomecenter;
    }

    public static int[] solicitatePriceDowntown(int productsSize,String[] productsNames,Scanner in) {
        int[] productsPriceDowntown = new int[productsSize];
        for(int i=0;i<productsPriceDowntown.length;i++) {
            System.out.println("");
            System.out.println("Ingrese el valor de "+productsNames[i]+" en el centro: ");
            productsPriceDowntown[i] = in.nextInt();
        }

        return productsPriceDowntown;
    }

    public static int[] solicitatePriceNeighborhood(int productsSize,String[] productsNames,Scanner in) {
        int[] productsPriceNeighborhood = new int[productsSize];
        for(int i=0;i<productsPriceNeighborhood.length;i++) {
            System.out.println("");
            System.out.println("Ingrese el valor de "+productsNames[i]+" en la ferreteria de barrio");
            productsPriceNeighborhood[i] = in.nextInt();
        }

        return productsPriceNeighborhood;
    }

    public static int calculateDomicile(int[] pricePerHadwareStore, int productsSize, int location) {
        pricePerHadwareStore = new int[productsSize];
        if() {

        }

    }   

    public static void menuConditions(int menuAnswer,int productsSize,String[] productsNames, float[] productsAmount, int[] productsUseDestination,Scanner in) {
        boolean finished = false, materialsRegistered = false;
        menuAnswer = menu(in);
        while (finished != true) {
            if(menuAnswer == 1) {
                productsSize = materialsSize(in);
                productsNames = solicitateProductsNames(productsSize, in);
                productsAmount = solicitateProductsAmount(productsSize, in);
                productsUseDestination = solicitateProductsUseDestination(productsSize, in);    
                materialsRegistered = true;

            }else if(menuAnswer == 2) {
                solicitateLocation(in);

            }else if (menuAnswer == 3) {
                solicitatePriceHomeCenter(productsSize, productsNames, in);
                solicitatePriceDowntown(productsSize, productsNames, in);
                solicitatePriceNeighborhood(productsSize, productsNames, in);

            }else if (menuAnswer == 4) {


            }else if (menuAnswer == 3 && materialsRegistered == false) {
                System.out.println("");
                System.out.println("Por favor ingrese los materiales primero.");
            }
        }
    }

}