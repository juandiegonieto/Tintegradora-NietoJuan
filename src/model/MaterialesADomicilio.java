package model;

import java.util.Scanner;

public class MaterialesADomicilio {

    static final int ROUGH_CONSTRUCTION = 1300000;
    static final int WHITE_WORK = 2600000;
    static final int PAINTING = 980000; 

    /**
     * Muesta el menu de usuario
     * <b> Pre: Scanner creado (in). </b>
     * <b> Post: Respuesta del menu (menuAnswer). </b>
     * @param in (Scanner)
     * @return (int)
     */
    public static int menu(final Scanner in) {
        int menuAnswer;
        System.out.println("----__________----");
        System.out.println("----|  MENU  |----");
        System.out.println("----**********----");
        System.out.println("");
        System.out.println("Ingrese el numero: ");
        System.out.println("(1) Ingreso de Materiales.");
        System.out.println("(2) Ingresar ubicacion actual.");
        System.out.println("(3) Ingresar costos de las distintas ferreterias y ver cotizacion de cada ferreteria.");
        System.out.println("(4) Mostrar donde es mas barato o economico cada producto.");

        menuAnswer = in.nextInt();
        return menuAnswer;
    }

    /**
     * Solicita Ingresar al usuario el tammaño de materiales o productos <b> Pre:
     * Scanner creado(in). </b> <b> Post: La cantidad de materiales o productos.
     * </b>
     * 
     * @param in
     * @return
     */
    public static int materialsSize(final Scanner in) {
        int productsSize;
        System.out.println("");
        System.out.println("Ingrese porfavor, la cantidad de materiales a comprar: ");
        productsSize = in.nextInt();
        return productsSize;
    }

    /**
     * Solicita al usuario ingresar los nombres de los materiales <b> Pre: Cantidad
     * de materiales o productos(productsSize) y el Scanner creado (in). </b> <b>
     * Post: Los nombres de cada material. </b>
     * 
     * @param productsSize
     * @param in
     * @return
     */
    public static String[] solicitateProductsNames(final int productsSize, final Scanner in) {
        final String[] productsNames = new String[productsSize];
        for (int i = 0; i < productsNames.length; i++) {
            System.out.println("");
            System.out.println("Ingrese el nombre del producto # " + (i + 1));
            productsNames[i] = in.nextLine();
        }
        return productsNames;
    }

    /**
     * Solicita al usuario ingresar la cantidad de cada material <b> Pre: Cantidad
     * de materiales ingresada.</b> <b> Post: . </b>
     * 
     * @param productsSize
     * @param in
     * @return
     */
    public static int[] solicitateProductsAmount(final int productsSize, final Scanner in) {
        final int[] productsAmount = new int[productsSize];
        for (int i = 0; i < productsAmount.length; i++) {
            System.out.println("");
            System.out.println("Ingrese la cantidad del producto # " + (i + 1));
            productsAmount[i] = in.nextInt();
            in.nextLine();
        }
        return productsAmount;
    }

    /**
     * Solicita ingresar el uso de cada material <b> Pre: La cantidad de materiales
     * o productos ingresada por usuario (productsSize) y el Scanner creado
     * (in).</b> <b> Post: El uso de cada material.</b>
     * 
     * @param productsSize (int)
     * @param in           (Scanner)
     * @return
     */
    public static int[] solicitateProductsUseDestination(final int productsSize, final Scanner in) {
        final int[] productsUseDestination = new int[productsSize];
        System.out.println("");
        System.out.println("(1) Para la obra negra.");
        System.out.println("(2) Para la obra blanca.");
        System.out.println("(3) Para pintar.");
        for (int i = 0; i < productsUseDestination.length; i++) {
            System.out.println("");
            System.out.println("Ingrese el uso para el producto del producto # " + (i + 1));
            productsUseDestination[i] = in.nextInt();
            in.nextLine();
        }
        return productsUseDestination;
    }

    /**
     * Solicita al usuario ingresar su localizacion <b> Pre: El Scanner creado (in).
     * </b> <b> Post: Localizacion del usuario.</b>
     * 
     * @param in (Scanner)
     * @return
     */
    public static int solicitateLocation(final Scanner in) {
        int location;
        System.out.println("");
        System.out.println("Ingrese su localizacion: ");
        System.out.println("(1) Norte.");
        System.out.println("(2) Centro.");
        System.out.println("(3) Sur.");
        location = in.nextInt();

        return location;
    }

    /**
     * Solicita ingresar los precios de los materiales en Homecenter <b> Pre: La
     * cantidad de materiales o productos ingresada (productsSize), nombres de los
     * productos ingresados por usuario (String[] productsNames) y el Scanner creado
     * (in). </b> <b> Post: El valor de cada material en Homecenter. </b>
     * 
     * @param productsSize  (int)
     * @param productsNames (String[])
     * @param in            (Scanner)
     * @return
     */
    public static int[] solicitatePriceHomeCenter(final int productsSize, final String[] productsNames,
            final Scanner in) {
        final int[] productsPriceHomecenter = new int[productsSize];
        for (int i = 0; i < productsPriceHomecenter.length; i++) {
            System.out.println("");
            System.out.println("Ingrese el valor de " + productsNames[i] + " en Homecenter: ");
            productsPriceHomecenter[i] = in.nextInt();
        }

        return productsPriceHomecenter;
    }

    /**
     * Solicita ingresar los precios de los materiales en la ferreteria del centro
     * <b> Pre: La cantidad de materiales o productos ingresada (productsSize),
     * nombres de los productos ingresados por usuario (String[] productsNames) y el
     * Scanner creado (in). </b> <b> Post: El valor de cada material en la
     * ferreteria del centro. </b>
     * 
     * @param productsSize  (int)
     * @param productsNames (Strin[])
     * @param in            (Scanner)
     * @return
     */
    public static int[] solicitatePriceDowntown(final int productsSize, final String[] productsNames,
            final Scanner in) {
        final int[] productsPriceDowntown = new int[productsSize];
        for (int i = 0; i < productsPriceDowntown.length; i++) {
            System.out.println("");
            System.out.println("Ingrese el valor de " + productsNames[i] + " en el centro: ");
            productsPriceDowntown[i] = in.nextInt();
        }

        return productsPriceDowntown;
    }

    /**
     * Solicita ingresar los precios de los materiales en la ferreteria del barrio
     * <b> Pre: La cantidad de materiales o productos ingresada (productsSize),
     * nombres de los productos ingresados por usuario (String[] productsNames) y el
     * Scanner creado (in). </b> <b> Post: El valor de cada material en la
     * ferreteria del barrio. </b>
     * 
     * @param productsSize  (int)
     * @param productsNames (String[])
     * @param in            (Scanner)
     * @return
     */
    public static int[] solicitatePriceNeighborhood(final int productsSize, final String[] productsNames,
            final Scanner in) {
        final int[] productsPriceNeighborhood = new int[productsSize];
        for (int i = 0; i < productsPriceNeighborhood.length; i++) {
            System.out.println("");
            System.out.println("Ingrese el valor de " + productsNames[i] + " en la ferreteria de barrio");
            productsPriceNeighborhood[i] = in.nextInt();
        }

        return productsPriceNeighborhood;
    }

    /**
     * Calcula el valor del domicio en Homecenter <b> Pre: Precios de Homecenter
     * ingresados por el usuario, cantidad de materiales o productos ingresados y
     * localizacion del usuario ingresada. </b> <b> Post: Valor del domicilio de
     * cada producto en Homecenter. </b>
     * 
     * @param priceHomecenter (int[])
     * @param productsSize    (int)
     * @param location        (int)
     * @return (int[])
     */
    public static int[] calculateDomicileHomecenter(final int[] priceHomecenter, final int productsSize,
            final int location) {
        final int[] domicile = new int[productsSize];
        for (int i = 0; i < priceHomecenter.length; i++) {
            if (priceHomecenter[i] < 80000 && location == 1) {
                domicile[i] = 120000;

            } else if (priceHomecenter[i] < 80000 && location == 2) {
                domicile[i] = 50000;

            } else if (priceHomecenter[i] < 80000 && location == 3) {
                domicile[i] = 120000;

            } else if (priceHomecenter[i] > 80000 && priceHomecenter[i] < 300000 && location == 1) {
                domicile[i] = 28000;

            } else if (priceHomecenter[i] > 80000 && priceHomecenter[i] < 300000 && location == 2) {
                domicile[i] = 0;

            } else if (priceHomecenter[i] > 80000 && priceHomecenter[i] < 300000 && location == 3) {
                domicile[i] = 55000;

            } else if (priceHomecenter[i] >= 300000 && location == 1) {
                domicile[i] = 0;

            } else if (priceHomecenter[i] >= 300000 && location == 2) {
                domicile[i] = 0;

            } else if (priceHomecenter[i] >= 300000 && location == 3) {
                domicile[i] = 0;

            }
        }

        return domicile;
    }

    /**
     * Calcula el valor del domicio en la ferreteria del barrio <b> Pre: Precios de
     * la ferreteria del barrio ingresados por el usuario, cantidad de materiales
     * ingresados y localizacion del usuario ingresada. </b> <b> Post: Valor del
     * domicilio de cada producto en la ferreteria del barrio. </b>
     * 
     * @param priceNeighborhood (int[])
     * @param productsSize      (int)
     * @param location          (int)
     * @return (int[])
     */

    public static int[] calculateDomicileNeighborhood(final int[] priceNeighborhood, final int productsSize,
            final int location) {
        final int[] domicile = new int[productsSize];
        for (int i = 0; i < priceNeighborhood.length; i++) {
            if (priceNeighborhood[i] < 80000 && location == 1) {
                domicile[i] = 120000;

            } else if (priceNeighborhood[i] < 80000 && location == 2) {
                domicile[i] = 50000;

            } else if (priceNeighborhood[i] < 80000 && location == 3) {
                domicile[i] = 120000;

            } else if (priceNeighborhood[i] > 80000 && priceNeighborhood[i] < 300000 && location == 1) {
                domicile[i] = 28000;

            } else if (priceNeighborhood[i] > 80000 && priceNeighborhood[i] < 300000 && location == 2) {
                domicile[i] = 0;

            } else if (priceNeighborhood[i] > 80000 && priceNeighborhood[i] < 300000 && location == 3) {
                domicile[i] = 55000;

            } else if (priceNeighborhood[i] >= 300000 && location == 1) {
                domicile[i] = 0;

            } else if (priceNeighborhood[i] >= 300000 && location == 2) {
                domicile[i] = 0;

            } else if (priceNeighborhood[i] >= 300000 && location == 3) {
                domicile[i] = 0;

            }
        }

        return domicile;
    }

    /**
     * Calcula el valor del domicio en la ferreteria del centro <b> Pre: Precios de
     * la ferreteria del centro ingresados por el usuario, cantidad de materiales
     * ingresados y localizacion del usuario ingresada. </b> <b> Post: Valor del
     * domicilio de cada producto en la ferreteria del centro. </b>
     * 
     * @param priceDowntown (int[])
     * @param productsSize  (int)
     * @param location      (int)
     * @return (int[])
     */

    public static int[] calculateDomicileDowntown(final int[] priceDowntown, final int productsSize,
            final int location) {
        final int[] domicile = new int[productsSize];
        for (int i = 0; i < priceDowntown.length; i++) {
            if (priceDowntown[i] < 80000 && location == 1) {
                domicile[i] = 120000;

            } else if (priceDowntown[i] < 80000 && location == 2) {
                domicile[i] = 50000;

            } else if (priceDowntown[i] < 80000 && location == 3) {
                domicile[i] = 120000;

            } else if (priceDowntown[i] > 80000 && priceDowntown[i] < 300000 && location == 1) {
                domicile[i] = 28000;

            } else if (priceDowntown[i] > 80000 && priceDowntown[i] < 300000 && location == 2) {
                domicile[i] = 0;

            } else if (priceDowntown[i] > 80000 && priceDowntown[i] < 300000 && location == 3) {
                domicile[i] = 55000;

            } else if (priceDowntown[i] >= 300000 && location == 1) {
                domicile[i] = 0;

            } else if (priceDowntown[i] >= 300000 && location == 2) {
                domicile[i] = 0;

            } else if (priceDowntown[i] >= 300000 && location == 3) {
                domicile[i] = 0;

            }
        }

        return domicile;
    }

    /**
     * Menu de condiciones respecto al menu de usuario <b> Pre: Respuesta del menu
     * ingresada y El Scanner llamado in creado. </b> <b> Post: Respuesta del punto
     * segun el menu de usurio. </b>
     * 
     * @param menuAnswer             (int)
     * @param productsSize           (int)
     * @param productsNames          (Strin[])
     * @param productsAmount         (int[])
     * @param productsUseDestination (int[])
     * @param priceDowntown          (int[])
     * @param priceHomecenter        (int[])
     * @param priceNeighborhood      (int[])
     * @param location               (int)
     * @param in                     (Scanner)
     */

    public static void menuConditions(int menuAnswer, int productsSize, String[] productsNames, int[] productsAmount,
        int[] productsUseDestination, int[] priceDowntown, int[] priceHomecenter, int[] priceNeighborhood,
        final int location, final Scanner in) {
        boolean finished = false;
        boolean materialsRegistered = false, pricesRegistered = false;
        int totalPriceHomecenter = 0, totalPriceDowntown = 0, totalPriceNeighborhood = 0;
        int[] domicileHomeCenter = calculateDomicileHomecenter(priceHomecenter, productsSize, location);
        int[] domicileDowntown = calculateDomicileDowntown(priceDowntown, productsSize, location);
        int[] domicileNeighborhood = calculateDomicileNeighborhood(priceNeighborhood, productsSize, location);

        menuAnswer = menu(in);
        while (finished != true) {
            if (menuAnswer == 1) {
                productsSize = materialsSize(in);
                productsNames = solicitateProductsNames(productsSize, in);
                productsAmount = solicitateProductsAmount(productsSize, in);
                productsUseDestination = solicitateProductsUseDestination(productsSize, in);
                materialsRegistered = true;

            } else if (menuAnswer == 2) {
                solicitateLocation(in);

            } else if (menuAnswer == 3) {
                priceHomecenter = new int[productsSize];
                priceHomecenter = solicitatePriceHomeCenter(productsSize, productsNames, in);
                priceDowntown = new int[productsSize];
                priceDowntown = solicitatePriceDowntown(productsSize, productsNames, in);
                priceNeighborhood = new int[productsSize];
                priceNeighborhood = solicitatePriceNeighborhood(productsSize, productsNames, in);
                pricesRegistered = true;

                for (int i = 0; i < priceHomecenter.length; i++) {
                    totalPriceHomecenter = +priceHomecenter[i] + domicileHomeCenter[i] * productsAmount[i];
                }

                for (int i = 0; i < priceDowntown.length; i++) {
                    totalPriceDowntown = +priceDowntown[i] + domicileDowntown[i] * productsAmount[i];
                }

                for (int i = 0; i < priceNeighborhood.length; i++) {
                    totalPriceNeighborhood = +priceNeighborhood[i] + domicileNeighborhood[i] * productsAmount[i];
                }

                System.out.println("");
                System.out.println("El valor total a pagar cotizando en Homecenter es: "
                        + (totalPriceHomecenter + ROUGH_CONSTRUCTION + WHITE_WORK + PAINTING) + "$ Pesos");
                System.out.println("");
                System.out.println("El valor total a pagar cotizando en la ferreteria del centro es: "
                        + (totalPriceDowntown + ROUGH_CONSTRUCTION + WHITE_WORK + PAINTING) + "$ Pesos");
                System.out.println("");
                System.out.println("el valor total a pagar cotizando en la ferreteria del barrio es: "
                        + (totalPriceNeighborhood + ROUGH_CONSTRUCTION + WHITE_WORK + PAINTING) + "$ Pesos");

            } else if (menuAnswer == 4) {

                for (int i = 0; i < priceHomecenter.length; i++) {
                    for (final int j = 0; i < priceDowntown.length; i++) {
                        for (final int k = 0; k < priceNeighborhood.length; i++) {
                            if(priceHomecenter[i] < priceDowntown[j] && priceHomecenter[i] < priceNeighborhood[k]) {
                                System.out.println("");
                                System.out.println("El producto "+productsNames[i]+" es mas barato en Homecenter con un valor de "+((priceHomecenter[i]+domicileHomeCenter[i])*productsAmount[i])+"$ pesos");
                                System.out.println("");
                                System.out.println("De todos los productos tendria un total a pagar de: "+totalPriceHomecenter);
                                System.out.println("");
                            } else if (priceDowntown[j] < priceHomecenter[i] && priceDowntown[j] < priceNeighborhood[k]) {
                                System.out.println("El producto "+productsNames[i]+" es mas barato en la ferreteria del centro con un valor de "+((priceDowntown[i]+domicileDowntown[i])*productsAmount[i])+"$ pesos");
                                System.out.println("");
                                System.out.println("De todos los productos tendria un total a pagar de: "+totalPriceHomecenter);
                                System.out.println("");
                            } else if (priceNeighborhood[k] < priceHomecenter[i] && priceNeighborhood[k] < priceDowntown[j]) {
                                System.out.println("El producto "+productsNames[i]+" es mas barato en la ferreteria del barrio con un valor de "+((priceNeighborhood[i]+domicileNeighborhood[i])*productsAmount[i])+"$ pesos");
                                System.out.println("");
                                System.out.println("De todos los productos tendria un total a pagar de: "+totalPriceHomecenter);
                                System.out.println("");
                            }
                        }
                    }
                }    
            }else if (menuAnswer == 3 && materialsRegistered == false) {
                System.out.println("");
                System.out.println("Por favor ingrese los materiales primero.");

            }else if (menuAnswer == 5) {
                System.out.println("");
                System.out.println("Los productos de Obra negra son: ");
                for(int i=0;i<productsUseDestination.length;i++) {
                    if(productsUseDestination[i] == 1) {
                        System.out.print(productsNames[i]+", ");
                    }
                }
                System.out.println("");
                System.out.println("Los productos de Obra blanca son: ");
                for(int i=0;i<productsUseDestination.length;i++) {
                    if(productsUseDestination[i] == 2) {
                        System.out.print(productsNames[i]+", ");
                    }
                }
                System.out.println("");
                System.out.println("Los productos de Pintura son: ");
                for(int i=0;i<productsUseDestination.length;i++) {
                    if(productsUseDestination[i] == 3) {
                        System.out.print(productsNames[i]+", ");
                    }
                }
            }else if (menuAnswer == 4 && materialsRegistered == false || pricesRegistered == false) {
                System.out.println("");
                System.out.println("Por favor ingrese los materiales primero o ingrese el precio de los materiales.");
            }
        }
    }

}