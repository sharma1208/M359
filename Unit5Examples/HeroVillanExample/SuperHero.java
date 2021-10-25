package Unit5Examples.HeroVillanExample;

public class SuperHero {
    private String heroName;
    private Power superPower;

    public String getHeroName() {
        return heroName;
    }

    public SuperHero(String heroName, Power superPower) {
        this.heroName = heroName;
        this.superPower = superPower;
    }

    public String toString(){
        return "super hero name: " + heroName + "super power: " + superPower.toString();
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
