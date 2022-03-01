package U9_Inheritance.examples;

public class Drink extends MenuItem{
    private int numOz;
    private boolean isFrozen;

    public Drink(String name, int numOz) {
        super(name);
        this.numOz = numOz;
        this.isFrozen = false;
        System.out.println("This drink holds " + numOz + " ounces");
    }

    public Drink(String name, int numOz, boolean isFrozen) {
        super(name);
        this.numOz = numOz;
        this.isFrozen = isFrozen;
        if (isFrozen) {
            System.out.println("This frozen drink holds " + numOz + " ounces");
        }
        else {
            System.out.println("This drink holds " + numOz + " ounces");
        }
    }

    @Override
    public String toString(){
        String output ="Drink Item (" + numOz + " oz) ";
        output += super.getName();
        return output;
    }

}
