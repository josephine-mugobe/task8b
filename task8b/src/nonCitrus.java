public class nonCitrus extends fruitObject {
    String FruitShape;
    String VitaminType;
    String Color;
    public nonCitrus(String FruitShape, String VitaminType, String Color) {
        super("Banana");
        this.FruitShape = FruitShape;
        this.VitaminType = VitaminType;
        this.Color = Color;
    }
    @Override
    public void displayFruitDetails() {
        System.out.println(" the fruit name is " + name);
        System.out.println(" the banana's shape is  " + FruitShape);
        System.out.println(" Banana is rich in vitamin " + VitaminType);
        System.out.println(" The color of Banana is " + Color);
    }
    }