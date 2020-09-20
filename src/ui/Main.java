package ui;
import java.util.*;
import model.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        MaterialesADomicilio.menuConditions(menuAnswer, productsSize, productsNames, productsAmount, productsUseDestination, priceDowntown, priceHomecenter, priceNeighborhood, location, in);
    }
}
