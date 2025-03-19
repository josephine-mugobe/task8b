public class fruitObject {
    String name;

    public fruitObject(String name) {
        this.name = name;
    }
    public abstract void displayFruitDetails();

    public double FruitCostPrice(double UnitPrice, int NumberOfPieces ){
        double cost=UnitPrice*NumberOfPieces;
        return cost;
    }
}
