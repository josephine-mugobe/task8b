public class citrus extends fruitObject{
    String FruitShape;
    String VitaminType;

    public citrus(String FruitShape, String VitaminType) {
        super("Orange");
        this.FruitShape=FruitShape;
        this.VitaminType=VitaminType;
    }
    @Override
    public void displayFruitDetails() {
        System.out.println(" the fruit name is " + name);
        System.out.println(" Orange is rich in vitamin " + VitaminType);
        System.out.println(" The shape of Orange is " + FruitShape);
    }
}
