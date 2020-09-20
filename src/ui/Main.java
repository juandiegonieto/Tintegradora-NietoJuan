package ui;
import java.util.*;
import model.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int menuAnswer = MaterialesADomicilio.menu(in), productsSize = MaterialesADomicilio.materialsSize(in);
        String[] productsNames = MaterialesADomicilio.solicitateProductsNames(productsSize, in);
        int[] productsAmount = MaterialesADomicilio.solicitateProductsAmount(productsSize, in), productsUseDestination = MaterialesADomicilio.solicitateProductsUseDestination(productsSize, in), priceDowntown = MaterialesADomicilio.solicitatePriceDowntown(productsSize, productsNames, in), priceHomecenter = MaterialesADomicilio.solicitatePriceHomeCenter(productsSize, productsNames, in), priceNeighborhood = MaterialesADomicilio.solicitatePriceNeighborhood(productsSize, productsNames, in);
        int location = MaterialesADomicilio.solicitateLocation(in);
        MaterialesADomicilio.menuConditions(menuAnswer, productsSize, productsNames, productsAmount, productsUseDestination, priceDowntown, priceHomecenter, priceNeighborhood, location, in);
    }
}
