package Unit5Classes.HeroVillainExample;

import Unit5Classes.HeroVillainExample.Power;

public class Villain {

    private String villainName;
    private Power superPower;

    private static int numVillains = 0;
    private static double totalStrengthV = 0;
    public Villain(String villainName, Power superPower) {
        numVillains++;
        this.villainName = villainName;
        this.superPower = new Power(superPower.getPower(), superPower.getPowerStrength() );
        //since creating a hero, update a sum of power
        totalStrengthV += superPower.getPowerStrength();
    }

    public String getVillainName() {
        return villainName;
    }

    public String  toString(){
        return "villain name:" + villainName + "\n " + superPower.toString();

    }
    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public Power getSuperPower() {
        return superPower;}

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public static int getNumVillains() {
        return numVillains;
    }

    public static double getTotalStrengthV() {
        return totalStrengthV;
    }
    public static double getAvgStrength(){
        return totalStrengthV/ numVillains;
    }
}
