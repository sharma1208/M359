package Unit2_UsingObjects.homework.WS1;

public class FruitTester {
    public static void main(String[] args) {
        Fruit myFruit1 = new Fruit("pineapple", true);
        myFruit1.printInfo();

        Fruit myFruit2 = new Fruit("mango", false);
        myFruit2.printInfo();
        int numServingss = myFruit2.getServings();
        System.out.println("Num Servings:" + " " + numServingss);
    }

}
