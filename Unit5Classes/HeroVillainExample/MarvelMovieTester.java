package Unit5Classes.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power superSpeed = new Power("speed", 10);
        //putting the superSpeed power object inside of the superhero object to be applied
        //to the superhero
        SuperHero flash = new SuperHero("Flash", superSpeed);
        System.out.println(flash.toString()); //

        Villain mephisto = new Villain("Mephisto", superSpeed);
        System.out.println(mephisto); //no need for toString

        //Change mephisto's super power to level 15
        //must go through the power class because villain doesn't have powerStrenth as a paramater
        //so, getting the superpower, which is connected to the power class, then allows us to
        //set the power strength now that we're in the class.
        mephisto.getSuperPower().setPowerStrength(15);


        //Because we used a single Power object, both flash and mephisto referenced this single object, changing
        //mephisto's power changes flash's power too and vise versa.
        System.out.println(flash.toString());
        System.out.println(mephisto);


    }



}
