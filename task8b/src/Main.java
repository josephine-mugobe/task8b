public class Main {
    public static void main(String[] args) {
        citrus client1 = new citrus("round","c");
        client1.displayFruitDetails();
        System.out.println("the price of those orange is " + client1.FruitCostPrice(500, 6));
        System.out.println();

        nonCitrus client2 = new nonCitrus("Cylindrical and elongated", "B6","yellow");
        client2.displayFruitDetails();
        System.out.println("the price of those banana is " + client2.FruitCostPrice(1000, 12));
        System.out.println();

    }
}