package Unit5Classes.HeroVillainExample;

public class Power {
    private String power;
    private double powerStrength;

    public Power(String power, double powerStrength) {
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

    public double getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(double powerStrength) {
        this.powerStrength = powerStrength;
    }
}
