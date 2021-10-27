package Unit5Classes.HeroVillainExample;

import Unit5Classes.HeroVillainExample.Power;

public class Villain {

    private String villainName;
    private Power superPower;

    public Villain(String villainName, Power superPower) {
        this.villainName = villainName;
        this.superPower = superPower;
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
}
