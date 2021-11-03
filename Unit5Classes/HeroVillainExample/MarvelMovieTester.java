package Unit5Classes.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power superSpeed = new Power("speed", 10);
        //putting the superSpeed power object inside of the superhero object to be applied
        //to the superhero

        System.out.println(SuperHero.getNumHeroes());
        System.out.println(SuperHero.getTotalStrength());
        SuperHero flash = new SuperHero("Flash", superSpeed);
        System.out.println(flash.toString()); //
        System.out.println(SuperHero.getNumHeroes());
        System.out.println(SuperHero.getTotalStrength());

        Villain mephisto = new Villain("Mephisto", superSpeed);
        System.out.println(mephisto); //no need for toString

        //Change mephisto's super power to level 15
        //must go through the power class because villain doesn't have powerStrenth as a paramater
        //so, getting the superpower, which is connected to the power class, then allows us to
        //set the power strength now that we're in the class.
        //mephisto.getSuperPower().setPowerStrength(15);


        //Because we used a single Power object, both flash and mephisto referenced this single object, changing
        //mephisto's power changes flash's power too and vise versa.
        System.out.println(flash.toString());
        System.out.println(mephisto);
        battle(flash,mephisto);
    }

    /**
     * This simulates a battle between hero and villain. Whichever has greater strength will win the battle.
     *          1. winner will gain 10% strength of the loser
     *          Loser will lose between 5-35% (inclusive) of its OWN strength
     *          If it's a tie, then BOTH parties lose between 5-35%(inclusive) of their strength.
     *          Print the result of the battle, as well as their new strength level afterwards.
     * @param hero
     * @param villain
     */
    public static void battle(SuperHero hero, Villain villain){
        double hPower = villain.getSuperPower().getPowerStrength();
        double  vPower = hero.getSuperPower().getPowerStrength();
        double randomNum =(int)(Math.random()*31) + 5;
        if(hPower > vPower){
            hPower += 0.10 * vPower;
            vPower -= randomNum * 0.01;
            System.out.println("Hero wins! \n hero strength: " + hPower + "\n villain strength: " + vPower);

        }else if(hPower < vPower){
            vPower += 0.10 * vPower;
            hPower -= randomNum* 0.01;
            System.out.println("Villain wins! \n villain strength: " + vPower  + "\n hero strength: " + hPower);

        }else{
            // get rand num between 5 and 35
            double rndNum =(int)(Math.random()*31) + 5;
            hPower -= rndNum * 0.01 * hPower;

            rndNum =(int)(Math.random()*31) + 5;
            vPower -= rndNum * 0.01 * vPower;

          System.out.println("Tie! \n hero strength: " + hPower + "\n villain strength: " + vPower);
        }

        hero.getSuperPower().setPowerStrength(hPower);
        villain.getSuperPower().setPowerStrength(vPower);


    }


}
