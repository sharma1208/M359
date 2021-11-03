package Unit5Classes.HeroVillainExample;

import Unit5Classes.HeroVillainExample.Power;

public class SuperHero {
    private String heroName;
    //An instance variable can be another object like Power.
    //(This isn't something new that we've learned...it happens in String class already).
    private Power superPower;
    //keeps track of total number of super hero objects that have been created
    private static int numHeroes = 0;

    private static double totalStrength = 0;

    public SuperHero(String heroName, Power superPower) {
        this.heroName = heroName;
        this.superPower = new Power(superPower.getPower(), superPower.getPowerStrength());
        //we are creating a hero, so update hero count
        numHeroes++;
        totalStrength += superPower.getPowerStrength();
    }

    public String toString(){
        //use the toString method from the power class on the superPower
        //because of this, you don't need to provide more description because your power class gives it
        return "super hero name:" + heroName + "\n " + superPower.toString();
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }


    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public static int getNumHeroes() {
        return numHeroes;
    }

    public static double getTotalStrength() {
        return totalStrength;
    }

    public static double getAvgStrength(){
        return totalStrength / numHeroes;
    }
}
