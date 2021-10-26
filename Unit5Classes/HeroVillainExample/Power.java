package Unit5Classes.HeroVillainExample;

public class Power {
    private String power;
    private int powerStrength;

    public Power(String power, int powerStrength) {
        this.power = power;
        this.powerStrength = powerStrength;
    }

    public String toString(){
        return "power:" + power +  " strength:" + powerStrength;
    }
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(int powerStrength) {
        this.powerStrength = powerStrength;
    }
}
