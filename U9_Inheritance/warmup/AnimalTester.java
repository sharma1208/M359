package U9_Inheritance.warmup;

/**
* Lesson 7-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 * 
 * @author   Mrs. Denna 
 */
public class AnimalTester
{
   public static void main(String[] args)
   {
       Animal[] barn = new Animal[6];
       // 1. What data type does this array hold
       //It's an array of animal objects


       barn[0] = new Animal("Murphy");
       barn[1] = new Cow("Daisy", "Dairy");
       barn[2] = new Pig("Wilbur", false);
       barn[3] = new Cow("Billy", "Beef");
       barn[4] = new Animal("Maggie");
       barn[5] = new Pig("Max", true);

       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?
       // No, there are many types of objects that extend from the Animal Parent even though they are all animals. Also filled with cow and pig objects.
       //This is allowed because cows and pigs are also animals: polymorphism. Extensions work.
   
       for (Animal a: barn)
            a.speak();
            // 3. What method is getting called here?  The speak method of the Animal class?
       //The speak method is being called of not just the animal class but of the class of the object that it is being called on

       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
       //Since cows and pigs are animals, they cann be considered animals despite being different objects, because they are an extension of the Animal.
       //The array holds many types of objects as they are related objects/.

       Animal cow = new Cow("Bae", "Dairy");
       ((Cow)cow).milk();

   }
   
}
